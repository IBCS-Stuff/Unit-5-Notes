import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        System.out.println("Try to guess my Number");
        Scanner OrangeJuice = new Scanner(System.in);
        Guesser(OrangeJuice);
    }
    public static void Guesser(Scanner A){
        int i = A.nextInt();
        
        while(1 != 2){
            if( i > 50){
                System.out.println("Too High!");
                System.out.println("Try again");
                i = A.nextInt();
            }
            else if(i < 50){
                System.out.println("Too Low!");
                System.out.println("Try again");
                i = A.nextInt();
            }
            else{
                System.out.println("Congratulations! You guessed correctly");
                break;
            }
        }
    }
}
