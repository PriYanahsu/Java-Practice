
public class avgOf3{

    public static void avgNum(int x, int y, int z){
        int add = x+y+z;
        int avg = add/3;
        System.out.println(avg);
    }
    
    public static void main(String[] args) {
        avgNum(5, 10, 15);
    }
}