package com.aotuspace.web.spgoods.model.po.treasure;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAotuerpTreasureImgExample
 * Description:±¦±´Í¼Æ¬Ìõ¼þ
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-11-30 ÏÂÎç6:04:02
 *
 */
public class SpAotuerpTreasureImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAotuerpTreasureImgExample() {
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

        public Criteria andSpImgIsNull() {
            addCriterion("sp_Img is null");
            return (Criteria) this;
        }

        public Criteria andSpImgIsNotNull() {
            addCriterion("sp_Img is not null");
            return (Criteria) this;
        }

        public Criteria andSpImgEqualTo(String value) {
            addCriterion("sp_Img =", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgNotEqualTo(String value) {
            addCriterion("sp_Img <>", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgGreaterThan(String value) {
            addCriterion("sp_Img >", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Img >=", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgLessThan(String value) {
            addCriterion("sp_Img <", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgLessThanOrEqualTo(String value) {
            addCriterion("sp_Img <=", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgLike(String value) {
            addCriterion("sp_Img like", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgNotLike(String value) {
            addCriterion("sp_Img not like", value, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgIn(List<String> values) {
            addCriterion("sp_Img in", values, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgNotIn(List<String> values) {
            addCriterion("sp_Img not in", values, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgBetween(String value1, String value2) {
            addCriterion("sp_Img between", value1, value2, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpImgNotBetween(String value1, String value2) {
            addCriterion("sp_Img not between", value1, value2, "spImg");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryIsNull() {
            addCriterion("sp_IsPrimary is null");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryIsNotNull() {
            addCriterion("sp_IsPrimary is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryEqualTo(Integer value) {
            addCriterion("sp_IsPrimary =", value, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryNotEqualTo(Integer value) {
            addCriterion("sp_IsPrimary <>", value, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryGreaterThan(Integer value) {
            addCriterion("sp_IsPrimary >", value, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsPrimary >=", value, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryLessThan(Integer value) {
            addCriterion("sp_IsPrimary <", value, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsPrimary <=", value, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryIn(List<Integer> values) {
            addCriterion("sp_IsPrimary in", values, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryNotIn(List<Integer> values) {
            addCriterion("sp_IsPrimary not in", values, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsPrimary between", value1, value2, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpIsprimaryNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsPrimary not between", value1, value2, "spIsprimary");
            return (Criteria) this;
        }

        public Criteria andSpImgorderIsNull() {
            addCriterion("sp_ImgOrder is null");
            return (Criteria) this;
        }

        public Criteria andSpImgorderIsNotNull() {
            addCriterion("sp_ImgOrder is not null");
            return (Criteria) this;
        }

        public Criteria andSpImgorderEqualTo(Integer value) {
            addCriterion("sp_ImgOrder =", value, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderNotEqualTo(Integer value) {
            addCriterion("sp_ImgOrder <>", value, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderGreaterThan(Integer value) {
            addCriterion("sp_ImgOrder >", value, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgOrder >=", value, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderLessThan(Integer value) {
            addCriterion("sp_ImgOrder <", value, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgOrder <=", value, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderIn(List<Integer> values) {
            addCriterion("sp_ImgOrder in", values, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderNotIn(List<Integer> values) {
            addCriterion("sp_ImgOrder not in", values, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgOrder between", value1, value2, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgorderNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgOrder not between", value1, value2, "spImgorder");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeIsNull() {
            addCriterion("sp_ImgSize is null");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeIsNotNull() {
            addCriterion("sp_ImgSize is not null");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeEqualTo(Integer value) {
            addCriterion("sp_ImgSize =", value, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeNotEqualTo(Integer value) {
            addCriterion("sp_ImgSize <>", value, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeGreaterThan(Integer value) {
            addCriterion("sp_ImgSize >", value, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgSize >=", value, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeLessThan(Integer value) {
            addCriterion("sp_ImgSize <", value, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgSize <=", value, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeIn(List<Integer> values) {
            addCriterion("sp_ImgSize in", values, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeNotIn(List<Integer> values) {
            addCriterion("sp_ImgSize not in", values, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgSize between", value1, value2, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgSize not between", value1, value2, "spImgsize");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthIsNull() {
            addCriterion("sp_ImgWidth is null");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthIsNotNull() {
            addCriterion("sp_ImgWidth is not null");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthEqualTo(Integer value) {
            addCriterion("sp_ImgWidth =", value, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthNotEqualTo(Integer value) {
            addCriterion("sp_ImgWidth <>", value, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthGreaterThan(Integer value) {
            addCriterion("sp_ImgWidth >", value, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgWidth >=", value, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthLessThan(Integer value) {
            addCriterion("sp_ImgWidth <", value, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgWidth <=", value, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthIn(List<Integer> values) {
            addCriterion("sp_ImgWidth in", values, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthNotIn(List<Integer> values) {
            addCriterion("sp_ImgWidth not in", values, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgWidth between", value1, value2, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgWidth not between", value1, value2, "spImgwidth");
            return (Criteria) this;
        }

        public Criteria andSpImgheightIsNull() {
            addCriterion("sp_ImgHeight is null");
            return (Criteria) this;
        }

        public Criteria andSpImgheightIsNotNull() {
            addCriterion("sp_ImgHeight is not null");
            return (Criteria) this;
        }

        public Criteria andSpImgheightEqualTo(Integer value) {
            addCriterion("sp_ImgHeight =", value, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightNotEqualTo(Integer value) {
            addCriterion("sp_ImgHeight <>", value, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightGreaterThan(Integer value) {
            addCriterion("sp_ImgHeight >", value, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgHeight >=", value, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightLessThan(Integer value) {
            addCriterion("sp_ImgHeight <", value, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ImgHeight <=", value, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightIn(List<Integer> values) {
            addCriterion("sp_ImgHeight in", values, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightNotIn(List<Integer> values) {
            addCriterion("sp_ImgHeight not in", values, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgHeight between", value1, value2, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpImgheightNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ImgHeight not between", value1, value2, "spImgheight");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidIsNull() {
            addCriterion("sp_OrginalImgId is null");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidIsNotNull() {
            addCriterion("sp_OrginalImgId is not null");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidEqualTo(Integer value) {
            addCriterion("sp_OrginalImgId =", value, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidNotEqualTo(Integer value) {
            addCriterion("sp_OrginalImgId <>", value, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidGreaterThan(Integer value) {
            addCriterion("sp_OrginalImgId >", value, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_OrginalImgId >=", value, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidLessThan(Integer value) {
            addCriterion("sp_OrginalImgId <", value, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_OrginalImgId <=", value, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidIn(List<Integer> values) {
            addCriterion("sp_OrginalImgId in", values, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidNotIn(List<Integer> values) {
            addCriterion("sp_OrginalImgId not in", values, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidBetween(Integer value1, Integer value2) {
            addCriterion("sp_OrginalImgId between", value1, value2, "spOrginalimgid");
            return (Criteria) this;
        }

        public Criteria andSpOrginalimgidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_OrginalImgId not between", value1, value2, "spOrginalimgid");
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