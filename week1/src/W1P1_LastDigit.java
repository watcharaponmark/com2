import java.util.Scanner;
public class W1P1_LastDigit {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = (x%10);
        System.out.println(sum);
    }
    
}
