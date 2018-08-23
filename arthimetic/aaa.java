import java.io.*;
import java.util.*;
public class aaa
{
static float sum(float a,float b,int n)
{
float sum=0;
for(i=0;i<n;i++)
{
sum=sum+a;
a=a+b;
}
return sum;
}
public static void main(String args[])
{
int n=20;
float a=2.5f,b=2.5f;
System.out.println(sum(a,b,n));
}
}
