package fr.digi.m052024.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Before
    public void setUp() {
        System.out.println("Avant chaque méthode de test");
    }

    @After
    public void tearDown() {
        System.out.println("Après chaque méthode de test");
    }

    @Test
    public void testAdditionAPosBPos() {

        //A -> Arrangement
        Operation operation = new Operation();
        int a = 2;
        int b = 3;

        //A -> Acting
        int resultat = operation.addition(a, b);

        //A -> Asserting
        assertEquals("Bravo, test réussi !", 5, resultat);
    }

    @Test
    public void testAdditionAPosBNeg() {

        //A -> Arrangement
        Operation operation = new Operation();
        int a = 2;
        int b = -3;

        //A -> Acting
        int resultat = operation.addition(a, b);

        //A -> Asserting
        assertEquals("Bravo, test réussi !", -1, resultat);
    }

    @Test
    public void testAdditionAZBZ() {

        //A -> Arrangement
        Operation operation = new Operation();
        int a = 0;
        int b = 0;

        //A -> Acting
        int resultat = operation.addition(a, b);

        //A -> Asserting
        assertEquals("Bravo, test réussi !", 0, resultat);
    }

    @Test
    public void testDivisionAPosBPos() {

        //A -> Arrangement
        Operation operation = new Operation();
        double a = 3d;
        double b = 2d;
        double epsilon = 0.000001d;

        //A -> Acting
        double resultat = operation.division(a, b);

        //A -> Asserting
        assertEquals("Test réussi", 1.5d, resultat, epsilon);
    }
}