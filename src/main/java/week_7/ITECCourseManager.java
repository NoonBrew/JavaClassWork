package week_7;

import java.util.ArrayList;


/**
 * Not an object oriented program.
 */
public class ITECCourseManager {

    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance",
                1310, 20);

        //Add some students.   TODO check that we have not exceeded the max number for the class
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudents("Carl");
        maintenanceCourse.removeStudents("Martha");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communications",1425,
                30);

        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareDevelopmentProjects = new ITECCourse("Software Development Projects",
                2903, 24);

        softwareDevelopmentProjects.addStudent("Gus");
        softwareDevelopmentProjects.addStudent("Harry");
        softwareDevelopmentProjects.addStudent("Izzy");

        softwareDevelopmentProjects.writeCourseInfo();

        int totalEnrolled = softwareDevelopmentProjects.getNumberOfStudents();
        System.out.println("The " + softwareDevelopmentProjects.getName() + " class has "
                + totalEnrolled + " students");
        System.out.println("ITEC " + softwareDevelopmentProjects.getCode() + " "
                + softwareDevelopmentProjects.getName());

        softwareDevelopmentProjects.setMaxStudents(-30);
        softwareDevelopmentProjects.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Made up Course",
                1234, 3);

        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Lisa");
        smallCourse.addStudent("Miran");
        smallCourse.removeStudents("Kirby");
        smallCourse.addStudent("Kira");

        smallCourse.writeCourseInfo();
    }


}





