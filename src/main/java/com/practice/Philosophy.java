package com.practice;

import com.practice.lessons.AudioLecture;
import com.practice.lessons.VideoLecture;

import java.util.ArrayList;

public class Philosophy extends VirtualClass{

    public Philosophy() {
        className = "com.practice.Philosophy class";
        classInstructorName = " Professor Jonathan";
        lessons = new ArrayList();
        lessons.add(new AudioLecture());


    }

}