import java.util.*;
class Program
{
    boolean isPrime(int n)
    {
        boolean prime = true;
        for(int i = 2; i<n; i++)
        {
            if(n%i==0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        sc.close();
        Program obj = new Program();
        boolean prime = obj.isPrime(n);
        if(prime)
            System.out.println(n+" is a prime number");
        else
        System.out.println(n+" is not a prime number");
        for(int j = 1; j<=500; j++)
        {
            prime = true;
            for(int i = 2; i<j; i++)
            {
                if(j%i==0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime)
                System.out.print(j+", ");
        }
    }
}