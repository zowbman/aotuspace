package com.aotuspace.web.spdictionary.model.po.bank;

/**
 * 
 * Title:SpBankBranch
 * Description:Ö§ÐÐ
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-4 ÏÂÎç3:32:23
 *
 */
public class SpBankBranch {
    private Long id;

    private Integer proId;

    private Integer cityId;

    private Integer bankId;

    private String name;

    private String address;

    private String telephone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}