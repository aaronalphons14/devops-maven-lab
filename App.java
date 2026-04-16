package com.example;

public class StudentResult {

    public int calculateTotal(int s1, int s2, int s3, int s4, int s5) {
        return s1 + s2 + s3 + s4 + s5;
    }

    public double calculateAverage(int total) {
        return total / 5.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90)
            return "A+";
        else if (average >= 75)
            return "A";
        else if (average >= 60)
            return "B";
        else if (average >= 50)
            return "C";
        else
            return "Fail";
    }
}
