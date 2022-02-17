/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes.tables;


import cs499.data_classes.DefaultSchema;
import cs499.data_classes.Indexes;
import cs499.data_classes.Keys;
import cs499.data_classes.tables.records.QuestionBankRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class QuestionBank extends TableImpl<QuestionBankRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>question_bank</code>
     */
    public static final QuestionBank QUESTION_BANK = new QuestionBank();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuestionBankRecord> getRecordType() {
        return QuestionBankRecord.class;
    }

    /**
     * The column <code>question_bank.id</code>.
     */
    public final TableField<QuestionBankRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>question_bank.name</code>.
     */
    public final TableField<QuestionBankRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>question_bank.course_id</code>.
     */
    public final TableField<QuestionBankRecord, Integer> COURSE_ID = createField(DSL.name("course_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>question_bank.canvas_id</code>.
     */
    public final TableField<QuestionBankRecord, String> CANVAS_ID = createField(DSL.name("canvas_id"), SQLDataType.CLOB, this, "");

    private QuestionBank(Name alias, Table<QuestionBankRecord> aliased) {
        this(alias, aliased, null);
    }

    private QuestionBank(Name alias, Table<QuestionBankRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>question_bank</code> table reference
     */
    public QuestionBank(String alias) {
        this(DSL.name(alias), QUESTION_BANK);
    }

    /**
     * Create an aliased <code>question_bank</code> table reference
     */
    public QuestionBank(Name alias) {
        this(alias, QUESTION_BANK);
    }

    /**
     * Create a <code>question_bank</code> table reference
     */
    public QuestionBank() {
        this(DSL.name("question_bank"), null);
    }

    public <O extends Record> QuestionBank(Table<O> child, ForeignKey<O, QuestionBankRecord> key) {
        super(child, key, QUESTION_BANK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_BANK_CANVAS_ID);
    }

    @Override
    public UniqueKey<QuestionBankRecord> getPrimaryKey() {
        return Keys.QUESTION_BANK__;
    }

    @Override
    public QuestionBank as(String alias) {
        return new QuestionBank(DSL.name(alias), this);
    }

    @Override
    public QuestionBank as(Name alias) {
        return new QuestionBank(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QuestionBank rename(String name) {
        return new QuestionBank(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QuestionBank rename(Name name) {
        return new QuestionBank(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
