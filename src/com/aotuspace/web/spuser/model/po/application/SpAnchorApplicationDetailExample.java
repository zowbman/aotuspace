package com.aotuspace.web.spuser.model.po.application;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpAnchorApplicationDetailExample
 * Description:´úÑÔÖ÷²¥ÉêÇëÏêÏ¸Ìõ¼þ
 * Company:aotuspace
 * @author    Î°±¦
 * @date      2015-12-4 ÏÂÎç2:36:51
 *
 */
public class SpAnchorApplicationDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpAnchorApplicationDetailExample() {
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

        public Criteria andSpRealnameIsNull() {
            addCriterion("sp_RealName is null");
            return (Criteria) this;
        }

        public Criteria andSpRealnameIsNotNull() {
            addCriterion("sp_RealName is not null");
            return (Criteria) this;
        }

        public Criteria andSpRealnameEqualTo(String value) {
            addCriterion("sp_RealName =", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameNotEqualTo(String value) {
            addCriterion("sp_RealName <>", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameGreaterThan(String value) {
            addCriterion("sp_RealName >", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_RealName >=", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameLessThan(String value) {
            addCriterion("sp_RealName <", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameLessThanOrEqualTo(String value) {
            addCriterion("sp_RealName <=", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameLike(String value) {
            addCriterion("sp_RealName like", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameNotLike(String value) {
            addCriterion("sp_RealName not like", value, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameIn(List<String> values) {
            addCriterion("sp_RealName in", values, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameNotIn(List<String> values) {
            addCriterion("sp_RealName not in", values, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameBetween(String value1, String value2) {
            addCriterion("sp_RealName between", value1, value2, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpRealnameNotBetween(String value1, String value2) {
            addCriterion("sp_RealName not between", value1, value2, "spRealname");
            return (Criteria) this;
        }

        public Criteria andSpMobieIsNull() {
            addCriterion("sp_Mobie is null");
            return (Criteria) this;
        }

        public Criteria andSpMobieIsNotNull() {
            addCriterion("sp_Mobie is not null");
            return (Criteria) this;
        }

        public Criteria andSpMobieEqualTo(String value) {
            addCriterion("sp_Mobie =", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieNotEqualTo(String value) {
            addCriterion("sp_Mobie <>", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieGreaterThan(String value) {
            addCriterion("sp_Mobie >", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Mobie >=", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieLessThan(String value) {
            addCriterion("sp_Mobie <", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieLessThanOrEqualTo(String value) {
            addCriterion("sp_Mobie <=", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieLike(String value) {
            addCriterion("sp_Mobie like", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieNotLike(String value) {
            addCriterion("sp_Mobie not like", value, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieIn(List<String> values) {
            addCriterion("sp_Mobie in", values, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieNotIn(List<String> values) {
            addCriterion("sp_Mobie not in", values, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieBetween(String value1, String value2) {
            addCriterion("sp_Mobie between", value1, value2, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpMobieNotBetween(String value1, String value2) {
            addCriterion("sp_Mobie not between", value1, value2, "spMobie");
            return (Criteria) this;
        }

        public Criteria andSpIdnumIsNull() {
            addCriterion("sp_IdNum is null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumIsNotNull() {
            addCriterion("sp_IdNum is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumEqualTo(String value) {
            addCriterion("sp_IdNum =", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotEqualTo(String value) {
            addCriterion("sp_IdNum <>", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumGreaterThan(String value) {
            addCriterion("sp_IdNum >", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("sp_IdNum >=", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumLessThan(String value) {
            addCriterion("sp_IdNum <", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumLessThanOrEqualTo(String value) {
            addCriterion("sp_IdNum <=", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumLike(String value) {
            addCriterion("sp_IdNum like", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotLike(String value) {
            addCriterion("sp_IdNum not like", value, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumIn(List<String> values) {
            addCriterion("sp_IdNum in", values, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotIn(List<String> values) {
            addCriterion("sp_IdNum not in", values, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumBetween(String value1, String value2) {
            addCriterion("sp_IdNum between", value1, value2, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumNotBetween(String value1, String value2) {
            addCriterion("sp_IdNum not between", value1, value2, "spIdnum");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortIsNull() {
            addCriterion("sp_IdNumSort is null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortIsNotNull() {
            addCriterion("sp_IdNumSort is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortEqualTo(String value) {
            addCriterion("sp_IdNumSort =", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotEqualTo(String value) {
            addCriterion("sp_IdNumSort <>", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortGreaterThan(String value) {
            addCriterion("sp_IdNumSort >", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortGreaterThanOrEqualTo(String value) {
            addCriterion("sp_IdNumSort >=", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortLessThan(String value) {
            addCriterion("sp_IdNumSort <", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortLessThanOrEqualTo(String value) {
            addCriterion("sp_IdNumSort <=", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortLike(String value) {
            addCriterion("sp_IdNumSort like", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotLike(String value) {
            addCriterion("sp_IdNumSort not like", value, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortIn(List<String> values) {
            addCriterion("sp_IdNumSort in", values, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotIn(List<String> values) {
            addCriterion("sp_IdNumSort not in", values, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortBetween(String value1, String value2) {
            addCriterion("sp_IdNumSort between", value1, value2, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpIdnumsortNotBetween(String value1, String value2) {
            addCriterion("sp_IdNumSort not between", value1, value2, "spIdnumsort");
            return (Criteria) this;
        }

        public Criteria andSpBankIsNull() {
            addCriterion("sp_Bank is null");
            return (Criteria) this;
        }

        public Criteria andSpBankIsNotNull() {
            addCriterion("sp_Bank is not null");
            return (Criteria) this;
        }

        public Criteria andSpBankEqualTo(Integer value) {
            addCriterion("sp_Bank =", value, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankNotEqualTo(Integer value) {
            addCriterion("sp_Bank <>", value, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankGreaterThan(Integer value) {
            addCriterion("sp_Bank >", value, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_Bank >=", value, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankLessThan(Integer value) {
            addCriterion("sp_Bank <", value, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankLessThanOrEqualTo(Integer value) {
            addCriterion("sp_Bank <=", value, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankIn(List<Integer> values) {
            addCriterion("sp_Bank in", values, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankNotIn(List<Integer> values) {
            addCriterion("sp_Bank not in", values, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankBetween(Integer value1, Integer value2) {
            addCriterion("sp_Bank between", value1, value2, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpBankNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_Bank not between", value1, value2, "spBank");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictIsNull() {
            addCriterion("sp_AncDistrict is null");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictIsNotNull() {
            addCriterion("sp_AncDistrict is not null");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictEqualTo(Integer value) {
            addCriterion("sp_AncDistrict =", value, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictNotEqualTo(Integer value) {
            addCriterion("sp_AncDistrict <>", value, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictGreaterThan(Integer value) {
            addCriterion("sp_AncDistrict >", value, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_AncDistrict >=", value, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictLessThan(Integer value) {
            addCriterion("sp_AncDistrict <", value, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictLessThanOrEqualTo(Integer value) {
            addCriterion("sp_AncDistrict <=", value, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictIn(List<Integer> values) {
            addCriterion("sp_AncDistrict in", values, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictNotIn(List<Integer> values) {
            addCriterion("sp_AncDistrict not in", values, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictBetween(Integer value1, Integer value2) {
            addCriterion("sp_AncDistrict between", value1, value2, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpAncdistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_AncDistrict not between", value1, value2, "spAncdistrict");
            return (Criteria) this;
        }

        public Criteria andSpBabranchIsNull() {
            addCriterion("sp_BaBranch is null");
            return (Criteria) this;
        }

        public Criteria andSpBabranchIsNotNull() {
            addCriterion("sp_BaBranch is not null");
            return (Criteria) this;
        }

        public Criteria andSpBabranchEqualTo(Long value) {
            addCriterion("sp_BaBranch =", value, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchNotEqualTo(Long value) {
            addCriterion("sp_BaBranch <>", value, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchGreaterThan(Long value) {
            addCriterion("sp_BaBranch >", value, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_BaBranch >=", value, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchLessThan(Long value) {
            addCriterion("sp_BaBranch <", value, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchLessThanOrEqualTo(Long value) {
            addCriterion("sp_BaBranch <=", value, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchIn(List<Long> values) {
            addCriterion("sp_BaBranch in", values, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchNotIn(List<Long> values) {
            addCriterion("sp_BaBranch not in", values, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchBetween(Long value1, Long value2) {
            addCriterion("sp_BaBranch between", value1, value2, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBabranchNotBetween(Long value1, Long value2) {
            addCriterion("sp_BaBranch not between", value1, value2, "spBabranch");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameIsNull() {
            addCriterion("sp_BankUserName is null");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameIsNotNull() {
            addCriterion("sp_BankUserName is not null");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameEqualTo(String value) {
            addCriterion("sp_BankUserName =", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameNotEqualTo(String value) {
            addCriterion("sp_BankUserName <>", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameGreaterThan(String value) {
            addCriterion("sp_BankUserName >", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_BankUserName >=", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameLessThan(String value) {
            addCriterion("sp_BankUserName <", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameLessThanOrEqualTo(String value) {
            addCriterion("sp_BankUserName <=", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameLike(String value) {
            addCriterion("sp_BankUserName like", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameNotLike(String value) {
            addCriterion("sp_BankUserName not like", value, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameIn(List<String> values) {
            addCriterion("sp_BankUserName in", values, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameNotIn(List<String> values) {
            addCriterion("sp_BankUserName not in", values, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameBetween(String value1, String value2) {
            addCriterion("sp_BankUserName between", value1, value2, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBankusernameNotBetween(String value1, String value2) {
            addCriterion("sp_BankUserName not between", value1, value2, "spBankusername");
            return (Criteria) this;
        }

        public Criteria andSpBaidIsNull() {
            addCriterion("sp_BaId is null");
            return (Criteria) this;
        }

        public Criteria andSpBaidIsNotNull() {
            addCriterion("sp_BaId is not null");
            return (Criteria) this;
        }

        public Criteria andSpBaidEqualTo(Long value) {
            addCriterion("sp_BaId =", value, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidNotEqualTo(Long value) {
            addCriterion("sp_BaId <>", value, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidGreaterThan(Long value) {
            addCriterion("sp_BaId >", value, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_BaId >=", value, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidLessThan(Long value) {
            addCriterion("sp_BaId <", value, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidLessThanOrEqualTo(Long value) {
            addCriterion("sp_BaId <=", value, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidIn(List<Long> values) {
            addCriterion("sp_BaId in", values, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidNotIn(List<Long> values) {
            addCriterion("sp_BaId not in", values, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidBetween(Long value1, Long value2) {
            addCriterion("sp_BaId between", value1, value2, "spBaid");
            return (Criteria) this;
        }

        public Criteria andSpBaidNotBetween(Long value1, Long value2) {
            addCriterion("sp_BaId not between", value1, value2, "spBaid");
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