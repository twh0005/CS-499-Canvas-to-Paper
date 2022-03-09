/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes;


import cs499.data_classes.tables.BankQuestions;
import cs499.data_classes.tables.Course;
import cs499.data_classes.tables.GroupQuestions;
import cs499.data_classes.tables.Instructor;
import cs499.data_classes.tables.Question;
import cs499.data_classes.tables.QuestionBank;
import cs499.data_classes.tables.QuestionGroup;
import cs499.data_classes.tables.QuestionReferences;
import cs499.data_classes.tables.Quiz;
import cs499.data_classes.tables.QuizQuestions;
import cs499.data_classes.tables.QuizReferences;
import cs499.data_classes.tables.ReferenceMaterial;
import cs499.data_classes.tables.Section;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>bank_questions</code>.
     */
    public final BankQuestions BANK_QUESTIONS = BankQuestions.BANK_QUESTIONS;

    /**
     * The table <code>course</code>.
     */
    public final Course COURSE = Course.COURSE;

    /**
     * The table <code>group_questions</code>.
     */
    public final GroupQuestions GROUP_QUESTIONS = GroupQuestions.GROUP_QUESTIONS;

    /**
     * The table <code>instructor</code>.
     */
    public final Instructor INSTRUCTOR = Instructor.INSTRUCTOR;

    /**
     * The table <code>question</code>.
     */
    public final Question QUESTION = Question.QUESTION;

    /**
     * The table <code>question_bank</code>.
     */
    public final QuestionBank QUESTION_BANK = QuestionBank.QUESTION_BANK;

    /**
     * The table <code>question_group</code>.
     */
    public final QuestionGroup QUESTION_GROUP = QuestionGroup.QUESTION_GROUP;

    /**
     * The table <code>question_references</code>.
     */
    public final QuestionReferences QUESTION_REFERENCES = QuestionReferences.QUESTION_REFERENCES;

    /**
     * The table <code>quiz</code>.
     */
    public final Quiz QUIZ = Quiz.QUIZ;

    /**
     * The table <code>quiz_questions</code>.
     */
    public final QuizQuestions QUIZ_QUESTIONS = QuizQuestions.QUIZ_QUESTIONS;

    /**
     * The table <code>quiz_references</code>.
     */
    public final QuizReferences QUIZ_REFERENCES = QuizReferences.QUIZ_REFERENCES;

    /**
     * The table <code>reference_material</code>.
     */
    public final ReferenceMaterial REFERENCE_MATERIAL = ReferenceMaterial.REFERENCE_MATERIAL;

    /**
     * The table <code>section</code>.
     */
    public final Section SECTION = Section.SECTION;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            BankQuestions.BANK_QUESTIONS,
            Course.COURSE,
            GroupQuestions.GROUP_QUESTIONS,
            Instructor.INSTRUCTOR,
            Question.QUESTION,
            QuestionBank.QUESTION_BANK,
            QuestionGroup.QUESTION_GROUP,
            QuestionReferences.QUESTION_REFERENCES,
            Quiz.QUIZ,
            QuizQuestions.QUIZ_QUESTIONS,
            QuizReferences.QUIZ_REFERENCES,
            ReferenceMaterial.REFERENCE_MATERIAL,
            Section.SECTION
        );
    }
}
