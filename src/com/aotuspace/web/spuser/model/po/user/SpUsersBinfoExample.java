package com.aotuspace.web.spuser.model.po.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpUsersBinfoExample
 * Description:用户基本信息条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-9-13 下午8:31:05
 *
 */
public class SpUsersBinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpUsersBinfoExample() {
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

        public Criteria andSpAccountIsNull() {
            addCriterion("sp_Account is null");
            return (Criteria) this;
        }

        public Criteria andSpAccountIsNotNull() {
            addCriterion("sp_Account is not null");
            return (Criteria) this;
        }

        public Criteria andSpAccountEqualTo(String value) {
            addCriterion("sp_Account =", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountNotEqualTo(String value) {
            addCriterion("sp_Account <>", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountGreaterThan(String value) {
            addCriterion("sp_Account >", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Account >=", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountLessThan(String value) {
            addCriterion("sp_Account <", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountLessThanOrEqualTo(String value) {
            addCriterion("sp_Account <=", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountLike(String value) {
            addCriterion("sp_Account like", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountNotLike(String value) {
            addCriterion("sp_Account not like", value, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountIn(List<String> values) {
            addCriterion("sp_Account in", values, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountNotIn(List<String> values) {
            addCriterion("sp_Account not in", values, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountBetween(String value1, String value2) {
            addCriterion("sp_Account between", value1, value2, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpAccountNotBetween(String value1, String value2) {
            addCriterion("sp_Account not between", value1, value2, "spAccount");
            return (Criteria) this;
        }

        public Criteria andSpPasswordIsNull() {
            addCriterion("sp_Password is null");
            return (Criteria) this;
        }

        public Criteria andSpPasswordIsNotNull() {
            addCriterion("sp_Password is not null");
            return (Criteria) this;
        }

        public Criteria andSpPasswordEqualTo(String value) {
            addCriterion("sp_Password =", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordNotEqualTo(String value) {
            addCriterion("sp_Password <>", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordGreaterThan(String value) {
            addCriterion("sp_Password >", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Password >=", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordLessThan(String value) {
            addCriterion("sp_Password <", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordLessThanOrEqualTo(String value) {
            addCriterion("sp_Password <=", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordLike(String value) {
            addCriterion("sp_Password like", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordNotLike(String value) {
            addCriterion("sp_Password not like", value, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordIn(List<String> values) {
            addCriterion("sp_Password in", values, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordNotIn(List<String> values) {
            addCriterion("sp_Password not in", values, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordBetween(String value1, String value2) {
            addCriterion("sp_Password between", value1, value2, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpPasswordNotBetween(String value1, String value2) {
            addCriterion("sp_Password not between", value1, value2, "spPassword");
            return (Criteria) this;
        }

        public Criteria andSpIdentityIsNull() {
            addCriterion("sp_Identity is null");
            return (Criteria) this;
        }

        public Criteria andSpIdentityIsNotNull() {
            addCriterion("sp_Identity is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdentityEqualTo(Byte value) {
            addCriterion("sp_Identity =", value, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityNotEqualTo(Byte value) {
            addCriterion("sp_Identity <>", value, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityGreaterThan(Byte value) {
            addCriterion("sp_Identity >", value, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_Identity >=", value, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityLessThan(Byte value) {
            addCriterion("sp_Identity <", value, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityLessThanOrEqualTo(Byte value) {
            addCriterion("sp_Identity <=", value, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityIn(List<Byte> values) {
            addCriterion("sp_Identity in", values, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityNotIn(List<Byte> values) {
            addCriterion("sp_Identity not in", values, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityBetween(Byte value1, Byte value2) {
            addCriterion("sp_Identity between", value1, value2, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpIdentityNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_Identity not between", value1, value2, "spIdentity");
            return (Criteria) this;
        }

        public Criteria andSpRedateIsNull() {
            addCriterion("sp_ReDate is null");
            return (Criteria) this;
        }

        public Criteria andSpRedateIsNotNull() {
            addCriterion("sp_ReDate is not null");
            return (Criteria) this;
        }

        public Criteria andSpRedateEqualTo(Date value) {
            addCriterion("sp_ReDate =", value, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateNotEqualTo(Date value) {
            addCriterion("sp_ReDate <>", value, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateGreaterThan(Date value) {
            addCriterion("sp_ReDate >", value, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_ReDate >=", value, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateLessThan(Date value) {
            addCriterion("sp_ReDate <", value, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateLessThanOrEqualTo(Date value) {
            addCriterion("sp_ReDate <=", value, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateIn(List<Date> values) {
            addCriterion("sp_ReDate in", values, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateNotIn(List<Date> values) {
            addCriterion("sp_ReDate not in", values, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateBetween(Date value1, Date value2) {
            addCriterion("sp_ReDate between", value1, value2, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpRedateNotBetween(Date value1, Date value2) {
            addCriterion("sp_ReDate not between", value1, value2, "spRedate");
            return (Criteria) this;
        }

        public Criteria andSpReplaceIsNull() {
            addCriterion("sp_RePlace is null");
            return (Criteria) this;
        }

        public Criteria andSpReplaceIsNotNull() {
            addCriterion("sp_RePlace is not null");
            return (Criteria) this;
        }

        public Criteria andSpReplaceEqualTo(String value) {
            addCriterion("sp_RePlace =", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceNotEqualTo(String value) {
            addCriterion("sp_RePlace <>", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceGreaterThan(String value) {
            addCriterion("sp_RePlace >", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceGreaterThanOrEqualTo(String value) {
            addCriterion("sp_RePlace >=", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceLessThan(String value) {
            addCriterion("sp_RePlace <", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceLessThanOrEqualTo(String value) {
            addCriterion("sp_RePlace <=", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceLike(String value) {
            addCriterion("sp_RePlace like", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceNotLike(String value) {
            addCriterion("sp_RePlace not like", value, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceIn(List<String> values) {
            addCriterion("sp_RePlace in", values, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceNotIn(List<String> values) {
            addCriterion("sp_RePlace not in", values, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceBetween(String value1, String value2) {
            addCriterion("sp_RePlace between", value1, value2, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReplaceNotBetween(String value1, String value2) {
            addCriterion("sp_RePlace not between", value1, value2, "spReplace");
            return (Criteria) this;
        }

        public Criteria andSpReipIsNull() {
            addCriterion("sp_ReIp is null");
            return (Criteria) this;
        }

        public Criteria andSpReipIsNotNull() {
            addCriterion("sp_ReIp is not null");
            return (Criteria) this;
        }

        public Criteria andSpReipEqualTo(String value) {
            addCriterion("sp_ReIp =", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipNotEqualTo(String value) {
            addCriterion("sp_ReIp <>", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipGreaterThan(String value) {
            addCriterion("sp_ReIp >", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipGreaterThanOrEqualTo(String value) {
            addCriterion("sp_ReIp >=", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipLessThan(String value) {
            addCriterion("sp_ReIp <", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipLessThanOrEqualTo(String value) {
            addCriterion("sp_ReIp <=", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipLike(String value) {
            addCriterion("sp_ReIp like", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipNotLike(String value) {
            addCriterion("sp_ReIp not like", value, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipIn(List<String> values) {
            addCriterion("sp_ReIp in", values, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipNotIn(List<String> values) {
            addCriterion("sp_ReIp not in", values, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipBetween(String value1, String value2) {
            addCriterion("sp_ReIp between", value1, value2, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpReipNotBetween(String value1, String value2) {
            addCriterion("sp_ReIp not between", value1, value2, "spReip");
            return (Criteria) this;
        }

        public Criteria andSpStatusIsNull() {
            addCriterion("sp_Status is null");
            return (Criteria) this;
        }

        public Criteria andSpStatusIsNotNull() {
            addCriterion("sp_Status is not null");
            return (Criteria) this;
        }

        public Criteria andSpStatusEqualTo(Byte value) {
            addCriterion("sp_Status =", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotEqualTo(Byte value) {
            addCriterion("sp_Status <>", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusGreaterThan(Byte value) {
            addCriterion("sp_Status >", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_Status >=", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusLessThan(Byte value) {
            addCriterion("sp_Status <", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusLessThanOrEqualTo(Byte value) {
            addCriterion("sp_Status <=", value, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusIn(List<Byte> values) {
            addCriterion("sp_Status in", values, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotIn(List<Byte> values) {
            addCriterion("sp_Status not in", values, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusBetween(Byte value1, Byte value2) {
            addCriterion("sp_Status between", value1, value2, "spStatus");
            return (Criteria) this;
        }

        public Criteria andSpStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_Status not between", value1, value2, "spStatus");
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