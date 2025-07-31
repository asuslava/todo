package com.lisus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Map<String, String>> todoList = new ArrayList<>();
        LocalDate date = LocalDate.now();

        // Format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedDate = date.format(formatter);

        System.out.println("Write the name of the task:");
        String todoName = scanner.nextLine();

        System.out.println("Write status of your task:");
        String todoStatus = scanner.nextLine();

        Todo todo = new Todo(todoName, todoStatus, formattedDate);
        todoList.add(todo.toMap());
        System.out.println(todoList);

    }

}