package com.zheng;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        //printing all the employees in the current list
        employeeList.forEach(employee -> System.out.println(employee));
        //printing the employee at index position 1
        System.out.println(employeeList.get(1));
        //checking if the list of employees are empty
        System.out.println(employeeList.isEmpty());

        //replacing a current employee with a new one
        employeeList.set(1, new Employee("John", "Adams", 4568));
        employeeList.forEach(employee -> System.out.println(employee));

        //displays the total size of the employee list
        System.out.println(employeeList.size());

        //using add defaults to adding at the end of the list unless we specify index position
        employeeList.add(3, new Employee("John1", "Doe1", 4567));
        employeeList.add( new Employee("John2", "Doe2", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("===========================================================");

        //now in an Employee list
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee: employeeArray) {
            System.out.println(employee);
        }

        //will require an equals method
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John1", "Doe1", 4567)));
    }
}
