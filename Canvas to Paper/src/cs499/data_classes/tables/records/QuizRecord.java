/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes.tables.records;


import cs499.data_classes.tables.Quiz;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record2;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuizRecord extends UpdatableRecordImpl<QuizRecord> implements Record10<Integer, Integer, byte[], byte[], String, String, String, byte[], BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>quiz.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>quiz.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>quiz.course_id</code>.
     */
    public void setCourseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>quiz.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>quiz.options</code>.
     */
    public void setOptions(byte[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>quiz.options</code>.
     */
    public byte[] getOptions() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>quiz.assign_to</code>.
     */
    public void setAssignTo(byte[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>quiz.assign_to</code>.
     */
    public byte[] getAssignTo() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>quiz.due_date</code>.
     */
    public void setDueDate(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>quiz.due_date</code>.
     */
    public String getDueDate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>quiz.available_from</code>.
     */
    public void setAvailableFrom(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>quiz.available_from</code>.
     */
    public String getAvailableFrom() {
        return (String) get(5);
    }

    /**
     * Setter for <code>quiz.until</code>.
     */
    public void setUntil(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>quiz.until</code>.
     */
    public String getUntil() {
        return (String) get(6);
    }

    /**
     * Setter for <code>quiz.rubric</code>.
     */
    public void setRubric(byte[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>quiz.rubric</code>.
     */
    public byte[] getRubric() {
        return (byte[]) get(7);
    }

    /**
     * Setter for <code>quiz.total_points</code>.
     */
    public void setTotalPoints(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>quiz.total_points</code>.
     */
    public BigDecimal getTotalPoints() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>quiz.canvas_id</code>.
     */
    public void setCanvasId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>quiz.canvas_id</code>.
     */
    public String getCanvasId() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, Integer, byte[], byte[], String, String, String, byte[], BigDecimal, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Integer, Integer, byte[], byte[], String, String, String, byte[], BigDecimal, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Quiz.QUIZ.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Quiz.QUIZ.COURSE_ID;
    }

    @Override
    public Field<byte[]> field3() {
        return Quiz.QUIZ.OPTIONS;
    }

    @Override
    public Field<byte[]> field4() {
        return Quiz.QUIZ.ASSIGN_TO;
    }

    @Override
    public Field<String> field5() {
        return Quiz.QUIZ.DUE_DATE;
    }

    @Override
    public Field<String> field6() {
        return Quiz.QUIZ.AVAILABLE_FROM;
    }

    @Override
    public Field<String> field7() {
        return Quiz.QUIZ.UNTIL;
    }

    @Override
    public Field<byte[]> field8() {
        return Quiz.QUIZ.RUBRIC;
    }

    @Override
    public Field<BigDecimal> field9() {
        return Quiz.QUIZ.TOTAL_POINTS;
    }

    @Override
    public Field<String> field10() {
        return Quiz.QUIZ.CANVAS_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getCourseId();
    }

    @Override
    public byte[] component3() {
        return getOptions();
    }

    @Override
    public byte[] component4() {
        return getAssignTo();
    }

    @Override
    public String component5() {
        return getDueDate();
    }

    @Override
    public String component6() {
        return getAvailableFrom();
    }

    @Override
    public String component7() {
        return getUntil();
    }

    @Override
    public byte[] component8() {
        return getRubric();
    }

    @Override
    public BigDecimal component9() {
        return getTotalPoints();
    }

    @Override
    public String component10() {
        return getCanvasId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getCourseId();
    }

    @Override
    public byte[] value3() {
        return getOptions();
    }

    @Override
    public byte[] value4() {
        return getAssignTo();
    }

    @Override
    public String value5() {
        return getDueDate();
    }

    @Override
    public String value6() {
        return getAvailableFrom();
    }

    @Override
    public String value7() {
        return getUntil();
    }

    @Override
    public byte[] value8() {
        return getRubric();
    }

    @Override
    public BigDecimal value9() {
        return getTotalPoints();
    }

    @Override
    public String value10() {
        return getCanvasId();
    }

    @Override
    public QuizRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public QuizRecord value2(Integer value) {
        setCourseId(value);
        return this;
    }

    @Override
    public QuizRecord value3(byte[] value) {
        setOptions(value);
        return this;
    }

    @Override
    public QuizRecord value4(byte[] value) {
        setAssignTo(value);
        return this;
    }

    @Override
    public QuizRecord value5(String value) {
        setDueDate(value);
        return this;
    }

    @Override
    public QuizRecord value6(String value) {
        setAvailableFrom(value);
        return this;
    }

    @Override
    public QuizRecord value7(String value) {
        setUntil(value);
        return this;
    }

    @Override
    public QuizRecord value8(byte[] value) {
        setRubric(value);
        return this;
    }

    @Override
    public QuizRecord value9(BigDecimal value) {
        setTotalPoints(value);
        return this;
    }

    @Override
    public QuizRecord value10(String value) {
        setCanvasId(value);
        return this;
    }

    @Override
    public QuizRecord values(Integer value1, Integer value2, byte[] value3, byte[] value4, String value5, String value6, String value7, byte[] value8, BigDecimal value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuizRecord
     */
    public QuizRecord() {
        super(Quiz.QUIZ);
    }

    /**
     * Create a detached, initialised QuizRecord
     */
    public QuizRecord(Integer id, Integer courseId, byte[] options, byte[] assignTo, String dueDate, String availableFrom, String until, byte[] rubric, BigDecimal totalPoints, String canvasId) {
        super(Quiz.QUIZ);

        setId(id);
        setCourseId(courseId);
        setOptions(options);
        setAssignTo(assignTo);
        setDueDate(dueDate);
        setAvailableFrom(availableFrom);
        setUntil(until);
        setRubric(rubric);
        setTotalPoints(totalPoints);
        setCanvasId(canvasId);
    }
}