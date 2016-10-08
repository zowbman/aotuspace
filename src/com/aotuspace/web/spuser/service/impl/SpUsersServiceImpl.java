package com.aotuspace.web.spuser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aotuspace.web.spuser.mapper.user.SpAnchorBinfoMapper;
import com.aotuspace.web.spuser.mapper.user.SpUsersAvatarMapper;
import com.aotuspace.web.spuser.mapper.user.SpUsersBinfoMapper;
import com.aotuspace.web.spuser.mapper.user.SpUsersDinfoMapper;
import com.aotuspace.web.spuser.mapper.user.SpUsersRinfoMapper;
import com.aotuspace.web.spuser.mapper.user.SpUsersSinfoMapper;
import com.aotuspace.web.spuser.mapper.user.custom.SpUsersBinfoMapperCustom;
import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfo;
import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;
import com.aotuspace.web.spuser.model.po.user.SpUsersAvatarExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersBinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersBinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfoExample;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfoKey;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersAvatarCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersDinfoCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersRinfoCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersSinfoCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;
import com.aotuspace.web.spuser.service.ISpUsersService;

/**
 * 
 * Title:SpUsersServiceImpl
 * Description:用户功能模块service实现类
 * Company:Boundless
 * @author    伟宝
 * @date      2015-9-10 上午11:13:52
 *
 */
public class SpUsersServiceImpl implements ISpUsersService {
	
	@Autowired
	private SpUsersBinfoMapper spUsersBinfoMapper;
	@Autowired
	private SpUsersBinfoMapperCustom spUsersBinfoMapperCustom;
	@Autowired
	private SpAnchorBinfoMapper spAnchorBinfoMapper;
	@Autowired
	private SpUsersDinfoMapper spUsersDinfoMapper;
	@Autowired
	private SpUsersRinfoMapper spUsersRinfoMapper;
	@Autowired
	private SpUsersSinfoMapper spUsersSinfoMapper;
	@Autowired
	private SpUsersAvatarMapper spUsersAvatarMapper;

	@Override
	public SpUsersBinfoCustom login(SpUsersBinfoQueryVo spUsersBinfoQueryVo)
			throws Exception {
		//密码加密传入
		return spUsersBinfoMapperCustom
				.findSpUserBySpAccountAndSpPassword(spUsersBinfoQueryVo);
	}

	@Override
	public SpUsersBinfoCustom register(SpUsersBinfo spUsersBinfo) throws Exception {
		//先查询用户信息aotuid最大并加1
		if (spUsersBinfoMapperCustom.findSpUserMaxAotuId() != null) {
			spUsersBinfo.setSpAtuid(spUsersBinfoMapperCustom
					.findSpUserMaxAotuId() + 1);
		}
		//查询是否有这个用户名
		Integer accountCount = spUsersBinfoMapperCustom
				.findSpUserByAccount(spUsersBinfo.getSpAccount());
		if (accountCount == null || accountCount == 0) {
			//注册
			spUsersBinfoMapper.insertSelective(spUsersBinfo);//返回aotuid和spid
			//详细信息(初始化)spUsersDinfo
			spUsersDinfoMapper.insertSelective(new SpUsersDinfoCustom(spUsersBinfo.getSpId(), spUsersBinfo.getSpAtuid(),spUsersBinfo.getSpAccount()));
			//真实信息(初始化)spUsersRinfo
			spUsersRinfoMapper.insertSelective(new SpUsersRinfoCustom(spUsersBinfo.getSpId(), spUsersBinfo.getSpAtuid()));
			//安全信息(初始化)spUsersSinfo
			spUsersSinfoMapper.insertSelective(new SpUsersSinfoCustom(spUsersBinfo.getSpId(), spUsersBinfo.getSpAtuid()));
			
			//准备回传信息
			SpUsersBinfoCustom spUsersBinfoCustom=new SpUsersBinfoCustom();
			spUsersBinfoCustom.setSpAccount(spUsersBinfo.getSpAccount());
			//spUsersBinfoCustom.setSpPassword(spUsersBinfo.getSpPassword());
			spUsersBinfoCustom.setSpAtuid(spUsersBinfo.getSpAtuid());
			return spUsersBinfoCustom;
		}
		return null;
		

	}

