package com.aotuspace.web.spdictionary.model.po.bank;

/**
 * 
 * Title:SpBanks
 * Description:×ÜÐÐ
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-4 ÏÂÎç3:33:03
 *
 */
public class SpBanks {
    private Integer id;

    private String name;

    private String nameen;

    private String briefname;

    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }

    public String getBriefname() {
        return briefname;
    }

    public void setBriefname(String briefname) {
        this.briefname = briefname == null ? null : briefname.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}