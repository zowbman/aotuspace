package com.aotuspace.web.spuser.model.po.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Title:SpUsersDinfoExample
 * Description:用户详细信息条件
 * Company:aotuspace
 * @author    伟宝
 * @date      2015-12-26 下午12:41:11
 *
 */
public class SpUsersDinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpUsersDinfoExample() {
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

        public Criteria andSpNicknameIsNull() {
            addCriterion("sp_NickName is null");
            return (Criteria) this;
        }

        public Criteria andSpNicknameIsNotNull() {
            addCriterion("sp_NickName is not null");
            return (Criteria) this;
        }

        public Criteria andSpNicknameEqualTo(String value) {
            addCriterion("sp_NickName =", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameNotEqualTo(String value) {
            addCriterion("sp_NickName <>", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameGreaterThan(String value) {
            addCriterion("sp_NickName >", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("sp_NickName >=", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameLessThan(String value) {
            addCriterion("sp_NickName <", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameLessThanOrEqualTo(String value) {
            addCriterion("sp_NickName <=", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameLike(String value) {
            addCriterion("sp_NickName like", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameNotLike(String value) {
            addCriterion("sp_NickName not like", value, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameIn(List<String> values) {
            addCriterion("sp_NickName in", values, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameNotIn(List<String> values) {
            addCriterion("sp_NickName not in", values, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameBetween(String value1, String value2) {
            addCriterion("sp_NickName between", value1, value2, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpNicknameNotBetween(String value1, String value2) {
            addCriterion("sp_NickName not between", value1, value2, "spNickname");
            return (Criteria) this;
        }

        public Criteria andSpIconIsNull() {
            addCriterion("sp_Icon is null");
            return (Criteria) this;
        }

        public Criteria andSpIconIsNotNull() {
            addCriterion("sp_Icon is not null");
            return (Criteria) this;
        }

        public Criteria andSpIconEqualTo(String value) {
            addCriterion("sp_Icon =", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconNotEqualTo(String value) {
            addCriterion("sp_Icon <>", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconGreaterThan(String value) {
            addCriterion("sp_Icon >", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Icon >=", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconLessThan(String value) {
            addCriterion("sp_Icon <", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconLessThanOrEqualTo(String value) {
            addCriterion("sp_Icon <=", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconLike(String value) {
            addCriterion("sp_Icon like", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconNotLike(String value) {
            addCriterion("sp_Icon not like", value, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconIn(List<String> values) {
            addCriterion("sp_Icon in", values, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconNotIn(List<String> values) {
            addCriterion("sp_Icon not in", values, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconBetween(String value1, String value2) {
            addCriterion("sp_Icon between", value1, value2, "spIcon");
            return (Criteria) this;
        }

        public Criteria andSpIconNotBetween(String value1, String value2) {
            addCriterion("sp_Icon not between", value1, value2, "spIcon");
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

        public Criteria andSpSexIsNull() {
            addCriterion("sp_Sex is null");
            return (Criteria) this;
        }

        public Criteria andSpSexIsNotNull() {
            addCriterion("sp_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSpSexEqualTo(String value) {
            addCriterion("sp_Sex =", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexNotEqualTo(String value) {
            addCriterion("sp_Sex <>", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexGreaterThan(String value) {
            addCriterion("sp_Sex >", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexGreaterThanOrEqualTo(String value) {
            addCriterion("sp_Sex >=", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexLessThan(String value) {
            addCriterion("sp_Sex <", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexLessThanOrEqualTo(String value) {
            addCriterion("sp_Sex <=", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexLike(String value) {
            addCriterion("sp_Sex like", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexNotLike(String value) {
            addCriterion("sp_Sex not like", value, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexIn(List<String> values) {
            addCriterion("sp_Sex in", values, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexNotIn(List<String> values) {
            addCriterion("sp_Sex not in", values, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexBetween(String value1, String value2) {
            addCriterion("sp_Sex between", value1, value2, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpSexNotBetween(String value1, String value2) {
            addCriterion("sp_Sex not between", value1, value2, "spSex");
            return (Criteria) this;
        }

        public Criteria andSpBirthIsNull() {
            addCriterion("sp_Birth is null");
            return (Criteria) this;
        }

        public Criteria andSpBirthIsNotNull() {
            addCriterion("sp_Birth is not null");
            return (Criteria) this;
        }

        public Criteria andSpBirthEqualTo(Date value) {
            addCriterion("sp_Birth =", value, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthNotEqualTo(Date value) {
            addCriterion("sp_Birth <>", value, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthGreaterThan(Date value) {
            addCriterion("sp_Birth >", value, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("sp_Birth >=", value, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthLessThan(Date value) {
            addCriterion("sp_Birth <", value, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthLessThanOrEqualTo(Date value) {
            addCriterion("sp_Birth <=", value, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthIn(List<Date> values) {
            addCriterion("sp_Birth in", values, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthNotIn(List<Date> values) {
            addCriterion("sp_Birth not in", values, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthBetween(Date value1, Date value2) {
            addCriterion("sp_Birth between", value1, value2, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpBirthNotBetween(Date value1, Date value2) {
            addCriterion("sp_Birth not between", value1, value2, "spBirth");
            return (Criteria) this;
        }

        public Criteria andSpAnimalIsNull() {
            addCriterion("sp_Animal is null");
            return (Criteria) this;
        }

        public Criteria andSpAnimalIsNotNull() {
            addCriterion("sp_Animal is not null");
            return (Criteria) this;
        }

        public Criteria andSpAnimalEqualTo(Byte value) {
            addCriterion("sp_Animal =", value, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalNotEqualTo(Byte value) {
            addCriterion("sp_Animal <>", value, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalGreaterThan(Byte value) {
            addCriterion("sp_Animal >", value, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_Animal >=", value, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalLessThan(Byte value) {
            addCriterion("sp_Animal <", value, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalLessThanOrEqualTo(Byte value) {
            addCriterion("sp_Animal <=", value, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalIn(List<Byte> values) {
            addCriterion("sp_Animal in", values, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalNotIn(List<Byte> values) {
            addCriterion("sp_Animal not in", values, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalBetween(Byte value1, Byte value2) {
            addCriterion("sp_Animal between", value1, value2, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAnimalNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_Animal not between", value1, value2, "spAnimal");
            return (Criteria) this;
        }

        public Criteria andSpAgeIsNull() {
            addCriterion("sp_Age is null");
            return (Criteria) this;
        }

        public Criteria andSpAgeIsNotNull() {
            addCriterion("sp_Age is not null");
            return (Criteria) this;
        }

        public Criteria andSpAgeEqualTo(Byte value) {
            addCriterion("sp_Age =", value, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeNotEqualTo(Byte value) {
            addCriterion("sp_Age <>", value, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeGreaterThan(Byte value) {
            addCriterion("sp_Age >", value, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_Age >=", value, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeLessThan(Byte value) {
            addCriterion("sp_Age <", value, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeLessThanOrEqualTo(Byte value) {
            addCriterion("sp_Age <=", value, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeIn(List<Byte> values) {
            addCriterion("sp_Age in", values, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeNotIn(List<Byte> values) {
            addCriterion("sp_Age not in", values, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeBetween(Byte value1, Byte value2) {
            addCriterion("sp_Age between", value1, value2, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_Age not between", value1, value2, "spAge");
            return (Criteria) this;
        }

        public Criteria andSpConIsNull() {
            addCriterion("sp_Con is null");
            return (Criteria) this;
        }

        public Criteria andSpConIsNotNull() {
            addCriterion("sp_Con is not null");
            return (Criteria) this;
        }

        public Criteria andSpConEqualTo(Byte value) {
            addCriterion("sp_Con =", value, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConNotEqualTo(Byte value) {
            addCriterion("sp_Con <>", value, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConGreaterThan(Byte value) {
            addCriterion("sp_Con >", value, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConGreaterThanOrEqualTo(Byte value) {
            addCriterion("sp_Con >=", value, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConLessThan(Byte value) {
            addCriterion("sp_Con <", value, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConLessThanOrEqualTo(Byte value) {
            addCriterion("sp_Con <=", value, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConIn(List<Byte> values) {
            addCriterion("sp_Con in", values, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConNotIn(List<Byte> values) {
            addCriterion("sp_Con not in", values, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConBetween(Byte value1, Byte value2) {
            addCriterion("sp_Con between", value1, value2, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpConNotBetween(Byte value1, Byte value2) {
            addCriterion("sp_Con not between", value1, value2, "spCon");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictIsNull() {
            addCriterion("sp_UserDistrict is null");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictIsNotNull() {
            addCriterion("sp_UserDistrict is not null");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictEqualTo(String value) {
            addCriterion("sp_UserDistrict =", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictNotEqualTo(String value) {
            addCriterion("sp_UserDistrict <>", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictGreaterThan(String value) {
            addCriterion("sp_UserDistrict >", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictGreaterThanOrEqualTo(String value) {
            addCriterion("sp_UserDistrict >=", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictLessThan(String value) {
            addCriterion("sp_UserDistrict <", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictLessThanOrEqualTo(String value) {
            addCriterion("sp_UserDistrict <=", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictLike(String value) {
            addCriterion("sp_UserDistrict like", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictNotLike(String value) {
            addCriterion("sp_UserDistrict not like", value, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictIn(List<String> values) {
            addCriterion("sp_UserDistrict in", values, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictNotIn(List<String> values) {
            addCriterion("sp_UserDistrict not in", values, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictBetween(String value1, String value2) {
            addCriterion("sp_UserDistrict between", value1, value2, "spUserdistrict");
            return (Criteria) this;
        }

        public Criteria andSpUserdistrictNotBetween(String value1, String value2) {
            addCriterion("sp_UserDistrict not between", value1, value2, "spUserdistrict");
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