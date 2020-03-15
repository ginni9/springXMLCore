package org.springXMLCore.beans;

public class Employee {

    private String name;
    private Integer age;
    private Double salary;
    private Department department;



    public Employee(String name, Integer age, Double salary, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department=department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
