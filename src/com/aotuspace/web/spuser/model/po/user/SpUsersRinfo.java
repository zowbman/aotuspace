package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpUsersRinfo
 * Description:�û���ʵ��Ϣ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-26 ����12:41:45
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