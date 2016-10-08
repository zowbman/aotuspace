package com.aotuspace.web.spuser.model.po.user;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpUsersSinfoExample
 * Description:安全信息条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:42:34
 *
 */
public class SpUsersSinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpUsersSinfoExample() {
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

        public Criteria andSpBmobieIsNull() {
            addCriterion("sp_BMobie is null");
            return (Criteria) this;
        }

        public Criteria andSpBmobieIsNotNull() {
            addCriterion("sp_BMobie is not null");
            return (Criteria) this;
        }

        public Criteria andSpBmobieEqualTo(String value) {
            addCriterion("sp_BMobie =", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieNotEqualTo(String value) {
            addCriterion("sp_BMobie <>", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieGreaterThan(String value) {
            addCriterion("sp_BMobie >", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieGreaterThanOrEqualTo(String value) {
            addCriterion("sp_BMobie >=", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieLessThan(String value) {
            addCriterion("sp_BMobie <", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieLessThanOrEqualTo(String value) {
            addCriterion("sp_BMobie <=", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieLike(String value) {
            addCriterion("sp_BMobie like", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieNotLike(String value) {
            addCriterion("sp_BMobie not like", value, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieIn(List<String> values) {
            addCriterion("sp_BMobie in", values, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieNotIn(List<String> values) {
            addCriterion("sp_BMobie not in", values, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieBetween(String value1, String value2) {
            addCriterion("sp_BMobie between", value1, value2, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBmobieNotBetween(String value1, String value2) {
            addCriterion("sp_BMobie not between", value1, value2, "spBmobie");
            return (Criteria) this;
        }

        public Criteria andSpBemailIsNull() {
            addCriterion("sp_BEmail is null");
            return (Criteria) this;
        }

        public Criteria andSpBemailIsNotNull() {
            addCriterion("sp_BEmail is not null");
            return (Criteria) this;
        }

        public Criteria andSpBemailEqualTo(String value) {
            addCriterion("sp_BEmail =", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailNotEqualTo(String value) {
            addCriterion("sp_BEmail <>", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailGreaterThan(String value) {
            addCriterion("sp_BEmail >", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailGreaterThanOrEqualTo(String value) {
            addCriterion("sp_BEmail >=", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailLessThan(String value) {
            addCriterion("sp_BEmail <", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailLessThanOrEqualTo(String value) {
            addCriterion("sp_BEmail <=", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailLike(String value) {
            addCriterion("sp_BEmail like", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailNotLike(String value) {
            addCriterion("sp_BEmail not like", value, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailIn(List<String> values) {
            addCriterion("sp_BEmail in", values, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailNotIn(List<String> values) {
            addCriterion("sp_BEmail not in", values, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailBetween(String value1, String value2) {
            addCriterion("sp_BEmail between", value1, value2, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpBemailNotBetween(String value1, String value2) {
            addCriterion("sp_BEmail not between", value1, value2, "spBemail");
            return (Criteria) this;
        }

        public Criteria andSpSequestionIsNull() {
            addCriterion("sp_SeQuestion is null");
            return (Criteria) this;
        }

        public Criteria andSpSequestionIsNotNull() {
            addCriterion("sp_SeQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andSpSequestionEqualTo(Byte value) {
            addCriterion("sp_SeQuestion =", value, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionNotEqualTo(Byte value) {
            addCriterion("sp_SeQuestion <>", value, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionGreaterThan(Byte value) {
            addCriterion("sp_SeQuestion >", value, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_SeQuestion >=", value, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionLessThan(Byte value) {
            addCriterion("sp_SeQuestion <", value, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionLessThanOrEqualTo(Byte value) {
            addCriterion("sp_SeQuestion <=", value, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionIn(List<Byte> values) {
            addCriterion("sp_SeQuestion in", values, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionNotIn(List<Byte> values) {
            addCriterion("sp_SeQuestion not in", values, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionBetween(Byte value1, Byte value2) {
            addCriterion("sp_SeQuestion between", value1, value2, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSequestionNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_SeQuestion not between", value1, value2, "spSequestion");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerIsNull() {
            addCriterion("sp_SeAnswer is null");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerIsNotNull() {
            addCriterion("sp_SeAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerEqualTo(String value) {
            addCriterion("sp_SeAnswer =", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerNotEqualTo(String value) {
            addCriterion("sp_SeAnswer <>", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerGreaterThan(String value) {
            addCriterion("sp_SeAnswer >", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerGreaterThanOrEqualTo(String value) {
            addCriterion("sp_SeAnswer >=", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerLessThan(String value) {
            addCriterion("sp_SeAnswer <", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerLessThanOrEqualTo(String value) {
            addCriterion("sp_SeAnswer <=", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerLike(String value) {
            addCriterion("sp_SeAnswer like", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerNotLike(String value) {
            addCriterion("sp_SeAnswer not like", value, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerIn(List<String> values) {
            addCriterion("sp_SeAnswer in", values, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerNotIn(List<String> values) {
            addCriterion("sp_SeAnswer not in", values, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerBetween(String value1, String value2) {
            addCriterion("sp_SeAnswer between", value1, value2, "spSeanswer");
            return (Criteria) this;
        }

        public Criteria andSpSeanswerNotBetween(String value1, String value2) {
            addCriterion("sp_SeAnswer not between", value1, value2, "spSeanswer");
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