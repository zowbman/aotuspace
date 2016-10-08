package com.aotuspace.web.spgoods.model.po.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpProductBrandsExample
 * Description:商品品牌条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-1 下午12:39:15
 *
 */
public class SpProductBrandsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpProductBrandsExample() {
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

        public Criteria andSpCategoryidIsNull() {
            addCriterion("sp_CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidIsNotNull() {
            addCriterion("sp_CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidEqualTo(Integer value) {
            addCriterion("sp_CategoryId =", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidNotEqualTo(Integer value) {
            addCriterion("sp_CategoryId <>", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidGreaterThan(Integer value) {
            addCriterion("sp_CategoryId >", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_CategoryId >=", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidLessThan(Integer value) {
            addCriterion("sp_CategoryId <", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_CategoryId <=", value, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidIn(List<Integer> values) {
            addCriterion("sp_CategoryId in", values, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidNotIn(List<Integer> values) {
            addCriterion("sp_CategoryId not in", values, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("sp_CategoryId between", value1, value2, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_CategoryId not between", value1, value2, "spCategoryid");
            return (Criteria) this;
        }

        public Criteria andSpBrandnIsNull() {
            addCriterion("sp_BrandN is null");
            return (Criteria) this;
        }

        public Criteria andSpBrandnIsNotNull() {
            addCriterion("sp_BrandN is not null");
            return (Criteria) this;
        }

        public Criteria andSpBrandnEqualTo(String value) {
            addCriterion("sp_BrandN =", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnNotEqualTo(String value) {
            addCriterion("sp_BrandN <>", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnGreaterThan(String value) {
            addCriterion("sp_BrandN >", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnGreaterThanOrEqualTo(String value) {
            addCriterion("sp_BrandN >=", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnLessThan(String value) {
            addCriterion("sp_BrandN <", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnLessThanOrEqualTo(String value) {
            addCriterion("sp_BrandN <=", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnLike(String value) {
            addCriterion("sp_BrandN like", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnNotLike(String value) {
            addCriterion("sp_BrandN not like", value, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnIn(List<String> values) {
            addCriterion("sp_BrandN in", values, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnNotIn(List<String> values) {
            addCriterion("sp_BrandN not in", values, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnBetween(String value1, String value2) {
            addCriterion("sp_BrandN between", value1, value2, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandnNotBetween(String value1, String value2) {
            addCriterion("sp_BrandN not between", value1, value2, "spBrandn");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoIsNull() {
            addCriterion("sp_BrandLogo is null");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoIsNotNull() {
            addCriterion("sp_BrandLogo is not null");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoEqualTo(String value) {
            addCriterion("sp_BrandLogo =", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoNotEqualTo(String value) {
            addCriterion("sp_BrandLogo <>", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoGreaterThan(String value) {
            addCriterion("sp_BrandLogo >", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoGreaterThanOrEqualTo(String value) {
            addCriterion("sp_BrandLogo >=", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoLessThan(String value) {
            addCriterion("sp_BrandLogo <", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoLessThanOrEqualTo(String value) {
            addCriterion("sp_BrandLogo <=", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoLike(String value) {
            addCriterion("sp_BrandLogo like", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoNotLike(String value) {
            addCriterion("sp_BrandLogo not like", value, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoIn(List<String> values) {
            addCriterion("sp_BrandLogo in", values, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoNotIn(List<String> values) {
            addCriterion("sp_BrandLogo not in", values, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoBetween(String value1, String value2) {
            addCriterion("sp_BrandLogo between", value1, value2, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandlogoNotBetween(String value1, String value2) {
            addCriterion("sp_BrandLogo not between", value1, value2, "spBrandlogo");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentIsNull() {
            addCriterion("sp_BrandPresent is null");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentIsNotNull() {
            addCriterion("sp_BrandPresent is not null");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentEqualTo(String value) {
            addCriterion("sp_BrandPresent =", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentNotEqualTo(String value) {
            addCriterion("sp_BrandPresent <>", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentGreaterThan(String value) {
            addCriterion("sp_BrandPresent >", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentGreaterThanOrEqualTo(String value) {
            addCriterion("sp_BrandPresent >=", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentLessThan(String value) {
            addCriterion("sp_BrandPresent <", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentLessThanOrEqualTo(String value) {
            addCriterion("sp_BrandPresent <=", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentLike(String value) {
            addCriterion("sp_BrandPresent like", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentNotLike(String value) {
            addCriterion("sp_BrandPresent not like", value, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentIn(List<String> values) {
            addCriterion("sp_BrandPresent in", values, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentNotIn(List<String> values) {
            addCriterion("sp_BrandPresent not in", values, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentBetween(String value1, String value2) {
            addCriterion("sp_BrandPresent between", value1, value2, "spBrandpresent");
            return (Criteria) this;
        }

        public Criteria andSpBrandpresentNotBetween(String value1, String value2) {
            addCriterion("sp_BrandPresent not between", value1, value2, "spBrandpresent");
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