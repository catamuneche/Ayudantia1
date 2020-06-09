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
public class Rectangulo {
    //atributos
    int ancho;
    int alto;
    
    //constructor
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    //metodos
    public void perimetro(){
        int perimetro = ancho + ancho + alto + alto;
        System.out.println("el perimetro del rectangulo es: " + perimetro);
    }
    
    public void area(){
        int area = ancho * alto;
        System.out.println("el area del rectangulo es : " + area);
    }
    
    //getters y setters
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
}
