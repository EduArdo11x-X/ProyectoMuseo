/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
class Validaciones {
      public boolean validarCedula(String cadena) {
        cadena = cadena.trim();
        boolean ban = false;
        if (cadena.matches("[0-9]{10}")) {
            ban = true;
        }
        return ban;
    }

    public boolean validarNomApe(String cadena) {
        cadena = cadena.trim();
        boolean ban = false;
        if (cadena.matches("[[A-Za-z]\\s]*{3,30}")) {
            ban = true;
        }
        return ban;
    }
     public boolean validarFecha(String cadena) {
        cadena = cadena.trim();
        boolean ban = false;
        if (cadena.matches("[[A-Za-z]\\s]*{3,30},[1-31]{2}")) {
            ban = true;
        }
        return ban;
    }

    public boolean validarid(String cadena) {
        boolean validar = cadena.matches("[[A-Z]{2}]*+\\-[[\\d]{4}]*");
        System.out.println(validar);
        return validar;
    }


    public boolean validarCorreo(String mail) {
        boolean val = false;
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{1,30})$");

        // El email a validar
        Matcher mather = pattern.matcher(mail);
        val = mather.find();

        return val;
    }

    public boolean validarFechaNacim(int diaI, int mesI, int anioI) {

        boolean validarFecha = false;
        Date dt = new Date();
        int year = dt.getYear();
        int anioActual = year + 1900;

        System.out.println(diaI + "/" + mesI + "/" + anioI);

        if (mesI >= 1 || mesI <= 12) {

            if (mesI == 2) {

                if ((anioI % 4 == 0) && (anioI % 100 != 0)) {
                    System.out.println("Es biciesto");
                    if (diaI >= 1 && diaI <= 29) {

                        validarFecha = true;
                    }
                } else {
                    if (diaI >= 1 && diaI <= 28) {
                        System.out.println("NO Es biciesto");
                        validarFecha = true;
                    }
                }
            } else {
                if (mesI == 1 || mesI == 3 || mesI == 5 || mesI == 7 || mesI == 8 || mesI == 10 || mesI == 12) {
                    if (diaI >= 1 && diaI <= 31) {

                        validarFecha = true;
                    }
                } else {
                    if (mesI == 4 || mesI == 6 || mesI == 9 || mesI == 11) {
                        if (diaI >= 1 && diaI <= 30) {
                            validarFecha = true;

                        }
                    }
                }
            }
        }

        return validarFecha;
    }

    public boolean validarInt(String numero) {
//        int num = 0;
        boolean validar = false;
        numero = numero.replaceAll("\\s", "");
        if (!numero.equalsIgnoreCase("")) {
            if (numero.matches("[0-9]{1,}")) {
                validar=true;
//                num = Integer.parseInt(numero);
//                if (num < 0) {
//                    num = 0;
//                }
            }
        }
        return validar;
    }
    
    
    
    
}
