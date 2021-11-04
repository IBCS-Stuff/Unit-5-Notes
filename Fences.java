public class Fences {
    public static void main(String[] args){
        numbers(10);
        FencePrinter(10);
    }

    public static void numbers(int n){
        int a = 1;
        if(n < 1){
            System.out.println("invalid Value");
        }
        else{
            while(a <= n){
            if(a == n){
                System.out.print(a);
            }
            else{
                System.out.print(a + ",");
               
            }
            a++;
                
            }
        }
    }


    public static void FencePrinter(int n){
        System.out.print("|");
        int b = 1;
        while(b <= n){
            System.out.print("-----|");
            b++;
        }
    }
}
