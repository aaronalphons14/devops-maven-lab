package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentResultTest {

    StudentResult sr = new StudentResult();

    @Test
    void testCalculateTotal() {
        int total = sr.calculateTotal(80, 85, 90, 75, 70);
        assertEquals(400, total);
    }

    @Test
    void testCalculateAverage() {
        double avg = sr.calculateAverage(400);
        assertEquals(80.0, avg);
    }

    @Test
    void testCalculateGradeAPlus() {
        assertEquals("A+", sr.calculateGrade(95));
    }

    @Test
    void testCalculateGradeB() {
        assertEquals("B", sr.calculateGrade(65));
    }

    @Test
    void testCalculateGradeFail() {
        assertEquals("Fail", sr.calculateGrade(40));
    }
}
