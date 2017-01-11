package HomeWork3.task3_3;

import java.util.Date;

/**
 * Created by ExAngelO on 11.01.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(new Date(), "Pasha");
        Course course2 = new Course(new Date(), "Dmitriy");
        Course course3 = new Course(60, "Viktoria", "Gurbik");
        Course course4 = new Course(120, "Masha", "Kolya");
        Course course5 = new Course(180, "Anton", "Evgen");

        Course[] courses = {course1, course2, course3, course4, course5};

        Student student1 = new Student("Vasiliy", "Petrov", 10);
        Student student2 = new Student("Petrov", courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Sasha", "Dmitrenko", 15);
        CollegeStudent collegeStudent2 = new CollegeStudent("Palu4", courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Dima", "Perehov", 3, "KNEY", 18, 432164132);

        SpecialStudent specialStudent1 = new SpecialStudent("Olga", "Matvienko", 15);
        SpecialStudent specialStudent2 = new SpecialStudent("Zinchenko", courses);
        SpecialStudent specialStudent3 = new SpecialStudent("July", "April", 4, "NTY", 33, 321343, 566324);

    }


}