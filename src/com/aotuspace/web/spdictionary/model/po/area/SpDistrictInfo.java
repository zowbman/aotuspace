package com.aotuspace.web.spdictionary.model.po.area;

/**
 * 
 * Title:SpDistrictInfo
 * Description:ʡ������Ϣ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-29 ����4:09:22
 *
 */
public class SpDistrictInfo {
    private Integer spId;

    private Integer spParentid;

    private String spDistrict;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSpParentid() {
        return spParentid;
    }

    public void setSpParentid(Integer spParentid) {
        this.spParentid = spParentid;
    }

    public String getSpDistrict() {
        return spDistrict;
    }

    public void setSpDistrict(String spDistrict) {
        this.spDistrict = spDistrict == null ? null : spDistrict.trim();
    }
}