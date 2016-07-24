package com.company;

/**
 * Created by 192.168.3.5 on 7/24/2016.
 */
public class Teacher extends Human {

    private String course;


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String toString(){

        return String.format("Course:%s\nName:%s\n",getCourse(),getName());
    }

}
