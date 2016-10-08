package com.aotuspace.web.spgoods.model.po.product;

import java.util.ArrayList;
import java.util.List;

public class SpProductPropertyNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpProductPropertyNameExample() {
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

        public Criteria andSpParentpvalueIsNull() {
            addCriterion("sp_ParentPValue is null");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueIsNotNull() {
            addCriterion("sp_ParentPValue is not null");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueEqualTo(Integer value) {
            addCriterion("sp_ParentPValue =", value, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueNotEqualTo(Integer value) {
            addCriterion("sp_ParentPValue <>", value, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueGreaterThan(Integer value) {
            addCriterion("sp_ParentPValue >", value, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ParentPValue >=", value, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueLessThan(Integer value) {
            addCriterion("sp_ParentPValue <", value, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ParentPValue <=", value, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueIn(List<Integer> values) {
            addCriterion("sp_ParentPValue in", values, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueNotIn(List<Integer> values) {
            addCriterion("sp_ParentPValue not in", values, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueBetween(Integer value1, Integer value2) {
            addCriterion("sp_ParentPValue between", value1, value2, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpParentpvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ParentPValue not between", value1, value2, "spParentpvalue");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameIsNull() {
            addCriterion("sp_PropertyName is null");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameIsNotNull() {
            addCriterion("sp_PropertyName is not null");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameEqualTo(String value) {
            addCriterion("sp_PropertyName =", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameNotEqualTo(String value) {
            addCriterion("sp_PropertyName <>", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameGreaterThan(String value) {
            addCriterion("sp_PropertyName >", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PropertyName >=", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameLessThan(String value) {
            addCriterion("sp_PropertyName <", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameLessThanOrEqualTo(String value) {
            addCriterion("sp_PropertyName <=", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameLike(String value) {
            addCriterion("sp_PropertyName like", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameNotLike(String value) {
            addCriterion("sp_PropertyName not like", value, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameIn(List<String> values) {
            addCriterion("sp_PropertyName in", values, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameNotIn(List<String> values) {
            addCriterion("sp_PropertyName not in", values, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameBetween(String value1, String value2) {
            addCriterion("sp_PropertyName between", value1, value2, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpPropertynameNotBetween(String value1, String value2) {
            addCriterion("sp_PropertyName not between", value1, value2, "spPropertyname");
            return (Criteria) this;
        }

        public Criteria andSpAliasIsNull() {
            addCriterion("sp_Alias is null");
            return (Criteria) this;
        }

        public Criteria andSpAliasIsNotNull() {
            addCriterion("sp_Alias is not null");
            return (Criteria) this;
        }

        public Criteria andSpAliasEqualTo(String value) {
            addCriterion("sp_Alias =", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasNotEqualTo(String value) {
            addCriterion("sp_Alias <>", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasGreaterThan(String value) {
            addCriterion("sp_Alias >", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Alias >=", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasLessThan(String value) {
            addCriterion("sp_Alias <", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasLessThanOrEqualTo(String value) {
            addCriterion("sp_Alias <=", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasLike(String value) {
            addCriterion("sp_Alias like", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasNotLike(String value) {
            addCriterion("sp_Alias not like", value, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasIn(List<String> values) {
            addCriterion("sp_Alias in", values, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasNotIn(List<String> values) {
            addCriterion("sp_Alias not in", values, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasBetween(String value1, String value2) {
            addCriterion("sp_Alias between", value1, value2, "spAlias");
            return (Criteria) this;
        }

        public Criteria andSpAliasNotBetween(String value1, String value2) {
            addCriterion("sp_Alias not between", value1, value2, "spAlias");
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

        public Criteria andSpIscolorproIsNull() {
            addCriterion("sp_IsColorPro is null");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproIsNotNull() {
            addCriterion("sp_IsColorPro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproEqualTo(Integer value) {
            addCriterion("sp_IsColorPro =", value, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproNotEqualTo(Integer value) {
            addCriterion("sp_IsColorPro <>", value, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproGreaterThan(Integer value) {
            addCriterion("sp_IsColorPro >", value, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsColorPro >=", value, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproLessThan(Integer value) {
            addCriterion("sp_IsColorPro <", value, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsColorPro <=", value, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproIn(List<Integer> values) {
            addCriterion("sp_IsColorPro in", values, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproNotIn(List<Integer> values) {
            addCriterion("sp_IsColorPro not in", values, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsColorPro between", value1, value2, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIscolorproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsColorPro not between", value1, value2, "spIscolorpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproIsNull() {
            addCriterion("sp_IsEnumPro is null");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproIsNotNull() {
            addCriterion("sp_IsEnumPro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproEqualTo(Integer value) {
            addCriterion("sp_IsEnumPro =", value, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproNotEqualTo(Integer value) {
            addCriterion("sp_IsEnumPro <>", value, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproGreaterThan(Integer value) {
            addCriterion("sp_IsEnumPro >", value, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsEnumPro >=", value, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproLessThan(Integer value) {
            addCriterion("sp_IsEnumPro <", value, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsEnumPro <=", value, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproIn(List<Integer> values) {
            addCriterion("sp_IsEnumPro in", values, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproNotIn(List<Integer> values) {
            addCriterion("sp_IsEnumPro not in", values, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsEnumPro between", value1, value2, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsenumproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsEnumPro not between", value1, value2, "spIsenumpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproIsNull() {
            addCriterion("sp_IsImportPro is null");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproIsNotNull() {
            addCriterion("sp_IsImportPro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproEqualTo(Integer value) {
            addCriterion("sp_IsImportPro =", value, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproNotEqualTo(Integer value) {
            addCriterion("sp_IsImportPro <>", value, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproGreaterThan(Integer value) {
            addCriterion("sp_IsImportPro >", value, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsImportPro >=", value, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproLessThan(Integer value) {
            addCriterion("sp_IsImportPro <", value, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsImportPro <=", value, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproIn(List<Integer> values) {
            addCriterion("sp_IsImportPro in", values, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproNotIn(List<Integer> values) {
            addCriterion("sp_IsImportPro not in", values, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsImportPro between", value1, value2, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIsimportproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsImportPro not between", value1, value2, "spIsimportpro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproIsNull() {
            addCriterion("sp_IsKeyPro is null");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproIsNotNull() {
            addCriterion("sp_IsKeyPro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproEqualTo(Integer value) {
            addCriterion("sp_IsKeyPro =", value, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproNotEqualTo(Integer value) {
            addCriterion("sp_IsKeyPro <>", value, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproGreaterThan(Integer value) {
            addCriterion("sp_IsKeyPro >", value, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsKeyPro >=", value, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproLessThan(Integer value) {
            addCriterion("sp_IsKeyPro <", value, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsKeyPro <=", value, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproIn(List<Integer> values) {
            addCriterion("sp_IsKeyPro in", values, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproNotIn(List<Integer> values) {
            addCriterion("sp_IsKeyPro not in", values, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsKeyPro between", value1, value2, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIskeyproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsKeyPro not between", value1, value2, "spIskeypro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproIsNull() {
            addCriterion("sp_IsSearchPro is null");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproIsNotNull() {
            addCriterion("sp_IsSearchPro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproEqualTo(Integer value) {
            addCriterion("sp_IsSearchPro =", value, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproNotEqualTo(Integer value) {
            addCriterion("sp_IsSearchPro <>", value, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproGreaterThan(Integer value) {
            addCriterion("sp_IsSearchPro >", value, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsSearchPro >=", value, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproLessThan(Integer value) {
            addCriterion("sp_IsSearchPro <", value, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsSearchPro <=", value, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproIn(List<Integer> values) {
            addCriterion("sp_IsSearchPro in", values, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproNotIn(List<Integer> values) {
            addCriterion("sp_IsSearchPro not in", values, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsSearchPro between", value1, value2, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIssearchproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsSearchPro not between", value1, value2, "spIssearchpro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproIsNull() {
            addCriterion("sp_IsRequirePro is null");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproIsNotNull() {
            addCriterion("sp_IsRequirePro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproEqualTo(Integer value) {
            addCriterion("sp_IsRequirePro =", value, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproNotEqualTo(Integer value) {
            addCriterion("sp_IsRequirePro <>", value, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproGreaterThan(Integer value) {
            addCriterion("sp_IsRequirePro >", value, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsRequirePro >=", value, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproLessThan(Integer value) {
            addCriterion("sp_IsRequirePro <", value, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsRequirePro <=", value, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproIn(List<Integer> values) {
            addCriterion("sp_IsRequirePro in", values, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproNotIn(List<Integer> values) {
            addCriterion("sp_IsRequirePro not in", values, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsRequirePro between", value1, value2, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsrequireproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsRequirePro not between", value1, value2, "spIsrequirepro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproIsNull() {
            addCriterion("sp_IsMultiselectPro is null");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproIsNotNull() {
            addCriterion("sp_IsMultiselectPro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproEqualTo(Integer value) {
            addCriterion("sp_IsMultiselectPro =", value, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproNotEqualTo(Integer value) {
            addCriterion("sp_IsMultiselectPro <>", value, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproGreaterThan(Integer value) {
            addCriterion("sp_IsMultiselectPro >", value, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsMultiselectPro >=", value, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproLessThan(Integer value) {
            addCriterion("sp_IsMultiselectPro <", value, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsMultiselectPro <=", value, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproIn(List<Integer> values) {
            addCriterion("sp_IsMultiselectPro in", values, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproNotIn(List<Integer> values) {
            addCriterion("sp_IsMultiselectPro not in", values, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsMultiselectPro between", value1, value2, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIsmultiselectproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsMultiselectPro not between", value1, value2, "spIsmultiselectpro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproIsNull() {
            addCriterion("sp_IsSalePro is null");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproIsNotNull() {
            addCriterion("sp_IsSalePro is not null");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproEqualTo(Integer value) {
            addCriterion("sp_IsSalePro =", value, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproNotEqualTo(Integer value) {
            addCriterion("sp_IsSalePro <>", value, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproGreaterThan(Integer value) {
            addCriterion("sp_IsSalePro >", value, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsSalePro >=", value, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproLessThan(Integer value) {
            addCriterion("sp_IsSalePro <", value, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsSalePro <=", value, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproIn(List<Integer> values) {
            addCriterion("sp_IsSalePro in", values, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproNotIn(List<Integer> values) {
            addCriterion("sp_IsSalePro not in", values, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsSalePro between", value1, value2, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpIssaleproNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsSalePro not between", value1, value2, "spIssalepro");
            return (Criteria) this;
        }

        public Criteria andSpSortIsNull() {
            addCriterion("sp_Sort is null");
            return (Criteria) this;
        }

        public Criteria andSpSortIsNotNull() {
            addCriterion("sp_Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSpSortEqualTo(Integer value) {
            addCriterion("sp_Sort =", value, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortNotEqualTo(Integer value) {
            addCriterion("sp_Sort <>", value, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortGreaterThan(Integer value) {
            addCriterion("sp_Sort >", value, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_Sort >=", value, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortLessThan(Integer value) {
            addCriterion("sp_Sort <", value, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortLessThanOrEqualTo(Integer value) {
            addCriterion("sp_Sort <=", value, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortIn(List<Integer> values) {
            addCriterion("sp_Sort in", values, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortNotIn(List<Integer> values) {
            addCriterion("sp_Sort not in", values, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortBetween(Integer value1, Integer value2) {
            addCriterion("sp_Sort between", value1, value2, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_Sort not between", value1, value2, "spSort");
            return (Criteria) this;
        }

        public Criteria andSpParentidIsNull() {
            addCriterion("sp_ParentId is null");
            return (Criteria) this;
        }

        public Criteria andSpParentidIsNotNull() {
            addCriterion("sp_ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andSpParentidEqualTo(Integer value) {
            addCriterion("sp_ParentId =", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidNotEqualTo(Integer value) {
            addCriterion("sp_ParentId <>", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidGreaterThan(Integer value) {
            addCriterion("sp_ParentId >", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_ParentId >=", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidLessThan(Integer value) {
            addCriterion("sp_ParentId <", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidLessThanOrEqualTo(Integer value) {
            addCriterion("sp_ParentId <=", value, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidIn(List<Integer> values) {
            addCriterion("sp_ParentId in", values, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidNotIn(List<Integer> values) {
            addCriterion("sp_ParentId not in", values, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidBetween(Integer value1, Integer value2) {
            addCriterion("sp_ParentId between", value1, value2, "spParentid");
            return (Criteria) this;
        }

        public Criteria andSpParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_ParentId not between", value1, value2, "spParentid");
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