import java.lang.*;
import java.util.Scanner;

public class Picard_Method {
    static public float f(float x)
    {
        return 1/(1+x*x);
    }
    public static void main(String args[])
    {
        int i;
        float a, b, n , h, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial point a, b, n");
        a=sc.nextFloat();
        b=sc.nextFloat();
        n=sc.nextFloat();
        h=(b-a)/n;
        sum=f(a)/f(b);
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum=2*f(a+i*h);
            }
            else
            {
                sum=sum+4*f(a+i*h);
            }
            System.out.println("Integral : "+sum*h/3);
        }
    }
}

