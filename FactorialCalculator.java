import java.util.*;//importing utility package
public class FactorialCalculator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter A non-negative Integer Value: ");
int x = sc.nextInt();//taken an integer input
long fac = calculateFactorial(x);//here we have called the functon claculateFactorial and stored its value in variable fac
System.out.println("Factorial of "+x+" is "+fac);
}//end of function main
public static long calculateFactorial(int n)
{
if(n==0)//used an if() statement to handle the base case 0
{
return 1;
}
else
{
int i;long fact = 1;
for(i=1;i<=n;i++)
{
fact=fact*i;//this multiplies all the natural numbers from 1 to that number taken input
}
return fact;
}
}//end of function calculateFactorial
}//end of class