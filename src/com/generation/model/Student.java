package com.generation.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    //creating an empty array for student object to add course
    private List<Course> enrolledCourses = new ArrayList<>();
    //creating a hash map for enrolled courses
    private Map<String, Course> enrolledCourse = new HashMap<>();

    //create a map for student to store their grading
    private HashMap<String, Float> gradeStore = new HashMap<>();

    //constructor
    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );

    }//end of constructor

    public void enrollToCourse( Course course )
    {
        //TODO : Complete

        this.enrolledCourses.add(course);
        //add the course into the array list;
        this.enrolledCourse.put(course.getCode(),course);
        //add into the hashmap so i can use it later
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        //min pass = 3
        //max = 6
        return null;

    }

    public Course findCourseById( String courseId )
    {
        //TODO
       return enrolledCourses.get(Integer.parseInt(courseId));
    }


    public List<Course> getEnrolledCourses()
    {
        //TODO
        return this.enrolledCourses;
    }
    public Map<String, Course> getEnrolledCourse(){
        return enrolledCourse;
    }

    //to set a method to set the grade
    //will need to assign to the course ID so can print in option 5 also
    public void setGrade (String courseID, Float grade){
        gradeStore.put(courseID, grade);
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
