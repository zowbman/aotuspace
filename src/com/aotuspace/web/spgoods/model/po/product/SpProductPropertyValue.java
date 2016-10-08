package com.aotuspace.web.spgoods.model.po.product;

/**
 * 
 * Title:SpProductPropertyValue
 * Description: Ù–‘÷µ
 * Company:aotuspace
 * @author    Œ∞±¶
 * @date      2015-12-11 œ¬ŒÁ3:37:13
 *
 */
public class SpProductPropertyValue {
    private Integer spId;

    private String spPropertyvalue;

    private Integer spPropertynameid;

    private Integer spCategoryid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpPropertyvalue() {
        return spPropertyvalue;
    }

    public void setSpPropertyvalue(String spPropertyvalue) {
        this.spPropertyvalue = spPropertyvalue == null ? null : spPropertyvalue.trim();
    }

    public Integer getSpPropertynameid() {
        return spPropertynameid;
    }

    public void setSpPropertynameid(Integer spPropertynameid) {
        this.spPropertynameid = spPropertynameid;
    }

    public Integer getSpCategoryid() {
        return spCategoryid;
    }

    public void setSpCategoryid(Integer spCategoryid) {
        this.spCategoryid = spCategoryid;
    }
}