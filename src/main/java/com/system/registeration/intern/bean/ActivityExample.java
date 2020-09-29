package com.system.registeration.intern.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityStartIsNull() {
            addCriterion("activity_start is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartIsNotNull() {
            addCriterion("activity_start is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartEqualTo(Date value) {
            addCriterion("activity_start =", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotEqualTo(Date value) {
            addCriterion("activity_start <>", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartGreaterThan(Date value) {
            addCriterion("activity_start >", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_start >=", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartLessThan(Date value) {
            addCriterion("activity_start <", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartLessThanOrEqualTo(Date value) {
            addCriterion("activity_start <=", value, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartIn(List<Date> values) {
            addCriterion("activity_start in", values, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotIn(List<Date> values) {
            addCriterion("activity_start not in", values, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartBetween(Date value1, Date value2) {
            addCriterion("activity_start between", value1, value2, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityStartNotBetween(Date value1, Date value2) {
            addCriterion("activity_start not between", value1, value2, "activityStart");
            return (Criteria) this;
        }

        public Criteria andActivityEndIsNull() {
            addCriterion("activity_end is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndIsNotNull() {
            addCriterion("activity_end is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndEqualTo(Date value) {
            addCriterion("activity_end =", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotEqualTo(Date value) {
            addCriterion("activity_end <>", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndGreaterThan(Date value) {
            addCriterion("activity_end >", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndGreaterThanOrEqualTo(Date value) {
            addCriterion("activity_end >=", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndLessThan(Date value) {
            addCriterion("activity_end <", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndLessThanOrEqualTo(Date value) {
            addCriterion("activity_end <=", value, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndIn(List<Date> values) {
            addCriterion("activity_end in", values, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotIn(List<Date> values) {
            addCriterion("activity_end not in", values, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndBetween(Date value1, Date value2) {
            addCriterion("activity_end between", value1, value2, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andActivityEndNotBetween(Date value1, Date value2) {
            addCriterion("activity_end not between", value1, value2, "activityEnd");
            return (Criteria) this;
        }

        public Criteria andSigninMethodIsNull() {
            addCriterion("signin_method is null");
            return (Criteria) this;
        }

        public Criteria andSigninMethodIsNotNull() {
            addCriterion("signin_method is not null");
            return (Criteria) this;
        }

        public Criteria andSigninMethodEqualTo(String value) {
            addCriterion("signin_method =", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodNotEqualTo(String value) {
            addCriterion("signin_method <>", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodGreaterThan(String value) {
            addCriterion("signin_method >", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodGreaterThanOrEqualTo(String value) {
            addCriterion("signin_method >=", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodLessThan(String value) {
            addCriterion("signin_method <", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodLessThanOrEqualTo(String value) {
            addCriterion("signin_method <=", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodLike(String value) {
            addCriterion("signin_method like", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodNotLike(String value) {
            addCriterion("signin_method not like", value, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodIn(List<String> values) {
            addCriterion("signin_method in", values, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodNotIn(List<String> values) {
            addCriterion("signin_method not in", values, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodBetween(String value1, String value2) {
            addCriterion("signin_method between", value1, value2, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andSigninMethodNotBetween(String value1, String value2) {
            addCriterion("signin_method not between", value1, value2, "signinMethod");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesIsNull() {
            addCriterion("content_of_activities is null");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesIsNotNull() {
            addCriterion("content_of_activities is not null");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesEqualTo(String value) {
            addCriterion("content_of_activities =", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesNotEqualTo(String value) {
            addCriterion("content_of_activities <>", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesGreaterThan(String value) {
            addCriterion("content_of_activities >", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesGreaterThanOrEqualTo(String value) {
            addCriterion("content_of_activities >=", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesLessThan(String value) {
            addCriterion("content_of_activities <", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesLessThanOrEqualTo(String value) {
            addCriterion("content_of_activities <=", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesLike(String value) {
            addCriterion("content_of_activities like", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesNotLike(String value) {
            addCriterion("content_of_activities not like", value, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesIn(List<String> values) {
            addCriterion("content_of_activities in", values, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesNotIn(List<String> values) {
            addCriterion("content_of_activities not in", values, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesBetween(String value1, String value2) {
            addCriterion("content_of_activities between", value1, value2, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andContentOfActivitiesNotBetween(String value1, String value2) {
            addCriterion("content_of_activities not between", value1, value2, "contentOfActivities");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNull() {
            addCriterion("max_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNotNull() {
            addCriterion("max_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumEqualTo(Integer value) {
            addCriterion("max_num =", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotEqualTo(Integer value) {
            addCriterion("max_num <>", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThan(Integer value) {
            addCriterion("max_num >", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_num >=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThan(Integer value) {
            addCriterion("max_num <", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("max_num <=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIn(List<Integer> values) {
            addCriterion("max_num in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotIn(List<Integer> values) {
            addCriterion("max_num not in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("max_num between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("max_num not between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameIsNull() {
            addCriterion("created_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameIsNotNull() {
            addCriterion("created_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameEqualTo(String value) {
            addCriterion("created_user_name =", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotEqualTo(String value) {
            addCriterion("created_user_name <>", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameGreaterThan(String value) {
            addCriterion("created_user_name >", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("created_user_name >=", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameLessThan(String value) {
            addCriterion("created_user_name <", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameLessThanOrEqualTo(String value) {
            addCriterion("created_user_name <=", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameLike(String value) {
            addCriterion("created_user_name like", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotLike(String value) {
            addCriterion("created_user_name not like", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameIn(List<String> values) {
            addCriterion("created_user_name in", values, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotIn(List<String> values) {
            addCriterion("created_user_name not in", values, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameBetween(String value1, String value2) {
            addCriterion("created_user_name between", value1, value2, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotBetween(String value1, String value2) {
            addCriterion("created_user_name not between", value1, value2, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andSignUpStartIsNull() {
            addCriterion("sign_up_start is null");
            return (Criteria) this;
        }

        public Criteria andSignUpStartIsNotNull() {
            addCriterion("sign_up_start is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpStartEqualTo(Date value) {
            addCriterion("sign_up_start =", value, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartNotEqualTo(Date value) {
            addCriterion("sign_up_start <>", value, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartGreaterThan(Date value) {
            addCriterion("sign_up_start >", value, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_up_start >=", value, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartLessThan(Date value) {
            addCriterion("sign_up_start <", value, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartLessThanOrEqualTo(Date value) {
            addCriterion("sign_up_start <=", value, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartIn(List<Date> values) {
            addCriterion("sign_up_start in", values, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartNotIn(List<Date> values) {
            addCriterion("sign_up_start not in", values, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartBetween(Date value1, Date value2) {
            addCriterion("sign_up_start between", value1, value2, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpStartNotBetween(Date value1, Date value2) {
            addCriterion("sign_up_start not between", value1, value2, "signUpStart");
            return (Criteria) this;
        }

        public Criteria andSignUpEndIsNull() {
            addCriterion("sign_up_end is null");
            return (Criteria) this;
        }

        public Criteria andSignUpEndIsNotNull() {
            addCriterion("sign_up_end is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpEndEqualTo(Date value) {
            addCriterion("sign_up_end =", value, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndNotEqualTo(Date value) {
            addCriterion("sign_up_end <>", value, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndGreaterThan(Date value) {
            addCriterion("sign_up_end >", value, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_up_end >=", value, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndLessThan(Date value) {
            addCriterion("sign_up_end <", value, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndLessThanOrEqualTo(Date value) {
            addCriterion("sign_up_end <=", value, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndIn(List<Date> values) {
            addCriterion("sign_up_end in", values, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndNotIn(List<Date> values) {
            addCriterion("sign_up_end not in", values, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndBetween(Date value1, Date value2) {
            addCriterion("sign_up_end between", value1, value2, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignUpEndNotBetween(Date value1, Date value2) {
            addCriterion("sign_up_end not between", value1, value2, "signUpEnd");
            return (Criteria) this;
        }

        public Criteria andSignInStartIsNull() {
            addCriterion("sign_in_start is null");
            return (Criteria) this;
        }

        public Criteria andSignInStartIsNotNull() {
            addCriterion("sign_in_start is not null");
            return (Criteria) this;
        }

        public Criteria andSignInStartEqualTo(Date value) {
            addCriterion("sign_in_start =", value, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartNotEqualTo(Date value) {
            addCriterion("sign_in_start <>", value, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartGreaterThan(Date value) {
            addCriterion("sign_in_start >", value, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_in_start >=", value, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartLessThan(Date value) {
            addCriterion("sign_in_start <", value, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartLessThanOrEqualTo(Date value) {
            addCriterion("sign_in_start <=", value, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartIn(List<Date> values) {
            addCriterion("sign_in_start in", values, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartNotIn(List<Date> values) {
            addCriterion("sign_in_start not in", values, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartBetween(Date value1, Date value2) {
            addCriterion("sign_in_start between", value1, value2, "signInStart");
            return (Criteria) this;
        }

        public Criteria andSignInStartNotBetween(Date value1, Date value2) {
            addCriterion("sign_in_start not between", value1, value2, "signInStart");
            return (Criteria) this;
        }

        public Criteria andCategroyIsNull() {
            addCriterion("categroy is null");
            return (Criteria) this;
        }

        public Criteria andCategroyIsNotNull() {
            addCriterion("categroy is not null");
            return (Criteria) this;
        }

        public Criteria andCategroyEqualTo(String value) {
            addCriterion("categroy =", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotEqualTo(String value) {
            addCriterion("categroy <>", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyGreaterThan(String value) {
            addCriterion("categroy >", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyGreaterThanOrEqualTo(String value) {
            addCriterion("categroy >=", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyLessThan(String value) {
            addCriterion("categroy <", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyLessThanOrEqualTo(String value) {
            addCriterion("categroy <=", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyLike(String value) {
            addCriterion("categroy like", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotLike(String value) {
            addCriterion("categroy not like", value, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyIn(List<String> values) {
            addCriterion("categroy in", values, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotIn(List<String> values) {
            addCriterion("categroy not in", values, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyBetween(String value1, String value2) {
            addCriterion("categroy between", value1, value2, "categroy");
            return (Criteria) this;
        }

        public Criteria andCategroyNotBetween(String value1, String value2) {
            addCriterion("categroy not between", value1, value2, "categroy");
            return (Criteria) this;
        }

        public Criteria andSignUpNumIsNull() {
            addCriterion("sign_up_num is null");
            return (Criteria) this;
        }

        public Criteria andSignUpNumIsNotNull() {
            addCriterion("sign_up_num is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpNumEqualTo(Integer value) {
            addCriterion("sign_up_num =", value, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumNotEqualTo(Integer value) {
            addCriterion("sign_up_num <>", value, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumGreaterThan(Integer value) {
            addCriterion("sign_up_num >", value, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_up_num >=", value, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumLessThan(Integer value) {
            addCriterion("sign_up_num <", value, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumLessThanOrEqualTo(Integer value) {
            addCriterion("sign_up_num <=", value, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumIn(List<Integer> values) {
            addCriterion("sign_up_num in", values, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumNotIn(List<Integer> values) {
            addCriterion("sign_up_num not in", values, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumBetween(Integer value1, Integer value2) {
            addCriterion("sign_up_num between", value1, value2, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andSignUpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_up_num not between", value1, value2, "signUpNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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