import java.util.Scanner;
public class twodim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        int r = 2;
        int c = 2;
        int number[][] = new int[r][c];

        for (int i = 0; i <r; i++) {
            for (int j = 0; j < c; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        int x = 5;

        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                if(number[i][j] == x){
                    System.out.print("idx = "+i+","+j);
                }
                
            }
            
        }
    }
    
}