	@Override
	public SpUsersBinfoCustom forgetPassword(
			SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception {
		return null;
	}

	@Override
	public boolean findUserByAutoIdAndIdenId(Integer spAutoId,int spIdentId) throws Exception {
		if(spAutoId!=null){
			SpUsersBinfoExample spUsersBinfoExample=new SpUsersBinfoExample();
			SpUsersBinfoExample.Criteria criteria=spUsersBinfoExample.createCriteria();
			criteria.andSpAtuidEqualTo(spAutoId);
			criteria.andSpIdentityEqualTo((byte)spIdentId);
			List<SpUsersBinfo> spUsersBinfos=spUsersBinfoMapper.selectByExample(spUsersBinfoExample);
			if(spUsersBinfos!=null&&spUsersBinfos.size()>0){
				return true;
			}
		}
		return false;
	}

	@Override
	public SpAnchorBinfo findAnBySpAutoId(Integer spAutoId) throws Exception {
		if(spAutoId!=null){
			SpAnchorBinfoExample spAnchorBinfoExample=new SpAnchorBinfoExample();
			SpAnchorBinfoExample.Criteria criteria=spAnchorBinfoExample.createCriteria();
			criteria.andSpAtuidEqualTo(spAutoId);
			List<SpAnchorBinfo> spAnchorBinfos=spAnchorBinfoMapper.selectByExample(spAnchorBinfoExample);
			if(spAnchorBinfos!=null&&spAnchorBinfos.size()>0){
				return spAnchorBinfos.get(0);
			}
		}
		return null;
	}

	@Override
	public SpUsersDinfo findUserDInfoByKey(SpUsersDinfoKey key) throws Exception {
		if(key!=null){
			return spUsersDinfoMapper.selectByPrimaryKey(key);
		}
		return null;
	}
	
	@Override
	public List<SpUsersDinfo> findUserDInfoByAutoId(Integer spAutoId) throws Exception {
		if(spAutoId!=null){
			SpUsersDinfoExample spUsersDinfoExample=new SpUsersDinfoExample();
			SpUsersDinfoExample.Criteria criteria=spUsersDinfoExample.createCriteria();
			criteria.andSpAtuidEqualTo(spAutoId);
			return (List<SpUsersDinfo>) spUsersDinfoMapper.selectByExample(spUsersDinfoExample);
		}
		return null;
	}

	@Override
	public void saveUserAvatar(SpUsersAvatarCustom spUsersAvatarC) throws Exception {
		if(spUsersAvatarC!=null){
			spUsersAvatarMapper.insertSelective(spUsersAvatarC);
		}
	}

	@Override
	public void updateUserDinfo(SpUsersDinfo spUsersDinfo) throws Exception {
		if(spUsersDinfo!=null){
			spUsersDinfoMapper.updateByPrimaryKeySelective(spUsersDinfo);
		}
	}

	@Override
	public List<SpUsersAvatar> findUserAvatarByAvatarId(Integer avatarId) throws Exception {
		if(avatarId!=null){
			SpUsersAvatarExample spUsersAvatarExample=new SpUsersAvatarExample();
			SpUsersAvatarExample.Criteria criteria=spUsersAvatarExample.createCriteria();
			criteria.andSpAvataridEqualTo(avatarId);
			return spUsersAvatarMapper.selectByExample(spUsersAvatarExample);
		}
		
		return null;
	}
	
	

	@Override
	public SpUsersAvatar findUserAvatarBySpId(Integer spId) throws Exception {
		if(spId!=null){
			return spUsersAvatarMapper.selectByPrimaryKey(spId);
		}
		return null;
	}

	@Override
	public void deleteUserAvatar(Integer spId) throws Exception {
		if(spId!=null&&spId!=1){
			SpUsersAvatarExample spUsersAvatarExample=new SpUsersAvatarExample();
			SpUsersAvatarExample.Criteria criteria=spUsersAvatarExample.createCriteria();
			criteria.andSpAvataridEqualTo(spId);
			spUsersAvatarMapper.deleteByExample(spUsersAvatarExample);
			spUsersAvatarMapper.deleteByPrimaryKey(spId);
		}
	}
}
