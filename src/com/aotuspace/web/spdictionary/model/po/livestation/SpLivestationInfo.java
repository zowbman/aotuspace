package com.aotuspace.web.spdictionary.model.po.livestation;

/**
 * 
 * Title:SpLivestationInfo
 * Description:直播平台类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-7 上午10:57:30
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