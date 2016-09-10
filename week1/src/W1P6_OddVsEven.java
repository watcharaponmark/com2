import java.util.Scanner;
public class W1P6_OddVsEven {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<8;i++)
        {
            int x = scan.nextInt();
            if(x%2==0)
            {
                sum1 += x;
            }
            else if(x%2!=0)
            {
                sum2 += x;
            }
        }
        if(sum1>sum2)
        {
            System.out.println("even");
        }
        else if(sum2>sum1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("equal");
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
    
}
