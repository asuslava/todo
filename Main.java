package com.lisus;

import java.time.LocalDate;
import java.util.*;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final List<Todo> todoList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("1 - new todo\n2 - all todos\n number - quit");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: createTodo();
                break;
                case 2: showTodos();
                break;
                default:
                    System.out.println("Return to menu");
                    break;
            }

            System.out.println(".");
        }

    }

    public static void createTodo() {
        System.out.println("Write name of the task:");
        String todoName = scanner.nextLine();

        System.out.println("Write status of the task:");
        String todoStatus = scanner.nextLine();

        Todo todo = new Todo(todoName, todoStatus, LocalDate.now());
        todoList.add(todo);
    }

    public static void showTodos() {
        System.out.println(todoList);
        System.out.println("If you want to update - 'U', delete - 'D', quit - 'Q'");
        String choice = scanner.nextLine();

        switch (choice) {
            case "U": updateTodo();
                break;
            case "D": removeTodo();
                break;
            case "Q":
                System.out.println("Returning to menu");
                break;
            default:
                System.out.println("Unknown option");
                break;
        }

        System.out.println(todoList);

    }

    public static void updateTodo() {

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i);
        }

        System.out.println("Write number of the task that you want to update:");
        int todoNumber = scanner.nextInt();
        scanner.nextLine();
        Todo todo = todoList.get(todoNumber);
        System.out.println(todo);

        System.out.println("Write new name:");
        String newTodoName = scanner.nextLine();
        todo.name = newTodoName;

        System.out.println("Write new status:");
        String newTodoStatus = scanner.nextLine();
        todo.status = newTodoStatus;
        System.out.println(todo);

    }

    public static void removeTodo() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i);
        }

        System.out.println("Which todo you want to remove:");
        int numberOfRemoveTodo = scanner.nextInt();
        scanner.nextLine();

        String removedTodo = String.valueOf(todoList.remove(numberOfRemoveTodo));
        System.out.println("Deleted!");
    }

}