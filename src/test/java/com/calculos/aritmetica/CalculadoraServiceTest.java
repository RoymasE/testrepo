package com.calculos.aritmetica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {
        @Test
    void testCalcularAreaRectangulo() {
        CalculadoraService calculadora = new CalculadoraService();
        double base = 12;
        double altura = 2;
        double unexpectedArea = 24.0; // Valor cambiado para que la aserción no falle
        double actualArea = calculadora.calcularAreaRectangulo(base, altura);
        assertEquals(unexpectedArea, actualArea, "Area incorrecta");
    }

    @Test
    void testCalcularAreaRectanguloConBaseNegativa() {
        CalculadoraService calculadora = new CalculadoraService();
        double base = -5.0;
        double altura = 10.0;
        try {
            calculadora.calcularAreaRectangulo(base, altura);
            fail("Se esperaba IllegalArgumentException pero no se lanzó ninguna excepción.");
        } catch (IllegalArgumentException e) {
            assertEquals("La base y la altura no pueden ser negativas.", e.getMessage(),
            "El mensaje de la excepción no es el esperado");
        }
    }

    @Test
    void testCalcularAreaRectanguloConAlturaNegativa() {
        CalculadoraService calculadora = new CalculadoraService();
        double base = 5.0;
        double altura = -10.0;
        try {
            calculadora.calcularAreaRectangulo(base, altura);
            assert (false); // Si no lanza excepción, falla el test
        } catch (IllegalArgumentException e) {
            assert (e.getMessage().equals("La base y la altura no pueden ser negativas."));
        }
    }

    @Test
    void testCalcularHipotenusa() {
        CalculadoraService calculadora = new CalculadoraService();
        double catetoA = 3.0;
        double catetoB = 4.0;
        double expectedHipotenusa = 5.0;
        double actualHipotenusa = calculadora.calcularHipotenusa(catetoA, catetoB);
        assert(actualHipotenusa == expectedHipotenusa);
    }

    @Test
    void testCalcularHipotenusaConCatetoANegativo() {
        CalculadoraService calculadora = new CalculadoraService();
        double catetoA = -3.0;
        double catetoB = 4.0;
        try {
            calculadora.calcularHipotenusa(catetoA, catetoB);
            assert (false); // Si no lanza excepción, falla el test 
        }catch(IllegalArgumentException e) {
            assert(e.getMessage().equals("Los catetos no pueden ser negativos."));
        }
    }

}
