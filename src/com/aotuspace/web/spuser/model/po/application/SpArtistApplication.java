package com.aotuspace.web.spuser.model.po.application;

import java.util.Date;

/**
 * 
 * Title:SpArtistApplication
 * Description:其他艺人申请
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午2:37:21
 *
 */
public class SpArtistApplication {
    private Integer spId;

    private Integer spAtuid;

    private String spArname;

    private String spArcontent;

    private String spArscreensort;

    private Integer spAppresult;

    private Integer spApplicationdetailid;

    private Date spApplydate;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSpAtuid() {
        return spAtuid;
    }

    public void setSpAtuid(Integer spAtuid) {
        this.spAtuid = spAtuid;
    }

    public String getSpArname() {
        return spArname;
    }

    public void setSpArname(String spArname) {
        this.spArname = spArname == null ? null : spArname.trim();
    }

    public String getSpArcontent() {
        return spArcontent;
    }

    public void setSpArcontent(String spArcontent) {
        this.spArcontent = spArcontent == null ? null : spArcontent.trim();
    }

    public String getSpArscreensort() {
        return spArscreensort;
    }

    public void setSpArscreensort(String spArscreensort) {
        this.spArscreensort = spArscreensort == null ? null : spArscreensort.trim();
    }

    public Integer getSpAppresult() {
        return spAppresult;
    }

    public void setSpAppresult(Integer spAppresult) {
        this.spAppresult = spAppresult;
    }

    public Integer getSpApplicationdetailid() {
        return spApplicationdetailid;
    }

    public void setSpApplicationdetailid(Integer spApplicationdetailid) {
        this.spApplicationdetailid = spApplicationdetailid;
    }

    public Date getSpApplydate() {
        return spApplydate;
    }

    public void setSpApplydate(Date spApplydate) {
        this.spApplydate = spApplydate;
    }
}