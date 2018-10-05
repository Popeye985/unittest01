package com.company.junit;

import java.time.LocalDate;
import java.time.Period;


public class Persoon {
    private String voornaam;
    private String achternaam;
    private LocalDate geboorteDatum;

    public Persoon(String voornaam, String achternaam, LocalDate geboorteDatum) {
        this.voornaam = voornaam;
        this.geboorteDatum = geboorteDatum;
        this.achternaam = achternaam;
        if (voornaam == null || voornaam.equals("")) {
            throw new IllegalArgumentException("Voornaam mag niet leeg zijn");
        }
        if (geboorteDatum.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Geboortedatum mag niet in de toekomst liggen");
        }
    }


    public String getVoornaam() {
        return voornaam;
    }
    public String getAchternaam(){
        return achternaam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }
    public int getLeeftijd(LocalDate huidigeDatum){
        Period periode = Period.between(geboorteDatum, huidigeDatum);
        return periode.getYears();
    }
    public int getLeeftijdVerkeerd(LocalDate huidig){
        int leeftijd = huidig.getYear() - geboorteDatum.getYear();
        if (geboorteDatum.getDayOfYear() > huidig.getDayOfYear()) leeftijd--;
        return leeftijd;
    }
    public int getLeeftijd(){
        return getLeeftijd(LocalDate.now());
    }

}
