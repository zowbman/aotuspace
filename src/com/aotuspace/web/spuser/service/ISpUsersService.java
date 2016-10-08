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
 * Description:�û�����ģ��Service�ӿ�
 * Company:Boundless
 * @author    ΰ��
 * @date      2015-9-10 ����11:13:32
 *
 */
public interface ISpUsersService {
	
	/**
	 * ��½service
	 * @param spUsersBinfoQueryVo
	 * @return
	 * @throws Exception
	 */
	public SpUsersBinfoCustom login(SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception;
	
	/**
	 * ע��service
	 * @param spUsersBinfo
	 * @return
	 * @throws Exception
	 */
	public SpUsersBinfoCustom register(SpUsersBinfo spUsersBinfo) throws Exception;
	
	//��������
	public SpUsersBinfoCustom forgetPassword(SpUsersBinfoQueryVo spUsersBinfoQueryVo) throws Exception;
	
	/**
	 * ����aotuid���û���ݲ�ѯ�û�
	 * @param spAutoId
	 * @return
	 * @throws Exception
	 */
	public boolean findUserByAutoIdAndIdenId(Integer spAutoId,int spIdentId)throws Exception;
	
	/**
	 * ����aotuid��ѯ������Ϣ
	 * @param spAutoId
	 * @return
	 * @throws Exception
	 */
	public SpAnchorBinfo findAnBySpAutoId(Integer spAutoId)throws Exception;
	
	/**
	 * ����key�û���ϸ��Ϣ
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public SpUsersDinfo findUserDInfoByKey(SpUsersDinfoKey key)throws Exception;
	
	/**
	 * ����aotuid��ѯ�û���ϸ��Ϣ
	 * @param spAutoId
	 * @return
	 * @throws Exception
	 */
	public List<SpUsersDinfo> findUserDInfoByAutoId(Integer spAutoId)throws Exception;
	
	/**
	 * �����û���ϸ��Ϣ
	 * @param spUsersDinfo
	 * @throws Exception
	 */
	public void updateUserDinfo(SpUsersDinfo spUsersDinfo)throws Exception;
	
	//ͷ����Ϣ����
	
	/**
	 * ����ͬͷ��ԭͼ��
	 * @param spId
	 * @return
	 * @throws Exception
	 */
	public SpUsersAvatar  findUserAvatarBySpId(Integer spId)throws Exception;
	
	/**
	 * ����ͷ������ͼ��
	 * @param avatarId
	 * @return
	 * @throws Exception
	 */
	public List<SpUsersAvatar> findUserAvatarByAvatarId(Integer avatarId)throws Exception;
	
	
	/**
	 * ����ͷ��
	 * @param spUsersAvatar
	 * @throws Exception
	 */
	public void saveUserAvatar(SpUsersAvatarCustom spUsersAvatarC)throws Exception;
	
	/**
	 * ɾ��ͷ����Ϣ
	 * @param spId
	 * @throws Exception
	 */
	public void deleteUserAvatar(Integer spId)throws Exception;
	
	
}
