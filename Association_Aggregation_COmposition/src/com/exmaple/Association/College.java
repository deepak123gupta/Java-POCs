package com.exmaple.Association;

// Professor class
class Professor {
    String name;
    String subject;

    Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void display() {
        System.out.println("Professor: " + name + ", Subject: " + subject);
    }
}

// Department class (Aggregation)
class Department {
    String deptName;
    Professor professor; // Aggregation (HAS-A)

    Department(String deptName, Professor professor) {
        this.deptName = deptName;
        this.professor = professor;
    }

    void showDetails() {
        System.out.println("Department: " + deptName);
        professor.display();
    }
}

// Main class
public class College {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Mehta", "Mathematics");

        // Aggregation: Department has a Professor
        Department dept = new Department("Science", prof1);

        dept.showDetails();
    }
}
