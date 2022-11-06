import java.util.*;
public class A3Q11
{
    int[] age = new int[10];
    String[] name = new String[10];
    int[] math = new int[10];
    int[] eng = new int[10];
    int[] sci = new int[10];
    double[] average = new double[10];
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++)
        {
            System.out.println("Enter age index "+(i+1));
            age[i] = sc.nextInt();
            System.out.println("Enter name index "+(i+1));
            name[i] = sc.next();
            System.out.println("Enter Math marks index "+(i+1));
            math[i] = sc.nextInt();
            System.out.println("Enter Eng marks index "+(i+1));
            eng[i] = sc.nextInt();
            System.out.println("Enter Sci marks index "+(i+1));
            sci[i] = sc.nextInt();
            average[i] = (sci[i]+eng[i]+math[i])/3;
        }
    }
    public static void main()
    {
        A3Q11 obj = new A3Q11();
        obj.accept();
        System.out.println("Age\tName\tMath\tEng\tScience\tAverage");
        for(int i = 0; i<10; i++)
        {
            System.out.println(obj.age[i]+"\t"+obj.name[i]+"\t"+obj.math[i]+"\t"+obj.eng[i]+"\t"+obj.sci[i]+"\t"+obj.average[i]);
        }
    }
}