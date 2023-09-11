import java.util.Scanner;
interface calci{
 int sum(int a, int b );
}
 class calciImpl implements calci
{
public int add(int a ,int b);
{ 
return a+b;
}
}
 class CalciDriver{ 
public static void main (String []args)
{
Scanner sc = new Scanner (System.in);
int a=sc.nextInt();
int b = sc.nextInt();
calciImpl c= new calciImpl();
System.out.println(a+b+"="+c.sum(a,b));
}
}