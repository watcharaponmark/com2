import java.util.Scanner;
public class W1P3_NoDivideByZero {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        float z = scan.nextFloat();
        float sum = (x+y)/z;
        if(z==0)
        {
            System.out.println("cannot divide by zero");
        }
        else 
        {
            System.out.println(String.format("%.6f", sum));
        }
    }
    
}
