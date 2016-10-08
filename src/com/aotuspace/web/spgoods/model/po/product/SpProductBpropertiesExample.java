package com.aotuspace.web.spgoods.model.po.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpProductBpropertiesExample
 * Description:商品属性条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-11 下午3:05:29
 *
 */
public class SpProductBpropertiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpProductBpropertiesExample() {
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

        public Criteria andSpPdidIsNull() {
            addCriterion("sp_PdId is null");
            return (Criteria) this;
        }

        public Criteria andSpPdidIsNotNull() {
            addCriterion("sp_PdId is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdidEqualTo(Integer value) {
            addCriterion("sp_PdId =", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidNotEqualTo(Integer value) {
            addCriterion("sp_PdId <>", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidGreaterThan(Integer value) {
            addCriterion("sp_PdId >", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PdId >=", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidLessThan(Integer value) {
            addCriterion("sp_PdId <", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PdId <=", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidIn(List<Integer> values) {
            addCriterion("sp_PdId in", values, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidNotIn(List<Integer> values) {
            addCriterion("sp_PdId not in", values, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdId between", value1, value2, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdId not between", value1, value2, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidIsNull() {
            addCriterion("sp_PropertyNameId is null");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidIsNotNull() {
            addCriterion("sp_PropertyNameId is not null");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidEqualTo(Integer value) {
            addCriterion("sp_PropertyNameId =", value, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidNotEqualTo(Integer value) {
            addCriterion("sp_PropertyNameId <>", value, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidGreaterThan(Integer value) {
            addCriterion("sp_PropertyNameId >", value, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PropertyNameId >=", value, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidLessThan(Integer value) {
            addCriterion("sp_PropertyNameId <", value, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PropertyNameId <=", value, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidIn(List<Integer> values) {
            addCriterion("sp_PropertyNameId in", values, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidNotIn(List<Integer> values) {
            addCriterion("sp_PropertyNameId not in", values, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidBetween(Integer value1, Integer value2) {
            addCriterion("sp_PropertyNameId between", value1, value2, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PropertyNameId not between", value1, value2, "spPropertynameid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidIsNull() {
            addCriterion("sp_PropertyValueId is null");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidIsNotNull() {
            addCriterion("sp_PropertyValueId is not null");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidEqualTo(Integer value) {
            addCriterion("sp_PropertyValueId =", value, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidNotEqualTo(Integer value) {
            addCriterion("sp_PropertyValueId <>", value, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidGreaterThan(Integer value) {
            addCriterion("sp_PropertyValueId >", value, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PropertyValueId >=", value, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidLessThan(Integer value) {
            addCriterion("sp_PropertyValueId <", value, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PropertyValueId <=", value, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidIn(List<Integer> values) {
            addCriterion("sp_PropertyValueId in", values, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidNotIn(List<Integer> values) {
            addCriterion("sp_PropertyValueId not in", values, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidBetween(Integer value1, Integer value2) {
            addCriterion("sp_PropertyValueId between", value1, value2, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PropertyValueId not between", value1, value2, "spPropertyvalueid");
            return (Criteria) this;
        }

        public Criteria andSpIsskuIsNull() {
            addCriterion("sp_IsSku is null");
            return (Criteria) this;
        }

        public Criteria andSpIsskuIsNotNull() {
            addCriterion("sp_IsSku is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsskuEqualTo(Integer value) {
            addCriterion("sp_IsSku =", value, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuNotEqualTo(Integer value) {
            addCriterion("sp_IsSku <>", value, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuGreaterThan(Integer value) {
            addCriterion("sp_IsSku >", value, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsSku >=", value, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuLessThan(Integer value) {
            addCriterion("sp_IsSku <", value, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsSku <=", value, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuIn(List<Integer> values) {
            addCriterion("sp_IsSku in", values, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuNotIn(List<Integer> values) {
            addCriterion("sp_IsSku not in", values, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsSku between", value1, value2, "spIssku");
            return (Criteria) this;
        }

        public Criteria andSpIsskuNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsSku not between", value1, value2, "spIssku");
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