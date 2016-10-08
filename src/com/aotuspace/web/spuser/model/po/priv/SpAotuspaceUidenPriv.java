package com.aotuspace.web.spuser.model.po.priv;

/**
 * 
 * Title:SpAotuspaceUidenPriv
 * Description:身份权限
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:33:00
 *
 */
public class SpAotuspaceUidenPriv {
    private Integer spId;

    private Byte spIdentid;

    private Integer spPrivid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Byte getSpIdentid() {
        return spIdentid;
    }

    public void setSpIdentid(Byte spIdentid) {
        this.spIdentid = spIdentid;
    }

    public Integer getSpPrivid() {
        return spPrivid;
    }

    public void setSpPrivid(Integer spPrivid) {
        this.spPrivid = spPrivid;
    }
}