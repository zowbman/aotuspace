package com.aotuspace.web.spgoods.model.po.task;

/**
 * 
 * Title:SpAotuerpTreasureTaskMode
 * Description:����ģʽ
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:03:09
 *
 */
public class SpAotuerpTreasureTaskMode {
    private Integer spId;

    private String spMode;

    private Integer spIsinterval;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpMode() {
        return spMode;
    }

    public void setSpMode(String spMode) {
        this.spMode = spMode == null ? null : spMode.trim();
    }

    public Integer getSpIsinterval() {
        return spIsinterval;
    }

    public void setSpIsinterval(Integer spIsinterval) {
        this.spIsinterval = spIsinterval;
    }
}