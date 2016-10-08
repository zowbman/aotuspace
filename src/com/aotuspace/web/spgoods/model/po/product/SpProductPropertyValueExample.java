package com.aotuspace.web.spgoods.model.po.product;

import java.util.ArrayList;
import java.util.List;

public class SpProductPropertyValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpProductPropertyValueExample() {
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

        public Criteria andSpPropertyvalueIsNull() {
            addCriterion("sp_PropertyValue is null");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueIsNotNull() {
            addCriterion("sp_PropertyValue is not null");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueEqualTo(String value) {
            addCriterion("sp_PropertyValue =", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueNotEqualTo(String value) {
            addCriterion("sp_PropertyValue <>", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueGreaterThan(String value) {
            addCriterion("sp_PropertyValue >", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PropertyValue >=", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueLessThan(String value) {
            addCriterion("sp_PropertyValue <", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueLessThanOrEqualTo(String value) {
            addCriterion("sp_PropertyValue <=", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueLike(String value) {
            addCriterion("sp_PropertyValue like", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueNotLike(String value) {
            addCriterion("sp_PropertyValue not like", value, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueIn(List<String> values) {
            addCriterion("sp_PropertyValue in", values, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueNotIn(List<String> values) {
            addCriterion("sp_PropertyValue not in", values, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueBetween(String value1, String value2) {
            addCriterion("sp_PropertyValue between", value1, value2, "spPropertyvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertyvalueNotBetween(String value1, String value2) {
            addCriterion("sp_PropertyValue not between", value1, value2, "spPropertyvalue");
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

        public Criteria andSpCategoryidIsNull() {
            addCriterion("sp_CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidIsNotNull() {
            addCriterion("sp_CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidEqualTo(Integer value) {
            addCriterion("sp_CategoryId =", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidNotEqualTo(Integer value) {
            addCriterion("sp_CategoryId <>", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidGreaterThan(Integer value) {
            addCriterion("sp_CategoryId >", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_CategoryId >=", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidLessThan(Integer value) {
            addCriterion("sp_CategoryId <", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_CategoryId <=", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidIn(List<Integer> values) {
            addCriterion("sp_CategoryId in", values, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidNotIn(List<Integer> values) {
            addCriterion("sp_CategoryId not in", values, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("sp_CategoryId between", value1, value2, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_CategoryId not between", value1, value2, "spCategoryid");
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