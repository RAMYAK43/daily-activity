//fibonacci series
//two variable &add those to get thired value
//a+b=c,0+1=1......1+1=2.....with loop
class fibo
{
public static void main(String[]args)
{
int i=1,n=20,a=0,b=1;
System.out.println("fibo series till"+n+"terms");
while(i<=n)
{
System.out.println(a+",");
int c=a+b;
a=b;
b=c;
i++;
}
}
}

