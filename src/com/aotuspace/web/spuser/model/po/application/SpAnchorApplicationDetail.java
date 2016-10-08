package com.aotuspace.web.spuser.model.po.application;

/**
 * 
 * Title:SpAnchorApplicationDetail
 * Description:´úÑÔÖ÷²¥ÉêÇëÏêÏ¸
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-4 ÏÂÎç2:36:36
 *
 */
public class SpAnchorApplicationDetail {
    private Integer spId;

    private String spRealname;

    private String spMobie;

    private String spIdnum;

    private String spIdnumsort;

    private Integer spBank;

    private Integer spAncdistrict;

    private Long spBabranch;

    private String spBankusername;

    private Long spBaid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpRealname() {
        return spRealname;
    }

    public void setSpRealname(String spRealname) {
        this.spRealname = spRealname == null ? null : spRealname.trim();
    }

    public String getSpMobie() {
        return spMobie;
    }

    public void setSpMobie(String spMobie) {
        this.spMobie = spMobie == null ? null : spMobie.trim();
    }

    public String getSpIdnum() {
        return spIdnum;
    }

    public void setSpIdnum(String spIdnum) {
        this.spIdnum = spIdnum == null ? null : spIdnum.trim();
    }

    public String getSpIdnumsort() {
        return spIdnumsort;
    }

    public void setSpIdnumsort(String spIdnumsort) {
        this.spIdnumsort = spIdnumsort == null ? null : spIdnumsort.trim();
    }

    public Integer getSpBank() {
        return spBank;
    }

    public void setSpBank(Integer spBank) {
        this.spBank = spBank;
    }

    public Integer getSpAncdistrict() {
        return spAncdistrict;
    }

    public void setSpAncdistrict(Integer spAncdistrict) {
        this.spAncdistrict = spAncdistrict;
    }

    public Long getSpBabranch() {
        return spBabranch;
    }

    public void setSpBabranch(Long spBabranch) {
        this.spBabranch = spBabranch;
    }

    public String getSpBankusername() {
        return spBankusername;
    }

    public void setSpBankusername(String spBankusername) {
        this.spBankusername = spBankusername == null ? null : spBankusername.trim();
    }

    public Long getSpBaid() {
        return spBaid;
    }

    public void setSpBaid(Long spBaid) {
        this.spBaid = spBaid;
    }
}