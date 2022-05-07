class animal//hirerachcal
{
void disp()
{
System.out.println("this parent");
}
}
class dog extends animal
{
void disp1()
{
System.out.println("this is doggy");
}
}
class cat extends animal
{
void disp2()
{
System.out.println("this is kitty");
}
}
class pets
{
public static void main(String[]args)
{
cat s=new cat();
dog t=new dog();
s.disp();
s.disp2();
t.disp();
t.disp1();
}
}