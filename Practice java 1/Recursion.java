import java.util.Scanner;

public class Recursion{

    public static void printTable(int x, int idx){
        if (idx == 10){
            System.out.println(x*idx);
            return;
        }
        
        System.out.println(x*idx);
        printTable(x, idx+1);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printTable(x, 1);
    }
}