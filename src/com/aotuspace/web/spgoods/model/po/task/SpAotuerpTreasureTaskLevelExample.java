package com.aotuspace.web.spgoods.model.po.task;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureTaskLevelExample
 * Description:任务奖励条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:02:25
 *
 */
public class SpAotuerpTreasureTaskLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureTaskLevelExample() {
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

        public Criteria andSpRewardlevelIsNull() {
            addCriterion("sp_RewardLevel is null");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelIsNotNull() {
            addCriterion("sp_RewardLevel is not null");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelEqualTo(String value) {
            addCriterion("sp_RewardLevel =", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelNotEqualTo(String value) {
            addCriterion("sp_RewardLevel <>", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelGreaterThan(String value) {
            addCriterion("sp_RewardLevel >", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelGreaterThanOrEqualTo(String value) {
            addCriterion("sp_RewardLevel >=", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelLessThan(String value) {
            addCriterion("sp_RewardLevel <", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelLessThanOrEqualTo(String value) {
            addCriterion("sp_RewardLevel <=", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelLike(String value) {
            addCriterion("sp_RewardLevel like", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelNotLike(String value) {
            addCriterion("sp_RewardLevel not like", value, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelIn(List<String> values) {
            addCriterion("sp_RewardLevel in", values, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelNotIn(List<String> values) {
            addCriterion("sp_RewardLevel not in", values, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelBetween(String value1, String value2) {
            addCriterion("sp_RewardLevel between", value1, value2, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelNotBetween(String value1, String value2) {
            addCriterion("sp_RewardLevel not between", value1, value2, "spRewardlevel");
            return (Criteria) this;
        }

        public Criteria andSpTaskidIsNull() {
            addCriterion("sp_TaskId is null");
            return (Criteria) this;
        }

        public Criteria andSpTaskidIsNotNull() {
            addCriterion("sp_TaskId is not null");
            return (Criteria) this;
        }

        public Criteria andSpTaskidEqualTo(Integer value) {
            addCriterion("sp_TaskId =", value, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidNotEqualTo(Integer value) {
            addCriterion("sp_TaskId <>", value, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidGreaterThan(Integer value) {
            addCriterion("sp_TaskId >", value, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_TaskId >=", value, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidLessThan(Integer value) {
            addCriterion("sp_TaskId <", value, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_TaskId <=", value, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidIn(List<Integer> values) {
            addCriterion("sp_TaskId in", values, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidNotIn(List<Integer> values) {
            addCriterion("sp_TaskId not in", values, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidBetween(Integer value1, Integer value2) {
            addCriterion("sp_TaskId between", value1, value2, "spTaskid");
            return (Criteria) this;
        }

        public Criteria andSpTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_TaskId not between", value1, value2, "spTaskid");
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