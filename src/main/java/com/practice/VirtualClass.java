package com.practice;

import com.practice.lessons.Lesson;

import java.util.List;

public abstract class VirtualClass {
    String className;
    String classInstructorName;
    List<Lesson> lessons;

    public void conductClass() {

        introToInstructor();
        for (int i = 0; i < lessons.size(); ++i) {
            System.out.println(" conducting lesson " + lessons.get(i).getTypeOfLesson());

        }
    }

    private void introToInstructor() {
        System.out.println("playing intro video to professor and topic of the day. The class instructor name is " + classInstructorName);
        System.out.println("the class is " + className);

    }



}

