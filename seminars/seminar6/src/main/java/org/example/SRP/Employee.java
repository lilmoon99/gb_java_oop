package org.example.SRP;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private String dol;

    public Employee(String name, String surname, int age, String dol) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dol = dol;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dol='" + dol + '\'' +
                '}';
    }
}
