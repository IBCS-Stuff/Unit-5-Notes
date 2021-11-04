import java.util.Scanner;
public class SentinelLoop {
    public static void main(String[] args){
        System.out.println("Enter in a Number");
        Scanner Sentinel = new Scanner(System.in);
        SentinelDetector(Sentinel);
    }
    public static void SentinelDetector(Scanner Sentinel){
        int i = Sentinel.nextInt();
        int z = 0;
        while(1 != 2){
            if(i >= 0){
                System.out.println("enter in another number");
               z += i;
            }
            else{
                System.out.println("Negative Number Detected");
                break;
            }
            i = Sentinel.nextInt();
        }
        System.out.println(z);
    }
}
