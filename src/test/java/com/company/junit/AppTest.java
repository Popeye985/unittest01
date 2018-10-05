package com.company.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAlVerjaard() {
        LocalDate vandaag = LocalDate.of(2016, Month.OCTOBER, 1);
        LocalDate geboorteDatum = LocalDate.of(2000, Month.JANUARY, 1);
        Persoon p = new Persoon("p", geboorteDatum);
        int leeftijd = p.getLeeftijd(vandaag);
        int oracle = 16;
        Assert.assertEquals(oracle, leeftijd);
    }

    @Test
    public void testNogNietVerjaard() {
        LocalDate vandaag = LocalDate.of(2016, Month.OCTOBER, 1);
        LocalDate geboorteDatum = LocalDate.of(2000, Month.NOVEMBER, 1);
        Persoon p = new Persoon("p", geboorteDatum);
        int leeftijd = p.getLeeftijd(vandaag);
        int oracle = 15;
        Assert.assertEquals(oracle, leeftijd);
    }
}