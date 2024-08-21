package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void addNewStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("61xxxxxx", "John");
        assertNotNull(studentList.findStudentById("61xxxxxx"));
        assertEquals("John", studentList.findStudentById("61xxxxxx").getName());
    }

    @Test
    void testAddNewStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("61yyyyyy", "Jane", 59);
        Student student = studentList.findStudentById("61yyyyyy");
        assertNotNull(student);
        assertEquals(59, student.getScore());
    }

    @Test
    void findStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("61xxxxxx", "John");
        Student student = studentList.findStudentById("61xxxxxx");
        assertNotNull(student);
        assertEquals("John", student.getName());
        assertNull(studentList.findStudentById("nonexistentId"));
    }

    @Test
    void giveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("61xxxxxx", "Kohn");
        studentList.giveScoreToId("61xxxxxx", 20.5);
        assertEquals(20.5, studentList.findStudentById("61xxxxxx").getScore());
    }

    @Test
    void viewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("61xxxxxx", "John", 85.0);
        assertEquals("A", studentList.viewGradeOfId("61xxxxxx"));
        assertNull(studentList.viewGradeOfId("nonexistentId"));
    }

    @Test
    void getStudents() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("61xxxxxx", "John");
        studentList.addNewStudent("61yyyyyy", "Jane", 75.0);
        ArrayList<Student> students = studentList.getStudents();
        assertEquals(2, students.size());
    }
}