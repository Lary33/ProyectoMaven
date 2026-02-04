package com.azahartech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilidadValidacionTest {

    @Test
    void esEmailValido_DebeDevolverTrue_ParaUnEmailCorrecto() {
        // Arrange: Preparar el escenario
        String emailValido = "usuario@dominio.com";
        // Act: Ejecutar el método a probar
        boolean resultado = UtilidadValidacion.esEmailValido(emailValido);
        // Assert: Verificar el resultado
        assertTrue(resultado, "Un email válido fue marcado como inválido");
    }

    @Test
    void esEmailValido_DebeDevolverFalse_ParaUnEmailSinArroba() {
        // Arrange
        String emailInvalido = "usuariodominio.com";
        // Act
        boolean resultado = UtilidadValidacion.esEmailValido (emailInvalido);
        // Assert
        assertFalse(resultado, "Un email sin '@' fue aceptado como válido");
    }

    @Test
    void esEmailValido_DebeDevolverFalse_ParaUnEmailSinDominio() {
        // Arrange
        String emailInvalido = "usuario@dominio";
        // Act
        boolean resultado = UtilidadValidacion.esEmailValido (emailInvalido);
        // Assert
        assertFalse(resultado, "Un email sin punto fue aceptado");
    }

    @Test
    void esEmailValido_DebeDevolverFalse_ParaUnInputNuloOVacio() {
        assertFalse(UtilidadValidacion.esEmailValido(null), "El valor null debería ser inválido");

        assertFalse(UtilidadValidacion.esEmailValido(""), "Un string vacío debería ser inválido");
    }
}