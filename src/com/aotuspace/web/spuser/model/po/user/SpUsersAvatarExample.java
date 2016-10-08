package com.aotuspace.web.spuser.model.po.user;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpUsersAvatarExample
 * Description:�û�ͷ������
 * Company:aotuspace
 * @author    ΰ��
 * @date      2015-12-28 ����11:08:46
 *
 */
public class SpUsersAvatarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpUsersAvatarExample() {
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

        public Criteria andSpAvatarIsNull() {
            addCriterion("sp_Avatar is null");
            return (Criteria) this;
        }

        public Criteria andSpAvatarIsNotNull() {
            addCriterion("sp_Avatar is not null");
            return (Criteria) this;
        }

        public Criteria andSpAvatarEqualTo(String value) {
            addCriterion("sp_Avatar =", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarNotEqualTo(String value) {
            addCriterion("sp_Avatar <>", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarGreaterThan(String value) {
            addCriterion("sp_Avatar >", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Avatar >=", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarLessThan(String value) {
            addCriterion("sp_Avatar <", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarLessThanOrEqualTo(String value) {
            addCriterion("sp_Avatar <=", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarLike(String value) {
            addCriterion("sp_Avatar like", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarNotLike(String value) {
            addCriterion("sp_Avatar not like", value, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarIn(List<String> values) {
            addCriterion("sp_Avatar in", values, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarNotIn(List<String> values) {
            addCriterion("sp_Avatar not in", values, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarBetween(String value1, String value2) {
            addCriterion("sp_Avatar between", value1, value2, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvatarNotBetween(String value1, String value2) {
            addCriterion("sp_Avatar not between", value1, value2, "spAvatar");
            return (Criteria) this;
        }

        public Criteria andSpAvataridIsNull() {
            addCriterion("sp_AvatarId is null");
            return (Criteria) this;
        }

        public Criteria andSpAvataridIsNotNull() {
            addCriterion("sp_AvatarId is not null");
            return (Criteria) this;
        }

        public Criteria andSpAvataridEqualTo(Integer value) {
            addCriterion("sp_AvatarId =", value, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridNotEqualTo(Integer value) {
            addCriterion("sp_AvatarId <>", value, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridGreaterThan(Integer value) {
            addCriterion("sp_AvatarId >", value, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_AvatarId >=", value, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridLessThan(Integer value) {
            addCriterion("sp_AvatarId <", value, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridLessThanOrEqualTo(Integer value) {
            addCriterion("sp_AvatarId <=", value, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridIn(List<Integer> values) {
            addCriterion("sp_AvatarId in", values, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridNotIn(List<Integer> values) {
            addCriterion("sp_AvatarId not in", values, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridBetween(Integer value1, Integer value2) {
            addCriterion("sp_AvatarId between", value1, value2, "spAvatarid");
            return (Criteria) this;
        }

        public Criteria andSpAvataridNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_AvatarId not between", value1, value2, "spAvatarid");
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