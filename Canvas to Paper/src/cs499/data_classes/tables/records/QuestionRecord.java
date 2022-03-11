/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes.tables.records;


import cs499.data_classes.tables.Question;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionRecord extends UpdatableRecordImpl<QuestionRecord> implements Record11<Integer, String, String, Integer, String, String, Float, String, Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>question.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>question.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>question.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>question.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>question.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>question.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>question.api_id</code>.
     */
    public void setApiId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>question.api_id</code>.
     */
    public Integer getApiId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>question.qti_id</code>.
     */
    public void setQtiId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>question.qti_id</code>.
     */
    public String getQtiId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>question.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>question.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>question.points_possible</code>.
     */
    public void setPointsPossible(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>question.points_possible</code>.
     */
    public Float getPointsPossible() {
        return (Float) get(6);
    }

    /**
     * Setter for <code>question.answers</code>.
     */
    public void setAnswers(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>question.answers</code>.
     */
    public String getAnswers() {
        return (String) get(7);
    }

    /**
     * Setter for <code>question.abet</code>.
     */
    public void setAbet(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>question.abet</code>.
     */
    public Integer getAbet() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>question.grading_instructions</code>.
     */
    public void setGradingInstructions(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>question.grading_instructions</code>.
     */
    public String getGradingInstructions() {
        return (String) get(9);
    }

    /**
     * Setter for <code>question.reference_id</code>.
     */
    public void setReferenceId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>question.reference_id</code>.
     */
    public Integer getReferenceId() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, Integer, String, String, Float, String, Integer, String, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, Integer, String, String, Float, String, Integer, String, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Question.QUESTION.ID;
    }

    @Override
    public Field<String> field2() {
        return Question.QUESTION.NAME;
    }

    @Override
    public Field<String> field3() {
        return Question.QUESTION.DESCRIPTION;
    }

    @Override
    public Field<Integer> field4() {
        return Question.QUESTION.API_ID;
    }

    @Override
    public Field<String> field5() {
        return Question.QUESTION.QTI_ID;
    }

    @Override
    public Field<String> field6() {
        return Question.QUESTION.TYPE;
    }

    @Override
    public Field<Float> field7() {
        return Question.QUESTION.POINTS_POSSIBLE;
    }

    @Override
    public Field<String> field8() {
        return Question.QUESTION.ANSWERS;
    }

    @Override
    public Field<Integer> field9() {
        return Question.QUESTION.ABET;
    }

    @Override
    public Field<String> field10() {
        return Question.QUESTION.GRADING_INSTRUCTIONS;
    }

    @Override
    public Field<Integer> field11() {
        return Question.QUESTION.REFERENCE_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer component4() {
        return getApiId();
    }

    @Override
    public String component5() {
        return getQtiId();
    }

    @Override
    public String component6() {
        return getType();
    }

    @Override
    public Float component7() {
        return getPointsPossible();
    }

    @Override
    public String component8() {
        return getAnswers();
    }

    @Override
    public Integer component9() {
        return getAbet();
    }

    @Override
    public String component10() {
        return getGradingInstructions();
    }

    @Override
    public Integer component11() {
        return getReferenceId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Integer value4() {
        return getApiId();
    }

    @Override
    public String value5() {
        return getQtiId();
    }

    @Override
    public String value6() {
        return getType();
    }

    @Override
    public Float value7() {
        return getPointsPossible();
    }

    @Override
    public String value8() {
        return getAnswers();
    }

    @Override
    public Integer value9() {
        return getAbet();
    }

    @Override
    public String value10() {
        return getGradingInstructions();
    }

    @Override
    public Integer value11() {
        return getReferenceId();
    }

    @Override
    public QuestionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public QuestionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public QuestionRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public QuestionRecord value4(Integer value) {
        setApiId(value);
        return this;
    }

    @Override
    public QuestionRecord value5(String value) {
        setQtiId(value);
        return this;
    }

    @Override
    public QuestionRecord value6(String value) {
        setType(value);
        return this;
    }

    @Override
    public QuestionRecord value7(Float value) {
        setPointsPossible(value);
        return this;
    }

    @Override
    public QuestionRecord value8(String value) {
        setAnswers(value);
        return this;
    }

    @Override
    public QuestionRecord value9(Integer value) {
        setAbet(value);
        return this;
    }

    @Override
    public QuestionRecord value10(String value) {
        setGradingInstructions(value);
        return this;
    }

    @Override
    public QuestionRecord value11(Integer value) {
        setReferenceId(value);
        return this;
    }

    @Override
    public QuestionRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, Float value7, String value8, Integer value9, String value10, Integer value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionRecord
     */
    public QuestionRecord() {
        super(Question.QUESTION);
    }

    /**
     * Create a detached, initialised QuestionRecord
     */
    public QuestionRecord(Integer id, String name, String description, Integer apiId, String qtiId, String type, Float pointsPossible, String answers, Integer abet, String gradingInstructions, Integer referenceId) {
        super(Question.QUESTION);

        setId(id);
        setName(name);
        setDescription(description);
        setApiId(apiId);
        setQtiId(qtiId);
        setType(type);
        setPointsPossible(pointsPossible);
        setAnswers(answers);
        setAbet(abet);
        setGradingInstructions(gradingInstructions);
        setReferenceId(referenceId);
    }
}
