package com.springcore.ci;

import java.util.List;

public class Person {
    String name;
    int personid;

      Certi certi;

      private List<Integer> list;

    public Person(int personid,String name ,Certi certi,List<Integer> list)
    {
        this.name=name;
        this.personid=personid;
        this.certi=certi;
        this.list=list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                ", certi=" + certi.name+
                ", list=" + list +
                '}';
    }
}
