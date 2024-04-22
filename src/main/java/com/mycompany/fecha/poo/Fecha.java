package com.mycompany.fecha.poo;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor de la clase Fecha.
     * 
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param ano El año de la fecha.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Retorna la fecha en formato corto (dd/mm/yyyy).
     * 
     * @return La fecha en formato corto.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String fechaCorta() {
        return dia + "/" + mes + "/" + ano;
    }

    /**
     * Valida si la fecha es correcta.
     * 
     * @return true si la fecha es válida, false si no lo es.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public boolean validarFecha() {
        if (mes < 1 || mes > 12)
            return false;
        if (dia < 1 || dia > diasEnMes(mes))
            return false;
        return true;
    }

    /**
     * Retorna el nombre del mes correspondiente al número de mes.
     * 
     * @return El nombre del mes.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String mesLetra() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes - 1];
    }

    /**
     * Retorna la fecha en formato largo (dd de mes de yyyy).
     * 
     * @return La fecha en formato largo.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String fechaLarga() {
        return dia + " de " + mesLetra() + " de " + ano;
    }

    /**
     * Retorna la cantidad de días en un mes específico.
     * 
     * @param mes El número de mes.
     * @return La cantidad de días en el mes dado.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */
    private int diasEnMes(int mes) {
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasMeses[mes - 1];
    }
}
