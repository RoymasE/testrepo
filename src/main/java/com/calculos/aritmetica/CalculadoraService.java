package com.calculos.aritmetica;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    /**
     * Calcula el área de un rectángulo.
     * 
     * @param base   La base del rectángulo.
     * @param altura La altura del rectángulo.
     * @return El área calculada.
     */
    public double calcularAreaRectangulo(double base, double altura) {
        // La fórmula del área de un rectángulo es base * altura
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("La base y la altura no pueden ser negativas.");
        }
        return base * altura;
    }

    /**
     * Calcula la hipotenusa de un triángulo rectángulo usando el Teorema de
     * Pitágoras.
     * 
     * @param catetoA La longitud del primer cateto.
     * @param catetoB La longitud del segundo cateto.
     * @return La longitud de la hipotenusa.
     */
    public double calcularHipotenusa(double catetoA, double catetoB) {
        // La fórmula del Teorema de Pitágoras es a^2 + b^2 = c^2
        if (catetoA < 0 || catetoB < 0) {
            throw new IllegalArgumentException("Los catetos no pueden ser negativos.");
        }
        return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
    }
}
