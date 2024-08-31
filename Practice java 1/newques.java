import java.util.Scanner;
public class newques {

    public static double parameter(double r){
        double para = 2 * 3.14 *r;
        return para;
    }

    public static double area(double r){
        double area = 2 * 3.14 * r * r;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the radius");
        int radius = sc.nextInt();
        double P = parameter(radius);
        System.out.println("the parameter of circle : "+ P);
        double A = area(radius);
        System.out.println("the area of circle : "+ A);
    }
}
