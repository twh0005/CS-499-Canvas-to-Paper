/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes.tables.records;


import cs499.data_classes.tables.Section;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SectionRecord extends UpdatableRecordImpl<SectionRecord> implements Record4<Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>section.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>section.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>section.course_id</code>.
     */
    public void setCourseId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>section.course_id</code>.
     */
    public Integer getCourseId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>section.instructor_id</code>.
     */
    public void setInstructorId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>section.instructor_id</code>.
     */
    public Integer getInstructorId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>section.canvas_id</code>.
     */
    public void setCanvasId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>section.canvas_id</code>.
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
    public Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Section.SECTION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Section.SECTION.COURSE_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Section.SECTION.INSTRUCTOR_ID;
    }

    @Override
    public Field<String> field4() {
        return Section.SECTION.CANVAS_ID;
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
    public Integer component3() {
        return getInstructorId();
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
    public Integer value2() {
        return getCourseId();
    }

    @Override
    public Integer value3() {
        return getInstructorId();
    }

    @Override
    public String value4() {
        return getCanvasId();
    }

    @Override
    public SectionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SectionRecord value2(Integer value) {
        setCourseId(value);
        return this;
    }

    @Override
    public SectionRecord value3(Integer value) {
        setInstructorId(value);
        return this;
    }

    @Override
    public SectionRecord value4(String value) {
        setCanvasId(value);
        return this;
    }

    @Override
    public SectionRecord values(Integer value1, Integer value2, Integer value3, String value4) {
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
     * Create a detached SectionRecord
     */
    public SectionRecord() {
        super(Section.SECTION);
    }

    /**
     * Create a detached, initialised SectionRecord
     */
    public SectionRecord(Integer id, Integer courseId, Integer instructorId, String canvasId) {
        super(Section.SECTION);

        setId(id);
        setCourseId(courseId);
        setInstructorId(instructorId);
        setCanvasId(canvasId);
    }
}