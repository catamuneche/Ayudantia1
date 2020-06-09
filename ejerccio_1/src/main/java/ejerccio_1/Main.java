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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ÁREAS Y PERIMETROS DE DISTINTAS FIGURAS GEOMÉTRICAS");
        
        //Instanciar la clase triángulo
        Triangulo triangulito = new Triangulo(4,2,7,5);//objeto tipo triangulo, llamado triangulito de medidas: ladoA=4,ladoB=2,ladoC=7,altura=5
        Triangulo triangulin = new Triangulo(5,7,8,6);
        
        triangulito.perimetro();//llamada al método perímetro
        triangulito.area();
        
        System.out.println("altura de triangulito " + triangulito.getAltura());//Obtener el valor de altura

        triangulito.setAltura(20);//Modificar el valor de altura
        System.out.println("nueva altura de triangulito " + triangulito.getAltura());

        
        triangulin.perimetro();
        triangulin.area();
        
        Cuadrado cuadradito = new Cuadrado(5);
        cuadradito.area();
        cuadradito.perimetro();
        
        Rectangulo rectangulin = new Rectangulo(8,2);
        
        rectangulin.perimetro();
        rectangulin.area();
        
        Circulo circulito = new Circulo(5);
        circulito.area();
        circulito.perimetro();       
    }
}
