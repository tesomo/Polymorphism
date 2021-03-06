package com.practice;

import com.practice.lessons.AudioLecture;
import com.practice.lessons.VideoLecture;

import java.util.ArrayList;

public class Maths extends VirtualClass {

    public Maths() {
        className = "com.practice.Maths class";
        classInstructorName = " Professor Innocent";
        lessons = new ArrayList();
        lessons.add(new AudioLecture());
        lessons.add(new VideoLecture());

    }

    void explainsProblems() {
        System.out.println("welcome to your " + className + "taught by" + classInstructorName + ". The Math teacher goes through a set of problems");
    }
}
