package com.tjetc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ServicerequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServicerequestExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeridIsNull() {
            addCriterion("serid is null");
            return (Criteria) this;
        }

        public Criteria andSeridIsNotNull() {
            addCriterion("serid is not null");
            return (Criteria) this;
        }

        public Criteria andSeridEqualTo(String value) {
            addCriterion("serid =", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotEqualTo(String value) {
            addCriterion("serid <>", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridGreaterThan(String value) {
            addCriterion("serid >", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridGreaterThanOrEqualTo(String value) {
            addCriterion("serid >=", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLessThan(String value) {
            addCriterion("serid <", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLessThanOrEqualTo(String value) {
            addCriterion("serid <=", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridLike(String value) {
            addCriterion("serid like", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotLike(String value) {
            addCriterion("serid not like", value, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridIn(List<String> values) {
            addCriterion("serid in", values, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotIn(List<String> values) {
            addCriterion("serid not in", values, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridBetween(String value1, String value2) {
            addCriterion("serid between", value1, value2, "serid");
            return (Criteria) this;
        }

        public Criteria andSeridNotBetween(String value1, String value2) {
            addCriterion("serid not between", value1, value2, "serid");
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

        public Criteria andSertextIsNull() {
            addCriterion("sertext is null");
            return (Criteria) this;
        }

        public Criteria andSertextIsNotNull() {
            addCriterion("sertext is not null");
            return (Criteria) this;
        }

        public Criteria andSertextEqualTo(String value) {
            addCriterion("sertext =", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextNotEqualTo(String value) {
            addCriterion("sertext <>", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextGreaterThan(String value) {
            addCriterion("sertext >", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextGreaterThanOrEqualTo(String value) {
            addCriterion("sertext >=", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextLessThan(String value) {
            addCriterion("sertext <", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextLessThanOrEqualTo(String value) {
            addCriterion("sertext <=", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextLike(String value) {
            addCriterion("sertext like", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextNotLike(String value) {
            addCriterion("sertext not like", value, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextIn(List<String> values) {
            addCriterion("sertext in", values, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextNotIn(List<String> values) {
            addCriterion("sertext not in", values, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextBetween(String value1, String value2) {
            addCriterion("sertext between", value1, value2, "sertext");
            return (Criteria) this;
        }

        public Criteria andSertextNotBetween(String value1, String value2) {
            addCriterion("sertext not between", value1, value2, "sertext");
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