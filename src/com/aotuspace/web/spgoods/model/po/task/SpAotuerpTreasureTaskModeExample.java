package com.aotuspace.web.spgoods.model.po.task;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureTaskModeExample
 * Description:任务模式条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:03:16
 *
 */
public class SpAotuerpTreasureTaskModeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureTaskModeExample() {
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

        public Criteria andSpModeIsNull() {
            addCriterion("sp_Mode is null");
            return (Criteria) this;
        }

        public Criteria andSpModeIsNotNull() {
            addCriterion("sp_Mode is not null");
            return (Criteria) this;
        }

        public Criteria andSpModeEqualTo(String value) {
            addCriterion("sp_Mode =", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeNotEqualTo(String value) {
            addCriterion("sp_Mode <>", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeGreaterThan(String value) {
            addCriterion("sp_Mode >", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Mode >=", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeLessThan(String value) {
            addCriterion("sp_Mode <", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeLessThanOrEqualTo(String value) {
            addCriterion("sp_Mode <=", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeLike(String value) {
            addCriterion("sp_Mode like", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeNotLike(String value) {
            addCriterion("sp_Mode not like", value, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeIn(List<String> values) {
            addCriterion("sp_Mode in", values, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeNotIn(List<String> values) {
            addCriterion("sp_Mode not in", values, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeBetween(String value1, String value2) {
            addCriterion("sp_Mode between", value1, value2, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpModeNotBetween(String value1, String value2) {
            addCriterion("sp_Mode not between", value1, value2, "spMode");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalIsNull() {
            addCriterion("sp_IsInterval is null");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalIsNotNull() {
            addCriterion("sp_IsInterval is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalEqualTo(Integer value) {
            addCriterion("sp_IsInterval =", value, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalNotEqualTo(Integer value) {
            addCriterion("sp_IsInterval <>", value, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalGreaterThan(Integer value) {
            addCriterion("sp_IsInterval >", value, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsInterval >=", value, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalLessThan(Integer value) {
            addCriterion("sp_IsInterval <", value, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsInterval <=", value, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalIn(List<Integer> values) {
            addCriterion("sp_IsInterval in", values, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalNotIn(List<Integer> values) {
            addCriterion("sp_IsInterval not in", values, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsInterval between", value1, value2, "spIsinterval");
            return (Criteria) this;
        }

        public Criteria andSpIsintervalNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsInterval not between", value1, value2, "spIsinterval");
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