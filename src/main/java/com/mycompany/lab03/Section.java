
package com.mycompany.lab03;
public class Section {
    String name;
    String[] courses = {"oop","edc"};
    Student s1 = new Student();
    
    void showStudentInfo()
    {
        s1.name="Tanjina";
        s1.id = "252-15-492";
        s1.section = "69-j";
        s1.address = "Chandpur";
        s1.displayInfo();
    }
  
}
