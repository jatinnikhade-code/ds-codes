package package1;

public class School {
    public void showSchool() {
        System.out.println("This is the School class");
    }
}
package package2;

import package1.School; // import base class

public class Teacher extends School {
    public void showTeacher() {
        System.out.println("This is the Teacher class (extends School)");
    }
}
package package3;

import package2.Teacher; // import teacher class

public class Student extends Teacher {
    public void showStudent() {
        System.out.println("This is the Student class (extends Teacher)");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.showSchool();   // from School
        s.showTeacher();  // from Teacher
        s.showStudent();  // from Student
    }
}
