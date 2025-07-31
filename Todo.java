package com.lisus;

import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

public class Todo {
    String name;
    String status;
    String id;
    String date;

    public Todo(String name, String status, String date) {
        this.name = name;
        this.status = status;
        this.id = UUID.randomUUID().toString();
        this.date = date;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nstatus: " + this.status + "\nid: " + this.id + "\ndate: " + this.date;
    }

    public Map<String, String> toMap() {
        Map<String, String> allTodos = new HashMap<>();
        allTodos.put("Name", name);
        allTodos.put("Status", status);
        allTodos.put("ID", id);
        allTodos.put("Date", date);
        return allTodos;

    }


}
