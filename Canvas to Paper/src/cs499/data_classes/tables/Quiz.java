/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes.tables;


import cs499.data_classes.DefaultSchema;
import cs499.data_classes.Indexes;
import cs499.data_classes.Keys;
import cs499.data_classes.tables.records.QuizRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Quiz extends TableImpl<QuizRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>quiz</code>
     */
    public static final Quiz QUIZ = new Quiz();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuizRecord> getRecordType() {
        return QuizRecord.class;
    }

    /**
     * The column <code>quiz.id</code>.
     */
    public final TableField<QuizRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>quiz.name</code>.
     */
    public final TableField<QuizRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>quiz.description</code>.
     */
    public final TableField<QuizRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>quiz.api_id</code>.
     */
    public final TableField<QuizRecord, Integer> API_ID = createField(DSL.name("api_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>quiz.qti_id</code>.
     */
    public final TableField<QuizRecord, String> QTI_ID = createField(DSL.name("qti_id"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>quiz.points_possible</code>.
     */
    public final TableField<QuizRecord, Float> POINTS_POSSIBLE = createField(DSL.name("points_possible"), SQLDataType.REAL, this, "");

    /**
     * The column <code>quiz.assignment_api_id</code>.
     */
    public final TableField<QuizRecord, Integer> ASSIGNMENT_API_ID = createField(DSL.name("assignment_api_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>quiz.course_id</code>.
     */
    public final TableField<QuizRecord, Integer> COURSE_ID = createField(DSL.name("course_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>quiz.due_date</code>.
     */
    public final TableField<QuizRecord, String> DUE_DATE = createField(DSL.name("due_date"), SQLDataType.CLOB, this, "");

    private Quiz(Name alias, Table<QuizRecord> aliased) {
        this(alias, aliased, null);
    }

    private Quiz(Name alias, Table<QuizRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>quiz</code> table reference
     */
    public Quiz(String alias) {
        this(DSL.name(alias), QUIZ);
    }

    /**
     * Create an aliased <code>quiz</code> table reference
     */
    public Quiz(Name alias) {
        this(alias, QUIZ);
    }

    /**
     * Create a <code>quiz</code> table reference
     */
    public Quiz() {
        this(DSL.name("quiz"), null);
    }

    public <O extends Record> Quiz(Table<O> child, ForeignKey<O, QuizRecord> key) {
        super(child, key, QUIZ);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_QUIZ_API_ID, Indexes.IDX_QUIZ_QTI_ID);
    }

    @Override
    public UniqueKey<QuizRecord> getPrimaryKey() {
        return Keys.QUIZ__;
    }

    @Override
    public Quiz as(String alias) {
        return new Quiz(DSL.name(alias), this);
    }

    @Override
    public Quiz as(Name alias) {
        return new Quiz(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Quiz rename(String name) {
        return new Quiz(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Quiz rename(Name name) {
        return new Quiz(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, Integer, String, Float, Integer, Integer, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}