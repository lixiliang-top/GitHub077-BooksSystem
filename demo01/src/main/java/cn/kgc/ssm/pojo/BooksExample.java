package cn.kgc.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BooksExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookcodeIsNull() {
            addCriterion("bookcode is null");
            return (Criteria) this;
        }

        public Criteria andBookcodeIsNotNull() {
            addCriterion("bookcode is not null");
            return (Criteria) this;
        }

        public Criteria andBookcodeEqualTo(String value) {
            addCriterion("bookcode =", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotEqualTo(String value) {
            addCriterion("bookcode <>", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeGreaterThan(String value) {
            addCriterion("bookcode >", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bookcode >=", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeLessThan(String value) {
            addCriterion("bookcode <", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeLessThanOrEqualTo(String value) {
            addCriterion("bookcode <=", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeLike(String value) {
            addCriterion("bookcode like", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotLike(String value) {
            addCriterion("bookcode not like", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeIn(List<String> values) {
            addCriterion("bookcode in", values, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotIn(List<String> values) {
            addCriterion("bookcode not in", values, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeBetween(String value1, String value2) {
            addCriterion("bookcode between", value1, value2, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotBetween(String value1, String value2) {
            addCriterion("bookcode not between", value1, value2, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooktypeIsNull() {
            addCriterion("booktype is null");
            return (Criteria) this;
        }

        public Criteria andBooktypeIsNotNull() {
            addCriterion("booktype is not null");
            return (Criteria) this;
        }

        public Criteria andBooktypeEqualTo(Integer value) {
            addCriterion("booktype =", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotEqualTo(Integer value) {
            addCriterion("booktype <>", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeGreaterThan(Integer value) {
            addCriterion("booktype >", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("booktype >=", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLessThan(Integer value) {
            addCriterion("booktype <", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLessThanOrEqualTo(Integer value) {
            addCriterion("booktype <=", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeIn(List<Integer> values) {
            addCriterion("booktype in", values, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotIn(List<Integer> values) {
            addCriterion("booktype not in", values, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeBetween(Integer value1, Integer value2) {
            addCriterion("booktype between", value1, value2, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("booktype not between", value1, value2, "booktype");
            return (Criteria) this;
        }

        public Criteria andBookatuthorIsNull() {
            addCriterion("bookatuthor is null");
            return (Criteria) this;
        }

        public Criteria andBookatuthorIsNotNull() {
            addCriterion("bookatuthor is not null");
            return (Criteria) this;
        }

        public Criteria andBookatuthorEqualTo(String value) {
            addCriterion("bookatuthor =", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorNotEqualTo(String value) {
            addCriterion("bookatuthor <>", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorGreaterThan(String value) {
            addCriterion("bookatuthor >", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorGreaterThanOrEqualTo(String value) {
            addCriterion("bookatuthor >=", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorLessThan(String value) {
            addCriterion("bookatuthor <", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorLessThanOrEqualTo(String value) {
            addCriterion("bookatuthor <=", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorLike(String value) {
            addCriterion("bookatuthor like", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorNotLike(String value) {
            addCriterion("bookatuthor not like", value, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorIn(List<String> values) {
            addCriterion("bookatuthor in", values, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorNotIn(List<String> values) {
            addCriterion("bookatuthor not in", values, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorBetween(String value1, String value2) {
            addCriterion("bookatuthor between", value1, value2, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andBookatuthorNotBetween(String value1, String value2) {
            addCriterion("bookatuthor not between", value1, value2, "bookatuthor");
            return (Criteria) this;
        }

        public Criteria andPublishpressIsNull() {
            addCriterion("publishpress is null");
            return (Criteria) this;
        }

        public Criteria andPublishpressIsNotNull() {
            addCriterion("publishpress is not null");
            return (Criteria) this;
        }

        public Criteria andPublishpressEqualTo(String value) {
            addCriterion("publishpress =", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotEqualTo(String value) {
            addCriterion("publishpress <>", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressGreaterThan(String value) {
            addCriterion("publishpress >", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressGreaterThanOrEqualTo(String value) {
            addCriterion("publishpress >=", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressLessThan(String value) {
            addCriterion("publishpress <", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressLessThanOrEqualTo(String value) {
            addCriterion("publishpress <=", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressLike(String value) {
            addCriterion("publishpress like", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotLike(String value) {
            addCriterion("publishpress not like", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressIn(List<String> values) {
            addCriterion("publishpress in", values, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotIn(List<String> values) {
            addCriterion("publishpress not in", values, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressBetween(String value1, String value2) {
            addCriterion("publishpress between", value1, value2, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotBetween(String value1, String value2) {
            addCriterion("publishpress not between", value1, value2, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("publishdate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("publishdate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(Date value) {
            addCriterion("publishdate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(Date value) {
            addCriterion("publishdate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(Date value) {
            addCriterion("publishdate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("publishdate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(Date value) {
            addCriterion("publishdate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(Date value) {
            addCriterion("publishdate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<Date> values) {
            addCriterion("publishdate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<Date> values) {
            addCriterion("publishdate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(Date value1, Date value2) {
            addCriterion("publishdate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(Date value1, Date value2) {
            addCriterion("publishdate not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andIsborrowIsNull() {
            addCriterion("isborrow is null");
            return (Criteria) this;
        }

        public Criteria andIsborrowIsNotNull() {
            addCriterion("isborrow is not null");
            return (Criteria) this;
        }

        public Criteria andIsborrowEqualTo(Integer value) {
            addCriterion("isborrow =", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotEqualTo(Integer value) {
            addCriterion("isborrow <>", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowGreaterThan(Integer value) {
            addCriterion("isborrow >", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isborrow >=", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowLessThan(Integer value) {
            addCriterion("isborrow <", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowLessThanOrEqualTo(Integer value) {
            addCriterion("isborrow <=", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowIn(List<Integer> values) {
            addCriterion("isborrow in", values, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotIn(List<Integer> values) {
            addCriterion("isborrow not in", values, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowBetween(Integer value1, Integer value2) {
            addCriterion("isborrow between", value1, value2, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotBetween(Integer value1, Integer value2) {
            addCriterion("isborrow not between", value1, value2, "isborrow");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("createdby is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("createdby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("createdby =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("createdby <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("createdby >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("createdby >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("createdby <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("createdby <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("createdby like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("createdby not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("createdby in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("createdby not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("createdby between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("createdby not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastupdatetime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastupdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterion("lastupdatetime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterion("lastupdatetime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterion("lastupdatetime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastupdatetime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterion("lastupdatetime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastupdatetime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterion("lastupdatetime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterion("lastupdatetime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastupdatetime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastupdatetime not between", value1, value2, "lastupdatetime");
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