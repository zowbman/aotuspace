package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpUsersSinfo
 * Description:安全信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:42:25
 *
 */
public class SpUsersSinfo extends SpUsersSinfoKey {
    private String spBmobie;

    private String spBemail;

    private Byte spSequestion;

    private String spSeanswer;

    public String getSpBmobie() {
        return spBmobie;
    }

    public void setSpBmobie(String spBmobie) {
        this.spBmobie = spBmobie == null ? null : spBmobie.trim();
    }

    public String getSpBemail() {
        return spBemail;
    }

    public void setSpBemail(String spBemail) {
        this.spBemail = spBemail == null ? null : spBemail.trim();
    }

    public Byte getSpSequestion() {
        return spSequestion;
    }

    public void setSpSequestion(Byte spSequestion) {
        this.spSequestion = spSequestion;
    }

    public String getSpSeanswer() {
        return spSeanswer;
    }

    public void setSpSeanswer(String spSeanswer) {
        this.spSeanswer = spSeanswer == null ? null : spSeanswer.trim();
    }
}