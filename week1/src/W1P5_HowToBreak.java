import java.util.Scanner;
public class W1P5_HowToBreak {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for(;;)
        {
            int x = scan.nextInt();
            if(x==0)
            {
                break;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
