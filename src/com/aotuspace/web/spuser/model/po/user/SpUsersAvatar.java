package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpUsersAvatar
 * Description:�û�ͷ��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-28 ����11:08:35
 *
 */
public class SpUsersAvatar {
	
    private Integer spId;

    protected String spAvatar;

    protected Integer spAvatarid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpAvatar() {
        return spAvatar;
    }

    public void setSpAvatar(String spAvatar) {
        this.spAvatar = spAvatar == null ? null : spAvatar.trim();
    }

    public Integer getSpAvatarid() {
        return spAvatarid;
    }

    public void setSpAvatarid(Integer spAvatarid) {
        this.spAvatarid = spAvatarid;
    }
}