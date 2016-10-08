package com.aotuspace.web.spgoods.model.po.task;

/**
 * 
 * Title:SpAotuerpTreasureTaskLevelProfit
 * Description:任务奖励级利润
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:02:35
 *
 */
public class SpAotuerpTreasureTaskLevelProfit {
    private Integer spId;

    private Integer spRewardlevelid;

    private Long spProfitpercentage;

    private Long spProfityuan;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public Integer getSpRewardlevelid() {
        return spRewardlevelid;
    }

    public void setSpRewardlevelid(Integer spRewardlevelid) {
        this.spRewardlevelid = spRewardlevelid;
    }

    public Long getSpProfitpercentage() {
        return spProfitpercentage;
    }

    public void setSpProfitpercentage(Long spProfitpercentage) {
        this.spProfitpercentage = spProfitpercentage;
    }

    public Long getSpProfityuan() {
        return spProfityuan;
    }

    public void setSpProfityuan(Long spProfityuan) {
        this.spProfityuan = spProfityuan;
    }
}