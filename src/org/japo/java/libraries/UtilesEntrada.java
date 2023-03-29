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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alumnoT
 */
public final class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final int leerEntero(String msg, String msgErr) {

        int numero = 0;
        boolean resultado = false;

        do {
            try {
                System.out.print(msg);
                numero = SCN.nextInt();
                resultado = true;

            } catch (Exception e) {
                System.out.println("---");
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!resultado);
        return numero;

    }

    public static final int leerEnteroRango(String msg, String msgErr, int min, int max) {
        int numero;
        boolean rangoOk;

        do {
            numero = leerEntero(msg, msgErr);
            rangoOk = numero >= min && numero <= max;
            if (!rangoOk) {
                System.out.println("ERROR: Numero fuera de rango");
                System.out.println("---");
            }
        } while (!rangoOk);
        return numero;
    }

    public static final char leerCaracter(String msg) {

        char chr = 0;
        boolean resultado = false;

        do {
            try {
                System.out.print(msg);
                chr = SCN.nextLine().charAt(0);
                resultado = true;
                System.out.println("---");
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("Error de entrada");
                System.out.println("---");
            }
        } while (!resultado);

        return chr;
    }

    public static final String traducirMes(String msg) {

        boolean resultado = false;
        String texto = "";

        do {
            try {
                System.out.print(msg);
                texto = SCN.nextLine();

            } catch (Exception e) {
                System.out.println("---");
                System.out.println("Error de entrada");
                System.out.println("---");
            }

        } while (!resultado);

        return texto;
    }

    public static final double leerReal(String msg) {

        boolean resultado = false;
        double real = 0;

        do {
            try {
                System.out.print(msg);
                real = SCN.nextDouble();

            } catch (Exception e) {
                System.out.println("---");
                System.out.println("Error de entrada");
                System.out.println("---");
            }

        } while (!resultado);
        return real;
    }

    public static final double rangoReal(String msg, String msgErr, int max, int min) {

        boolean resultado = false;
        double real = 0;

       

        do {
            try {
                real = leerEntero(msg, msgErr);
                resultado = real < max && real > min;
            } catch (Exception e) {
                System.out.println("---");
                System.out.println("Error de entrada");
                System.out.println("---");
            }

        } while (!resultado);
        return real;
    }
}
