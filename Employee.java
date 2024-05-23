package com.spring;

public class Employee {
    private int eid;
    private String name;
    private String desg;
    private int salary;

    public Employee() {
        super();
    }

    public Employee(int eid, String name, String desg, int salary) {
        super();
        this.eid = eid;
        this.name = name;
        this.desg = desg;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
    }
}