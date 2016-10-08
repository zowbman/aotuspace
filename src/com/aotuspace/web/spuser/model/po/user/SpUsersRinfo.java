package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpUsersRinfo
 * Description:用户真实信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:41:45
 *
 */
public class SpUsersRinfo extends SpUsersRinfoKey {
    private String spIdnum;

    private String spIdnumsort;

    public String getSpIdnum() {
        return spIdnum;
    }

    public void setSpIdnum(String spIdnum) {
        this.spIdnum = spIdnum == null ? null : spIdnum.trim();
    }

    public String getSpIdnumsort() {
        return spIdnumsort;
    }

    public void setSpIdnumsort(String spIdnumsort) {
        this.spIdnumsort = spIdnumsort == null ? null : spIdnumsort.trim();
    }
}