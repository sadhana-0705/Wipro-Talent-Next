package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] s) {
        int C = 0;
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] != null && s[i].getMarks() == null) {
                    C++;
                }
            }
        }
        return C;
    }

    public int findNumberOfNullName(Student[] s) {
        int C = 0;
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] != null && s[i].getName() == null) {
                    C++;
                }
            }
        }
        return C;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int C = 0;
        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] == null) {
                    C++;
                }
            }
        }
        return C;
    }
}
