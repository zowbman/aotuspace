package com.aotuspace.web.spgoods.model.po.treasure;

/**
 * 
 * Title:SpAotuerpTreasureStatus
 * Description:����״̬
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-11-30 ����6:04:58
 *
 */
public class SpAotuerpTreasureStatus {
    private Integer spId;

    private String spTreasurestatus;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpTreasurestatus() {
        return spTreasurestatus;
    }

    public void setSpTreasurestatus(String spTreasurestatus) {
        this.spTreasurestatus = spTreasurestatus == null ? null : spTreasurestatus.trim();
    }
}