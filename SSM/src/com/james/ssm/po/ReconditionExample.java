package com.james.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReconditionExample {

    protected String orderByClause;


    protected boolean distinct;


    protected List<Criteria> oredCriteria;


    public ReconditionExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNuIsNull() {
            addCriterion("NU is null");
            return (Criteria) this;
        }

        public Criteria andNuIsNotNull() {
            addCriterion("NU is not null");
            return (Criteria) this;
        }

        public Criteria andNuEqualTo(String value) {
            addCriterion("NU =", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuNotEqualTo(String value) {
            addCriterion("NU <>", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuGreaterThan(String value) {
            addCriterion("NU >", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuGreaterThanOrEqualTo(String value) {
            addCriterion("NU >=", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuLessThan(String value) {
            addCriterion("NU <", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuLessThanOrEqualTo(String value) {
            addCriterion("NU <=", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuLike(String value) {
            addCriterion("NU like", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuNotLike(String value) {
            addCriterion("NU not like", value, "nu");
            return (Criteria) this;
        }

        public Criteria andNuIn(List<String> values) {
            addCriterion("NU in", values, "nu");
            return (Criteria) this;
        }

        public Criteria andNuNotIn(List<String> values) {
            addCriterion("NU not in", values, "nu");
            return (Criteria) this;
        }

        public Criteria andNuBetween(String value1, String value2) {
            addCriterion("NU between", value1, value2, "nu");
            return (Criteria) this;
        }

        public Criteria andNuNotBetween(String value1, String value2) {
            addCriterion("NU not between", value1, value2, "nu");
            return (Criteria) this;
        }

        public Criteria andRnameIsNull() {
            addCriterion("RNAME is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("RNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("RNAME =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("RNAME <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("RNAME >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("RNAME >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("RNAME <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("RNAME <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("RNAME like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("RNAME not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("RNAME in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("RNAME not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("RNAME between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("RNAME not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeIsNull() {
            addCriterion("RSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andRstarttimeIsNotNull() {
            addCriterion("RSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRstarttimeEqualTo(Date value) {
            addCriterion("RSTARTTIME =", value, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeNotEqualTo(Date value) {
            addCriterion("RSTARTTIME <>", value, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeGreaterThan(Date value) {
            addCriterion("RSTARTTIME >", value, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RSTARTTIME >=", value, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeLessThan(Date value) {
            addCriterion("RSTARTTIME <", value, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("RSTARTTIME <=", value, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeIn(List<Date> values) {
            addCriterion("RSTARTTIME in", values, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeNotIn(List<Date> values) {
            addCriterion("RSTARTTIME not in", values, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeBetween(Date value1, Date value2) {
            addCriterion("RSTARTTIME between", value1, value2, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("RSTARTTIME not between", value1, value2, "rstarttime");
            return (Criteria) this;
        }

        public Criteria andRendtimeIsNull() {
            addCriterion("RENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andRendtimeIsNotNull() {
            addCriterion("RENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRendtimeEqualTo(Date value) {
            addCriterion("RENDTIME =", value, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeNotEqualTo(Date value) {
            addCriterion("RENDTIME <>", value, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeGreaterThan(Date value) {
            addCriterion("RENDTIME >", value, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RENDTIME >=", value, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeLessThan(Date value) {
            addCriterion("RENDTIME <", value, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeLessThanOrEqualTo(Date value) {
            addCriterion("RENDTIME <=", value, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeIn(List<Date> values) {
            addCriterion("RENDTIME in", values, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeNotIn(List<Date> values) {
            addCriterion("RENDTIME not in", values, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeBetween(Date value1, Date value2) {
            addCriterion("RENDTIME between", value1, value2, "rendtime");
            return (Criteria) this;
        }

        public Criteria andRendtimeNotBetween(Date value1, Date value2) {
            addCriterion("RENDTIME not between", value1, value2, "rendtime");
            return (Criteria) this;
        }

        public Criteria andConfirmIsNull() {
            addCriterion("CONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andConfirmIsNotNull() {
            addCriterion("CONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmEqualTo(byte[] value) {
            addCriterion("CONFIRM =", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotEqualTo(byte[] value) {
            addCriterion("CONFIRM <>", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmGreaterThan(byte[] value) {
            addCriterion("CONFIRM >", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmGreaterThanOrEqualTo(byte[] value) {
            addCriterion("CONFIRM >=", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLessThan(byte[] value) {
            addCriterion("CONFIRM <", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLessThanOrEqualTo(byte[] value) {
            addCriterion("CONFIRM <=", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmIn(List<byte[]> values) {
            addCriterion("CONFIRM in", values, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotIn(List<byte[]> values) {
            addCriterion("CONFIRM not in", values, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmBetween(byte[] value1, byte[] value2) {
            addCriterion("CONFIRM between", value1, value2, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotBetween(byte[] value1, byte[] value2) {
            addCriterion("CONFIRM not between", value1, value2, "confirm");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNull() {
            addCriterion("CREATEMAN is null");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNotNull() {
            addCriterion("CREATEMAN is not null");
            return (Criteria) this;
        }

        public Criteria andCreatemanEqualTo(Integer value) {
            addCriterion("CREATEMAN =", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotEqualTo(Integer value) {
            addCriterion("CREATEMAN <>", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThan(Integer value) {
            addCriterion("CREATEMAN >", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATEMAN >=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThan(Integer value) {
            addCriterion("CREATEMAN <", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThanOrEqualTo(Integer value) {
            addCriterion("CREATEMAN <=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanIn(List<Integer> values) {
            addCriterion("CREATEMAN in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotIn(List<Integer> values) {
            addCriterion("CREATEMAN not in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanBetween(Integer value1, Integer value2) {
            addCriterion("CREATEMAN between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATEMAN not between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andWatchmanIsNull() {
            addCriterion("WATCHMAN is null");
            return (Criteria) this;
        }

        public Criteria andWatchmanIsNotNull() {
            addCriterion("WATCHMAN is not null");
            return (Criteria) this;
        }

        public Criteria andWatchmanEqualTo(Integer value) {
            addCriterion("WATCHMAN =", value, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanNotEqualTo(Integer value) {
            addCriterion("WATCHMAN <>", value, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanGreaterThan(Integer value) {
            addCriterion("WATCHMAN >", value, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATCHMAN >=", value, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanLessThan(Integer value) {
            addCriterion("WATCHMAN <", value, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanLessThanOrEqualTo(Integer value) {
            addCriterion("WATCHMAN <=", value, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanIn(List<Integer> values) {
            addCriterion("WATCHMAN in", values, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanNotIn(List<Integer> values) {
            addCriterion("WATCHMAN not in", values, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanBetween(Integer value1, Integer value2) {
            addCriterion("WATCHMAN between", value1, value2, "watchman");
            return (Criteria) this;
        }

        public Criteria andWatchmanNotBetween(Integer value1, Integer value2) {
            addCriterion("WATCHMAN not between", value1, value2, "watchman");
            return (Criteria) this;
        }

        public Criteria andAuditmanIsNull() {
            addCriterion("AUDITMAN is null");
            return (Criteria) this;
        }

        public Criteria andAuditmanIsNotNull() {
            addCriterion("AUDITMAN is not null");
            return (Criteria) this;
        }

        public Criteria andAuditmanEqualTo(Integer value) {
            addCriterion("AUDITMAN =", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotEqualTo(Integer value) {
            addCriterion("AUDITMAN <>", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanGreaterThan(Integer value) {
            addCriterion("AUDITMAN >", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDITMAN >=", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLessThan(Integer value) {
            addCriterion("AUDITMAN <", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLessThanOrEqualTo(Integer value) {
            addCriterion("AUDITMAN <=", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanIn(List<Integer> values) {
            addCriterion("AUDITMAN in", values, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotIn(List<Integer> values) {
            addCriterion("AUDITMAN not in", values, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanBetween(Integer value1, Integer value2) {
            addCriterion("AUDITMAN between", value1, value2, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDITMAN not between", value1, value2, "auditman");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNull() {
            addCriterion("RTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRtypeIsNotNull() {
            addCriterion("RTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRtypeEqualTo(String value) {
            addCriterion("RTYPE =", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotEqualTo(String value) {
            addCriterion("RTYPE <>", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThan(String value) {
            addCriterion("RTYPE >", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RTYPE >=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThan(String value) {
            addCriterion("RTYPE <", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLessThanOrEqualTo(String value) {
            addCriterion("RTYPE <=", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeLike(String value) {
            addCriterion("RTYPE like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotLike(String value) {
            addCriterion("RTYPE not like", value, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeIn(List<String> values) {
            addCriterion("RTYPE in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotIn(List<String> values) {
            addCriterion("RTYPE not in", values, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeBetween(String value1, String value2) {
            addCriterion("RTYPE between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRtypeNotBetween(String value1, String value2) {
            addCriterion("RTYPE not between", value1, value2, "rtype");
            return (Criteria) this;
        }

        public Criteria andRleveIsNull() {
            addCriterion("RLEVE is null");
            return (Criteria) this;
        }

        public Criteria andRleveIsNotNull() {
            addCriterion("RLEVE is not null");
            return (Criteria) this;
        }

        public Criteria andRleveEqualTo(String value) {
            addCriterion("RLEVE =", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveNotEqualTo(String value) {
            addCriterion("RLEVE <>", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveGreaterThan(String value) {
            addCriterion("RLEVE >", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveGreaterThanOrEqualTo(String value) {
            addCriterion("RLEVE >=", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveLessThan(String value) {
            addCriterion("RLEVE <", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveLessThanOrEqualTo(String value) {
            addCriterion("RLEVE <=", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveLike(String value) {
            addCriterion("RLEVE like", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveNotLike(String value) {
            addCriterion("RLEVE not like", value, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveIn(List<String> values) {
            addCriterion("RLEVE in", values, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveNotIn(List<String> values) {
            addCriterion("RLEVE not in", values, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveBetween(String value1, String value2) {
            addCriterion("RLEVE between", value1, value2, "rleve");
            return (Criteria) this;
        }

        public Criteria andRleveNotBetween(String value1, String value2) {
            addCriterion("RLEVE not between", value1, value2, "rleve");
            return (Criteria) this;
        }

        public Criteria andRcontextIsNull() {
            addCriterion("RCONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andRcontextIsNotNull() {
            addCriterion("RCONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andRcontextEqualTo(String value) {
            addCriterion("RCONTEXT =", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextNotEqualTo(String value) {
            addCriterion("RCONTEXT <>", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextGreaterThan(String value) {
            addCriterion("RCONTEXT >", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextGreaterThanOrEqualTo(String value) {
            addCriterion("RCONTEXT >=", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextLessThan(String value) {
            addCriterion("RCONTEXT <", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextLessThanOrEqualTo(String value) {
            addCriterion("RCONTEXT <=", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextLike(String value) {
            addCriterion("RCONTEXT like", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextNotLike(String value) {
            addCriterion("RCONTEXT not like", value, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextIn(List<String> values) {
            addCriterion("RCONTEXT in", values, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextNotIn(List<String> values) {
            addCriterion("RCONTEXT not in", values, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextBetween(String value1, String value2) {
            addCriterion("RCONTEXT between", value1, value2, "rcontext");
            return (Criteria) this;
        }

        public Criteria andRcontextNotBetween(String value1, String value2) {
            addCriterion("RCONTEXT not between", value1, value2, "rcontext");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("SCOPE =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("SCOPE <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("SCOPE >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("SCOPE >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("SCOPE <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("SCOPE <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("SCOPE like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("SCOPE not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("SCOPE in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("SCOPE not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("SCOPE between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("SCOPE not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmIsNull() {
            addCriterion("SGCCCONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmIsNotNull() {
            addCriterion("SGCCCONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmEqualTo(byte[] value) {
            addCriterion("SGCCCONFIRM =", value, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmNotEqualTo(byte[] value) {
            addCriterion("SGCCCONFIRM <>", value, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmGreaterThan(byte[] value) {
            addCriterion("SGCCCONFIRM >", value, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmGreaterThanOrEqualTo(byte[] value) {
            addCriterion("SGCCCONFIRM >=", value, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmLessThan(byte[] value) {
            addCriterion("SGCCCONFIRM <", value, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmLessThanOrEqualTo(byte[] value) {
            addCriterion("SGCCCONFIRM <=", value, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmIn(List<byte[]> values) {
            addCriterion("SGCCCONFIRM in", values, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmNotIn(List<byte[]> values) {
            addCriterion("SGCCCONFIRM not in", values, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmBetween(byte[] value1, byte[] value2) {
            addCriterion("SGCCCONFIRM between", value1, value2, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccconfirmNotBetween(byte[] value1, byte[] value2) {
            addCriterion("SGCCCONFIRM not between", value1, value2, "sgccconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmIsNull() {
            addCriterion("DPCONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andDpconfirmIsNotNull() {
            addCriterion("DPCONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andDpconfirmEqualTo(byte[] value) {
            addCriterion("DPCONFIRM =", value, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmNotEqualTo(byte[] value) {
            addCriterion("DPCONFIRM <>", value, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmGreaterThan(byte[] value) {
            addCriterion("DPCONFIRM >", value, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmGreaterThanOrEqualTo(byte[] value) {
            addCriterion("DPCONFIRM >=", value, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmLessThan(byte[] value) {
            addCriterion("DPCONFIRM <", value, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmLessThanOrEqualTo(byte[] value) {
            addCriterion("DPCONFIRM <=", value, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmIn(List<byte[]> values) {
            addCriterion("DPCONFIRM in", values, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmNotIn(List<byte[]> values) {
            addCriterion("DPCONFIRM not in", values, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmBetween(byte[] value1, byte[] value2) {
            addCriterion("DPCONFIRM between", value1, value2, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andDpconfirmNotBetween(byte[] value1, byte[] value2) {
            addCriterion("DPCONFIRM not between", value1, value2, "dpconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmIsNull() {
            addCriterion("SGCCSDCONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmIsNotNull() {
            addCriterion("SGCCSDCONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmEqualTo(byte[] value) {
            addCriterion("SGCCSDCONFIRM =", value, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmNotEqualTo(byte[] value) {
            addCriterion("SGCCSDCONFIRM <>", value, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmGreaterThan(byte[] value) {
            addCriterion("SGCCSDCONFIRM >", value, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmGreaterThanOrEqualTo(byte[] value) {
            addCriterion("SGCCSDCONFIRM >=", value, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmLessThan(byte[] value) {
            addCriterion("SGCCSDCONFIRM <", value, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmLessThanOrEqualTo(byte[] value) {
            addCriterion("SGCCSDCONFIRM <=", value, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmIn(List<byte[]> values) {
            addCriterion("SGCCSDCONFIRM in", values, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmNotIn(List<byte[]> values) {
            addCriterion("SGCCSDCONFIRM not in", values, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmBetween(byte[] value1, byte[] value2) {
            addCriterion("SGCCSDCONFIRM between", value1, value2, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andSgccsdconfirmNotBetween(byte[] value1, byte[] value2) {
            addCriterion("SGCCSDCONFIRM not between", value1, value2, "sgccsdconfirm");
            return (Criteria) this;
        }

        public Criteria andRwindowIsNull() {
            addCriterion("RWINDOW is null");
            return (Criteria) this;
        }

        public Criteria andRwindowIsNotNull() {
            addCriterion("RWINDOW is not null");
            return (Criteria) this;
        }

        public Criteria andRwindowEqualTo(byte[] value) {
            addCriterion("RWINDOW =", value, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowNotEqualTo(byte[] value) {
            addCriterion("RWINDOW <>", value, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowGreaterThan(byte[] value) {
            addCriterion("RWINDOW >", value, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowGreaterThanOrEqualTo(byte[] value) {
            addCriterion("RWINDOW >=", value, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowLessThan(byte[] value) {
            addCriterion("RWINDOW <", value, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowLessThanOrEqualTo(byte[] value) {
            addCriterion("RWINDOW <=", value, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowIn(List<byte[]> values) {
            addCriterion("RWINDOW in", values, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowNotIn(List<byte[]> values) {
            addCriterion("RWINDOW not in", values, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowBetween(byte[] value1, byte[] value2) {
            addCriterion("RWINDOW between", value1, value2, "rwindow");
            return (Criteria) this;
        }

        public Criteria andRwindowNotBetween(byte[] value1, byte[] value2) {
            addCriterion("RWINDOW not between", value1, value2, "rwindow");
            return (Criteria) this;
        }

        public Criteria andIsdownIsNull() {
            addCriterion("ISDOWN is null");
            return (Criteria) this;
        }

        public Criteria andIsdownIsNotNull() {
            addCriterion("ISDOWN is not null");
            return (Criteria) this;
        }

        public Criteria andIsdownEqualTo(byte[] value) {
            addCriterion("ISDOWN =", value, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownNotEqualTo(byte[] value) {
            addCriterion("ISDOWN <>", value, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownGreaterThan(byte[] value) {
            addCriterion("ISDOWN >", value, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownGreaterThanOrEqualTo(byte[] value) {
            addCriterion("ISDOWN >=", value, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownLessThan(byte[] value) {
            addCriterion("ISDOWN <", value, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownLessThanOrEqualTo(byte[] value) {
            addCriterion("ISDOWN <=", value, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownIn(List<byte[]> values) {
            addCriterion("ISDOWN in", values, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownNotIn(List<byte[]> values) {
            addCriterion("ISDOWN not in", values, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownBetween(byte[] value1, byte[] value2) {
            addCriterion("ISDOWN between", value1, value2, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsdownNotBetween(byte[] value1, byte[] value2) {
            addCriterion("ISDOWN not between", value1, value2, "isdown");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeIsNull() {
            addCriterion("ISRUNTYPECHANGE is null");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeIsNotNull() {
            addCriterion("ISRUNTYPECHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeEqualTo(byte[] value) {
            addCriterion("ISRUNTYPECHANGE =", value, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeNotEqualTo(byte[] value) {
            addCriterion("ISRUNTYPECHANGE <>", value, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeGreaterThan(byte[] value) {
            addCriterion("ISRUNTYPECHANGE >", value, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeGreaterThanOrEqualTo(byte[] value) {
            addCriterion("ISRUNTYPECHANGE >=", value, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeLessThan(byte[] value) {
            addCriterion("ISRUNTYPECHANGE <", value, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeLessThanOrEqualTo(byte[] value) {
            addCriterion("ISRUNTYPECHANGE <=", value, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeIn(List<byte[]> values) {
            addCriterion("ISRUNTYPECHANGE in", values, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeNotIn(List<byte[]> values) {
            addCriterion("ISRUNTYPECHANGE not in", values, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeBetween(byte[] value1, byte[] value2) {
            addCriterion("ISRUNTYPECHANGE between", value1, value2, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andIsruntypechangeNotBetween(byte[] value1, byte[] value2) {
            addCriterion("ISRUNTYPECHANGE not between", value1, value2, "isruntypechange");
            return (Criteria) this;
        }

        public Criteria andRiskIsNull() {
            addCriterion("RISK is null");
            return (Criteria) this;
        }

        public Criteria andRiskIsNotNull() {
            addCriterion("RISK is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEqualTo(String value) {
            addCriterion("RISK =", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotEqualTo(String value) {
            addCriterion("RISK <>", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThan(String value) {
            addCriterion("RISK >", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThanOrEqualTo(String value) {
            addCriterion("RISK >=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThan(String value) {
            addCriterion("RISK <", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThanOrEqualTo(String value) {
            addCriterion("RISK <=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLike(String value) {
            addCriterion("RISK like", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotLike(String value) {
            addCriterion("RISK not like", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskIn(List<String> values) {
            addCriterion("RISK in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotIn(List<String> values) {
            addCriterion("RISK not in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskBetween(String value1, String value2) {
            addCriterion("RISK between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotBetween(String value1, String value2) {
            addCriterion("RISK not between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andTimecodeIsNull() {
            addCriterion("TIMECODE is null");
            return (Criteria) this;
        }

        public Criteria andTimecodeIsNotNull() {
            addCriterion("TIMECODE is not null");
            return (Criteria) this;
        }

        public Criteria andTimecodeEqualTo(String value) {
            addCriterion("TIMECODE =", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeNotEqualTo(String value) {
            addCriterion("TIMECODE <>", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeGreaterThan(String value) {
            addCriterion("TIMECODE >", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeGreaterThanOrEqualTo(String value) {
            addCriterion("TIMECODE >=", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeLessThan(String value) {
            addCriterion("TIMECODE <", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeLessThanOrEqualTo(String value) {
            addCriterion("TIMECODE <=", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeLike(String value) {
            addCriterion("TIMECODE like", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeNotLike(String value) {
            addCriterion("TIMECODE not like", value, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeIn(List<String> values) {
            addCriterion("TIMECODE in", values, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeNotIn(List<String> values) {
            addCriterion("TIMECODE not in", values, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeBetween(String value1, String value2) {
            addCriterion("TIMECODE between", value1, value2, "timecode");
            return (Criteria) this;
        }

        public Criteria andTimecodeNotBetween(String value1, String value2) {
            addCriterion("TIMECODE not between", value1, value2, "timecode");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmIsNull() {
            addCriterion("SGCCCSCONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmIsNotNull() {
            addCriterion("SGCCCSCONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmEqualTo(byte[] value) {
            addCriterion("SGCCCSCONFIRM =", value, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmNotEqualTo(byte[] value) {
            addCriterion("SGCCCSCONFIRM <>", value, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmGreaterThan(byte[] value) {
            addCriterion("SGCCCSCONFIRM >", value, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmGreaterThanOrEqualTo(byte[] value) {
            addCriterion("SGCCCSCONFIRM >=", value, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmLessThan(byte[] value) {
            addCriterion("SGCCCSCONFIRM <", value, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmLessThanOrEqualTo(byte[] value) {
            addCriterion("SGCCCSCONFIRM <=", value, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmIn(List<byte[]> values) {
            addCriterion("SGCCCSCONFIRM in", values, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmNotIn(List<byte[]> values) {
            addCriterion("SGCCCSCONFIRM not in", values, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmBetween(byte[] value1, byte[] value2) {
            addCriterion("SGCCCSCONFIRM between", value1, value2, "sgcccsconfirm");
            return (Criteria) this;
        }

        public Criteria andSgcccsconfirmNotBetween(byte[] value1, byte[] value2) {
            addCriterion("SGCCCSCONFIRM not between", value1, value2, "sgcccsconfirm");
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