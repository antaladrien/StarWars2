package com.antaladrien;

public class XWing extends LazadoGep implements Hiperhajtomu {

    public XWing() {
        super(150, true);
    }

    @Override
    public void hiperUgras() {
        this.sebesseg += Math.random() * 100;
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return (this.meghibasodhatE && sebesseg < 10000) ? true : false;
    }

    @Override
    public String toString() {
        return "XWing " + super.toString();
    }
}
