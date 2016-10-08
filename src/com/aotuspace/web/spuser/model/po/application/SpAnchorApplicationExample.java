package com.aotuspace.web.spuser.model.po.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpAnchorApplicationExample
 * Description:代言主播申请条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午2:37:10
 *
 */
public class SpAnchorApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAnchorApplicationExample() {
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

        public Criteria andSpListationIsNull() {
            addCriterion("sp_LiStation is null");
            return (Criteria) this;
        }

        public Criteria andSpListationIsNotNull() {
            addCriterion("sp_LiStation is not null");
            return (Criteria) this;
        }

        public Criteria andSpListationEqualTo(Byte value) {
            addCriterion("sp_LiStation =", value, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationNotEqualTo(Byte value) {
            addCriterion("sp_LiStation <>", value, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationGreaterThan(Byte value) {
            addCriterion("sp_LiStation >", value, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_LiStation >=", value, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationLessThan(Byte value) {
            addCriterion("sp_LiStation <", value, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationLessThanOrEqualTo(Byte value) {
            addCriterion("sp_LiStation <=", value, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationIn(List<Byte> values) {
            addCriterion("sp_LiStation in", values, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationNotIn(List<Byte> values) {
            addCriterion("sp_LiStation not in", values, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationBetween(Byte value1, Byte value2) {
            addCriterion("sp_LiStation between", value1, value2, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpListationNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_LiStation not between", value1, value2, "spListation");
            return (Criteria) this;
        }

        public Criteria andSpLisrcIsNull() {
            addCriterion("sp_LiSrc is null");
            return (Criteria) this;
        }

        public Criteria andSpLisrcIsNotNull() {
            addCriterion("sp_LiSrc is not null");
            return (Criteria) this;
        }

        public Criteria andSpLisrcEqualTo(String value) {
            addCriterion("sp_LiSrc =", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcNotEqualTo(String value) {
            addCriterion("sp_LiSrc <>", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcGreaterThan(String value) {
            addCriterion("sp_LiSrc >", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcGreaterThanOrEqualTo(String value) {
            addCriterion("sp_LiSrc >=", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcLessThan(String value) {
            addCriterion("sp_LiSrc <", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcLessThanOrEqualTo(String value) {
            addCriterion("sp_LiSrc <=", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcLike(String value) {
            addCriterion("sp_LiSrc like", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcNotLike(String value) {
            addCriterion("sp_LiSrc not like", value, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcIn(List<String> values) {
            addCriterion("sp_LiSrc in", values, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcNotIn(List<String> values) {
            addCriterion("sp_LiSrc not in", values, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcBetween(String value1, String value2) {
            addCriterion("sp_LiSrc between", value1, value2, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLisrcNotBetween(String value1, String value2) {
            addCriterion("sp_LiSrc not between", value1, value2, "spLisrc");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameIsNull() {
            addCriterion("sp_LiNickName is null");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameIsNotNull() {
            addCriterion("sp_LiNickName is not null");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameEqualTo(String value) {
            addCriterion("sp_LiNickName =", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameNotEqualTo(String value) {
            addCriterion("sp_LiNickName <>", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameGreaterThan(String value) {
            addCriterion("sp_LiNickName >", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_LiNickName >=", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameLessThan(String value) {
            addCriterion("sp_LiNickName <", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameLessThanOrEqualTo(String value) {
            addCriterion("sp_LiNickName <=", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameLike(String value) {
            addCriterion("sp_LiNickName like", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameNotLike(String value) {
            addCriterion("sp_LiNickName not like", value, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameIn(List<String> values) {
            addCriterion("sp_LiNickName in", values, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameNotIn(List<String> values) {
            addCriterion("sp_LiNickName not in", values, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameBetween(String value1, String value2) {
            addCriterion("sp_LiNickName between", value1, value2, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLinicknameNotBetween(String value1, String value2) {
            addCriterion("sp_LiNickName not between", value1, value2, "spLinickname");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortIsNull() {
            addCriterion("sp_LiScreenSort is null");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortIsNotNull() {
            addCriterion("sp_LiScreenSort is not null");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortEqualTo(String value) {
            addCriterion("sp_LiScreenSort =", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortNotEqualTo(String value) {
            addCriterion("sp_LiScreenSort <>", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortGreaterThan(String value) {
            addCriterion("sp_LiScreenSort >", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortGreaterThanOrEqualTo(String value) {
            addCriterion("sp_LiScreenSort >=", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortLessThan(String value) {
            addCriterion("sp_LiScreenSort <", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortLessThanOrEqualTo(String value) {
            addCriterion("sp_LiScreenSort <=", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortLike(String value) {
            addCriterion("sp_LiScreenSort like", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortNotLike(String value) {
            addCriterion("sp_LiScreenSort not like", value, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortIn(List<String> values) {
            addCriterion("sp_LiScreenSort in", values, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortNotIn(List<String> values) {
            addCriterion("sp_LiScreenSort not in", values, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortBetween(String value1, String value2) {
            addCriterion("sp_LiScreenSort between", value1, value2, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpLiscreensortNotBetween(String value1, String value2) {
            addCriterion("sp_LiScreenSort not between", value1, value2, "spLiscreensort");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidIsNull() {
            addCriterion("sp_ApplicationDetailId is null");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidIsNotNull() {
            addCriterion("sp_ApplicationDetailId is not null");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidEqualTo(Integer value) {
            addCriterion("sp_ApplicationDetailId =", value, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidNotEqualTo(Integer value) {
            addCriterion("sp_ApplicationDetailId <>", value, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidGreaterThan(Integer value) {
            addCriterion("sp_ApplicationDetailId >", value, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ApplicationDetailId >=", value, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidLessThan(Integer value) {
            addCriterion("sp_ApplicationDetailId <", value, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ApplicationDetailId <=", value, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidIn(List<Integer> values) {
            addCriterion("sp_ApplicationDetailId in", values, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidNotIn(List<Integer> values) {
            addCriterion("sp_ApplicationDetailId not in", values, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidBetween(Integer value1, Integer value2) {
            addCriterion("sp_ApplicationDetailId between", value1, value2, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpApplicationdetailidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ApplicationDetailId not between", value1, value2, "spApplicationdetailid");
            return (Criteria) this;
        }

        public Criteria andSpAppresultIsNull() {
            addCriterion("sp_AppResult is null");
            return (Criteria) this;
        }

        public Criteria andSpAppresultIsNotNull() {
            addCriterion("sp_AppResult is not null");
            return (Criteria) this;
        }

        public Criteria andSpAppresultEqualTo(Integer value) {
            addCriterion("sp_AppResult =", value, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultNotEqualTo(Integer value) {
            addCriterion("sp_AppResult <>", value, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultGreaterThan(Integer value) {
            addCriterion("sp_AppResult >", value, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_AppResult >=", value, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultLessThan(Integer value) {
            addCriterion("sp_AppResult <", value, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultLessThanOrEqualTo(Integer value) {
            addCriterion("sp_AppResult <=", value, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultIn(List<Integer> values) {
            addCriterion("sp_AppResult in", values, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultNotIn(List<Integer> values) {
            addCriterion("sp_AppResult not in", values, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultBetween(Integer value1, Integer value2) {
            addCriterion("sp_AppResult between", value1, value2, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpAppresultNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_AppResult not between", value1, value2, "spAppresult");
            return (Criteria) this;
        }

        public Criteria andSpApplydateIsNull() {
            addCriterion("sp_ApplyDate is null");
            return (Criteria) this;
        }

        public Criteria andSpApplydateIsNotNull() {
            addCriterion("sp_ApplyDate is not null");
            return (Criteria) this;
        }

        public Criteria andSpApplydateEqualTo(Date value) {
            addCriterion("sp_ApplyDate =", value, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateNotEqualTo(Date value) {
            addCriterion("sp_ApplyDate <>", value, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateGreaterThan(Date value) {
            addCriterion("sp_ApplyDate >", value, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_ApplyDate >=", value, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateLessThan(Date value) {
            addCriterion("sp_ApplyDate <", value, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateLessThanOrEqualTo(Date value) {
            addCriterion("sp_ApplyDate <=", value, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateIn(List<Date> values) {
            addCriterion("sp_ApplyDate in", values, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateNotIn(List<Date> values) {
            addCriterion("sp_ApplyDate not in", values, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateBetween(Date value1, Date value2) {
            addCriterion("sp_ApplyDate between", value1, value2, "spApplydate");
            return (Criteria) this;
        }

        public Criteria andSpApplydateNotBetween(Date value1, Date value2) {
            addCriterion("sp_ApplyDate not between", value1, value2, "spApplydate");
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