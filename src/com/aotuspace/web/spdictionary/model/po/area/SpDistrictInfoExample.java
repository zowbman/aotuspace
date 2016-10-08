package com.aotuspace.web.spdictionary.model.po.area;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpDistrictInfoExample
 * Description:省市区条件信息
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-29 下午4:09:39
 *
 */
public class SpDistrictInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpDistrictInfoExample() {
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

        public Criteria andSpParentidIsNull() {
            addCriterion("sp_ParentId is null");
            return (Criteria) this;
        }

        public Criteria andSpParentidIsNotNull() {
            addCriterion("sp_ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andSpParentidEqualTo(Integer value) {
            addCriterion("sp_ParentId =", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidNotEqualTo(Integer value) {
            addCriterion("sp_ParentId <>", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidGreaterThan(Integer value) {
            addCriterion("sp_ParentId >", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ParentId >=", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidLessThan(Integer value) {
            addCriterion("sp_ParentId <", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ParentId <=", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidIn(List<Integer> values) {
            addCriterion("sp_ParentId in", values, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidNotIn(List<Integer> values) {
            addCriterion("sp_ParentId not in", values, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidBetween(Integer value1, Integer value2) {
            addCriterion("sp_ParentId between", value1, value2, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ParentId not between", value1, value2, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpDistrictIsNull() {
            addCriterion("sp_District is null");
            return (Criteria) this;
        }

        public Criteria andSpDistrictIsNotNull() {
            addCriterion("sp_District is not null");
            return (Criteria) this;
        }

        public Criteria andSpDistrictEqualTo(String value) {
            addCriterion("sp_District =", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictNotEqualTo(String value) {
            addCriterion("sp_District <>", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictGreaterThan(String value) {
            addCriterion("sp_District >", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("sp_District >=", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictLessThan(String value) {
            addCriterion("sp_District <", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictLessThanOrEqualTo(String value) {
            addCriterion("sp_District <=", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictLike(String value) {
            addCriterion("sp_District like", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictNotLike(String value) {
            addCriterion("sp_District not like", value, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictIn(List<String> values) {
            addCriterion("sp_District in", values, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictNotIn(List<String> values) {
            addCriterion("sp_District not in", values, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictBetween(String value1, String value2) {
            addCriterion("sp_District between", value1, value2, "spDistrict");
            return (Criteria) this;
        }

        public Criteria andSpDistrictNotBetween(String value1, String value2) {
            addCriterion("sp_District not between", value1, value2, "spDistrict");
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