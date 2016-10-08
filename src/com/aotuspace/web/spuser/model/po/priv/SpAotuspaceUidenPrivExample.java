package com.aotuspace.web.spuser.model.po.priv;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuspaceUidenPrivExample
 * Description:身份权限条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:33:08
 *
 */
public class SpAotuspaceUidenPrivExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuspaceUidenPrivExample() {
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

        public Criteria andSpIdentidIsNull() {
            addCriterion("sp_IdentId is null");
            return (Criteria) this;
        }

        public Criteria andSpIdentidIsNotNull() {
            addCriterion("sp_IdentId is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdentidEqualTo(Byte value) {
            addCriterion("sp_IdentId =", value, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidNotEqualTo(Byte value) {
            addCriterion("sp_IdentId <>", value, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidGreaterThan(Byte value) {
            addCriterion("sp_IdentId >", value, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_IdentId >=", value, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidLessThan(Byte value) {
            addCriterion("sp_IdentId <", value, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidLessThanOrEqualTo(Byte value) {
            addCriterion("sp_IdentId <=", value, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidIn(List<Byte> values) {
            addCriterion("sp_IdentId in", values, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidNotIn(List<Byte> values) {
            addCriterion("sp_IdentId not in", values, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidBetween(Byte value1, Byte value2) {
            addCriterion("sp_IdentId between", value1, value2, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpIdentidNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_IdentId not between", value1, value2, "spIdentid");
            return (Criteria) this;
        }

        public Criteria andSpPrividIsNull() {
            addCriterion("sp_PrivId is null");
            return (Criteria) this;
        }

        public Criteria andSpPrividIsNotNull() {
            addCriterion("sp_PrivId is not null");
            return (Criteria) this;
        }

        public Criteria andSpPrividEqualTo(Integer value) {
            addCriterion("sp_PrivId =", value, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividNotEqualTo(Integer value) {
            addCriterion("sp_PrivId <>", value, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividGreaterThan(Integer value) {
            addCriterion("sp_PrivId >", value, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PrivId >=", value, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividLessThan(Integer value) {
            addCriterion("sp_PrivId <", value, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PrivId <=", value, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividIn(List<Integer> values) {
            addCriterion("sp_PrivId in", values, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividNotIn(List<Integer> values) {
            addCriterion("sp_PrivId not in", values, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividBetween(Integer value1, Integer value2) {
            addCriterion("sp_PrivId between", value1, value2, "spPrivid");
            return (Criteria) this;
        }

        public Criteria andSpPrividNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PrivId not between", value1, value2, "spPrivid");
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