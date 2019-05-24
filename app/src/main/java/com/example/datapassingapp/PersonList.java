package com.example.datapassingapp;
import java.util.List;
import java.util.ArrayList;

public class PersonList {


    List displayPersondetails() {

        List<Person> list = new ArrayList<Person>();


        Person p1 = new Person("101", "John", "99999999");
        Person p2 = new Person("102", "tom", "888888888");
        Person p3 = new Person("103", "Monk", "777777777");
        Person p4 = new Person("104", "ray", "66666666");
        Person p5 = new Person("105", "tim", "555555555");

        list.add(p1);
        list.add(p2);

        list.add(p3);

        list.add(p4);

        list.add(p5);

        return list;


    }
}
