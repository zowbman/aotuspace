package com.aotuspace.web.spgoods.model.po.task;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureTaskLevelProfitExample
 * Description:任务奖励级利润条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:02:44
 *
 */
public class SpAotuerpTreasureTaskLevelProfitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureTaskLevelProfitExample() {
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

        public Criteria andSpRewardlevelidIsNull() {
            addCriterion("sp_RewardLevelId is null");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidIsNotNull() {
            addCriterion("sp_RewardLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidEqualTo(Integer value) {
            addCriterion("sp_RewardLevelId =", value, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidNotEqualTo(Integer value) {
            addCriterion("sp_RewardLevelId <>", value, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidGreaterThan(Integer value) {
            addCriterion("sp_RewardLevelId >", value, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_RewardLevelId >=", value, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidLessThan(Integer value) {
            addCriterion("sp_RewardLevelId <", value, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_RewardLevelId <=", value, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidIn(List<Integer> values) {
            addCriterion("sp_RewardLevelId in", values, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidNotIn(List<Integer> values) {
            addCriterion("sp_RewardLevelId not in", values, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidBetween(Integer value1, Integer value2) {
            addCriterion("sp_RewardLevelId between", value1, value2, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpRewardlevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_RewardLevelId not between", value1, value2, "spRewardlevelid");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageIsNull() {
            addCriterion("sp_ProfitPercentage is null");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageIsNotNull() {
            addCriterion("sp_ProfitPercentage is not null");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageEqualTo(Long value) {
            addCriterion("sp_ProfitPercentage =", value, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageNotEqualTo(Long value) {
            addCriterion("sp_ProfitPercentage <>", value, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageGreaterThan(Long value) {
            addCriterion("sp_ProfitPercentage >", value, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_ProfitPercentage >=", value, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageLessThan(Long value) {
            addCriterion("sp_ProfitPercentage <", value, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageLessThanOrEqualTo(Long value) {
            addCriterion("sp_ProfitPercentage <=", value, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageIn(List<Long> values) {
            addCriterion("sp_ProfitPercentage in", values, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageNotIn(List<Long> values) {
            addCriterion("sp_ProfitPercentage not in", values, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageBetween(Long value1, Long value2) {
            addCriterion("sp_ProfitPercentage between", value1, value2, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfitpercentageNotBetween(Long value1, Long value2) {
            addCriterion("sp_ProfitPercentage not between", value1, value2, "spProfitpercentage");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanIsNull() {
            addCriterion("sp_ProfitYUAN is null");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanIsNotNull() {
            addCriterion("sp_ProfitYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanEqualTo(Long value) {
            addCriterion("sp_ProfitYUAN =", value, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanNotEqualTo(Long value) {
            addCriterion("sp_ProfitYUAN <>", value, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanGreaterThan(Long value) {
            addCriterion("sp_ProfitYUAN >", value, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_ProfitYUAN >=", value, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanLessThan(Long value) {
            addCriterion("sp_ProfitYUAN <", value, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanLessThanOrEqualTo(Long value) {
            addCriterion("sp_ProfitYUAN <=", value, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanIn(List<Long> values) {
            addCriterion("sp_ProfitYUAN in", values, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanNotIn(List<Long> values) {
            addCriterion("sp_ProfitYUAN not in", values, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanBetween(Long value1, Long value2) {
            addCriterion("sp_ProfitYUAN between", value1, value2, "spProfityuan");
            return (Criteria) this;
        }

        public Criteria andSpProfityuanNotBetween(Long value1, Long value2) {
            addCriterion("sp_ProfitYUAN not between", value1, value2, "spProfityuan");
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