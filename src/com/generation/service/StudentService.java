package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;



import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();



    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //TODO
        return this.students.get(studentId);
        //this is to search through the students HashMap to retrieve the student info
        //based on hash key studentId
    }

    //this function is to loop the hash map and display result if hash map is not empty
    public void displaySummary()
    {
        for (Student counter: students.values())
        {
            System.out.println(counter);
            System.out.println("Enrolled Courses:");
            System.out.println(counter.getEnrolledCourses());
            }
        }



    public boolean showSummary()
    {
        //TODO
        //declare a variable summaryFlag to check for the Id
        //if the id is blank = summaryFlag  true
        boolean summaryFlag = true;
        if (students.isEmpty()) { // is empty() to check if the student hash map is empty
            return summaryFlag;
        }
        else {
            return false;
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        //enroll student to course using student id and course
        Student student = this.students.get(studentId);
        // course = Course enrolled; to add using the student enroll function due to composite
        //1 entry point = main.java has to access through Student Service + Course Service to get
        //student and course details
        student.enrollToCourse(course);
    }
}
