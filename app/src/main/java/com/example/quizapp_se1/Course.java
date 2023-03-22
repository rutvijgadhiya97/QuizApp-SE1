package com.example.quizapp_se1;

import java.io.Serializable;

public class Course implements Serializable {
    public String CoursesId;
    public boolean approvalflag;
    public Course()
    {

    }
    public Course(String courseId,boolean appflag)
    {
        this.CoursesId=courseId;
        this.approvalflag=appflag;
    }

}
