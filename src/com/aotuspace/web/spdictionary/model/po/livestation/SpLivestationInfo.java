package com.aotuspace.web.spdictionary.model.po.livestation;

/**
 * 
 * Title:SpLivestationInfo
 * Description:ֱ��ƽ̨��
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-7 ����10:57:30
 *
 */
public class SpLivestationInfo {
    private Byte spId;

    private String spListationn;

    public Byte getSpId() {
        return spId;
    }

    public void setSpId(Byte spId) {
        this.spId = spId;
    }

    public String getSpListationn() {
        return spListationn;
    }

    public void setSpListationn(String spListationn) {
        this.spListationn = spListationn == null ? null : spListationn.trim();
    }
}