/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerccio_1;

/**
 *
 * @author Cata
 */
public class Triangulo {
    //Atributos
    int ladoA; //base
    int ladoB;
    int ladoC;
    int altura;
    
    //Constructor

    public Triangulo(int ladoA, int ladoB, int ladoC, int altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.altura = altura;
    }

    //Metodos
    public void perimetro(){
        int perimetro = ladoA + ladoB + ladoC;
        System.out.println("el perimetro de es: " + perimetro);
    }
    
    public void area(){
        int area = ladoA * altura / 2;
        System.out.println("el area del triangulo es : " + area);
    }
    
    //Getters y Setters
    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
