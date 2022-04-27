class rect
{
int l,w;
rect(int length,int width)
{
l=length;
w=width;
}
void disp()
{
System.out.println(l*w);
}
public static void main (String[]args)
{
rect rv=new rect(12,2);
rv.disp();
}
}