package com.learning.coby.complejos;

public class Complejo {
    //declaración de atributos
    private double real, imaginario;
    //declaración de constructor
    public Complejo(double real, double imaginario) {
        this.real= real;
        this.imaginario= imaginario;
    }
    //declaración de métodos
    /** Transcribe el complejo a String.
     * @returnun string con la parte entera y la imaginaria
     */
    public String toString() {
        return real + "+"+ imaginario + "i";
    }
    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */
    public void suma(Complejo v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
}
