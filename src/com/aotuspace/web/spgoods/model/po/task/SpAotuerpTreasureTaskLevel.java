package com.aotuspace.web.spgoods.model.po.task;

/**
 * 
 * Title:SpAotuerpTreasureTaskLevel
 * Description:任务奖励级
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:02:12
 *
 */
public class SpAotuerpTreasureTaskLevel {
    private Integer spId;

    private String spRewardlevel;

    private Integer spTaskid;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpRewardlevel() {
        return spRewardlevel;
    }

    public void setSpRewardlevel(String spRewardlevel) {
        this.spRewardlevel = spRewardlevel == null ? null : spRewardlevel.trim();
    }

    public Integer getSpTaskid() {
        return spTaskid;
    }

    public void setSpTaskid(Integer spTaskid) {
        this.spTaskid = spTaskid;
    }
}