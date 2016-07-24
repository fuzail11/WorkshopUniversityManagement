package com.company;

/**
 * Created by Farrukh's on 25-Jul-16.
 */
public class Student extends Human {

    private String semester;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String toString(){

        return String.format("Semester:%s\nName:%s\n",getSemester(),getName());
    }

}
