package com.aotuspace.web.spgoods.model.po.treasure;

/**
 * 
 * Title:SpAotuerpTreasureImg
 * Description:±¦±´Í¼Æ¬
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:03:54
 *
 */

public class SpAotuerpTreasureImg {
    private Integer spId;

    private String spImg;

    private Integer spIsprimary;

    private Integer spImgorder;

    private Integer spImgsize;

    private Integer spImgwidth;

    private Integer spImgheight;

    private Integer spOrginalimgid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpImg() {
        return spImg;
    }

    public void setSpImg(String spImg) {
        this.spImg = spImg == null ? null : spImg.trim();
    }

    public Integer getSpIsprimary() {
        return spIsprimary;
    }

    public void setSpIsprimary(Integer spIsprimary) {
        this.spIsprimary = spIsprimary;
    }

    public Integer getSpImgorder() {
        return spImgorder;
    }

    public void setSpImgorder(Integer spImgorder) {
        this.spImgorder = spImgorder;
    }

    public Integer getSpImgsize() {
        return spImgsize;
    }

    public void setSpImgsize(Integer spImgsize) {
        this.spImgsize = spImgsize;
    }

    public Integer getSpImgwidth() {
        return spImgwidth;
    }

    public void setSpImgwidth(Integer spImgwidth) {
        this.spImgwidth = spImgwidth;
    }

    public Integer getSpImgheight() {
        return spImgheight;
    }

    public void setSpImgheight(Integer spImgheight) {
        this.spImgheight = spImgheight;
    }

    public Integer getSpOrginalimgid() {
        return spOrginalimgid;
    }

    public void setSpOrginalimgid(Integer spOrginalimgid) {
        this.spOrginalimgid = spOrginalimgid;
    }
}