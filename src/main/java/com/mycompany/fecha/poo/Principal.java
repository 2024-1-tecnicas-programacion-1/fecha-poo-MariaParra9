package com.mycompany.fecha.poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el día, mes y año
        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año:");
        int ano = scanner.nextInt();

        // Crear el objeto Fecha
        Fecha fecha = new Fecha(dia, mes, ano);

        // Validar la fecha
        if (fecha.validarFecha()) {
            System.out.println("La fecha es válida.");
            // Imprimir la fecha en formato largo
            System.out.println("Fecha en formato largo: " + fecha.fechaLarga());
        } else {
            System.out.println("La fecha es inválida.");
        }
    }
}
