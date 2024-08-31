import java.util.Scanner;
public class findA{

    public static int first = -1;
    public static int last = -1;

    public static void findA(String str, int idx, char element){
        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

            char currChar = str.charAt(idx);
            if(currChar == element){
                if(first == -1){
                    first = idx;
                }
                else{
                    last = idx;
                }
                
            }
            findA(str, idx+1, element);
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        findA(str,0, 'a');
    }
}
