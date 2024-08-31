import java.util.Scanner;

public class arrayfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        // int n = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("enter the value idx" + i);
            number[i] = sc.nextInt();
        }
        
        System.out.println("number to find :");
        int x = sc.nextInt();

        for(int i=0; i<= number.length; i++){
            if(number[i] == x){
                System.out.println("the number is found at idx" + i);
            }
        }
    }
}
