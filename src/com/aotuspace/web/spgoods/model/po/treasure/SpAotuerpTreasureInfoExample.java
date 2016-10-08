package com.aotuspace.web.spgoods.model.po.treasure;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureInfoExample
 * Description:宝贝信息条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:04:23
 *
 */
public class SpAotuerpTreasureInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureInfoExample() {
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

        public Criteria andSpTreasuretitleIsNull() {
            addCriterion("sp_TreasureTitle is null");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleIsNotNull() {
            addCriterion("sp_TreasureTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleEqualTo(String value) {
            addCriterion("sp_TreasureTitle =", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleNotEqualTo(String value) {
            addCriterion("sp_TreasureTitle <>", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleGreaterThan(String value) {
            addCriterion("sp_TreasureTitle >", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleGreaterThanOrEqualTo(String value) {
            addCriterion("sp_TreasureTitle >=", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleLessThan(String value) {
            addCriterion("sp_TreasureTitle <", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleLessThanOrEqualTo(String value) {
            addCriterion("sp_TreasureTitle <=", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleLike(String value) {
            addCriterion("sp_TreasureTitle like", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleNotLike(String value) {
            addCriterion("sp_TreasureTitle not like", value, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleIn(List<String> values) {
            addCriterion("sp_TreasureTitle in", values, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleNotIn(List<String> values) {
            addCriterion("sp_TreasureTitle not in", values, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleBetween(String value1, String value2) {
            addCriterion("sp_TreasureTitle between", value1, value2, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuretitleNotBetween(String value1, String value2) {
            addCriterion("sp_TreasureTitle not between", value1, value2, "spTreasuretitle");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsIsNull() {
            addCriterion("sp_TreasureSellingPoints is null");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsIsNotNull() {
            addCriterion("sp_TreasureSellingPoints is not null");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsEqualTo(String value) {
            addCriterion("sp_TreasureSellingPoints =", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsNotEqualTo(String value) {
            addCriterion("sp_TreasureSellingPoints <>", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsGreaterThan(String value) {
            addCriterion("sp_TreasureSellingPoints >", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsGreaterThanOrEqualTo(String value) {
            addCriterion("sp_TreasureSellingPoints >=", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsLessThan(String value) {
            addCriterion("sp_TreasureSellingPoints <", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsLessThanOrEqualTo(String value) {
            addCriterion("sp_TreasureSellingPoints <=", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsLike(String value) {
            addCriterion("sp_TreasureSellingPoints like", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsNotLike(String value) {
            addCriterion("sp_TreasureSellingPoints not like", value, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsIn(List<String> values) {
            addCriterion("sp_TreasureSellingPoints in", values, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsNotIn(List<String> values) {
            addCriterion("sp_TreasureSellingPoints not in", values, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsBetween(String value1, String value2) {
            addCriterion("sp_TreasureSellingPoints between", value1, value2, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpTreasuresellingpointsNotBetween(String value1, String value2) {
            addCriterion("sp_TreasureSellingPoints not between", value1, value2, "spTreasuresellingpoints");
            return (Criteria) this;
        }

        public Criteria andSpProductidIsNull() {
            addCriterion("sp_ProductId is null");
            return (Criteria) this;
        }

        public Criteria andSpProductidIsNotNull() {
            addCriterion("sp_ProductId is not null");
            return (Criteria) this;
        }

        public Criteria andSpProductidEqualTo(Integer value) {
            addCriterion("sp_ProductId =", value, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidNotEqualTo(Integer value) {
            addCriterion("sp_ProductId <>", value, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidGreaterThan(Integer value) {
            addCriterion("sp_ProductId >", value, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ProductId >=", value, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidLessThan(Integer value) {
            addCriterion("sp_ProductId <", value, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ProductId <=", value, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidIn(List<Integer> values) {
            addCriterion("sp_ProductId in", values, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidNotIn(List<Integer> values) {
            addCriterion("sp_ProductId not in", values, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidBetween(Integer value1, Integer value2) {
            addCriterion("sp_ProductId between", value1, value2, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ProductId not between", value1, value2, "spProductid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidIsNull() {
            addCriterion("sp_TreasureStatusId is null");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidIsNotNull() {
            addCriterion("sp_TreasureStatusId is not null");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidEqualTo(Integer value) {
            addCriterion("sp_TreasureStatusId =", value, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidNotEqualTo(Integer value) {
            addCriterion("sp_TreasureStatusId <>", value, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidGreaterThan(Integer value) {
            addCriterion("sp_TreasureStatusId >", value, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_TreasureStatusId >=", value, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidLessThan(Integer value) {
            addCriterion("sp_TreasureStatusId <", value, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_TreasureStatusId <=", value, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidIn(List<Integer> values) {
            addCriterion("sp_TreasureStatusId in", values, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidNotIn(List<Integer> values) {
            addCriterion("sp_TreasureStatusId not in", values, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidBetween(Integer value1, Integer value2) {
            addCriterion("sp_TreasureStatusId between", value1, value2, "spTreasurestatusid");
            return (Criteria) this;
        }

        public Criteria andSpTreasurestatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_TreasureStatusId not between", value1, value2, "spTreasurestatusid");
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