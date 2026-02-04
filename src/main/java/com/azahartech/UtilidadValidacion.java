package com.azahartech;

public class UtilidadValidacion {

    public static boolean esEmailValido(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        // Lógica simple: debe contener '@' y después un '.'
        int indiceArroba = email.indexOf('@');
        int indicePunto = email.lastIndexOf('.');
        return indiceArroba > 0 && indicePunto > indiceArroba;
    }
}
