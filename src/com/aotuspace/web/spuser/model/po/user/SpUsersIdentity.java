package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpUsersIdentity
 * Description:�û�������Ϣ���
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-9-13 ����8:31:32
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