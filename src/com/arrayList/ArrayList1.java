package com.arrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Person> users = new ArrayList<>();
        users.add(new Person("Sharath", 25));
        users.add(new Person("Santosh", 34));
        users.add(new Person("Anjaneyulu", 29));       
        users.set(0, new Person("SharathKumar", 26));
        users.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
        });
    }
}
