package com.aotuspace.web.spgoods.model.po.treasure;

/**
 * 
 * Title:SpAotuerpTreasureInfo
 * Description:±¦±´ÐÅÏ¢
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:04:13
 *
 */
public class SpAotuerpTreasureInfo {
    private Integer spId;

    private String spTreasuretitle;

    private String spTreasuresellingpoints;

    private Integer spProductid;

    private Integer spTreasurestatusid;

    private String spTreasuredescription;

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSpTreasuretitle() {
        return spTreasuretitle;
    }

    public void setSpTreasuretitle(String spTreasuretitle) {
        this.spTreasuretitle = spTreasuretitle == null ? null : spTreasuretitle.trim();
    }

    public String getSpTreasuresellingpoints() {
        return spTreasuresellingpoints;
    }

    public void setSpTreasuresellingpoints(String spTreasuresellingpoints) {
        this.spTreasuresellingpoints = spTreasuresellingpoints == null ? null : spTreasuresellingpoints.trim();
    }

    public Integer getSpProductid() {
        return spProductid;
    }

    public void setSpProductid(Integer spProductid) {
        this.spProductid = spProductid;
    }

    public Integer getSpTreasurestatusid() {
        return spTreasurestatusid;
    }

    public void setSpTreasurestatusid(Integer spTreasurestatusid) {
        this.spTreasurestatusid = spTreasurestatusid;
    }

    public String getSpTreasuredescription() {
        return spTreasuredescription;
    }

    public void setSpTreasuredescription(String spTreasuredescription) {
        this.spTreasuredescription = spTreasuredescription == null ? null : spTreasuredescription.trim();
    }
}