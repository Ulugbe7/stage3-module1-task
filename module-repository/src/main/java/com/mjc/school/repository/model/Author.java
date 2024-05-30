package com.mjc.school.repository.model;

public class Author {
    private static Long autoId = 1L;

    private final Long id;
    private String name;

    public Author(String name) {
        this.id = autoId++;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
