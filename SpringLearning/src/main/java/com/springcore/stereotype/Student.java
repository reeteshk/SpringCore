package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
@Scope("prototype")
public class Student {
    @Value("Amarthya Patel")
    private String studentName;
    @Value("Robertsganj")
    private String city;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }
    @Value("#{temp}")
    private List<String> address;

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
