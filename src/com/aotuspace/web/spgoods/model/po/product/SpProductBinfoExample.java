package com.aotuspace.web.spgoods.model.po.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpProductBinfoExample
 * Description:商品基本信息条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:38:42
 *
 */

public class SpProductBinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpProductBinfoExample() {
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

        public Criteria andSpPdspuIsNull() {
            addCriterion("sp_PdSpu is null");
            return (Criteria) this;
        }

        public Criteria andSpPdspuIsNotNull() {
            addCriterion("sp_PdSpu is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdspuEqualTo(String value) {
            addCriterion("sp_PdSpu =", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuNotEqualTo(String value) {
            addCriterion("sp_PdSpu <>", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuGreaterThan(String value) {
            addCriterion("sp_PdSpu >", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PdSpu >=", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuLessThan(String value) {
            addCriterion("sp_PdSpu <", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuLessThanOrEqualTo(String value) {
            addCriterion("sp_PdSpu <=", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuLike(String value) {
            addCriterion("sp_PdSpu like", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuNotLike(String value) {
            addCriterion("sp_PdSpu not like", value, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuIn(List<String> values) {
            addCriterion("sp_PdSpu in", values, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuNotIn(List<String> values) {
            addCriterion("sp_PdSpu not in", values, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuBetween(String value1, String value2) {
            addCriterion("sp_PdSpu between", value1, value2, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpPdspuNotBetween(String value1, String value2) {
            addCriterion("sp_PdSpu not between", value1, value2, "spPdspu");
            return (Criteria) this;
        }

        public Criteria andSpBrandidIsNull() {
            addCriterion("sp_BrandId is null");
            return (Criteria) this;
        }

        public Criteria andSpBrandidIsNotNull() {
            addCriterion("sp_BrandId is not null");
            return (Criteria) this;
        }

        public Criteria andSpBrandidEqualTo(Integer value) {
            addCriterion("sp_BrandId =", value, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidNotEqualTo(Integer value) {
            addCriterion("sp_BrandId <>", value, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidGreaterThan(Integer value) {
            addCriterion("sp_BrandId >", value, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_BrandId >=", value, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidLessThan(Integer value) {
            addCriterion("sp_BrandId <", value, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_BrandId <=", value, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidIn(List<Integer> values) {
            addCriterion("sp_BrandId in", values, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidNotIn(List<Integer> values) {
            addCriterion("sp_BrandId not in", values, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidBetween(Integer value1, Integer value2) {
            addCriterion("sp_BrandId between", value1, value2, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_BrandId not between", value1, value2, "spBrandid");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleIsNull() {
            addCriterion("sp_PdTitle is null");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleIsNotNull() {
            addCriterion("sp_PdTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleEqualTo(String value) {
            addCriterion("sp_PdTitle =", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleNotEqualTo(String value) {
            addCriterion("sp_PdTitle <>", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleGreaterThan(String value) {
            addCriterion("sp_PdTitle >", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PdTitle >=", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleLessThan(String value) {
            addCriterion("sp_PdTitle <", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleLessThanOrEqualTo(String value) {
            addCriterion("sp_PdTitle <=", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleLike(String value) {
            addCriterion("sp_PdTitle like", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleNotLike(String value) {
            addCriterion("sp_PdTitle not like", value, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleIn(List<String> values) {
            addCriterion("sp_PdTitle in", values, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleNotIn(List<String> values) {
            addCriterion("sp_PdTitle not in", values, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleBetween(String value1, String value2) {
            addCriterion("sp_PdTitle between", value1, value2, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdtitleNotBetween(String value1, String value2) {
            addCriterion("sp_PdTitle not between", value1, value2, "spPdtitle");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureIsNull() {
            addCriterion("sp_PdFeature is null");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureIsNotNull() {
            addCriterion("sp_PdFeature is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureEqualTo(String value) {
            addCriterion("sp_PdFeature =", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureNotEqualTo(String value) {
            addCriterion("sp_PdFeature <>", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureGreaterThan(String value) {
            addCriterion("sp_PdFeature >", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PdFeature >=", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureLessThan(String value) {
            addCriterion("sp_PdFeature <", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureLessThanOrEqualTo(String value) {
            addCriterion("sp_PdFeature <=", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureLike(String value) {
            addCriterion("sp_PdFeature like", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureNotLike(String value) {
            addCriterion("sp_PdFeature not like", value, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureIn(List<String> values) {
            addCriterion("sp_PdFeature in", values, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureNotIn(List<String> values) {
            addCriterion("sp_PdFeature not in", values, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureBetween(String value1, String value2) {
            addCriterion("sp_PdFeature between", value1, value2, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdfeatureNotBetween(String value1, String value2) {
            addCriterion("sp_PdFeature not between", value1, value2, "spPdfeature");
            return (Criteria) this;
        }

        public Criteria andSpPdimageIsNull() {
            addCriterion("sp_PdImage is null");
            return (Criteria) this;
        }

        public Criteria andSpPdimageIsNotNull() {
            addCriterion("sp_PdImage is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdimageEqualTo(String value) {
            addCriterion("sp_PdImage =", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageNotEqualTo(String value) {
            addCriterion("sp_PdImage <>", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageGreaterThan(String value) {
            addCriterion("sp_PdImage >", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PdImage >=", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageLessThan(String value) {
            addCriterion("sp_PdImage <", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageLessThanOrEqualTo(String value) {
            addCriterion("sp_PdImage <=", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageLike(String value) {
            addCriterion("sp_PdImage like", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageNotLike(String value) {
            addCriterion("sp_PdImage not like", value, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageIn(List<String> values) {
            addCriterion("sp_PdImage in", values, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageNotIn(List<String> values) {
            addCriterion("sp_PdImage not in", values, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageBetween(String value1, String value2) {
            addCriterion("sp_PdImage between", value1, value2, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdimageNotBetween(String value1, String value2) {
            addCriterion("sp_PdImage not between", value1, value2, "spPdimage");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateIsNull() {
            addCriterion("sp_PdCreDate is null");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateIsNotNull() {
            addCriterion("sp_PdCreDate is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateEqualTo(Date value) {
            addCriterion("sp_PdCreDate =", value, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateNotEqualTo(Date value) {
            addCriterion("sp_PdCreDate <>", value, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateGreaterThan(Date value) {
            addCriterion("sp_PdCreDate >", value, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_PdCreDate >=", value, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateLessThan(Date value) {
            addCriterion("sp_PdCreDate <", value, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateLessThanOrEqualTo(Date value) {
            addCriterion("sp_PdCreDate <=", value, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateIn(List<Date> values) {
            addCriterion("sp_PdCreDate in", values, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateNotIn(List<Date> values) {
            addCriterion("sp_PdCreDate not in", values, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateBetween(Date value1, Date value2) {
            addCriterion("sp_PdCreDate between", value1, value2, "spPdcredate");
            return (Criteria) this;
        }

        public Criteria andSpPdcredateNotBetween(Date value1, Date value2) {
            addCriterion("sp_PdCreDate not between", value1, value2, "spPdcredate");
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