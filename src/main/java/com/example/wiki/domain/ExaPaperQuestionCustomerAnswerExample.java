package com.example.wiki.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExaPaperQuestionCustomerAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaPaperQuestionCustomerAnswerExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
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

        public Criteria andExamPaperAnswerIdIsNull() {
            addCriterion("exam_paper_answer_id is null");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdIsNotNull() {
            addCriterion("exam_paper_answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdEqualTo(Integer value) {
            addCriterion("exam_paper_answer_id =", value, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdNotEqualTo(Integer value) {
            addCriterion("exam_paper_answer_id <>", value, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdGreaterThan(Integer value) {
            addCriterion("exam_paper_answer_id >", value, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_paper_answer_id >=", value, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdLessThan(Integer value) {
            addCriterion("exam_paper_answer_id <", value, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_paper_answer_id <=", value, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdIn(List<Integer> values) {
            addCriterion("exam_paper_answer_id in", values, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdNotIn(List<Integer> values) {
            addCriterion("exam_paper_answer_id not in", values, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_paper_answer_id between", value1, value2, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andExamPaperAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_paper_answer_id not between", value1, value2, "examPaperAnswerId");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(Integer value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(Integer value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(Integer value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(Integer value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<Integer> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<Integer> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(Integer value1, Integer value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
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

        public Criteria andCustomerScoreIsNull() {
            addCriterion("customer_score is null");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreIsNotNull() {
            addCriterion("customer_score is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreEqualTo(Integer value) {
            addCriterion("customer_score =", value, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreNotEqualTo(Integer value) {
            addCriterion("customer_score <>", value, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreGreaterThan(Integer value) {
            addCriterion("customer_score >", value, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_score >=", value, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreLessThan(Integer value) {
            addCriterion("customer_score <", value, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreLessThanOrEqualTo(Integer value) {
            addCriterion("customer_score <=", value, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreIn(List<Integer> values) {
            addCriterion("customer_score in", values, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreNotIn(List<Integer> values) {
            addCriterion("customer_score not in", values, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreBetween(Integer value1, Integer value2) {
            addCriterion("customer_score between", value1, value2, "customerScore");
            return (Criteria) this;
        }

        public Criteria andCustomerScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_score not between", value1, value2, "customerScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNull() {
            addCriterion("question_score is null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIsNotNull() {
            addCriterion("question_score is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreEqualTo(Integer value) {
            addCriterion("question_score =", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotEqualTo(Integer value) {
            addCriterion("question_score <>", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThan(Integer value) {
            addCriterion("question_score >", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_score >=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThan(Integer value) {
            addCriterion("question_score <", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("question_score <=", value, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreIn(List<Integer> values) {
            addCriterion("question_score in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotIn(List<Integer> values) {
            addCriterion("question_score not in", values, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreBetween(Integer value1, Integer value2) {
            addCriterion("question_score between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("question_score not between", value1, value2, "questionScore");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdIsNull() {
            addCriterion("question_text_content_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdIsNotNull() {
            addCriterion("question_text_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdEqualTo(Integer value) {
            addCriterion("question_text_content_id =", value, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdNotEqualTo(Integer value) {
            addCriterion("question_text_content_id <>", value, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdGreaterThan(Integer value) {
            addCriterion("question_text_content_id >", value, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_text_content_id >=", value, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdLessThan(Integer value) {
            addCriterion("question_text_content_id <", value, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_text_content_id <=", value, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdIn(List<Integer> values) {
            addCriterion("question_text_content_id in", values, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdNotIn(List<Integer> values) {
            addCriterion("question_text_content_id not in", values, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdBetween(Integer value1, Integer value2) {
            addCriterion("question_text_content_id between", value1, value2, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andQuestionTextContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_text_content_id not between", value1, value2, "questionTextContentId");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andTextContentIdIsNull() {
            addCriterion("text_content_id is null");
            return (Criteria) this;
        }

        public Criteria andTextContentIdIsNotNull() {
            addCriterion("text_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextContentIdEqualTo(Integer value) {
            addCriterion("text_content_id =", value, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdNotEqualTo(Integer value) {
            addCriterion("text_content_id <>", value, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdGreaterThan(Integer value) {
            addCriterion("text_content_id >", value, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_content_id >=", value, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdLessThan(Integer value) {
            addCriterion("text_content_id <", value, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdLessThanOrEqualTo(Integer value) {
            addCriterion("text_content_id <=", value, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdIn(List<Integer> values) {
            addCriterion("text_content_id in", values, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdNotIn(List<Integer> values) {
            addCriterion("text_content_id not in", values, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdBetween(Integer value1, Integer value2) {
            addCriterion("text_content_id between", value1, value2, "textContentId");
            return (Criteria) this;
        }

        public Criteria andTextContentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("text_content_id not between", value1, value2, "textContentId");
            return (Criteria) this;
        }

        public Criteria andDoRightIsNull() {
            addCriterion("do_right is null");
            return (Criteria) this;
        }

        public Criteria andDoRightIsNotNull() {
            addCriterion("do_right is not null");
            return (Criteria) this;
        }

        public Criteria andDoRightEqualTo(Boolean value) {
            addCriterion("do_right =", value, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightNotEqualTo(Boolean value) {
            addCriterion("do_right <>", value, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightGreaterThan(Boolean value) {
            addCriterion("do_right >", value, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightGreaterThanOrEqualTo(Boolean value) {
            addCriterion("do_right >=", value, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightLessThan(Boolean value) {
            addCriterion("do_right <", value, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightLessThanOrEqualTo(Boolean value) {
            addCriterion("do_right <=", value, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightIn(List<Boolean> values) {
            addCriterion("do_right in", values, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightNotIn(List<Boolean> values) {
            addCriterion("do_right not in", values, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightBetween(Boolean value1, Boolean value2) {
            addCriterion("do_right between", value1, value2, "doRight");
            return (Criteria) this;
        }

        public Criteria andDoRightNotBetween(Boolean value1, Boolean value2) {
            addCriterion("do_right not between", value1, value2, "doRight");
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

        public Criteria andItemOrderIsNull() {
            addCriterion("item_order is null");
            return (Criteria) this;
        }

        public Criteria andItemOrderIsNotNull() {
            addCriterion("item_order is not null");
            return (Criteria) this;
        }

        public Criteria andItemOrderEqualTo(Integer value) {
            addCriterion("item_order =", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotEqualTo(Integer value) {
            addCriterion("item_order <>", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderGreaterThan(Integer value) {
            addCriterion("item_order >", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_order >=", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderLessThan(Integer value) {
            addCriterion("item_order <", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderLessThanOrEqualTo(Integer value) {
            addCriterion("item_order <=", value, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderIn(List<Integer> values) {
            addCriterion("item_order in", values, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotIn(List<Integer> values) {
            addCriterion("item_order not in", values, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderBetween(Integer value1, Integer value2) {
            addCriterion("item_order between", value1, value2, "itemOrder");
            return (Criteria) this;
        }

        public Criteria andItemOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("item_order not between", value1, value2, "itemOrder");
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