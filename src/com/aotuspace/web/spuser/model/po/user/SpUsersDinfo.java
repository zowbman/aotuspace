package com.aotuspace.web.spuser.model.po.user;

import java.util.Date;

/**
 * 
 * Title:SpUsersDinfo
 * Description:用户详细信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:40:59
 *
 */
public class SpUsersDinfo extends SpUsersDinfoKey {
    protected String spNickname;

    private Integer spIcon;

    private String spRealname;

    private String spSex;

    private Date spBirth;

    private Byte spAnimal;

    private Byte spAge;

    private Byte spCon;

    private String spUserdistrict;

    private String spAddress;

    public String getSpNickname() {
        return spNickname;
    }

    public void setSpNickname(String spNickname) {
        this.spNickname = spNickname == null ? null : spNickname.trim();
    }

    public Integer getSpIcon() {
        return spIcon;
    }

    public void setSpIcon(Integer spIcon) {
        this.spIcon = spIcon;
    }

    public String getSpRealname() {
        return spRealname;
    }

    public void setSpRealname(String spRealname) {
        this.spRealname = spRealname == null ? null : spRealname.trim();
    }

    public String getSpSex() {
        return spSex;
    }

    public void setSpSex(String spSex) {
        this.spSex = spSex == null ? null : spSex.trim();
    }

    public Date getSpBirth() {
        return spBirth;
    }

    public void setSpBirth(Date spBirth) {
        this.spBirth = spBirth;
    }

    public Byte getSpAnimal() {
        return spAnimal;
    }

    public void setSpAnimal(Byte spAnimal) {
        this.spAnimal = spAnimal;
    }

    public Byte getSpAge() {
        return spAge;
    }

    public void setSpAge(Byte spAge) {
        this.spAge = spAge;
    }

    public Byte getSpCon() {
        return spCon;
    }

    public void setSpCon(Byte spCon) {
        this.spCon = spCon;
    }

    public String getSpUserdistrict() {
        return spUserdistrict;
    }

    public void setSpUserdistrict(String spUserdistrict) {
        this.spUserdistrict = spUserdistrict == null ? null : spUserdistrict.trim();
    }

    public String getSpAddress() {
        return spAddress;
    }

    public void setSpAddress(String spAddress) {
        this.spAddress = spAddress == null ? null : spAddress.trim();
    }
}