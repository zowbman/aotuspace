package com.aotuspace.web.spdictionary.model.po.livestation;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpLivestationInfoExample
 * Description:直播平台条件类
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-7 上午10:57:45
 *
 */
public class SpLivestationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpLivestationInfoExample() {
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

        public Criteria andSpIdEqualTo(Byte value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Byte value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Byte value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Byte value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Byte value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Byte> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Byte> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Byte value1, Byte value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpListationnIsNull() {
            addCriterion("sp_LiStationN is null");
            return (Criteria) this;
        }

        public Criteria andSpListationnIsNotNull() {
            addCriterion("sp_LiStationN is not null");
            return (Criteria) this;
        }

        public Criteria andSpListationnEqualTo(String value) {
            addCriterion("sp_LiStationN =", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnNotEqualTo(String value) {
            addCriterion("sp_LiStationN <>", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnGreaterThan(String value) {
            addCriterion("sp_LiStationN >", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnGreaterThanOrEqualTo(String value) {
            addCriterion("sp_LiStationN >=", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnLessThan(String value) {
            addCriterion("sp_LiStationN <", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnLessThanOrEqualTo(String value) {
            addCriterion("sp_LiStationN <=", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnLike(String value) {
            addCriterion("sp_LiStationN like", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnNotLike(String value) {
            addCriterion("sp_LiStationN not like", value, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnIn(List<String> values) {
            addCriterion("sp_LiStationN in", values, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnNotIn(List<String> values) {
            addCriterion("sp_LiStationN not in", values, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnBetween(String value1, String value2) {
            addCriterion("sp_LiStationN between", value1, value2, "spListationn");
            return (Criteria) this;
        }

        public Criteria andSpListationnNotBetween(String value1, String value2) {
            addCriterion("sp_LiStationN not between", value1, value2, "spListationn");
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