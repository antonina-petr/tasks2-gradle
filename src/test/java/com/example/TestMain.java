package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Random;

public class TestMain {

    @BeforeEach
    void setUp() {
        System.out.println("========================Test method start");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test method end\n" + "\n" + "========================");
    }

    @Test
    void testIsEven() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean result = TestClass.isEven(number);

        if (result == (number % 2 == 0)) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }


    @Test
    void testCheckAccess() {
        Random rnd = new Random();
        int age = rnd.nextInt(100);
        String result = TestClass.checkAccess(age);

        if (result != null ) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @Test
    void testGetGrade() {
        Random rnd = new Random();
        int score = rnd.nextInt(100);
        String result = TestClass.getGrade(score);

        if (result != null ) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }


    @Test
    void testIsPositive() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean result = TestClass.isPositive(number);

        if (result == (number >= 0)) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(2)
    void testIsEvenRepeat() {
        Random rnd = new Random();
        int number = rnd.nextInt(100) + 1;
        boolean result = TestClass.isEven(number);

        if (result == (number % 2 == 0)) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(20)
    void testCheckAccessRepeat() {
        Random rnd = new Random();
        int age = rnd.nextInt(100);

        String result = TestClass.checkAccess(age);

        if (result != null) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(3)
    void testGetGradeRepeat() {
        Random rnd = new Random();
        int score = rnd.nextInt(100);
        String result = TestClass.getGrade(score);

        if (result != null ) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @RepeatedTest(4)
    void testIsPositiveRepeat() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean result = TestClass.isPositive(number);

        if (result == (number >= 0)) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    public void testIsEvenParametr(int number) {
        boolean result = TestClass.isEven(number);

        if (result == (number % 2 == 0)) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    void testCheckAccessParametr(int age) {

        String result = TestClass.checkAccess(age);

        if (result != null) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    void testGetGradeParametr(int score) {
        String result = TestClass.getGrade(score);

        if (result != null) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }


    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    void testIsPositiveParametr(int number) {
        boolean result = TestClass.isPositive(number);

        if (result == (number >= 0)) {
            System.out.println("TEST PASSED");
        }
        else {
            System.out.println("TEST FAILED");
        }
    }


}
