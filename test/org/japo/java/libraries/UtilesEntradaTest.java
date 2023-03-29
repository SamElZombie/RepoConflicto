/*
 * Copyright 2022 alumnoT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumnoT
 */
public class UtilesEntradaTest {

    public UtilesEntradaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of leerEntero method, of class UtilesEntrada.
     */
    @Test
    public void testLeerEntero() {
        System.out.println("leerEntero");
        String msg = "";
        String msgErr = "";
        int expResult = 0;
        int result = UtilesEntrada.leerEntero(msg, msgErr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerEnteroRango method, of class UtilesEntrada.
     */
    @Test
    public void testLeerEnteroRango() {
        System.out.println("leerEnteroRango");
        String msg = "";
        String msgErr = "";
        int min = 0;
        int max = 0;
        int expResult = 0;
        int result = UtilesEntrada.leerEnteroRango(msg, msgErr, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerCaracter method, of class UtilesEntrada.
     */
    @Test
    public void testLeerCaracter() {
        System.out.println("leerCaracter");
        String msg = "";
        char expResult = ' ';
        char result = UtilesEntrada.leerCaracter(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of traducirMes method, of class UtilesEntrada.
     */
    @Test
    public void testTraducirMes() {
        System.out.println("traducirMes");
        String msg = "";
        String expResult = "";
        String result = UtilesEntrada.traducirMes(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerReal method, of class UtilesEntrada.
     */
    @Test
    public void testLeerReal() {
        System.out.println("leerReal");
        String msg = "";
        double expResult = 0.0;
        double result = UtilesEntrada.leerReal(msg);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rangoReal method, of class UtilesEntrada.
     */
    @Test
    public void testRangoReal() {
        System.out.println("rangoReal");
        String msg = "";
        String msgErr = "";
        int max = 0;
        int min = 0;
        double expResult = 0.0;
        double result = UtilesEntrada.rangoReal(msg, msgErr, max, min);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
