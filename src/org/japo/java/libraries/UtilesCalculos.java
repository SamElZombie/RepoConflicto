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

/**
 *
 * @author alumnoT
 */
public final class UtilesCalculos {

    // Lotería Primitiva
    public static final int PRIM_MIN = 1;
    public static final int PRIM_MAX = 49;
// Tipos IVA
    public static final int IVA01 = 4;
    public static final int IVA10 = 10;
    public static final int IVA21 = 21;

    private UtilesCalculos() {

    }

    public static final void TestUtilesCalculo(int n) {
        boolean paridad = UtilesCalculos.validarParidad(n);
        System.out.printf("Paridad .........: %b%n", paridad);
        boolean positivo = UtilesCalculos.validarPositivo(n);
        System.out.printf("Positividad .....: %b%n", positivo);
        boolean primitiva = UtilesCalculos.validarNumeroPrimitiva(n);
        System.out.printf("Primitiva .......: %b%n", primitiva);
        boolean iva = UtilesCalculos.validarTipoIVA(n);
        System.out.printf("Tipo IVA .........: %b%n", iva);
        int cuadrado = UtilesCalculos.calcularCuadrado(n);
        System.out.printf("Cuadrado .........: %d%n", cuadrado);
    }

    // Validar paridad
    public static boolean validarParidad(int n) {
        return n % 2 == 0;
    }
    // Validar positivo

    public static boolean validarPositivo(int n) {
        return n >= 0;
    }
    // Validar primitiva - Entre 1 y 49

    public static boolean validarNumeroPrimitiva(int n) {
        return n >= PRIM_MIN && n <= PRIM_MAX;
    }
    // Validar IVA

    public static boolean validarTipoIVA(int iva) {
        return iva == IVA01 || iva == IVA10 || iva == IVA21;
    }

    public static int calcularCuadrado(int n) {
        return n * n;
    }
}
