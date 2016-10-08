package com.aotuspace.web.spgoods.model.po.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureTaskExample
 * Description:任务条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-11-30 下午6:02:05
 *
 */
public class SpAotuerpTreasureTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureTaskExample() {
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

        public Criteria andSpTaskuploadtimeIsNull() {
            addCriterion("sp_TaskUploadTime is null");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeIsNotNull() {
            addCriterion("sp_TaskUploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeEqualTo(Date value) {
            addCriterion("sp_TaskUploadTime =", value, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeNotEqualTo(Date value) {
            addCriterion("sp_TaskUploadTime <>", value, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeGreaterThan(Date value) {
            addCriterion("sp_TaskUploadTime >", value, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_TaskUploadTime >=", value, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeLessThan(Date value) {
            addCriterion("sp_TaskUploadTime <", value, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("sp_TaskUploadTime <=", value, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeIn(List<Date> values) {
            addCriterion("sp_TaskUploadTime in", values, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeNotIn(List<Date> values) {
            addCriterion("sp_TaskUploadTime not in", values, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeBetween(Date value1, Date value2) {
            addCriterion("sp_TaskUploadTime between", value1, value2, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskuploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("sp_TaskUploadTime not between", value1, value2, "spTaskuploadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeIsNull() {
            addCriterion("sp_TaskUnloadTime is null");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeIsNotNull() {
            addCriterion("sp_TaskUnloadTime is not null");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeEqualTo(Date value) {
            addCriterion("sp_TaskUnloadTime =", value, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeNotEqualTo(Date value) {
            addCriterion("sp_TaskUnloadTime <>", value, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeGreaterThan(Date value) {
            addCriterion("sp_TaskUnloadTime >", value, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_TaskUnloadTime >=", value, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeLessThan(Date value) {
            addCriterion("sp_TaskUnloadTime <", value, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeLessThanOrEqualTo(Date value) {
            addCriterion("sp_TaskUnloadTime <=", value, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeIn(List<Date> values) {
            addCriterion("sp_TaskUnloadTime in", values, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeNotIn(List<Date> values) {
            addCriterion("sp_TaskUnloadTime not in", values, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeBetween(Date value1, Date value2) {
            addCriterion("sp_TaskUnloadTime between", value1, value2, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpTaskunloadtimeNotBetween(Date value1, Date value2) {
            addCriterion("sp_TaskUnloadTime not between", value1, value2, "spTaskunloadtime");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridIsNull() {
            addCriterion("sp_AnchorId is null");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridIsNotNull() {
            addCriterion("sp_AnchorId is not null");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridEqualTo(Integer value) {
            addCriterion("sp_AnchorId =", value, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridNotEqualTo(Integer value) {
            addCriterion("sp_AnchorId <>", value, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridGreaterThan(Integer value) {
            addCriterion("sp_AnchorId >", value, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_AnchorId >=", value, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridLessThan(Integer value) {
            addCriterion("sp_AnchorId <", value, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridLessThanOrEqualTo(Integer value) {
            addCriterion("sp_AnchorId <=", value, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridIn(List<Integer> values) {
            addCriterion("sp_AnchorId in", values, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridNotIn(List<Integer> values) {
            addCriterion("sp_AnchorId not in", values, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridBetween(Integer value1, Integer value2) {
            addCriterion("sp_AnchorId between", value1, value2, "spAnchorid");
            return (Criteria) this;
        }

        public Criteria andSpAnchoridNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_AnchorId not between", value1, value2, "spAnchorid");
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

        public Criteria andSpTaskagingIsNull() {
            addCriterion("sp_TaskAging is null");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingIsNotNull() {
            addCriterion("sp_TaskAging is not null");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingEqualTo(Integer value) {
            addCriterion("sp_TaskAging =", value, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingNotEqualTo(Integer value) {
            addCriterion("sp_TaskAging <>", value, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingGreaterThan(Integer value) {
            addCriterion("sp_TaskAging >", value, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_TaskAging >=", value, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingLessThan(Integer value) {
            addCriterion("sp_TaskAging <", value, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingLessThanOrEqualTo(Integer value) {
            addCriterion("sp_TaskAging <=", value, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingIn(List<Integer> values) {
            addCriterion("sp_TaskAging in", values, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingNotIn(List<Integer> values) {
            addCriterion("sp_TaskAging not in", values, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingBetween(Integer value1, Integer value2) {
            addCriterion("sp_TaskAging between", value1, value2, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpTaskagingNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_TaskAging not between", value1, value2, "spTaskaging");
            return (Criteria) this;
        }

        public Criteria andSpStatusidIsNull() {
            addCriterion("sp_StatusId is null");
            return (Criteria) this;
        }

        public Criteria andSpStatusidIsNotNull() {
            addCriterion("sp_StatusId is not null");
            return (Criteria) this;
        }

        public Criteria andSpStatusidEqualTo(Integer value) {
            addCriterion("sp_StatusId =", value, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidNotEqualTo(Integer value) {
            addCriterion("sp_StatusId <>", value, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidGreaterThan(Integer value) {
            addCriterion("sp_StatusId >", value, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_StatusId >=", value, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidLessThan(Integer value) {
            addCriterion("sp_StatusId <", value, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_StatusId <=", value, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidIn(List<Integer> values) {
            addCriterion("sp_StatusId in", values, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidNotIn(List<Integer> values) {
            addCriterion("sp_StatusId not in", values, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidBetween(Integer value1, Integer value2) {
            addCriterion("sp_StatusId between", value1, value2, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpStatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_StatusId not between", value1, value2, "spStatusid");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkIsNull() {
            addCriterion("sp_TaskRemark is null");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkIsNotNull() {
            addCriterion("sp_TaskRemark is not null");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkEqualTo(String value) {
            addCriterion("sp_TaskRemark =", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkNotEqualTo(String value) {
            addCriterion("sp_TaskRemark <>", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkGreaterThan(String value) {
            addCriterion("sp_TaskRemark >", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkGreaterThanOrEqualTo(String value) {
            addCriterion("sp_TaskRemark >=", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkLessThan(String value) {
            addCriterion("sp_TaskRemark <", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkLessThanOrEqualTo(String value) {
            addCriterion("sp_TaskRemark <=", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkLike(String value) {
            addCriterion("sp_TaskRemark like", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkNotLike(String value) {
            addCriterion("sp_TaskRemark not like", value, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkIn(List<String> values) {
            addCriterion("sp_TaskRemark in", values, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkNotIn(List<String> values) {
            addCriterion("sp_TaskRemark not in", values, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkBetween(String value1, String value2) {
            addCriterion("sp_TaskRemark between", value1, value2, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskremarkNotBetween(String value1, String value2) {
            addCriterion("sp_TaskRemark not between", value1, value2, "spTaskremark");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidIsNull() {
            addCriterion("sp_TaskModeId is null");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidIsNotNull() {
            addCriterion("sp_TaskModeId is not null");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidEqualTo(Integer value) {
            addCriterion("sp_TaskModeId =", value, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidNotEqualTo(Integer value) {
            addCriterion("sp_TaskModeId <>", value, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidGreaterThan(Integer value) {
            addCriterion("sp_TaskModeId >", value, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_TaskModeId >=", value, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidLessThan(Integer value) {
            addCriterion("sp_TaskModeId <", value, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_TaskModeId <=", value, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidIn(List<Integer> values) {
            addCriterion("sp_TaskModeId in", values, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidNotIn(List<Integer> values) {
            addCriterion("sp_TaskModeId not in", values, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidBetween(Integer value1, Integer value2) {
            addCriterion("sp_TaskModeId between", value1, value2, "spTaskmodeid");
            return (Criteria) this;
        }

        public Criteria andSpTaskmodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_TaskModeId not between", value1, value2, "spTaskmodeid");
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