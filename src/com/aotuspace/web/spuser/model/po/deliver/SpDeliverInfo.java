package com.aotuspace.web.spuser.model.po.deliver;

/**
 * 
 * Title:SpDeliverInfo
 * Description:收货地址信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-31 上午11:28:13
 *
 */
public class SpDeliverInfo {
    private Integer spId;

    private Integer spAtuid;

    protected String spArea;

    private String spAddress;

    private String spPostcode;

    private String spReceiver;

    private String spMobie;

    private String spTelephone;

    private Integer spIsdefault;

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

    public String getSpArea() {
        return spArea;
    }

    public void setSpArea(String spArea) {
        this.spArea = spArea == null ? null : spArea.trim();
    }

    public String getSpAddress() {
        return spAddress;
    }

    public void setSpAddress(String spAddress) {
        this.spAddress = spAddress == null ? null : spAddress.trim();
    }

    public String getSpPostcode() {
        return spPostcode;
    }

    public void setSpPostcode(String spPostcode) {
        this.spPostcode = spPostcode == null ? null : spPostcode.trim();
    }

    public String getSpReceiver() {
        return spReceiver;
    }

    public void setSpReceiver(String spReceiver) {
        this.spReceiver = spReceiver == null ? null : spReceiver.trim();
    }

    public String getSpMobie() {
        return spMobie;
    }

    public void setSpMobie(String spMobie) {
        this.spMobie = spMobie == null ? null : spMobie.trim();
    }

    public String getSpTelephone() {
        return spTelephone;
    }

    public void setSpTelephone(String spTelephone) {
        this.spTelephone = spTelephone == null ? null : spTelephone.trim();
    }

    public Integer getSpIsdefault() {
        return spIsdefault;
    }

    public void setSpIsdefault(Integer spIsdefault) {
        this.spIsdefault = spIsdefault;
    }
}