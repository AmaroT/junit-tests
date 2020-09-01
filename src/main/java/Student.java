import java.util.ArrayList;


public class Student {
    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    //returns the student's id

    //returns the student's name

    //adds the given grade to the grades list

    //returns the list of grades

    //returns the average of the students grades

    public static long getId() {
        return id;
    }

    public static String getName() {
        return name;
    }
    public void addGrade(int grade){

    }

    public double getGradeAverage(){
        return 0;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void setId(long id) {
        Student.id = id;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static void setGrades(ArrayList<Integer> grades) {
        Student.grades = grades;
    }

    public static void updateGrade(){

    }
    public static void deleteGrade(){

    }



}
