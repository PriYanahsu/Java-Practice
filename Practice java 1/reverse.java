import java.util.Scanner;

public class reverse {
    public static void reverSe(String str, int idx){
        if (idx == 0){
            System.out.print(str);
            return;
        }
        System.out.println(str.charAt(idx));
        reverSe(str, idx-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        reverSe(str, str.length());
    }
}
