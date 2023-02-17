package com.springcore.auto.wire.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

   // @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp(Address address) {
        super();
        this.address = address;
    }

    @Autowired
    @Qualifier("address24")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
        super();
    }
}
