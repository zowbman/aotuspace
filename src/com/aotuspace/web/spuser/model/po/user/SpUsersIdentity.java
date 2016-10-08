package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpUsersIdentity
 * Description:用户基本信息身份
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:31:32
 *
 */
public class SpUsersIdentity {
    private Byte spId;

    private String spIdentityn;

    public Byte getSpId() {
        return spId;
    }

    public void setSpId(Byte spId) {
        this.spId = spId;
    }

    public String getSpIdentityn() {
        return spIdentityn;
    }

    public void setSpIdentityn(String spIdentityn) {
        this.spIdentityn = spIdentityn == null ? null : spIdentityn.trim();
    }
}