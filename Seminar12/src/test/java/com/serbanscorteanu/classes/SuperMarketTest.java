package com.serbanscorteanu.classes;

import com.serbanscorteanu.exceptions.NoMarketTypeException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class SuperMarketTest {

    static Market m1;
    static Market m2;
    static Market m3;
    static Market m4;
    static Market m5;

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Setup Before");
        m1 = new Market("Sephora", 20, TypeMarketEnum.BEAUTY);
        m2 = new Market("Douglas", 29, TypeMarketEnum.BEAUTY);
        m3 = new Market("H&M", 40, TypeMarketEnum.DRESS);
        m4 = new Market("Mobexpert", 20, TypeMarketEnum.DECORATION);
        m5 = new Market("Zara", 20, TypeMarketEnum.DRESS);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("TearDown");
    }

//    @org.junit.Test
//    public void getBiggestMarketByArea() {
//    }

    @org.junit.Test
    public void testRight() {
        System.out.println("Test RIGHT");
        List<Market> markets = new ArrayList<>();
        markets.add(m1);
        markets.add(m2);
        markets.add(m3);
        markets.add(m4);
        markets.add(m5);
        SuperMarket sm = new SuperMarket("Electroputere", markets);
        try {
            String result = sm.getBiggestMarketByArea(TypeMarketEnum.BEAUTY);
            assertEquals("Douglas", result);
        } catch (NoMarketTypeException e) {
            e.printStackTrace();
            fail("Exception not expected");
        }
    }

    @org.junit.Test
    public void testBoundary() {
        System.out.println("Test Boundary");
        List<Market> markets = new ArrayList<>();
        markets.add(m1);
        SuperMarket sm = new SuperMarket("Electroputere", markets);
        try {
            String result = sm.getBiggestMarketByArea(TypeMarketEnum.BEAUTY);
            assertEquals("Sephora", result);
        } catch (NoMarketTypeException e) {
            e.printStackTrace();
            fail("No exception expected. Inside the boundaries of the interval");
        }
    }

    @org.junit.Test(expected = NoMarketTypeException.class)
    public void testException() throws NoMarketTypeException {
        SuperMarket sm = new SuperMarket("Electroputere", null);
        String result = sm.getBiggestMarketByArea(TypeMarketEnum.BEAUTY);

    }

    @org.junit.Test
    public void testPerformance() throws NoMarketTypeException {
        List<Market> markets = new ArrayList<>();
        markets.add(m1);
        markets.add(m2);
        markets.add(m3);
        markets.add(m4);
        markets.add(m5);
        SuperMarket sm = new SuperMarket("Electroputere", markets);

        double startTime = System.currentTimeMillis();
        sm.getBiggestMarketByArea(TypeMarketEnum.BEAUTY);
        double stopTime = System.currentTimeMillis();
        // assertEquals("Test takes less than 0.5ms", 0.5, stopTime - startTime);
        assertTrue("Test takes less than 0.5ms", stopTime - startTime < 10);
    }

    public String getLargestMarket(TypeMarketEnum type, List<Market> markets) {
        Optional<Market> m = markets.stream()
                .filter(mark -> mark.getType() == type).max(Comparator.comparing(Market::getArea));
        return m.map(Market::getName).orElse(null);
    }

    @org.junit.Test
    public void testCrossCheck() throws NoMarketTypeException {
        List<Market> markets = new ArrayList<>();
        markets.add(m1);
        markets.add(m2);
        markets.add(m3);
        markets.add(m4);
        markets.add(m5);
        SuperMarket sm = new SuperMarket("Electroputere", markets);

        String actual = sm.getBiggestMarketByArea(TypeMarketEnum.BEAUTY);
        String expected = getLargestMarket(TypeMarketEnum.BEAUTY, markets);
        assertEquals("crosscheck", expected, actual);
    }

    @org.junit.Test
    public void testInverse() {

    }

}