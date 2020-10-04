package com.antaladrien;

public class MilleniumFalcon implements Urhajo, Hiperhajtomu {
    private double tapasztalat;

    public MilleniumFalcon() {
        this.tapasztalat = 100;
    }

    @Override
    public void hiperUgras() {
        this.tapasztalat += 500;
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        return urhajo.milyenGyors() < this.milyenGyors() ? true : false;
    }

    @Override
    public double milyenGyors() {
        return tapasztalat * 2;
    }

    @Override
    public String toString() {
        return "MilleniumFalcon tapasztalat: " + tapasztalat;
    }
}
