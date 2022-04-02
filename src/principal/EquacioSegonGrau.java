package principal;

public class EquacioSegonGrau {
    
    public static void main (String[] args){
        double a = 1.0;
        double b = 4.0;
        double c = 1.0;

        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
    }
    
}
