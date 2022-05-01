/*
 * This file is generated by jOOQ.
 */
package cs499.data_classes;


import cs499.data_classes.tables.Course;
import cs499.data_classes.tables.Instructor;
import cs499.data_classes.tables.Metadata;
import cs499.data_classes.tables.Question;
import cs499.data_classes.tables.QuestionBank;
import cs499.data_classes.tables.QuestionBankQuestion;
import cs499.data_classes.tables.QuestionGroup;
import cs499.data_classes.tables.Quiz;
import cs499.data_classes.tables.QuizReference;
import cs499.data_classes.tables.QuizToQuestion;
import cs499.data_classes.tables.ReferenceMaterial;


/**
 * Convenience access to all tables in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>course</code>.
     */
    public static final Course COURSE = Course.COURSE;

    /**
     * The table <code>instructor</code>.
     */
    public static final Instructor INSTRUCTOR = Instructor.INSTRUCTOR;

    /**
     * The table <code>metadata</code>.
     */
    public static final Metadata METADATA = Metadata.METADATA;

    /**
     * The table <code>question</code>.
     */
    public static final Question QUESTION = Question.QUESTION;

    /**
     * The table <code>question_bank</code>.
     */
    public static final QuestionBank QUESTION_BANK = QuestionBank.QUESTION_BANK;

    /**
     * The table <code>question_bank_question</code>.
     */
    public static final QuestionBankQuestion QUESTION_BANK_QUESTION = QuestionBankQuestion.QUESTION_BANK_QUESTION;

    /**
     * The table <code>question_group</code>.
     */
    public static final QuestionGroup QUESTION_GROUP = QuestionGroup.QUESTION_GROUP;

    /**
     * The table <code>quiz</code>.
     */
    public static final Quiz QUIZ = Quiz.QUIZ;

    /**
     * The table <code>quiz_reference</code>.
     */
    public static final QuizReference QUIZ_REFERENCE = QuizReference.QUIZ_REFERENCE;

    /**
     * The table <code>quiz_to_question</code>.
     */
    public static final QuizToQuestion QUIZ_TO_QUESTION = QuizToQuestion.QUIZ_TO_QUESTION;

    /**
     * The table <code>reference_material</code>.
     */
    public static final ReferenceMaterial REFERENCE_MATERIAL = ReferenceMaterial.REFERENCE_MATERIAL;
}
