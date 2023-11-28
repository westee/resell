package com.westee.sales.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public ConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("SHOP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("SHOP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("SHOP_ADDRESS =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("SHOP_ADDRESS >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("SHOP_ADDRESS <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("SHOP_ADDRESS <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("SHOP_ADDRESS like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("SHOP_ADDRESS not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("SHOP_ADDRESS in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("SHOP_ADDRESS not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("SHOP_ADDRESS not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIsNull() {
            addCriterion("BUSINESS_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIsNotNull() {
            addCriterion("BUSINESS_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_START_TIME =", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_START_TIME <>", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("BUSINESS_START_TIME >", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_START_TIME >=", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("BUSINESS_START_TIME <", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_START_TIME <=", value, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("BUSINESS_START_TIME in", values, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("BUSINESS_START_TIME not in", values, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("BUSINESS_START_TIME between", value1, value2, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("BUSINESS_START_TIME not between", value1, value2, "businessStartTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIsNull() {
            addCriterion("BUSINESS_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIsNotNull() {
            addCriterion("BUSINESS_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_END_TIME =", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_END_TIME <>", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("BUSINESS_END_TIME >", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_END_TIME >=", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("BUSINESS_END_TIME <", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("BUSINESS_END_TIME <=", value, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("BUSINESS_END_TIME in", values, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("BUSINESS_END_TIME not in", values, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("BUSINESS_END_TIME between", value1, value2, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andBusinessEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("BUSINESS_END_TIME not between", value1, value2, "businessEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountIsNull() {
            addCriterion("FREE_EXPRESS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountIsNotNull() {
            addCriterion("FREE_EXPRESS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountEqualTo(BigDecimal value) {
            addCriterion("FREE_EXPRESS_AMOUNT =", value, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountNotEqualTo(BigDecimal value) {
            addCriterion("FREE_EXPRESS_AMOUNT <>", value, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountGreaterThan(BigDecimal value) {
            addCriterion("FREE_EXPRESS_AMOUNT >", value, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FREE_EXPRESS_AMOUNT >=", value, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountLessThan(BigDecimal value) {
            addCriterion("FREE_EXPRESS_AMOUNT <", value, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FREE_EXPRESS_AMOUNT <=", value, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountIn(List<BigDecimal> values) {
            addCriterion("FREE_EXPRESS_AMOUNT in", values, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountNotIn(List<BigDecimal> values) {
            addCriterion("FREE_EXPRESS_AMOUNT not in", values, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREE_EXPRESS_AMOUNT between", value1, value2, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andFreeExpressAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREE_EXPRESS_AMOUNT not between", value1, value2, "freeExpressAmount");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartIsNull() {
            addCriterion("STORE_CLOSE_START is null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartIsNotNull() {
            addCriterion("STORE_CLOSE_START is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_START =", value, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_START <>", value, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartGreaterThan(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_START >", value, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_START >=", value, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartLessThan(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_START <", value, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_START <=", value, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartIn(List<Date> values) {
            addCriterionForJDBCDate("STORE_CLOSE_START in", values, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("STORE_CLOSE_START not in", values, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STORE_CLOSE_START between", value1, value2, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STORE_CLOSE_START not between", value1, value2, "storeCloseStart");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndIsNull() {
            addCriterion("STORE_CLOSE_END is null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndIsNotNull() {
            addCriterion("STORE_CLOSE_END is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_END =", value, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_END <>", value, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndGreaterThan(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_END >", value, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_END >=", value, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndLessThan(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_END <", value, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STORE_CLOSE_END <=", value, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndIn(List<Date> values) {
            addCriterionForJDBCDate("STORE_CLOSE_END in", values, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("STORE_CLOSE_END not in", values, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STORE_CLOSE_END between", value1, value2, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andStoreCloseEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STORE_CLOSE_END not between", value1, value2, "storeCloseEnd");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("CREATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("CREATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("CREATED_AT =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("CREATED_AT <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("CREATED_AT >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("CREATED_AT <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_AT <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("CREATED_AT in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("CREATED_AT not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_AT not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("UPDATED_AT is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("UPDATED_AT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("UPDATED_AT =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("UPDATED_AT <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("UPDATED_AT >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("UPDATED_AT <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_AT <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("UPDATED_AT in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("UPDATED_AT not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_AT not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CONFIG
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 09 16:47:26 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
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