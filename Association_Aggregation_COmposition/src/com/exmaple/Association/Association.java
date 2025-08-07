package com.exmaple.Association;

class Course{
    String courseName;

    Course(String courseName){
        this.courseName=courseName;
    }

    public void getCourseName(){
        System.out.println("Course Name: " + courseName);
    }
}

class  Student{

    String id;
    String name;
    Course course;
    Student(String id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void display(){
        course.getCourseName();;
    }
}



public class Association {
    public static void main(String[] args) {

    }
Course c=new Course("Java Programming");
Student s=new Student("1", "John Doe", c);

}
