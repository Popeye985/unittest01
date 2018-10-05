package com.company.junit;

import java.time.LocalDate;
import java.time.Period;

public class Persoon {
    private String naam;
    private LocalDate geboorteDatum;

    public Persoon(String naam, LocalDate geboorteDatum) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }
    protected int getLeeftijd(LocalDate huidigeDatum){
        Period periode = Period.between(geboorteDatum, huidigeDatum);
        return periode.getYears();
    }
    public int getLeeftijd(){
        return getLeeftijd(LocalDate.now());
    }
}
