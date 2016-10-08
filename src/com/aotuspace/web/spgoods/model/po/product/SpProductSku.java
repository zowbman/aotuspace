package com.aotuspace.web.spgoods.model.po.product;

import java.util.Date;

/**
 * 
 * Title:SpProductSku
 * Description:ÉÌÆ·sku
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-1 ÏÂÎç12:39:25
 *
 */
public class SpProductSku {
    private Integer spSkuid;

    private Integer spPdid;

    private Integer spPdcount;

    private Long spPdprice;

    private Integer spPdstatus;

    private String spSkupropertiesname;

    private String spSkuproperties;

    private Date spPdcredate;

    public Integer getSpSkuid() {
        return spSkuid;
    }

    public void setSpSkuid(Integer spSkuid) {
        this.spSkuid = spSkuid;
    }

    public Integer getSpPdid() {
        return spPdid;
    }

    public void setSpPdid(Integer spPdid) {
        this.spPdid = spPdid;
    }

    public Integer getSpPdcount() {
        return spPdcount;
    }

    public void setSpPdcount(Integer spPdcount) {
        this.spPdcount = spPdcount;
    }

    public Long getSpPdprice() {
        return spPdprice;
    }

    public void setSpPdprice(Long spPdprice) {
        this.spPdprice = spPdprice;
    }

    public Integer getSpPdstatus() {
        return spPdstatus;
    }

    public void setSpPdstatus(Integer spPdstatus) {
        this.spPdstatus = spPdstatus;
    }

    public String getSpSkupropertiesname() {
        return spSkupropertiesname;
    }

    public void setSpSkupropertiesname(String spSkupropertiesname) {
        this.spSkupropertiesname = spSkupropertiesname == null ? null : spSkupropertiesname.trim();
    }

    public String getSpSkuproperties() {
        return spSkuproperties;
    }

    public void setSpSkuproperties(String spSkuproperties) {
        this.spSkuproperties = spSkuproperties == null ? null : spSkuproperties.trim();
    }

    public Date getSpPdcredate() {
        return spPdcredate;
    }

    public void setSpPdcredate(Date spPdcredate) {
        this.spPdcredate = spPdcredate;
    }
}