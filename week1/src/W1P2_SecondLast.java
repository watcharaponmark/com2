import java.util.Scanner;
public class W1P2_SecondLast {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = (x/10)%10;
        System.out.print(sum);
    }
    
}
