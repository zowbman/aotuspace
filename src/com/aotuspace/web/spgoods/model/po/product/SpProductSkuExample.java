package com.aotuspace.web.spgoods.model.po.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpProductSkuExample
 * Description:商品sku条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:39:33
 *
 */
public class SpProductSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpProductSkuExample() {
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

        public Criteria andSpSkuidIsNull() {
            addCriterion("sp_skuId is null");
            return (Criteria) this;
        }

        public Criteria andSpSkuidIsNotNull() {
            addCriterion("sp_skuId is not null");
            return (Criteria) this;
        }

        public Criteria andSpSkuidEqualTo(Integer value) {
            addCriterion("sp_skuId =", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidNotEqualTo(Integer value) {
            addCriterion("sp_skuId <>", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidGreaterThan(Integer value) {
            addCriterion("sp_skuId >", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_skuId >=", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidLessThan(Integer value) {
            addCriterion("sp_skuId <", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_skuId <=", value, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidIn(List<Integer> values) {
            addCriterion("sp_skuId in", values, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidNotIn(List<Integer> values) {
            addCriterion("sp_skuId not in", values, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidBetween(Integer value1, Integer value2) {
            addCriterion("sp_skuId between", value1, value2, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpSkuidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_skuId not between", value1, value2, "spSkuid");
            return (Criteria) this;
        }

        public Criteria andSpPdidIsNull() {
            addCriterion("sp_PdId is null");
            return (Criteria) this;
        }

        public Criteria andSpPdidIsNotNull() {
            addCriterion("sp_PdId is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdidEqualTo(Integer value) {
            addCriterion("sp_PdId =", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidNotEqualTo(Integer value) {
            addCriterion("sp_PdId <>", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidGreaterThan(Integer value) {
            addCriterion("sp_PdId >", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PdId >=", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidLessThan(Integer value) {
            addCriterion("sp_PdId <", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PdId <=", value, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidIn(List<Integer> values) {
            addCriterion("sp_PdId in", values, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidNotIn(List<Integer> values) {
            addCriterion("sp_PdId not in", values, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdId between", value1, value2, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdId not between", value1, value2, "spPdid");
            return (Criteria) this;
        }

        public Criteria andSpPdcountIsNull() {
            addCriterion("sp_PdCount is null");
            return (Criteria) this;
        }

        public Criteria andSpPdcountIsNotNull() {
            addCriterion("sp_PdCount is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdcountEqualTo(Integer value) {
            addCriterion("sp_PdCount =", value, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountNotEqualTo(Integer value) {
            addCriterion("sp_PdCount <>", value, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountGreaterThan(Integer value) {
            addCriterion("sp_PdCount >", value, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PdCount >=", value, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountLessThan(Integer value) {
            addCriterion("sp_PdCount <", value, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PdCount <=", value, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountIn(List<Integer> values) {
            addCriterion("sp_PdCount in", values, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountNotIn(List<Integer> values) {
            addCriterion("sp_PdCount not in", values, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdCount between", value1, value2, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdcountNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdCount not between", value1, value2, "spPdcount");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceIsNull() {
            addCriterion("sp_PdPrice is null");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceIsNotNull() {
            addCriterion("sp_PdPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceEqualTo(Long value) {
            addCriterion("sp_PdPrice =", value, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceNotEqualTo(Long value) {
            addCriterion("sp_PdPrice <>", value, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceGreaterThan(Long value) {
            addCriterion("sp_PdPrice >", value, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_PdPrice >=", value, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceLessThan(Long value) {
            addCriterion("sp_PdPrice <", value, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceLessThanOrEqualTo(Long value) {
            addCriterion("sp_PdPrice <=", value, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceIn(List<Long> values) {
            addCriterion("sp_PdPrice in", values, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceNotIn(List<Long> values) {
            addCriterion("sp_PdPrice not in", values, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceBetween(Long value1, Long value2) {
            addCriterion("sp_PdPrice between", value1, value2, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdpriceNotBetween(Long value1, Long value2) {
            addCriterion("sp_PdPrice not between", value1, value2, "spPdprice");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusIsNull() {
            addCriterion("sp_PdStatus is null");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusIsNotNull() {
            addCriterion("sp_PdStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusEqualTo(Integer value) {
            addCriterion("sp_PdStatus =", value, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusNotEqualTo(Integer value) {
            addCriterion("sp_PdStatus <>", value, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusGreaterThan(Integer value) {
            addCriterion("sp_PdStatus >", value, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_PdStatus >=", value, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusLessThan(Integer value) {
            addCriterion("sp_PdStatus <", value, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusLessThanOrEqualTo(Integer value) {
            addCriterion("sp_PdStatus <=", value, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusIn(List<Integer> values) {
            addCriterion("sp_PdStatus in", values, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusNotIn(List<Integer> values) {
            addCriterion("sp_PdStatus not in", values, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdStatus between", value1, value2, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpPdstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_PdStatus not between", value1, value2, "spPdstatus");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameIsNull() {
            addCriterion("sp_SkuPropertiesName is null");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameIsNotNull() {
            addCriterion("sp_SkuPropertiesName is not null");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameEqualTo(String value) {
            addCriterion("sp_SkuPropertiesName =", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameNotEqualTo(String value) {
            addCriterion("sp_SkuPropertiesName <>", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameGreaterThan(String value) {
            addCriterion("sp_SkuPropertiesName >", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_SkuPropertiesName >=", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameLessThan(String value) {
            addCriterion("sp_SkuPropertiesName <", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameLessThanOrEqualTo(String value) {
            addCriterion("sp_SkuPropertiesName <=", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameLike(String value) {
            addCriterion("sp_SkuPropertiesName like", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameNotLike(String value) {
            addCriterion("sp_SkuPropertiesName not like", value, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameIn(List<String> values) {
            addCriterion("sp_SkuPropertiesName in", values, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameNotIn(List<String> values) {
            addCriterion("sp_SkuPropertiesName not in", values, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameBetween(String value1, String value2) {
            addCriterion("sp_SkuPropertiesName between", value1, value2, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesnameNotBetween(String value1, String value2) {
            addCriterion("sp_SkuPropertiesName not between", value1, value2, "spSkupropertiesname");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesIsNull() {
            addCriterion("sp_SkuProperties is null");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesIsNotNull() {
            addCriterion("sp_SkuProperties is not null");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesEqualTo(String value) {
            addCriterion("sp_SkuProperties =", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesNotEqualTo(String value) {
            addCriterion("sp_SkuProperties <>", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesGreaterThan(String value) {
            addCriterion("sp_SkuProperties >", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("sp_SkuProperties >=", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesLessThan(String value) {
            addCriterion("sp_SkuProperties <", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesLessThanOrEqualTo(String value) {
            addCriterion("sp_SkuProperties <=", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesLike(String value) {
            addCriterion("sp_SkuProperties like", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesNotLike(String value) {
            addCriterion("sp_SkuProperties not like", value, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesIn(List<String> values) {
            addCriterion("sp_SkuProperties in", values, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesNotIn(List<String> values) {
            addCriterion("sp_SkuProperties not in", values, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesBetween(String value1, String value2) {
            addCriterion("sp_SkuProperties between", value1, value2, "spSkuproperties");
            return (Criteria) this;
        }

        public Criteria andSpSkupropertiesNotBetween(String value1, String value2) {
            addCriterion("sp_SkuProperties not between", value1, value2, "spSkuproperties");
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