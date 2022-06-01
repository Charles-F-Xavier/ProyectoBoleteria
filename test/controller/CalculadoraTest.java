/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jr972
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    /**
     * Test of getX method, of class Calculadora.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Calculadora.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Calculadora instance = new Calculadora();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Calculadora.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Calculadora.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Calculadora instance = new Calculadora();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        Calculadora instance = new Calculadora();
        instance.setX(2);
        instance.setY(2);
        int expResult = 4;
        int result = instance.Sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
