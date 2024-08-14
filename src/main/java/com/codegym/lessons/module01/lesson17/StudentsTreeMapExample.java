package com.codegym.lessons.module01.lesson17;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class StudentsTreeMapExample {

    public static void main(String[] args) {
        //Student ranking
        var students = new TreeMap<Student, Boolean>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int gradeFirst = o1.engineering + o1.english + o1.math;
                int gradeSecond = o2.engineering + o2.english + o2.math;
                //return Integer.compare(gradeFirst, gradeSecond);
                return Integer.compare(gradeSecond, gradeFirst);
            }
        });

        Student s1 = new Student();
        s1.engineering = 2;
        s1.english = 2;
        s1.math = 2;
        Student s2 = new Student();
        s2.engineering = 5;
        s2.english = 5;
        s2.math = 5;
        Student s3 = new Student();
        s3.engineering = 9;
        s3.english = 9;
        s3.math = 9;
        students.put(s1, true);
        students.put(s2, true);
        students.put(s3, true);
        for(Map.Entry<Student,Boolean> student: students.entrySet()){
            System.out.println(student.getKey());
        }
    }

    static class Student {
        //Academic subjects
        int engineering;
        int math;
        int english;

        @Override
        public String toString() {
            return "Student{" +
                    "engineering=" + engineering +
                    ", math=" + math +
                    ", english=" + english +
                    '}';
        }
    }
}
