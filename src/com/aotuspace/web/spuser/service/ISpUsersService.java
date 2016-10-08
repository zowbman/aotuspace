package com.aotuspace.web.spuser.service;

import java.util.List;

import com.aotuspace.web.spuser.model.po.user.SpAnchorBinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersAvatar;
import com.aotuspace.web.spuser.model.po.user.SpUsersBinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfo;
import com.aotuspace.web.spuser.model.po.user.SpUsersDinfoKey;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersAvatarCustom;
import com.aotuspace.web.spuser.model.po.user.custom.SpUsersBinfoCustom;
import com.aotuspace.web.spuser.model.vo.user.SpUsersBinfoQueryVo;


/**
 * 
 * Title:ISpUsersService
 * Description:用户功能模块Service接口
 * Company:Boundless
 * @author    伟宝
 * @date      2015-9-10 上午11:13:32
 *
 */
public interface ISpUsersService {
	
	/**
	 * 登陆service
	 * @param spUsersBinfoQueryVo
	 * @return
	 * @throws Exception
	 */
	public SpUsersBinfoCustom login(SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception;
	
	/**
	 * 注册service
	 * @param spUsersBinfo
	 * @return
	 * @throws Exception
	 */
	public SpUsersBinfoCustom register(SpUsersBinfo spUsersBinfo) throws Exception;
	
	//忘记密码
	public SpUsersBinfoCustom forgetPassword(SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception;
	
	/**
	 * 根据aotuid和用户身份查询用户
	 * @param spAutoId
	 * @return
	 * @throws Exception
	 */
	public boolean findUserByAutoIdAndIdenId(Integer spAutoId,int spIdentId)throws Exception;
	
	/**
	 * 根据aotuid查询主播信息
	 * @param spAutoId
	 * @return
	 * @throws Exception
	 */
	public SpAnchorBinfo findAnBySpAutoId(Integer spAutoId)throws Exception;
	
	/**
	 * 根据key用户详细信息
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public SpUsersDinfo findUserDInfoByKey(SpUsersDinfoKey key)throws Exception;
	
	/**
	 * 根据aotuid查询用户详细信息
	 * @param spAutoId
	 * @return
	 * @throws Exception
	 */
	public List<SpUsersDinfo> findUserDInfoByAutoId(Integer spAutoId)throws Exception;
	
	/**
	 * 更新用户详细信息
	 * @param spUsersDinfo
	 * @throws Exception
	 */
	public void updateUserDinfo(SpUsersDinfo spUsersDinfo)throws Exception;
	
	//头像信息操作
	
	/**
	 * 查找同头像（原图）
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	public SpUsersAvatar  findUserAvatarBySpId(Integer spId)throws Exception;
	
	/**
	 * 查找头像（缩略图）
	 * @param avatarId
	 * @return
	 * @throws Exception
	 */
	public List<SpUsersAvatar> findUserAvatarByAvatarId(Integer avatarId)throws Exception;
	
	
	/**
	 * 保存头像
	 * @param spUsersAvatar
	 * @throws Exception
	 */
	public void saveUserAvatar(SpUsersAvatarCustom spUsersAvatarC)throws Exception;
	
	/**
	 * 删除头像信息
	 * @param spId
	 * @throws Exception
	 */
	public void deleteUserAvatar(Integer spId)throws Exception;
	
	
}
