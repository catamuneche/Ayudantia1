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
public class Circulo {
    //atributos
    int radio;
    double pi = 3.14;
    
    //constructor
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    //métodos
    public void area(){
        double area = pi * radio * radio;
        System.out.println("El area de circulo es: " + area);
    }
    
    public void perimetro(){
        double perimetro = pi * radio * 2;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
    
    //get y set
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
