package com.aotuspace.web.spgoods.model.po.product;

/**
 * 
 * Title:SpProductBrands
 * Description:商品品牌
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:39:02
 *
 */
public class SpProductBrands {
    private Integer spId;

    private Integer spCategoryid;

    private String spBrandn;

    private String spBrandlogo;

    private String spBrandpresent;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSpCategoryid() {
        return spCategoryid;
    }

    public void setSpCategoryid(Integer spCategoryid) {
        this.spCategoryid = spCategoryid;
    }

    public String getSpBrandn() {
        return spBrandn;
    }

    public void setSpBrandn(String spBrandn) {
        this.spBrandn = spBrandn == null ? null : spBrandn.trim();
    }

    public String getSpBrandlogo() {
        return spBrandlogo;
    }

    public void setSpBrandlogo(String spBrandlogo) {
        this.spBrandlogo = spBrandlogo == null ? null : spBrandlogo.trim();
    }

    public String getSpBrandpresent() {
        return spBrandpresent;
    }

    public void setSpBrandpresent(String spBrandpresent) {
        this.spBrandpresent = spBrandpresent == null ? null : spBrandpresent.trim();
    }
}