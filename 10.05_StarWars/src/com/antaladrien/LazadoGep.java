package com.antaladrien;

public abstract class LazadoGep implements Urhajo {
    protected double sebesseg;
    protected boolean meghibasodhatE;

    public LazadoGep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }

    public abstract boolean elkapjaAVonosugar();

    public boolean legyorsuljaE(Urhajo urhajo) {
        if (urhajo instanceof MilleniumFalcon) {
            return (((MilleniumFalcon) urhajo).milyenGyors() < 2 * this.sebesseg) ? true : false;
        } else {
            return (((LazadoGep) urhajo).isMeghibasodhatE() && urhajo.milyenGyors() < this.sebesseg) ? true : false;
        }
    }

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }

    public double milyenGyors() {
        return this.sebesseg;
    }

    @Override
    public String toString() {
        return "LazadoGep sebesség: " + sebesseg + ", meghibasodhat-e? " + meghibasodhatE;
    }
}
