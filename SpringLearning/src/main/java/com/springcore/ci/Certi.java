package com.springcore.ci;

public class Certi {
     String name;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' ;
    }

    public Certi(String name) {
        this.name = name;
    }
}
