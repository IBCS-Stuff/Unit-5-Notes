public class UntilDoneExercise{
    public static void main(String[] args){
        int a = 1;
        int b = 0;
        
        while(a <= 100){
            b += a;
            a++;
            System.out.println(b);
        }
    }
}