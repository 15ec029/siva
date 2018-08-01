import java.io.*;
import java.utli.*;
public class rom
{
public static void amin(String args[])
{
int a,b,c,rev;
rev=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
c=a;
while(a>0)
{
b=a%10;
rev=rev*10+b;
a=a/10;
}
if(c==rev)
{
System.out.println("yes");
}
else
{
system.out.println("no");
}
}
}
