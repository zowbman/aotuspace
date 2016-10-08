package com.aotuspace.web.spgoods.model.po.treasure;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureImgRelationExample
 * Description:宝贝图片关联条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 上午10:05:14
 *
 */
public class SpAotuerpTreasureImgRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureImgRelationExample() {
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

        public Criteria andSpTreasureimgidIsNull() {
            addCriterion("sp_TreasureImgId is null");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidIsNotNull() {
            addCriterion("sp_TreasureImgId is not null");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidEqualTo(Integer value) {
            addCriterion("sp_TreasureImgId =", value, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidNotEqualTo(Integer value) {
            addCriterion("sp_TreasureImgId <>", value, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidGreaterThan(Integer value) {
            addCriterion("sp_TreasureImgId >", value, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_TreasureImgId >=", value, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidLessThan(Integer value) {
            addCriterion("sp_TreasureImgId <", value, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_TreasureImgId <=", value, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidIn(List<Integer> values) {
            addCriterion("sp_TreasureImgId in", values, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidNotIn(List<Integer> values) {
            addCriterion("sp_TreasureImgId not in", values, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidBetween(Integer value1, Integer value2) {
            addCriterion("sp_TreasureImgId between", value1, value2, "spTreasureimgid");
            return (Criteria) this;
        }

        public Criteria andSpTreasureimgidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_TreasureImgId not between", value1, value2, "spTreasureimgid");
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