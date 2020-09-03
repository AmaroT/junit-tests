import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CohortTest {
    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before

    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student ama = new Student(1, "Amaro Terrazas");
        ama.addGrade(100);

        Student tom = new Student(2, "Tom Hanks");
        tom.addGrade(0);
        tom.addGrade(100);
        tom.addGrade(100);
        tom.addGrade(100);

        cohortWithOne.addStudent(ama);
        cohortWithMany.addStudent(ama);
        cohortWithMany.addStudent(tom);
    }

    // A Cohort  instance con add a Student to the List of students.

    @Test
    public void testAddStudentWorks(){
        cohortWithMany.addStudent(new Student(3,"Tim Allen"));
        //We can test if addStudent worked by getting a specific student's name
        assertEquals("Tim Allen", cohortWithMany.getStudents().get(2).getName());
        cohortWithMany.addStudent(new Student(4, "Denziel Washington"));
        //Or we can test if addStudent worked by checking the size of the list
        assertEquals(4, cohortWithMany.getStudents().size());
    }

    //A Cohort instance can get the current List of Students.
    @Test
    public void testIfGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());

        assertEquals(1, cohortWithMany.getStudents().get(0).getId());
        assertEquals(2, cohortWithMany.getStudents().get(1).getId());
    }

    //A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(100.0, cohortWithOne.getCohortAverage(),0);
        assertEquals(87.5, cohortWithMany.getCohortAverage(), 0);
    }
}
