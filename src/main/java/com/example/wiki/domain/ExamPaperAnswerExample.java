package com.example.wiki.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamPaperAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamPaperAnswerExample() {
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

        public Criteria andExamPaperIdIsNull() {
            addCriterion("exam_paper_id is null");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdIsNotNull() {
            addCriterion("exam_paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdEqualTo(Integer value) {
            addCriterion("exam_paper_id =", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdNotEqualTo(Integer value) {
            addCriterion("exam_paper_id <>", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdGreaterThan(Integer value) {
            addCriterion("exam_paper_id >", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_paper_id >=", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdLessThan(Integer value) {
            addCriterion("exam_paper_id <", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_paper_id <=", value, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdIn(List<Integer> values) {
            addCriterion("exam_paper_id in", values, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdNotIn(List<Integer> values) {
            addCriterion("exam_paper_id not in", values, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_paper_id between", value1, value2, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_paper_id not between", value1, value2, "examPaperId");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNull() {
            addCriterion("paper_type is null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIsNotNull() {
            addCriterion("paper_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaperTypeEqualTo(Integer value) {
            addCriterion("paper_type =", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotEqualTo(Integer value) {
            addCriterion("paper_type <>", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThan(Integer value) {
            addCriterion("paper_type >", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_type >=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThan(Integer value) {
            addCriterion("paper_type <", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeLessThanOrEqualTo(Integer value) {
            addCriterion("paper_type <=", value, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeIn(List<Integer> values) {
            addCriterion("paper_type in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotIn(List<Integer> values) {
            addCriterion("paper_type not in", values, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeBetween(Integer value1, Integer value2) {
            addCriterion("paper_type between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andPaperTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_type not between", value1, value2, "paperType");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSystemScoreIsNull() {
            addCriterion("system_score is null");
            return (Criteria) this;
        }

        public Criteria andSystemScoreIsNotNull() {
            addCriterion("system_score is not null");
            return (Criteria) this;
        }

        public Criteria andSystemScoreEqualTo(Integer value) {
            addCriterion("system_score =", value, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreNotEqualTo(Integer value) {
            addCriterion("system_score <>", value, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreGreaterThan(Integer value) {
            addCriterion("system_score >", value, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_score >=", value, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreLessThan(Integer value) {
            addCriterion("system_score <", value, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreLessThanOrEqualTo(Integer value) {
            addCriterion("system_score <=", value, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreIn(List<Integer> values) {
            addCriterion("system_score in", values, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreNotIn(List<Integer> values) {
            addCriterion("system_score not in", values, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreBetween(Integer value1, Integer value2) {
            addCriterion("system_score between", value1, value2, "systemScore");
            return (Criteria) this;
        }

        public Criteria andSystemScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("system_score not between", value1, value2, "systemScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNull() {
            addCriterion("user_score is null");
            return (Criteria) this;
        }

        public Criteria andUserScoreIsNotNull() {
            addCriterion("user_score is not null");
            return (Criteria) this;
        }

        public Criteria andUserScoreEqualTo(Integer value) {
            addCriterion("user_score =", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotEqualTo(Integer value) {
            addCriterion("user_score <>", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThan(Integer value) {
            addCriterion("user_score >", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_score >=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThan(Integer value) {
            addCriterion("user_score <", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreLessThanOrEqualTo(Integer value) {
            addCriterion("user_score <=", value, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreIn(List<Integer> values) {
            addCriterion("user_score in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotIn(List<Integer> values) {
            addCriterion("user_score not in", values, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreBetween(Integer value1, Integer value2) {
            addCriterion("user_score between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andUserScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("user_score not between", value1, value2, "userScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIsNull() {
            addCriterion("paper_score is null");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIsNotNull() {
            addCriterion("paper_score is not null");
            return (Criteria) this;
        }

        public Criteria andPaperScoreEqualTo(Integer value) {
            addCriterion("paper_score =", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotEqualTo(Integer value) {
            addCriterion("paper_score <>", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreGreaterThan(Integer value) {
            addCriterion("paper_score >", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_score >=", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLessThan(Integer value) {
            addCriterion("paper_score <", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLessThanOrEqualTo(Integer value) {
            addCriterion("paper_score <=", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIn(List<Integer> values) {
            addCriterion("paper_score in", values, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotIn(List<Integer> values) {
            addCriterion("paper_score not in", values, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreBetween(Integer value1, Integer value2) {
            addCriterion("paper_score between", value1, value2, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_score not between", value1, value2, "paperScore");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectIsNull() {
            addCriterion("question_correct is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectIsNotNull() {
            addCriterion("question_correct is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectEqualTo(Integer value) {
            addCriterion("question_correct =", value, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectNotEqualTo(Integer value) {
            addCriterion("question_correct <>", value, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectGreaterThan(Integer value) {
            addCriterion("question_correct >", value, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_correct >=", value, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectLessThan(Integer value) {
            addCriterion("question_correct <", value, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectLessThanOrEqualTo(Integer value) {
            addCriterion("question_correct <=", value, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectIn(List<Integer> values) {
            addCriterion("question_correct in", values, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectNotIn(List<Integer> values) {
            addCriterion("question_correct not in", values, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectBetween(Integer value1, Integer value2) {
            addCriterion("question_correct between", value1, value2, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCorrectNotBetween(Integer value1, Integer value2) {
            addCriterion("question_correct not between", value1, value2, "questionCorrect");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIsNull() {
            addCriterion("question_count is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIsNotNull() {
            addCriterion("question_count is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountEqualTo(Integer value) {
            addCriterion("question_count =", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotEqualTo(Integer value) {
            addCriterion("question_count <>", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThan(Integer value) {
            addCriterion("question_count >", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_count >=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThan(Integer value) {
            addCriterion("question_count <", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThanOrEqualTo(Integer value) {
            addCriterion("question_count <=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIn(List<Integer> values) {
            addCriterion("question_count in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotIn(List<Integer> values) {
            addCriterion("question_count not in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountBetween(Integer value1, Integer value2) {
            addCriterion("question_count between", value1, value2, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("question_count not between", value1, value2, "questionCount");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNull() {
            addCriterion("do_time is null");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNotNull() {
            addCriterion("do_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoTimeEqualTo(Integer value) {
            addCriterion("do_time =", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotEqualTo(Integer value) {
            addCriterion("do_time <>", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThan(Integer value) {
            addCriterion("do_time >", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("do_time >=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThan(Integer value) {
            addCriterion("do_time <", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThanOrEqualTo(Integer value) {
            addCriterion("do_time <=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeIn(List<Integer> values) {
            addCriterion("do_time in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotIn(List<Integer> values) {
            addCriterion("do_time not in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeBetween(Integer value1, Integer value2) {
            addCriterion("do_time between", value1, value2, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("do_time not between", value1, value2, "doTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdIsNull() {
            addCriterion("task_exam_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdIsNotNull() {
            addCriterion("task_exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdEqualTo(Integer value) {
            addCriterion("task_exam_id =", value, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdNotEqualTo(Integer value) {
            addCriterion("task_exam_id <>", value, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdGreaterThan(Integer value) {
            addCriterion("task_exam_id >", value, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_exam_id >=", value, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdLessThan(Integer value) {
            addCriterion("task_exam_id <", value, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_exam_id <=", value, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdIn(List<Integer> values) {
            addCriterion("task_exam_id in", values, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdNotIn(List<Integer> values) {
            addCriterion("task_exam_id not in", values, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdBetween(Integer value1, Integer value2) {
            addCriterion("task_exam_id between", value1, value2, "taskExamId");
            return (Criteria) this;
        }

        public Criteria andTaskExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_exam_id not between", value1, value2, "taskExamId");
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