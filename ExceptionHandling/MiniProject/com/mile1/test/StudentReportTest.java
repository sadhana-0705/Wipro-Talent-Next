package com.mile1.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentReportTest {

    private StudentReport studentReport = new StudentReport();
    private StudentService studentService = new StudentService();

    // ==========================================
    // GRADE CALCULATION FOR VALID OBJECTS
    // ==========================================

    // TC1 -- Calculate the grade for valid objects – Check for A grade computation
    @Test
    public void testTC1_GradeA() throws Exception {
        Student s = new Student("Aakash", new int[] { 85, 90, 95 });
        String grade = studentReport.findGrade(s);
        assertEquals("A", grade);
    }

    // TC2 -- Calculate the grade for valid objects – Check for D grade computation
    @Test
    public void testTC2_GradeD() throws Exception {
        Student s = new Student("Bala", new int[] { 40, 45, 50 });
        String grade = studentReport.findGrade(s);
        assertEquals("D", grade);
    }

    // TC3 -- Calculate the grade for valid objects – Check for F grade computation
    @Test
    public void testTC3_GradeF() throws Exception {
        Student s = new Student("Chitra", new int[] { 30, 80, 90 });
        String grade = studentReport.findGrade(s);
        assertEquals("F", grade);
    }

    // ==========================================
    // THROW ERROR MESSAGE FOR INVALID OBJECT
    // ==========================================

    // TC4 -- If the Object is null, throw NullStudentException
    @Test(expected = NullStudentException.class)
    public void testTC4_NullStudentException() throws Exception {
        Student s = null;
        studentReport.validate(s);
    }

    // TC5 -- If the Name is null, throw NullNameException
    @Test(expected = NullNameException.class)
    public void testTC5_NullNameException() throws Exception {
        Student s = new Student(null, new int[] { 80, 85, 90 });
        studentReport.validate(s);
    }

    // TC6 -- If the Marks array is null, throw NullMarksArrayException
    @Test(expected = NullMarksArrayException.class)
    public void testTC6_NullMarksArrayException() throws Exception {
        Student s = new Student("David", null);
        studentReport.validate(s);
    }

    // ==========================================
    // COUNTING THE NULL VALUES
    // ==========================================

    // TC7 – Test findNumberOfNullName function
    @Test
    public void testTC7_FindNumberOfNullName() {
        Student[] data = new Student[] {
            new Student(null, new int[] { 80, 85, 90 }),
            new Student("Esha", new int[] { 70, 75, 80 }),
            new Student(null, new int[] { 60, 65, 70 })
        };
        int count = studentService.findNumberOfNullName(data);
        assertEquals(2, count);
    }

    // TC8 – Test findNumberOfNullObjects function
    @Test
    public void testTC8_FindNumberOfNullObjects() {
        Student[] data = new Student[] {
            null,
            new Student("Farhan", new int[] { 80, 85, 90 }),
            null
        };
        int count = studentService.findNumberOfNullObjects(data);
        assertEquals(2, count);
    }

    // TC9 -- Test findNumberOfNullMarks function
    @Test
    public void testTC9_FindNumberOfNullMarks() {
        Student[] data = new Student[] {
            new Student("Ganesh", null),
            new Student("Hari", new int[] { 70, 75, 80 }),
            new Student("Isha", null)
        };
        int count = studentService.findNumberOfNullMarks(data);
        assertEquals(2, count);
    }
}