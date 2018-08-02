import java.io.*;
import java.util.*;
public class factorial
{
public static void main(string args[])
{
int n,i,fact=1;
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
