
package boletin5_7;

import java.util.Scanner;

public class Boletin5_7 {

    public static void main(String[] args) {
        String op;
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Cuadrado \n2.Triángulo \n3.Círculo \nElige una opción");
        op = sc.next();
        switch(op){
            case "1" : 
                System.out.println("Introduce lado");
                double l = sc.nextInt();
                Area obj = new Area();
                obj.areaCuadrado(l);
                break;
            case "2" :
                System.out.println("Introduce base");
                double b = sc.nextDouble();
                System.out.println("Introduce altura");
                double h = sc.nextDouble();
                Area obj2 = new Area();
                obj2.areaTriangulo(b, h);
                break;
            case "3" :
                System.out.println("Introduce radio");
                double r = sc.nextDouble();
                Area obj3 = new Area();
                obj3.areaCirculo(r);
                break;          
        }
    }
    
}
