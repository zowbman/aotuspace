package com.aotuspace.web.spuser.model.po.user;

import java.util.Date;

/**
 * 
 * Title:SpUsersBinfo
 * Description:用户基本信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:30:53
 *
 */
public class SpUsersBinfo extends SpUsersBinfoKey {
    private String spAccount;

    private String spPassword;

    private Byte spIdentity;

    private Date spRedate;

    private String spReplace;

    private String spReip;

    private Byte spStatus;

    public String getSpAccount() {
        return spAccount;
    }

    public void setSpAccount(String spAccount) {
        this.spAccount = spAccount == null ? null : spAccount.trim();
    }

    public String getSpPassword() {
        return spPassword;
    }

    public void setSpPassword(String spPassword) {
        this.spPassword = spPassword == null ? null : spPassword.trim();
    }

    public Byte getSpIdentity() {
        return spIdentity;
    }

    public void setSpIdentity(Byte spIdentity) {
        this.spIdentity = spIdentity;
    }

    public Date getSpRedate() {
        return spRedate;
    }

    public void setSpRedate(Date spRedate) {
        this.spRedate = spRedate;
    }

    public String getSpReplace() {
        return spReplace;
    }

    public void setSpReplace(String spReplace) {
        this.spReplace = spReplace == null ? null : spReplace.trim();
    }

    public String getSpReip() {
        return spReip;
    }

    public void setSpReip(String spReip) {
        this.spReip = spReip == null ? null : spReip.trim();
    }

    public Byte getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(Byte spStatus) {
        this.spStatus = spStatus;
    }
}