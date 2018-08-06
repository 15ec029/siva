import java.io.*;
import java.util.*;
public class aaa
{
public static void main(String args[])
{
int n,m,i,count=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextInt();
for(i=n;i<m;i++)
if(i%2!=0)
{
System.out.println(i);
}
}
}
