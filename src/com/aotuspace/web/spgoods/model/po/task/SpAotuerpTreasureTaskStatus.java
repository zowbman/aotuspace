package com.aotuspace.web.spgoods.model.po.task;

/**
 * 
 * Title:SpAotuerpTreasureTaskStatus
 * Description:����״̬
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:03:26
 *
 */
public class SpAotuerpTreasureTaskStatus {
    private Integer spId;

    private String spTaskstatus;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpTaskstatus() {
        return spTaskstatus;
    }

    public void setSpTaskstatus(String spTaskstatus) {
        this.spTaskstatus = spTaskstatus == null ? null : spTaskstatus.trim();
    }
}