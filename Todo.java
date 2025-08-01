package com.lisus;

import java.time.LocalDate;
import java.util.UUID;

public class Todo {
    static String name;
    String status;
    UUID id;
    static LocalDate date;

    public Todo(String name, String status, LocalDate date) {
        this.name = name;
        this.status = status;
        this.id = UUID.randomUUID();
        this.date = date;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\nstatus: " + this.status + "\nid: " + this.id + "\ndate: " + this.date.toString();
    }

}
