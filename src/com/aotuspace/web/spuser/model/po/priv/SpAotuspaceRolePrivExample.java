package com.aotuspace.web.spuser.model.po.priv;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuspaceRolePrivExample
 * Description:角色权限条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:32:46
 *
 */
public class SpAotuspaceRolePrivExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuspaceRolePrivExample() {
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

        public Criteria andSpRoleidIsNull() {
            addCriterion("sp_RoleId is null");
            return (Criteria) this;
        }

        public Criteria andSpRoleidIsNotNull() {
            addCriterion("sp_RoleId is not null");
            return (Criteria) this;
        }

        public Criteria andSpRoleidEqualTo(Integer value) {
            addCriterion("sp_RoleId =", value, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidNotEqualTo(Integer value) {
            addCriterion("sp_RoleId <>", value, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidGreaterThan(Integer value) {
            addCriterion("sp_RoleId >", value, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_RoleId >=", value, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidLessThan(Integer value) {
            addCriterion("sp_RoleId <", value, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_RoleId <=", value, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidIn(List<Integer> values) {
            addCriterion("sp_RoleId in", values, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidNotIn(List<Integer> values) {
            addCriterion("sp_RoleId not in", values, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidBetween(Integer value1, Integer value2) {
            addCriterion("sp_RoleId between", value1, value2, "spRoleid");
            return (Criteria) this;
        }

        public Criteria andSpRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_RoleId not between", value1, value2, "spRoleid");
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