package com.aotuspace.web.spgoods.model.po.treasure;

/**
 * 
 * Title:SpAotuerpTreasureProductSku
 * Description:±¦±´ÉÌÆ·sku
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:04:32
 *
 */
public class SpAotuerpTreasureProductSku {
    private Integer spId;

    private Integer spTreasureid;

    private Integer spSkuid;

    private Long spSalesprice;

    private Integer spSalesquantity;

    private Integer spSalesorderquantity;

    private Long spTotalprice;

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

    public Integer getSpSkuid() {
        return spSkuid;
    }

    public void setSpSkuid(Integer spSkuid) {
        this.spSkuid = spSkuid;
    }

    public Long getSpSalesprice() {
        return spSalesprice;
    }

    public void setSpSalesprice(Long spSalesprice) {
        this.spSalesprice = spSalesprice;
    }

    public Integer getSpSalesquantity() {
        return spSalesquantity;
    }

    public void setSpSalesquantity(Integer spSalesquantity) {
        this.spSalesquantity = spSalesquantity;
    }

    public Integer getSpSalesorderquantity() {
        return spSalesorderquantity;
    }

    public void setSpSalesorderquantity(Integer spSalesorderquantity) {
        this.spSalesorderquantity = spSalesorderquantity;
    }

    public Long getSpTotalprice() {
        return spTotalprice;
    }

    public void setSpTotalprice(Long spTotalprice) {
        this.spTotalprice = spTotalprice;
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
		if (getClass() != obj.getClass())
			return false;
		SpAotuerpTreasureProductSku other = (SpAotuerpTreasureProductSku) obj;
		if (spId == null) {
			if (other.spId != null)
				return false;
		} else if (!spId.equals(other.spId))
			return false;
		return true;
	}
    
    
}