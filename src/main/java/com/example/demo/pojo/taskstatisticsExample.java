package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class taskstatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public taskstatisticsExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSecretNumIsNull() {
            addCriterion("secret_num is null");
            return (Criteria) this;
        }

        public Criteria andSecretNumIsNotNull() {
            addCriterion("secret_num is not null");
            return (Criteria) this;
        }

        public Criteria andSecretNumEqualTo(Integer value) {
            addCriterion("secret_num =", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotEqualTo(Integer value) {
            addCriterion("secret_num <>", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumGreaterThan(Integer value) {
            addCriterion("secret_num >", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("secret_num >=", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumLessThan(Integer value) {
            addCriterion("secret_num <", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumLessThanOrEqualTo(Integer value) {
            addCriterion("secret_num <=", value, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumIn(List<Integer> values) {
            addCriterion("secret_num in", values, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotIn(List<Integer> values) {
            addCriterion("secret_num not in", values, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumBetween(Integer value1, Integer value2) {
            addCriterion("secret_num between", value1, value2, "secretNum");
            return (Criteria) this;
        }

        public Criteria andSecretNumNotBetween(Integer value1, Integer value2) {
            addCriterion("secret_num not between", value1, value2, "secretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumIsNull() {
            addCriterion("no_secret_num is null");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumIsNotNull() {
            addCriterion("no_secret_num is not null");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumEqualTo(Integer value) {
            addCriterion("no_secret_num =", value, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumNotEqualTo(Integer value) {
            addCriterion("no_secret_num <>", value, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumGreaterThan(Integer value) {
            addCriterion("no_secret_num >", value, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_secret_num >=", value, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumLessThan(Integer value) {
            addCriterion("no_secret_num <", value, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumLessThanOrEqualTo(Integer value) {
            addCriterion("no_secret_num <=", value, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumIn(List<Integer> values) {
            addCriterion("no_secret_num in", values, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumNotIn(List<Integer> values) {
            addCriterion("no_secret_num not in", values, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumBetween(Integer value1, Integer value2) {
            addCriterion("no_secret_num between", value1, value2, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andNoSecretNumNotBetween(Integer value1, Integer value2) {
            addCriterion("no_secret_num not between", value1, value2, "noSecretNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumIsNull() {
            addCriterion("suspect_num is null");
            return (Criteria) this;
        }

        public Criteria andSuspectNumIsNotNull() {
            addCriterion("suspect_num is not null");
            return (Criteria) this;
        }

        public Criteria andSuspectNumEqualTo(Integer value) {
            addCriterion("suspect_num =", value, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumNotEqualTo(Integer value) {
            addCriterion("suspect_num <>", value, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumGreaterThan(Integer value) {
            addCriterion("suspect_num >", value, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("suspect_num >=", value, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumLessThan(Integer value) {
            addCriterion("suspect_num <", value, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumLessThanOrEqualTo(Integer value) {
            addCriterion("suspect_num <=", value, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumIn(List<Integer> values) {
            addCriterion("suspect_num in", values, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumNotIn(List<Integer> values) {
            addCriterion("suspect_num not in", values, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumBetween(Integer value1, Integer value2) {
            addCriterion("suspect_num between", value1, value2, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andSuspectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("suspect_num not between", value1, value2, "suspectNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumIsNull() {
            addCriterion("no_deal_num is null");
            return (Criteria) this;
        }

        public Criteria andNoDealNumIsNotNull() {
            addCriterion("no_deal_num is not null");
            return (Criteria) this;
        }

        public Criteria andNoDealNumEqualTo(Integer value) {
            addCriterion("no_deal_num =", value, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumNotEqualTo(Integer value) {
            addCriterion("no_deal_num <>", value, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumGreaterThan(Integer value) {
            addCriterion("no_deal_num >", value, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_deal_num >=", value, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumLessThan(Integer value) {
            addCriterion("no_deal_num <", value, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumLessThanOrEqualTo(Integer value) {
            addCriterion("no_deal_num <=", value, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumIn(List<Integer> values) {
            addCriterion("no_deal_num in", values, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumNotIn(List<Integer> values) {
            addCriterion("no_deal_num not in", values, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumBetween(Integer value1, Integer value2) {
            addCriterion("no_deal_num between", value1, value2, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andNoDealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("no_deal_num not between", value1, value2, "noDealNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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