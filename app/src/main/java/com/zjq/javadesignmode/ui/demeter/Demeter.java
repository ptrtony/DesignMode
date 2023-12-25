package com.zjq.javadesignmode.ui.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmploy(new CollegeManager());
    }
}


class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i< 10; i++) {
            CollegeEmployee employ = new CollegeEmployee();
            employ.setId("学院员工Id=" + i);
            list.add(employ);
        }
        return list;
    }

    public void printAllEmploy() {
        List<CollegeEmployee> employees = this.getAllEmployee();
        for (CollegeEmployee employee: employees) {
            System.out.println(employee.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id=" + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmploy(CollegeManager sub) {
        //获取到学院员工
        sub.printAllEmploy();
        List<Employee> allEmployee = this.getAllEmployee();
        for (Employee employee: allEmployee) {
            System.out.println(employee.getId());
        }
    }
}


