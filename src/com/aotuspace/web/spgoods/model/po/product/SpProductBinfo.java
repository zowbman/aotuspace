package com.aotuspace.web.spgoods.model.po.product;

import java.util.Date;

/**
 * 
 * Title:SpProductBinfo
 * Description:商品基本信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:38:20
 *
 */
public class SpProductBinfo {
    private Integer spId;

    private String spPdspu;

    private Integer spBrandid;

    private String spPdtitle;

    private String spPdfeature;

    private String spPdimage;

    private Date spPdcredate;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpPdspu() {
        return spPdspu;
    }

    public void setSpPdspu(String spPdspu) {
        this.spPdspu = spPdspu == null ? null : spPdspu.trim();
    }

    public Integer getSpBrandid() {
        return spBrandid;
    }

    public void setSpBrandid(Integer spBrandid) {
        this.spBrandid = spBrandid;
    }

    public String getSpPdtitle() {
        return spPdtitle;
    }

    public void setSpPdtitle(String spPdtitle) {
        this.spPdtitle = spPdtitle == null ? null : spPdtitle.trim();
    }

    public String getSpPdfeature() {
        return spPdfeature;
    }

    public void setSpPdfeature(String spPdfeature) {
        this.spPdfeature = spPdfeature == null ? null : spPdfeature.trim();
    }

    public String getSpPdimage() {
        return spPdimage;
    }

    public void setSpPdimage(String spPdimage) {
        this.spPdimage = spPdimage == null ? null : spPdimage.trim();
    }

    public Date getSpPdcredate() {
        return spPdcredate;
    }

    public void setSpPdcredate(Date spPdcredate) {
        this.spPdcredate = spPdcredate;
    }
}