import java.lang.invoke.ConstantCallSite;
import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args)
    {
        //Scanner scanner = new Scanner(System.in);

        Secret s1 = Secret.getNewSecret();
        Secret s2 = Secret.getNewSecret();
        Secret s3 = Secret.getNewSecret();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        int x = 8;
        int z = 9;
        int bobo = 10;
        int bozo = 11;
    }
}