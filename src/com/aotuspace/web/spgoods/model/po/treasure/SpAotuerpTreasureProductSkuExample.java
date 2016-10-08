package com.aotuspace.web.spgoods.model.po.treasure;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureProductSkuExample
 * Description:宝贝商品sku条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:04:42
 *
 */
public class SpAotuerpTreasureProductSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureProductSkuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Integer value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Integer value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Integer value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Integer value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Integer value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Integer> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Integer> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Integer value1, Integer value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidIsNull() {
            addCriterion("sp_TreasureId is null");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidIsNotNull() {
            addCriterion("sp_TreasureId is not null");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidEqualTo(Integer value) {
            addCriterion("sp_TreasureId =", value, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidNotEqualTo(Integer value) {
            addCriterion("sp_TreasureId <>", value, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidGreaterThan(Integer value) {
            addCriterion("sp_TreasureId >", value, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_TreasureId >=", value, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidLessThan(Integer value) {
            addCriterion("sp_TreasureId <", value, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_TreasureId <=", value, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidIn(List<Integer> values) {
            addCriterion("sp_TreasureId in", values, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidNotIn(List<Integer> values) {
            addCriterion("sp_TreasureId not in", values, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidBetween(Integer value1, Integer value2) {
            addCriterion("sp_TreasureId between", value1, value2, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_TreasureId not between", value1, value2, "spTreasureid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidIsNull() {
            addCriterion("sp_SkuId is null");
            return (Criteria) this;
        }

        public Criteria andSpSkuidIsNotNull() {
            addCriterion("sp_SkuId is not null");
            return (Criteria) this;
        }

        public Criteria andSpSkuidEqualTo(Integer value) {
            addCriterion("sp_SkuId =", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidNotEqualTo(Integer value) {
            addCriterion("sp_SkuId <>", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidGreaterThan(Integer value) {
            addCriterion("sp_SkuId >", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_SkuId >=", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidLessThan(Integer value) {
            addCriterion("sp_SkuId <", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_SkuId <=", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidIn(List<Integer> values) {
            addCriterion("sp_SkuId in", values, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidNotIn(List<Integer> values) {
            addCriterion("sp_SkuId not in", values, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidBetween(Integer value1, Integer value2) {
            addCriterion("sp_SkuId between", value1, value2, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_SkuId not between", value1, value2, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceIsNull() {
            addCriterion("sp_SalesPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceIsNotNull() {
            addCriterion("sp_SalesPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceEqualTo(Long value) {
            addCriterion("sp_SalesPrice =", value, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceNotEqualTo(Long value) {
            addCriterion("sp_SalesPrice <>", value, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceGreaterThan(Long value) {
            addCriterion("sp_SalesPrice >", value, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_SalesPrice >=", value, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceLessThan(Long value) {
            addCriterion("sp_SalesPrice <", value, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceLessThanOrEqualTo(Long value) {
            addCriterion("sp_SalesPrice <=", value, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceIn(List<Long> values) {
            addCriterion("sp_SalesPrice in", values, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceNotIn(List<Long> values) {
            addCriterion("sp_SalesPrice not in", values, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceBetween(Long value1, Long value2) {
            addCriterion("sp_SalesPrice between", value1, value2, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalespriceNotBetween(Long value1, Long value2) {
            addCriterion("sp_SalesPrice not between", value1, value2, "spSalesprice");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityIsNull() {
            addCriterion("sp_SalesQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityIsNotNull() {
            addCriterion("sp_SalesQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityEqualTo(Integer value) {
            addCriterion("sp_SalesQuantity =", value, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityNotEqualTo(Integer value) {
            addCriterion("sp_SalesQuantity <>", value, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityGreaterThan(Integer value) {
            addCriterion("sp_SalesQuantity >", value, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_SalesQuantity >=", value, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityLessThan(Integer value) {
            addCriterion("sp_SalesQuantity <", value, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityLessThanOrEqualTo(Integer value) {
            addCriterion("sp_SalesQuantity <=", value, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityIn(List<Integer> values) {
            addCriterion("sp_SalesQuantity in", values, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityNotIn(List<Integer> values) {
            addCriterion("sp_SalesQuantity not in", values, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityBetween(Integer value1, Integer value2) {
            addCriterion("sp_SalesQuantity between", value1, value2, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_SalesQuantity not between", value1, value2, "spSalesquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityIsNull() {
            addCriterion("sp_SalesOrderQuantity is null");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityIsNotNull() {
            addCriterion("sp_SalesOrderQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityEqualTo(Integer value) {
            addCriterion("sp_SalesOrderQuantity =", value, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityNotEqualTo(Integer value) {
            addCriterion("sp_SalesOrderQuantity <>", value, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityGreaterThan(Integer value) {
            addCriterion("sp_SalesOrderQuantity >", value, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_SalesOrderQuantity >=", value, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityLessThan(Integer value) {
            addCriterion("sp_SalesOrderQuantity <", value, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityLessThanOrEqualTo(Integer value) {
            addCriterion("sp_SalesOrderQuantity <=", value, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityIn(List<Integer> values) {
            addCriterion("sp_SalesOrderQuantity in", values, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityNotIn(List<Integer> values) {
            addCriterion("sp_SalesOrderQuantity not in", values, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityBetween(Integer value1, Integer value2) {
            addCriterion("sp_SalesOrderQuantity between", value1, value2, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpSalesorderquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_SalesOrderQuantity not between", value1, value2, "spSalesorderquantity");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceIsNull() {
            addCriterion("sp_TotalPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceIsNotNull() {
            addCriterion("sp_TotalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceEqualTo(Long value) {
            addCriterion("sp_TotalPrice =", value, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceNotEqualTo(Long value) {
            addCriterion("sp_TotalPrice <>", value, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceGreaterThan(Long value) {
            addCriterion("sp_TotalPrice >", value, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_TotalPrice >=", value, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceLessThan(Long value) {
            addCriterion("sp_TotalPrice <", value, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceLessThanOrEqualTo(Long value) {
            addCriterion("sp_TotalPrice <=", value, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceIn(List<Long> values) {
            addCriterion("sp_TotalPrice in", values, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceNotIn(List<Long> values) {
            addCriterion("sp_TotalPrice not in", values, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceBetween(Long value1, Long value2) {
            addCriterion("sp_TotalPrice between", value1, value2, "spTotalprice");
            return (Criteria) this;
        }

        public Criteria andSpTotalpriceNotBetween(Long value1, Long value2) {
            addCriterion("sp_TotalPrice not between", value1, value2, "spTotalprice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}