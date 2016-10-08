package com.aotuspace.web.spgoods.model.po.task;

import java.util.Date;

/**
 * 
 * Title:SpAotuerpTreasureTask
 * Description:任务
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:01:45
 *
 */
public class SpAotuerpTreasureTask {
	private Integer spId;

	private Integer spTreasureid;

	private Date spTaskuploadtime;

	private Date spTaskunloadtime;

	private Integer spAnid;

	private Integer spTaskaging;

	private Integer spStatusid;

	private String spTaskremark;

	private Integer spTaskmodeid;

	public Integer getSpId() {
		return spId;
	}

	public void setSpId(Integer spId) {
		this.spId = spId;
	}

	public Integer getSpTreasureid() {
		return spTreasureid;
	}

	public void setSpTreasureid(Integer spTreasureid) {
		this.spTreasureid = spTreasureid;
	}

	public Date getSpTaskuploadtime() {
		return spTaskuploadtime;
	}

	public void setSpTaskuploadtime(Date spTaskuploadtime) {
		this.spTaskuploadtime = spTaskuploadtime;
	}

	public Date getSpTaskunloadtime() {
		return spTaskunloadtime;
	}

	public void setSpTaskunloadtime(Date spTaskunloadtime) {
		this.spTaskunloadtime = spTaskunloadtime;
	}

	public Integer getSpAnid() {
		return spAnid;
	}

	public void setSpAnid(Integer spAnid) {
		this.spAnid = spAnid;
	}

	public Integer getSpTaskaging() {
		return spTaskaging;
	}

	public void setSpTaskaging(Integer spTaskaging) {
		this.spTaskaging = spTaskaging;
	}

	public Integer getSpStatusid() {
		return spStatusid;
	}

	public void setSpStatusid(Integer spStatusid) {
		this.spStatusid = spStatusid;
	}

	public String getSpTaskremark() {
		return spTaskremark;
	}

	public void setSpTaskremark(String spTaskremark) {
		this.spTaskremark = spTaskremark == null ? null : spTaskremark.trim();
	}

	public Integer getSpTaskmodeid() {
		return spTaskmodeid;
	}

	public void setSpTaskmodeid(Integer spTaskmodeid) {
		this.spTaskmodeid = spTaskmodeid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spId == null) ? 0 : spId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//if (getClass() != obj.getClass()) //因为mybatis、hibernate的代理模式问题，
		//使得equal方法的getClass出来是有代理对象和真实对象，改为if (!(obj instanceof SpAotuerpTreasureTask))
		if (!(obj instanceof SpAotuerpTreasureTask))
			return false;
		SpAotuerpTreasureTask other = (SpAotuerpTreasureTask) obj;
		if (spId == null) {
			if (other.spId != null)
				return false;
		} else if (!spId.equals(other.spId))
			return false;
		return true;
	}
	
	
}
