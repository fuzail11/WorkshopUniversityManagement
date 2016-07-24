package com.company;



/**
 * Created by 192.168.3.5 on 7/24/2016.
 */
import java.util.Scanner;
public class Uni {

    private  final int INDEX=3;
    Teacher T[];
    Student S[];
    int cout;

    private Scanner input;
    public Uni(){
        input = new Scanner(System.in);
        T = new Teacher[INDEX];
        S=new Student[INDEX];
    }
    public void addT(Teacher Teach)
    {

        if(cout< INDEX)
            T[cout++]=Teach;
        else
            System.out.println("Teachers can not add..");
    }


    public void getInputFromUserAndAddTeacher(){
        String course = null;
        String name = null;

        for(int index=0; index<INDEX; index++) {
            System.out.println("Enter course:");
            course = input.next();
            System.out.println("Enter name:");
            name = input.next();

            Teacher temp;
            temp = new Teacher();
            temp.setCourse(course);
            temp.setName(name);
            addT(temp);
        }//end of loop

    }




    public void ViewT()
    {

        for(int index = 0; index<cout; index++){

            System.out.println(T[index]);

        }
    }
    public void updateAtIndex(int index)
    {
        String name=null;
        String course = null;

        System.out.println("Enter name:");
        name=input.next();
        System.out.println("Enter course:");
        course=input.next();

        T[index].setCourse(course);
        T[index].setName(name);
        System.out.println("Teacher is updated");
    }
    public void update()
    {
        int index;
        System.out.println("Enter your index");
        index = input.nextInt();

        if(index>=INDEX)
        {
            System.out.println("Please enter valid index");
        }
        else
        {
            this.updateAtIndex(index);
        }

    }

    public void delete()
    {
        int index;
        System.out.println("Enter your index");
        index = input.nextInt();

        if(index>=INDEX)
        {
            System.out.println("Please enter valid index");
        }
        else
        {
            this.delAtIndex(index);
        }

    }


    public void delAtIndex(int del)
    {

        T[del].setCourse(null);
        T[del].setName(null);

    }



















    public void addS(Student Stu)
    {

        if(cout< INDEX)
            S[cout++]=Stu;
        else
            System.out.println("Student can not add..");
    }


    public void getInputFromUserAndAddStudent(){
        String semester = null;
        String name = null;

        for(int index=0; index<INDEX; index++) {
            System.out.println("Enter Semeter:");
            semester = input.next();
            System.out.println("Enter name:");
            name = input.next();

            Student stud;
            stud =new Student();
            stud.setName(name);
            stud.setSemester(semester);

            addS(stud);
        }//end of loop

    }




    public void ViewS()
    {

        for(int index = 0; index<cout; index++){

            System.out.println(S[index]);

        }
    }
    public void updateAtIndexS(int index)
    {
        String name=null;
        String semeter = null;

        System.out.println("Enter name:");
        name=input.next();
        System.out.println("Enter course:");
        semeter=input.next();

        S[index].setSemester(semeter);
        S[index].setName(name);
        System.out.println("Teacher is updated");
    }
    public void updateS()
    {
        int index;
        System.out.println("Enter your index");
        index = input.nextInt();

        if(index>=INDEX)
        {
            System.out.println("Please enter valid index");
        }
        else
        {
            this.updateAtIndex(index);
        }

    }

    public void deleteS()
    {
        int index;
        System.out.println("Enter your index");
        index = input.nextInt();

        if(index>=INDEX)
        {
            System.out.println("Please enter valid index");
        }
        else
        {
            this.delAtIndex(index);
        }

    }


    public void delAtIndexS(int del)
    {

        S[del].setSemester(null);
        S[del].setName(null);

    }







}
