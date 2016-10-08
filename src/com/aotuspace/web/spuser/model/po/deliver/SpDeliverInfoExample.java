package com.aotuspace.web.spuser.model.po.deliver;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title:SpDeliverInfoExample
 * Description:收货地址条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-31 上午11:28:34
 *
 */
public class SpDeliverInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpDeliverInfoExample() {
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

        public Criteria andSpAreaIsNull() {
            addCriterion("sp_Area is null");
            return (Criteria) this;
        }

        public Criteria andSpAreaIsNotNull() {
            addCriterion("sp_Area is not null");
            return (Criteria) this;
        }

        public Criteria andSpAreaEqualTo(String value) {
            addCriterion("sp_Area =", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaNotEqualTo(String value) {
            addCriterion("sp_Area <>", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaGreaterThan(String value) {
            addCriterion("sp_Area >", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Area >=", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaLessThan(String value) {
            addCriterion("sp_Area <", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaLessThanOrEqualTo(String value) {
            addCriterion("sp_Area <=", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaLike(String value) {
            addCriterion("sp_Area like", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaNotLike(String value) {
            addCriterion("sp_Area not like", value, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaIn(List<String> values) {
            addCriterion("sp_Area in", values, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaNotIn(List<String> values) {
            addCriterion("sp_Area not in", values, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaBetween(String value1, String value2) {
            addCriterion("sp_Area between", value1, value2, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAreaNotBetween(String value1, String value2) {
            addCriterion("sp_Area not between", value1, value2, "spArea");
            return (Criteria) this;
        }

        public Criteria andSpAddressIsNull() {
            addCriterion("sp_Address is null");
            return (Criteria) this;
        }

        public Criteria andSpAddressIsNotNull() {
            addCriterion("sp_Address is not null");
            return (Criteria) this;
        }

        public Criteria andSpAddressEqualTo(String value) {
            addCriterion("sp_Address =", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressNotEqualTo(String value) {
            addCriterion("sp_Address <>", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressGreaterThan(String value) {
            addCriterion("sp_Address >", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Address >=", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressLessThan(String value) {
            addCriterion("sp_Address <", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressLessThanOrEqualTo(String value) {
            addCriterion("sp_Address <=", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressLike(String value) {
            addCriterion("sp_Address like", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressNotLike(String value) {
            addCriterion("sp_Address not like", value, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressIn(List<String> values) {
            addCriterion("sp_Address in", values, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressNotIn(List<String> values) {
            addCriterion("sp_Address not in", values, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressBetween(String value1, String value2) {
            addCriterion("sp_Address between", value1, value2, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpAddressNotBetween(String value1, String value2) {
            addCriterion("sp_Address not between", value1, value2, "spAddress");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeIsNull() {
            addCriterion("sp_PostCode is null");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeIsNotNull() {
            addCriterion("sp_PostCode is not null");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeEqualTo(String value) {
            addCriterion("sp_PostCode =", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeNotEqualTo(String value) {
            addCriterion("sp_PostCode <>", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeGreaterThan(String value) {
            addCriterion("sp_PostCode >", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sp_PostCode >=", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeLessThan(String value) {
            addCriterion("sp_PostCode <", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeLessThanOrEqualTo(String value) {
            addCriterion("sp_PostCode <=", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeLike(String value) {
            addCriterion("sp_PostCode like", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeNotLike(String value) {
            addCriterion("sp_PostCode not like", value, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeIn(List<String> values) {
            addCriterion("sp_PostCode in", values, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeNotIn(List<String> values) {
            addCriterion("sp_PostCode not in", values, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeBetween(String value1, String value2) {
            addCriterion("sp_PostCode between", value1, value2, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpPostcodeNotBetween(String value1, String value2) {
            addCriterion("sp_PostCode not between", value1, value2, "spPostcode");
            return (Criteria) this;
        }

        public Criteria andSpReceiverIsNull() {
            addCriterion("sp_Receiver is null");
            return (Criteria) this;
        }

        public Criteria andSpReceiverIsNotNull() {
            addCriterion("sp_Receiver is not null");
            return (Criteria) this;
        }

        public Criteria andSpReceiverEqualTo(String value) {
            addCriterion("sp_Receiver =", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverNotEqualTo(String value) {
            addCriterion("sp_Receiver <>", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverGreaterThan(String value) {
            addCriterion("sp_Receiver >", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Receiver >=", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverLessThan(String value) {
            addCriterion("sp_Receiver <", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverLessThanOrEqualTo(String value) {
            addCriterion("sp_Receiver <=", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverLike(String value) {
            addCriterion("sp_Receiver like", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverNotLike(String value) {
            addCriterion("sp_Receiver not like", value, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverIn(List<String> values) {
            addCriterion("sp_Receiver in", values, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverNotIn(List<String> values) {
            addCriterion("sp_Receiver not in", values, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverBetween(String value1, String value2) {
            addCriterion("sp_Receiver between", value1, value2, "spReceiver");
            return (Criteria) this;
        }

        public Criteria andSpReceiverNotBetween(String value1, String value2) {
            addCriterion("sp_Receiver not between", value1, value2, "spReceiver");
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

        public Criteria andSpTelephoneIsNull() {
            addCriterion("sp_Telephone is null");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneIsNotNull() {
            addCriterion("sp_Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneEqualTo(String value) {
            addCriterion("sp_Telephone =", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneNotEqualTo(String value) {
            addCriterion("sp_Telephone <>", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneGreaterThan(String value) {
            addCriterion("sp_Telephone >", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Telephone >=", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneLessThan(String value) {
            addCriterion("sp_Telephone <", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneLessThanOrEqualTo(String value) {
            addCriterion("sp_Telephone <=", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneLike(String value) {
            addCriterion("sp_Telephone like", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneNotLike(String value) {
            addCriterion("sp_Telephone not like", value, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneIn(List<String> values) {
            addCriterion("sp_Telephone in", values, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneNotIn(List<String> values) {
            addCriterion("sp_Telephone not in", values, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneBetween(String value1, String value2) {
            addCriterion("sp_Telephone between", value1, value2, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpTelephoneNotBetween(String value1, String value2) {
            addCriterion("sp_Telephone not between", value1, value2, "spTelephone");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultIsNull() {
            addCriterion("sp_IsDefault is null");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultIsNotNull() {
            addCriterion("sp_IsDefault is not null");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultEqualTo(Integer value) {
            addCriterion("sp_IsDefault =", value, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultNotEqualTo(Integer value) {
            addCriterion("sp_IsDefault <>", value, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultGreaterThan(Integer value) {
            addCriterion("sp_IsDefault >", value, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("sp_IsDefault >=", value, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultLessThan(Integer value) {
            addCriterion("sp_IsDefault <", value, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultLessThanOrEqualTo(Integer value) {
            addCriterion("sp_IsDefault <=", value, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultIn(List<Integer> values) {
            addCriterion("sp_IsDefault in", values, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultNotIn(List<Integer> values) {
            addCriterion("sp_IsDefault not in", values, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsDefault between", value1, value2, "spIsdefault");
            return (Criteria) this;
        }

        public Criteria andSpIsdefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("sp_IsDefault not between", value1, value2, "spIsdefault");
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