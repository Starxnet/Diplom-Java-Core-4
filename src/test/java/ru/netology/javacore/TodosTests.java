package ru.netology.javacore;

import org.junit.jupiter.api.*;

public class TodosTests {

    private Todos todos;

    @BeforeAll
    public static void startedAllTests() {
        System.out.println("Testing has started");
    }

    @AfterAll
    public static void finishAllTest() {
        System.out.println("Testing completed");
    }

    @BeforeEach
    void createTodos() {
        todos = new Todos();
        todos.addTask("домашка");
        todos.addTask("погулять");
    }

    @Test
    void testGetAllTaskMethod1() {
        String result = todos.getAllTasks();
        String expected = "домашка погулять";
        Assertions.assertEquals(result, expected);
    }

    @Test
    void testGetAllTaskMethod2() {
        String result = todos.getAllTasks();
        String expected = "погулять домашка";
        Assertions.assertNotEquals(result, expected);
    }

    @Test
    void testGetAllTaskMethod3() {
        String result = todos.getAllTasks();
        String expected = "домашка, погулять";
        Assertions.assertNotEquals(result, expected);
    }
}