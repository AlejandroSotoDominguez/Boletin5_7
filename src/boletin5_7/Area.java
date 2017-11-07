
package boletin5_7;

public class Area {
    private final double PI = 3.14;
    
    public void areaCuadrado(double l){
        double area = l*l;
        System.out.println("Área = "+(area = l*l));
    }
    
    public void areaTriangulo(double b, double h){
        double area;
        System.out.println("Área = "+(area = (b*h)/2));
    }
    
    public void areaCirculo(double r){
        double area;
        System.out.println("Área = "+(area = PI*Math.pow(r, 2)));
    }
}
