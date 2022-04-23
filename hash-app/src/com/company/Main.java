package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hellow Word");
        Person p1 = new Person();
        p1.setId(555);
        p1.setName("Bob");
        System.out.println(p1.hashCode());
        Person p2 = new Person();
        p2.setId(100);
        p2.setName("John");

        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));

        Person p3 = p2;
        System.out.println(p2.equals(p3));
    }
}
class Person {
    private  int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);

    }


}