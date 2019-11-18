package com.tjetc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServtitleIsNull() {
            addCriterion("servtitle is null");
            return (Criteria) this;
        }

        public Criteria andServtitleIsNotNull() {
            addCriterion("servtitle is not null");
            return (Criteria) this;
        }

        public Criteria andServtitleEqualTo(String value) {
            addCriterion("servtitle =", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleNotEqualTo(String value) {
            addCriterion("servtitle <>", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleGreaterThan(String value) {
            addCriterion("servtitle >", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleGreaterThanOrEqualTo(String value) {
            addCriterion("servtitle >=", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleLessThan(String value) {
            addCriterion("servtitle <", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleLessThanOrEqualTo(String value) {
            addCriterion("servtitle <=", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleLike(String value) {
            addCriterion("servtitle like", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleNotLike(String value) {
            addCriterion("servtitle not like", value, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleIn(List<String> values) {
            addCriterion("servtitle in", values, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleNotIn(List<String> values) {
            addCriterion("servtitle not in", values, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleBetween(String value1, String value2) {
            addCriterion("servtitle between", value1, value2, "servtitle");
            return (Criteria) this;
        }

        public Criteria andServtitleNotBetween(String value1, String value2) {
            addCriterion("servtitle not between", value1, value2, "servtitle");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andServtypeIsNull() {
            addCriterion("servtype is null");
            return (Criteria) this;
        }

        public Criteria andServtypeIsNotNull() {
            addCriterion("servtype is not null");
            return (Criteria) this;
        }

        public Criteria andServtypeEqualTo(String value) {
            addCriterion("servtype =", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeNotEqualTo(String value) {
            addCriterion("servtype <>", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeGreaterThan(String value) {
            addCriterion("servtype >", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeGreaterThanOrEqualTo(String value) {
            addCriterion("servtype >=", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeLessThan(String value) {
            addCriterion("servtype <", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeLessThanOrEqualTo(String value) {
            addCriterion("servtype <=", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeLike(String value) {
            addCriterion("servtype like", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeNotLike(String value) {
            addCriterion("servtype not like", value, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeIn(List<String> values) {
            addCriterion("servtype in", values, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeNotIn(List<String> values) {
            addCriterion("servtype not in", values, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeBetween(String value1, String value2) {
            addCriterion("servtype between", value1, value2, "servtype");
            return (Criteria) this;
        }

        public Criteria andServtypeNotBetween(String value1, String value2) {
            addCriterion("servtype not between", value1, value2, "servtype");
            return (Criteria) this;
        }

        public Criteria andCurnameIsNull() {
            addCriterion("curname is null");
            return (Criteria) this;
        }

        public Criteria andCurnameIsNotNull() {
            addCriterion("curname is not null");
            return (Criteria) this;
        }

        public Criteria andCurnameEqualTo(String value) {
            addCriterion("curname =", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameNotEqualTo(String value) {
            addCriterion("curname <>", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameGreaterThan(String value) {
            addCriterion("curname >", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameGreaterThanOrEqualTo(String value) {
            addCriterion("curname >=", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameLessThan(String value) {
            addCriterion("curname <", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameLessThanOrEqualTo(String value) {
            addCriterion("curname <=", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameLike(String value) {
            addCriterion("curname like", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameNotLike(String value) {
            addCriterion("curname not like", value, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameIn(List<String> values) {
            addCriterion("curname in", values, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameNotIn(List<String> values) {
            addCriterion("curname not in", values, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameBetween(String value1, String value2) {
            addCriterion("curname between", value1, value2, "curname");
            return (Criteria) this;
        }

        public Criteria andCurnameNotBetween(String value1, String value2) {
            addCriterion("curname not between", value1, value2, "curname");
            return (Criteria) this;
        }

        public Criteria andCretimeIsNull() {
            addCriterion("cretime is null");
            return (Criteria) this;
        }

        public Criteria andCretimeIsNotNull() {
            addCriterion("cretime is not null");
            return (Criteria) this;
        }

        public Criteria andCretimeEqualTo(String value) {
            addCriterion("cretime =", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeNotEqualTo(String value) {
            addCriterion("cretime <>", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeGreaterThan(String value) {
            addCriterion("cretime >", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeGreaterThanOrEqualTo(String value) {
            addCriterion("cretime >=", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeLessThan(String value) {
            addCriterion("cretime <", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeLessThanOrEqualTo(String value) {
            addCriterion("cretime <=", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeLike(String value) {
            addCriterion("cretime like", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeNotLike(String value) {
            addCriterion("cretime not like", value, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeIn(List<String> values) {
            addCriterion("cretime in", values, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeNotIn(List<String> values) {
            addCriterion("cretime not in", values, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeBetween(String value1, String value2) {
            addCriterion("cretime between", value1, value2, "cretime");
            return (Criteria) this;
        }

        public Criteria andCretimeNotBetween(String value1, String value2) {
            addCriterion("cretime not between", value1, value2, "cretime");
            return (Criteria) this;
        }

        public Criteria andStateidIsNull() {
            addCriterion("stateid is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("stateid is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(Integer value) {
            addCriterion("stateid =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(Integer value) {
            addCriterion("stateid <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(Integer value) {
            addCriterion("stateid >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateid >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(Integer value) {
            addCriterion("stateid <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(Integer value) {
            addCriterion("stateid <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<Integer> values) {
            addCriterion("stateid in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<Integer> values) {
            addCriterion("stateid not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(Integer value1, Integer value2) {
            addCriterion("stateid between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(Integer value1, Integer value2) {
            addCriterion("stateid not between", value1, value2, "stateid");
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