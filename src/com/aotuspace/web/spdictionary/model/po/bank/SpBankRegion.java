package com.aotuspace.web.spdictionary.model.po.bank;

/**
 * 
 * Title:SpBankRegion
 * Description:银行地域
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午3:32:44
 *
 */
public class SpBankRegion {
    private Integer id;

    private Integer pid;

    private String name;

    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}