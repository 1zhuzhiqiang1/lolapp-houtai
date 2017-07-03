package com.iqiang.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbVideoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImgUriIsNull() {
            addCriterion("img_uri is null");
            return (Criteria) this;
        }

        public Criteria andImgUriIsNotNull() {
            addCriterion("img_uri is not null");
            return (Criteria) this;
        }

        public Criteria andImgUriEqualTo(String value) {
            addCriterion("img_uri =", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriNotEqualTo(String value) {
            addCriterion("img_uri <>", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriGreaterThan(String value) {
            addCriterion("img_uri >", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriGreaterThanOrEqualTo(String value) {
            addCriterion("img_uri >=", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriLessThan(String value) {
            addCriterion("img_uri <", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriLessThanOrEqualTo(String value) {
            addCriterion("img_uri <=", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriLike(String value) {
            addCriterion("img_uri like", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriNotLike(String value) {
            addCriterion("img_uri not like", value, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriIn(List<String> values) {
            addCriterion("img_uri in", values, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriNotIn(List<String> values) {
            addCriterion("img_uri not in", values, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriBetween(String value1, String value2) {
            addCriterion("img_uri between", value1, value2, "imgUri");
            return (Criteria) this;
        }

        public Criteria andImgUriNotBetween(String value1, String value2) {
            addCriterion("img_uri not between", value1, value2, "imgUri");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNull() {
            addCriterion("video_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("video_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(String value) {
            addCriterion("video_time =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(String value) {
            addCriterion("video_time <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(String value) {
            addCriterion("video_time >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_time >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(String value) {
            addCriterion("video_time <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(String value) {
            addCriterion("video_time <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLike(String value) {
            addCriterion("video_time like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotLike(String value) {
            addCriterion("video_time not like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<String> values) {
            addCriterion("video_time in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<String> values) {
            addCriterion("video_time not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(String value1, String value2) {
            addCriterion("video_time between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(String value1, String value2) {
            addCriterion("video_time not between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andZuozheIsNull() {
            addCriterion("zuozhe is null");
            return (Criteria) this;
        }

        public Criteria andZuozheIsNotNull() {
            addCriterion("zuozhe is not null");
            return (Criteria) this;
        }

        public Criteria andZuozheEqualTo(String value) {
            addCriterion("zuozhe =", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheNotEqualTo(String value) {
            addCriterion("zuozhe <>", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheGreaterThan(String value) {
            addCriterion("zuozhe >", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheGreaterThanOrEqualTo(String value) {
            addCriterion("zuozhe >=", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheLessThan(String value) {
            addCriterion("zuozhe <", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheLessThanOrEqualTo(String value) {
            addCriterion("zuozhe <=", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheLike(String value) {
            addCriterion("zuozhe like", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheNotLike(String value) {
            addCriterion("zuozhe not like", value, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheIn(List<String> values) {
            addCriterion("zuozhe in", values, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheNotIn(List<String> values) {
            addCriterion("zuozhe not in", values, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheBetween(String value1, String value2) {
            addCriterion("zuozhe between", value1, value2, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andZuozheNotBetween(String value1, String value2) {
            addCriterion("zuozhe not between", value1, value2, "zuozhe");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangIsNull() {
            addCriterion("bo_fang_liang is null");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangIsNotNull() {
            addCriterion("bo_fang_liang is not null");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangEqualTo(String value) {
            addCriterion("bo_fang_liang =", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangNotEqualTo(String value) {
            addCriterion("bo_fang_liang <>", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangGreaterThan(String value) {
            addCriterion("bo_fang_liang >", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangGreaterThanOrEqualTo(String value) {
            addCriterion("bo_fang_liang >=", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangLessThan(String value) {
            addCriterion("bo_fang_liang <", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangLessThanOrEqualTo(String value) {
            addCriterion("bo_fang_liang <=", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangLike(String value) {
            addCriterion("bo_fang_liang like", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangNotLike(String value) {
            addCriterion("bo_fang_liang not like", value, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangIn(List<String> values) {
            addCriterion("bo_fang_liang in", values, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangNotIn(List<String> values) {
            addCriterion("bo_fang_liang not in", values, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangBetween(String value1, String value2) {
            addCriterion("bo_fang_liang between", value1, value2, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andBoFangLiangNotBetween(String value1, String value2) {
            addCriterion("bo_fang_liang not between", value1, value2, "boFangLiang");
            return (Criteria) this;
        }

        public Criteria andMiaoShuIsNull() {
            addCriterion("miao_shu is null");
            return (Criteria) this;
        }

        public Criteria andMiaoShuIsNotNull() {
            addCriterion("miao_shu is not null");
            return (Criteria) this;
        }

        public Criteria andMiaoShuEqualTo(String value) {
            addCriterion("miao_shu =", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuNotEqualTo(String value) {
            addCriterion("miao_shu <>", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuGreaterThan(String value) {
            addCriterion("miao_shu >", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuGreaterThanOrEqualTo(String value) {
            addCriterion("miao_shu >=", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuLessThan(String value) {
            addCriterion("miao_shu <", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuLessThanOrEqualTo(String value) {
            addCriterion("miao_shu <=", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuLike(String value) {
            addCriterion("miao_shu like", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuNotLike(String value) {
            addCriterion("miao_shu not like", value, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuIn(List<String> values) {
            addCriterion("miao_shu in", values, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuNotIn(List<String> values) {
            addCriterion("miao_shu not in", values, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuBetween(String value1, String value2) {
            addCriterion("miao_shu between", value1, value2, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andMiaoShuNotBetween(String value1, String value2) {
            addCriterion("miao_shu not between", value1, value2, "miaoShu");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
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