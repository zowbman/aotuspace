package com.aotuspace.web.spuser.model.po.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpArtistApplicationExample
 * Description:其他艺人申请条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-4 下午2:37:32
 *
 */
public class SpArtistApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpArtistApplicationExample() {
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

        public Criteria andSpArnameIsNull() {
            addCriterion("sp_ArName is null");
            return (Criteria) this;
        }

        public Criteria andSpArnameIsNotNull() {
            addCriterion("sp_ArName is not null");
            return (Criteria) this;
        }

        public Criteria andSpArnameEqualTo(String value) {
            addCriterion("sp_ArName =", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameNotEqualTo(String value) {
            addCriterion("sp_ArName <>", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameGreaterThan(String value) {
            addCriterion("sp_ArName >", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_ArName >=", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameLessThan(String value) {
            addCriterion("sp_ArName <", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameLessThanOrEqualTo(String value) {
            addCriterion("sp_ArName <=", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameLike(String value) {
            addCriterion("sp_ArName like", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameNotLike(String value) {
            addCriterion("sp_ArName not like", value, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameIn(List<String> values) {
            addCriterion("sp_ArName in", values, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameNotIn(List<String> values) {
            addCriterion("sp_ArName not in", values, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameBetween(String value1, String value2) {
            addCriterion("sp_ArName between", value1, value2, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArnameNotBetween(String value1, String value2) {
            addCriterion("sp_ArName not between", value1, value2, "spArname");
            return (Criteria) this;
        }

        public Criteria andSpArcontentIsNull() {
            addCriterion("sp_ArContent is null");
            return (Criteria) this;
        }

        public Criteria andSpArcontentIsNotNull() {
            addCriterion("sp_ArContent is not null");
            return (Criteria) this;
        }

        public Criteria andSpArcontentEqualTo(String value) {
            addCriterion("sp_ArContent =", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentNotEqualTo(String value) {
            addCriterion("sp_ArContent <>", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentGreaterThan(String value) {
            addCriterion("sp_ArContent >", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentGreaterThanOrEqualTo(String value) {
            addCriterion("sp_ArContent >=", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentLessThan(String value) {
            addCriterion("sp_ArContent <", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentLessThanOrEqualTo(String value) {
            addCriterion("sp_ArContent <=", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentLike(String value) {
            addCriterion("sp_ArContent like", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentNotLike(String value) {
            addCriterion("sp_ArContent not like", value, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentIn(List<String> values) {
            addCriterion("sp_ArContent in", values, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentNotIn(List<String> values) {
            addCriterion("sp_ArContent not in", values, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentBetween(String value1, String value2) {
            addCriterion("sp_ArContent between", value1, value2, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArcontentNotBetween(String value1, String value2) {
            addCriterion("sp_ArContent not between", value1, value2, "spArcontent");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortIsNull() {
            addCriterion("sp_ArScreenSort is null");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortIsNotNull() {
            addCriterion("sp_ArScreenSort is not null");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortEqualTo(String value) {
            addCriterion("sp_ArScreenSort =", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortNotEqualTo(String value) {
            addCriterion("sp_ArScreenSort <>", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortGreaterThan(String value) {
            addCriterion("sp_ArScreenSort >", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortGreaterThanOrEqualTo(String value) {
            addCriterion("sp_ArScreenSort >=", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortLessThan(String value) {
            addCriterion("sp_ArScreenSort <", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortLessThanOrEqualTo(String value) {
            addCriterion("sp_ArScreenSort <=", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortLike(String value) {
            addCriterion("sp_ArScreenSort like", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortNotLike(String value) {
            addCriterion("sp_ArScreenSort not like", value, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortIn(List<String> values) {
            addCriterion("sp_ArScreenSort in", values, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortNotIn(List<String> values) {
            addCriterion("sp_ArScreenSort not in", values, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortBetween(String value1, String value2) {
            addCriterion("sp_ArScreenSort between", value1, value2, "spArscreensort");
            return (Criteria) this;
        }

        public Criteria andSpArscreensortNotBetween(String value1, String value2) {
            addCriterion("sp_ArScreenSort not between", value1, value2, "spArscreensort");
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