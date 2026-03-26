package com.enock.springbootdemo;

import java.util.Objects;

public class SoftwareEngineer {
    private  Integer id;
    private String name;
    private String testStack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id,  String name, String testStack) {
        this.name = name;
        this.testStack = testStack;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTestStack() {
        return testStack;
    }

    public void setTestStack(String testStack) {
        this.testStack = testStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(testStack, that.testStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, testStack);
    }
}