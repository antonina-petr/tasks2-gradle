package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

public class TestMainTask3 {

    @BeforeEach
    void setUp() {
        System.out.println("========================Test method start");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test method end\n" + "\n" + "========================");
    }

    @Test
    @Tag("testStart")
    void testIsEven() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean result = TestClass.isEven(number);
        Assertions.assertTrue(result, "результат" + "\n" + result);
    }


    @Test
    void testCheckAccess() {
        Random rnd = new Random();
        int age = rnd.nextInt(100);
        String expected = "Allowed";
        String actual = TestClass.checkAccess(age);

        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }

    @Test
    void testGetGrade() {
        Random rnd = new Random();
        int score = rnd.nextInt(100);

        String expected = "A";
        String actual = TestClass.getGrade(score);
        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }


    @Test
    void testIsPositive() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean expected = number % 2 == 0;
        boolean actual = TestClass.isPositive(number);
        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }

    @RepeatedTest(10)
    @Tag("testStart")
    void testIsEvenRepeat() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean result = TestClass.isEven(number);
        Assertions.assertTrue(result, "результат" + "\n" + result);
    }

    @RepeatedTest(10)
    void testCheckAccessRepeat() {
        Random rnd = new Random();
        int age = rnd.nextInt(100);
        String expected = "Allowed";
        String actual = TestClass.checkAccess(age);

        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }

    @RepeatedTest(10)
    void testGetGradeRepeat() {
        Random rnd = new Random();
        int score = rnd.nextInt(100);

        String expected = "A";
        String actual = TestClass.getGrade(score);
        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }

    @RepeatedTest(10)
    void testIsPositiveRepeat() {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        boolean expected = number % 2 == 0;
        boolean actual = TestClass.isPositive(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @Tag("testStart")
    @ValueSource(ints = {10, 20, 30, 40, 50})
    void testCheckAccessParametr(int age) {

        String expected = "Allowed";
        String actual = TestClass.checkAccess(age);

        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }

    @ValueSource(ints = {10, 20, 30, 40, 50})
    void testGetGradeParametr(int score) {
        String expected = "A";
        String actual = TestClass.getGrade(score);
        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }


    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    void testIsPositiveParametr(int number) {
        boolean expected = number % 2 == 0;
        boolean actual = TestClass.isPositive(number);
        Assertions.assertEquals(expected, actual, "ожидаемый рез-т " + expected + "\n" + "фактический рез-т" + "\n" + actual);
    }
}
