class semp2
{
static int emid=0;
String emname;
static String companyname="tcs";
semp2(String d)
{
emname=d;
}
void show()
{
emid++;
System.out.println(emid+"" +emname+"" +companyname+"" );
}
public static void main(String[]args)
{
semp2 s=new semp2("rk");
semp2 s1=new semp2("vk");
semp2 s2=new semp2("kr");
s.show();
s1.show();
s2.show();
}
}
