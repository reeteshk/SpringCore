package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{21+4}")
    private int x;
    @Value("#{21^4}")
    private int y;

    @Value( "#{ T(java.lang.Math).sqrt(25)}")
    private double  z;

    @Value( "#{ T(java.lang.Math).E}")
    private double e;

    @Value( "#{ T(java.lang.Math).PI}")
    private double pi;


    @Value("#{8>3}")
    private boolean isActive;
    public Demo() {
        super();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", pi=" + pi +
                ", isActive=" + isActive +
                '}';
    }

    public double getZ() {
        return z;
    }


    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

}
