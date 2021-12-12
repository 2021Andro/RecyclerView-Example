package com.example.recyclrviewexample.CostumeClasses;

import java.io.Serializable;

public class DemoProduct implements Serializable
{
    private String id, name, age, price;

    public DemoProduct() {
    }

    public DemoProduct(String id, String name, String age, String price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public DemoProduct(String name, String age, String price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DemoProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
