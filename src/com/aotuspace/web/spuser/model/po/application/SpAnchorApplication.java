package com.aotuspace.web.spuser.model.po.application;

import java.util.Date;

/**
 * 
 * Title:SpAnchorApplication
 * Description:¥˙—‘÷˜≤•…Í«Î¿‡
 * Company:aotuspace
 * @author    Œ∞±¶
 * @date      2015-12-4 œ¬ŒÁ2:36:18
 *
 */
public class SpAnchorApplication {
    private Integer spId;

    private Integer spAtuid;

    private Byte spListation;

    private String spLisrc;

    private String spLinickname;

    private String spLiscreensort;

    private Integer spApplicationdetailid;

    private Integer spAppresult;

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

    public Byte getSpListation() {
        return spListation;
    }

    public void setSpListation(Byte spListation) {
        this.spListation = spListation;
    }

    public String getSpLisrc() {
        return spLisrc;
    }

    public void setSpLisrc(String spLisrc) {
        this.spLisrc = spLisrc == null ? null : spLisrc.trim();
    }

    public String getSpLinickname() {
        return spLinickname;
    }

    public void setSpLinickname(String spLinickname) {
        this.spLinickname = spLinickname == null ? null : spLinickname.trim();
    }

    public String getSpLiscreensort() {
        return spLiscreensort;
    }

    public void setSpLiscreensort(String spLiscreensort) {
        this.spLiscreensort = spLiscreensort == null ? null : spLiscreensort.trim();
    }

    public Integer getSpApplicationdetailid() {
        return spApplicationdetailid;
    }

    public void setSpApplicationdetailid(Integer spApplicationdetailid) {
        this.spApplicationdetailid = spApplicationdetailid;
    }

    public Integer getSpAppresult() {
        return spAppresult;
    }

    public void setSpAppresult(Integer spAppresult) {
        this.spAppresult = spAppresult;
    }

    public Date getSpApplydate() {
        return spApplydate;
    }

    public void setSpApplydate(Date spApplydate) {
        this.spApplydate = spApplydate;
    }
}