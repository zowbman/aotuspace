package com.aotuspace.web.spuser.model.po.priv;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuspacePrivExample
 * Description:权限条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:32:12
 *
 */
public class SpAotuspacePrivExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuspacePrivExample() {
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

        public Criteria andSpNameIsNull() {
            addCriterion("sp_Name is null");
            return (Criteria) this;
        }

        public Criteria andSpNameIsNotNull() {
            addCriterion("sp_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSpNameEqualTo(String value) {
            addCriterion("sp_Name =", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotEqualTo(String value) {
            addCriterion("sp_Name <>", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThan(String value) {
            addCriterion("sp_Name >", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Name >=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThan(String value) {
            addCriterion("sp_Name <", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLessThanOrEqualTo(String value) {
            addCriterion("sp_Name <=", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameLike(String value) {
            addCriterion("sp_Name like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotLike(String value) {
            addCriterion("sp_Name not like", value, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameIn(List<String> values) {
            addCriterion("sp_Name in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotIn(List<String> values) {
            addCriterion("sp_Name not in", values, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameBetween(String value1, String value2) {
            addCriterion("sp_Name between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpNameNotBetween(String value1, String value2) {
            addCriterion("sp_Name not between", value1, value2, "spName");
            return (Criteria) this;
        }

        public Criteria andSpUrlIsNull() {
            addCriterion("sp_Url is null");
            return (Criteria) this;
        }

        public Criteria andSpUrlIsNotNull() {
            addCriterion("sp_Url is not null");
            return (Criteria) this;
        }

        public Criteria andSpUrlEqualTo(String value) {
            addCriterion("sp_Url =", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotEqualTo(String value) {
            addCriterion("sp_Url <>", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlGreaterThan(String value) {
            addCriterion("sp_Url >", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Url >=", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlLessThan(String value) {
            addCriterion("sp_Url <", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlLessThanOrEqualTo(String value) {
            addCriterion("sp_Url <=", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlLike(String value) {
            addCriterion("sp_Url like", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotLike(String value) {
            addCriterion("sp_Url not like", value, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlIn(List<String> values) {
            addCriterion("sp_Url in", values, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotIn(List<String> values) {
            addCriterion("sp_Url not in", values, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlBetween(String value1, String value2) {
            addCriterion("sp_Url between", value1, value2, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpUrlNotBetween(String value1, String value2) {
            addCriterion("sp_Url not between", value1, value2, "spUrl");
            return (Criteria) this;
        }

        public Criteria andSpPidIsNull() {
            addCriterion("sp_Pid is null");
            return (Criteria) this;
        }

        public Criteria andSpPidIsNotNull() {
            addCriterion("sp_Pid is not null");
            return (Criteria) this;
        }

        public Criteria andSpPidEqualTo(Integer value) {
            addCriterion("sp_Pid =", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidNotEqualTo(Integer value) {
            addCriterion("sp_Pid <>", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidGreaterThan(Integer value) {
            addCriterion("sp_Pid >", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_Pid >=", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidLessThan(Integer value) {
            addCriterion("sp_Pid <", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_Pid <=", value, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidIn(List<Integer> values) {
            addCriterion("sp_Pid in", values, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidNotIn(List<Integer> values) {
            addCriterion("sp_Pid not in", values, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidBetween(Integer value1, Integer value2) {
            addCriterion("sp_Pid between", value1, value2, "spPid");
            return (Criteria) this;
        }

        public Criteria andSpPidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_Pid not between", value1, value2, "spPid");
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