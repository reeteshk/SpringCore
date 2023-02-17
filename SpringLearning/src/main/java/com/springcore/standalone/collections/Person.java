package com.springcore.standalone.collections;
import java.util.*;
public class Person {

    private List<String> friends;
    private Map<String,Integer> fee;

    public Map<String, Integer> getFee() {
        return fee;
    }

    public void setFee(Map<String, Integer> fee) {
        this.fee = fee;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person(List<String> friends, Map<String, Integer> fee) {
        this.friends = friends;
        this.fee = fee;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", fee=" + fee +
                '}';
    }
}
