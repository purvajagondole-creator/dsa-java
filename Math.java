import java.util.Scanner;

public class problem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = Math.max(c, Math.max(a, b));
        System.out.println("The maximum value is"+ max);
        
        int min = Math.min(c, Math.min(a,b));
        System.out.println("The minimum value is"+ min);


        
        
    }
 } 
