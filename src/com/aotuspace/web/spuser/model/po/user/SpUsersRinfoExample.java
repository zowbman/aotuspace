package com.aotuspace.web.spuser.model.po.user;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpUsersRinfoExample
 * Description:真实信息条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:42:04
 *
 */
public class SpUsersRinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpUsersRinfoExample() {
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

        public Criteria andSpAtuidIsNull() {
            addCriterion("sp_AtuId is null");
            return (Criteria) this;
        }

        public Criteria andSpAtuidIsNotNull() {
            addCriterion("sp_AtuId is not null");
            return (Criteria) this;
        }

        public Criteria andSpAtuidEqualTo(Integer value) {
            addCriterion("sp_AtuId =", value, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidNotEqualTo(Integer value) {
            addCriterion("sp_AtuId <>", value, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidGreaterThan(Integer value) {
            addCriterion("sp_AtuId >", value, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_AtuId >=", value, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidLessThan(Integer value) {
            addCriterion("sp_AtuId <", value, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_AtuId <=", value, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidIn(List<Integer> values) {
            addCriterion("sp_AtuId in", values, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidNotIn(List<Integer> values) {
            addCriterion("sp_AtuId not in", values, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidBetween(Integer value1, Integer value2) {
            addCriterion("sp_AtuId between", value1, value2, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpAtuidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_AtuId not between", value1, value2, "spAtuid");
            return (Criteria) this;
        }

        public Criteria andSpIdnumIsNull() {
            addCriterion("sp_IdNum is null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumIsNotNull() {
            addCriterion("sp_IdNum is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumEqualTo(String value) {
            addCriterion("sp_IdNum =", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotEqualTo(String value) {
            addCriterion("sp_IdNum <>", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumGreaterThan(String value) {
            addCriterion("sp_IdNum >", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("sp_IdNum >=", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumLessThan(String value) {
            addCriterion("sp_IdNum <", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumLessThanOrEqualTo(String value) {
            addCriterion("sp_IdNum <=", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumLike(String value) {
            addCriterion("sp_IdNum like", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotLike(String value) {
            addCriterion("sp_IdNum not like", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumIn(List<String> values) {
            addCriterion("sp_IdNum in", values, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotIn(List<String> values) {
            addCriterion("sp_IdNum not in", values, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumBetween(String value1, String value2) {
            addCriterion("sp_IdNum between", value1, value2, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotBetween(String value1, String value2) {
            addCriterion("sp_IdNum not between", value1, value2, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortIsNull() {
            addCriterion("sp_IdNumSort is null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortIsNotNull() {
            addCriterion("sp_IdNumSort is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortEqualTo(String value) {
            addCriterion("sp_IdNumSort =", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotEqualTo(String value) {
            addCriterion("sp_IdNumSort <>", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortGreaterThan(String value) {
            addCriterion("sp_IdNumSort >", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortGreaterThanOrEqualTo(String value) {
            addCriterion("sp_IdNumSort >=", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortLessThan(String value) {
            addCriterion("sp_IdNumSort <", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortLessThanOrEqualTo(String value) {
            addCriterion("sp_IdNumSort <=", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortLike(String value) {
            addCriterion("sp_IdNumSort like", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotLike(String value) {
            addCriterion("sp_IdNumSort not like", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortIn(List<String> values) {
            addCriterion("sp_IdNumSort in", values, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotIn(List<String> values) {
            addCriterion("sp_IdNumSort not in", values, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortBetween(String value1, String value2) {
            addCriterion("sp_IdNumSort between", value1, value2, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotBetween(String value1, String value2) {
            addCriterion("sp_IdNumSort not between", value1, value2, "spIdnumsort");
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