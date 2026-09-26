package com.mycompany.lab03;

public class Lab03 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.read();
        s1.name = "Mahi";
        s1.id = "252-15-564";
        s1.section = "69-i";
        s1.address = "Dhaka";
        s1.displayInfo();
        
       Section i_69 = new Section();
        i_69.showStudentInfo();
       
    }
}
class Student {
    
    String name;
    String id;
    String section;
    String address;
    
    void read() {
        System.out.println("Show all information ");
    }

    void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("ID:" + id);
        System.out.println("Section :" + section);
        System.out.println("Address :" + address);
    }
}
