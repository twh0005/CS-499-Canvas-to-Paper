/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes.tables.records;


import cs499.data_classes.tables.QuestionBank;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionBankRecord extends UpdatableRecordImpl<QuestionBankRecord> implements Record4<Integer, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>question_bank.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>question_bank.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>question_bank.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>question_bank.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>question_bank.course_id</code>.
     */
    public void setCourseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>question_bank.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>question_bank.canvas_id</code>.
     */
    public void setCanvasId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>question_bank.canvas_id</code>.
     */
    public String getCanvasId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return QuestionBank.QUESTION_BANK.ID;
    }

    @Override
    public Field<String> field2() {
        return QuestionBank.QUESTION_BANK.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return QuestionBank.QUESTION_BANK.COURSE_ID;
    }

    @Override
    public Field<String> field4() {
        return QuestionBank.QUESTION_BANK.CANVAS_ID;
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
    public Integer component3() {
        return getCourseId();
    }

    @Override
    public String component4() {
        return getCanvasId();
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
    public Integer value3() {
        return getCourseId();
    }

    @Override
    public String value4() {
        return getCanvasId();
    }

    @Override
    public QuestionBankRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public QuestionBankRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public QuestionBankRecord value3(Integer value) {
        setCourseId(value);
        return this;
    }

    @Override
    public QuestionBankRecord value4(String value) {
        setCanvasId(value);
        return this;
    }

    @Override
    public QuestionBankRecord values(Integer value1, String value2, Integer value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuestionBankRecord
     */
    public QuestionBankRecord() {
        super(QuestionBank.QUESTION_BANK);
    }

    /**
     * Create a detached, initialised QuestionBankRecord
     */
    public QuestionBankRecord(Integer id, String name, Integer courseId, String canvasId) {
        super(QuestionBank.QUESTION_BANK);

        setId(id);
        setName(name);
        setCourseId(courseId);
        setCanvasId(canvasId);
    }
}