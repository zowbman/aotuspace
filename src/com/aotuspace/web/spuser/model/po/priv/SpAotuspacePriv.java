package com.aotuspace.web.spuser.model.po.priv;

/**
 * 
 * Title:SpAotuspacePriv
 * Description:È¨ÏÞ
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-9-13 ÏÂÎç8:31:58
 *
 */
public class SpAotuspacePriv {
    private Integer spId;

    private String spName;

    private String spUrl;

    private Integer spPid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    public String getSpUrl() {
        return spUrl;
    }

    public void setSpUrl(String spUrl) {
        this.spUrl = spUrl == null ? null : spUrl.trim();
    }

    public Integer getSpPid() {
        return spPid;
    }

    public void setSpPid(Integer spPid) {
        this.spPid = spPid;
    }
}