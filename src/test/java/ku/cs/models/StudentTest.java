package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore(){
        Student s1 = new Student("61xxxxxx", "John");
        assertEquals(0,s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5,s1.getScore());
        s1.addScore(10);
        assertEquals(50.5,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1 = new Student("61xxxxxx", "john");
        s1.addScore(60.8);
        assertEquals("C",s1.grade());
    }

    @Test
    void testChangeName(){
        Student s1 = new Student("61xxxxxx", "John");
        s1.changeName("John");
        assertEquals("John",s1.getName());
    }

    @Test
    void testIsId(){
        Student s1 = new Student("61xxxxxx", "John");
        assertTrue(s1.isId("61xxxxxx"));
        assertFalse(s1.isId("62yyyyyy"));
    }

}