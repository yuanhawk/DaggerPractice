package com.example.dagger.car;

public class Wheels {

    //We don't own this class so we can't annotate it with @Inject
    private Rims rims;
    private Tyres tyres;

//    @Inject
//    public Wheels() {
//
//    }

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
