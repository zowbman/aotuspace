package com.aotuspace.web.spuser.model.po.user;

/**
 * 
 * Title:SpAnchorBinfo
 * Description:主播基础信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-14 上午11:59:27
 *
 */
public class SpAnchorBinfo {
    private Integer spId;

    private Integer spAtuid;

    private String spResume;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSpAtuid() {
        return spAtuid;
    }

    public void setSpAtuid(Integer spAtuid) {
        this.spAtuid = spAtuid;
    }

    public String getSpResume() {
        return spResume;
    }

    public void setSpResume(String spResume) {
        this.spResume = spResume == null ? null : spResume.trim();
    }
}