import java.io.*;
import java.util.*;
public class reversestring
{
public static void main(String args[])
{
String a,b="";
Scanner s=new Scanner(System.in);
a=s.nextLine();
int length=a.length();
for(int i=length-1;i>=0;i--)
b=b+a.charAt(i);
System.out.println(b);
}
}
