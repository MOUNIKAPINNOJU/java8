package org.springboot;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentExample {

    public static void main(String[] args){
        Student std1= new Student("Mounika",24, "F");
        Student std2= new Student("Bairstow",33,"M");
        Student std3= new Student("Stokes",33,"m");
        Student std4= new Student("Buttler",34,"M");
        Student std5= new Student("Livinstone",30,"M");
        Student std6= new Student("Mithali Raj",36,"F");
        Student std7= new Student("Sciver",32,"F");
        Student std8= new Student("Lanning",29,"f");

        List<Student> studentList = new ArrayList();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
        studentList.add(std4);
        studentList.add(std5);
        studentList.add(std6);
        studentList.add(std7);
        studentList.add(std8);

        //•	Write a program to find all students whose age is greater than 33.
        List<Student> ageStudents = studentList.stream().filter(s->s.age > 33).collect(Collectors.toList());
        System.out.println(ageStudents.toString());

        //•	Write a program to find all students whose name start with ‘S’.
//        List<String> StudentsWithS = studentList.stream()
//                .filter(name->name.startsWith("S")).collect(Collectors.toList());

        //	Write a program to find all students whose gender is ‘F’.
        List<Student> Female = studentList.stream().filter(student->student.gender.equals("F")).collect(Collectors.toList());
        System.out.println(Female.toString());

        //•	Write a program to find Student name whose age is 33.
        List<Student> studentWith33Age = studentList.stream().filter(s->s.age == 33).collect(Collectors.toList());
        System.out.println(studentWith33Age.toString());



    }
}
