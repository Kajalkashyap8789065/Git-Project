import java.util.Scanner;
interface calci{
 int sum(int a, int b );
}
class calciImpl implements calci
{
public int sum(int a ,int b)
{ 
return a+b;
}
}
 class CalciDriver{ 
public static void main (String []args)
{
Scanner sc = new Scanner (System.in);
System.out.println("enter first number");
int a=sc.nextInt();
System.out.println("enter second number");
int b = sc.nextInt();
calciImpl c= new calciImpl();
System.out.println(a+b+"="+c.sum(a,b));
}
}