package com.hecc.practicetestapp;

public class Course {
    private String courseName;
    private String courseDesc;

    public static final Course[] courses = {
            new Course("Android Development", "Prep for a test on Android Studio and Java"),
            new Course("CompTIA A+", "Prep for a test on CompTIA A+ Core 1 and Core 2"),
            new Course("CompTIA Network+", "Prep for a test on CompTIA Network+")
    };

    private Course(String courseName, String courseDesc) {
        this.courseName =  courseName;
        this.courseDesc = courseDesc;
    }

    public String getCourseName() { return courseName; }
    public String getCourseDesc() { return courseDesc; }

    public static String[] getCourseNamesArray() {
        String[] names = new String[Course.courses.length];

        for(int i=0; i < names.length; i++) {
            names[i] = Course.courses[i].getCourseName();
        }
        return names;
    }

    public String toString() {return this.courseName; }
}
