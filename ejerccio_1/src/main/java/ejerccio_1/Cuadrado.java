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
public class Cuadrado {
    //Atributos
    int lado;
        
    //Constructor
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    //Métodos
    public void perimetro(){
        int perimetro = 4 * lado;
        System.out.println("el perimetro del rectangulo es: " + perimetro);
    }
    
    public void area(){
        int area = lado * lado;
        System.out.println("el area del rectangulo es : " + area);
    }
    
    //Getters&Setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
