class semp1
{
int emid;
String emname;
static String companyname="tcs";
semp1(int e,String d)
{
emid=e;
emname=d;
}
void show()
{
System.out.println(emid+"" +emname+"" +companyname+"" );
}
public static void main(String[]args)
{
semp1 s=new semp1(1,"rk");
semp1 s1=new semp1(2,"vk");
semp1 s2=new semp1(3,"kr");
s.show();
s1.show();
s2.show();
}
}
