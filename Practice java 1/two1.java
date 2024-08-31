import java.util.Scanner;

public class two1 {

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the rows : ");
        int rows = sc.nextInt();

        System.out.print("enter the cols : ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("enter value to find (i,j) : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("enter value to find x : ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == x){
                    System.out.println("the number is found at i ="+ i +" and j = "+j);
                }
            }
            
        }
    }
}
