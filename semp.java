class semp
{
int emid;
String emname;
String companyname;
semp(int e,String d,String f)
{
emid=e;
emname=d;
companyname=f;
}
void show()
{
System.out.println(emid+"" +emname+"" +companyname+"" );
}
public static void main(String[]args)
{
semp s=new semp(1,"rk","tcs");
semp s1=new semp(2,"vk","tcs");
semp s2=new semp(3,"kr","tcs");
s.show();
s1.show();
s2.show();
}
}
