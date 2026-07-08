package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;
import com.mile1.service.StudentReport;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentMain {
    static Student data[] = new Student[10];

    public void init() {
        data[0] = new Student("A1", new int[]{72, 73, 74});
        data[1] = new Student("B1", new int[]{75, 76, 77});
        data[2] = new Student("C1", new int[]{99, 99, 99});
        data[3] = new Student("C3", new int[]{100, 100, 99});
        data[4] = new Student("B2", new int[]{13, 88, 13});
        data[5] = new Student("C5", new int[]{14, 14, 99});
        data[6] = new Student("A2", new int[]{77, 55, 12});
        data[7] = new Student(null, new int[]{13, 88, 13});
        data[8] = new Student("A2", null);
        data[9] = null;
    }

    public static void main(String[] args) {
        StudentMain app = new StudentMain();
        app.init();

        StudentService service = new StudentService();
        StudentReport report = new StudentReport();

        System.out.println("--- Validation & Grading Suite ---");
        for (int i = 0; i < data.length; i++) {
            try {
                String validationResult = report.validate(data[i]);
                if ("VALID".equals(validationResult)) {
                    String grade = report.findGrades(data[i]);
                    data[i].setGrade(grade);
                    System.out.println("Student[" + i + "] (" + data[i].getName() + ") Grade: " + data[i].getGrade());
                }
            } catch (NullStudentObjectException e) {
                System.out.println("Student[" + i + "] Exception: " + e.toString());
            } catch (NullNameException e) {
                System.out.println("Student[" + i + "] Exception: " + e.toString());
            } catch (NullMarksArrayException e) {
                System.out.println("Student[" + i + "] Exception: " + e.toString());
            }
        }

        System.out.println("\n--- Service Reporting Matrix ---");
        System.out.println("Null Name Counts: " + service.findNumberOfNullName(data));
        System.out.println("Null Objects Counts: " + service.findNumberOfNullObjects(data));
        System.out.println("Null Marks Array Counts: " + service.findNumberOfNullMarksArray(data));
    }
}
