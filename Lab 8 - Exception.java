//WrongAge user defined exception class
class WrongAge extends Exception
{
WrongAge(String s)
{
super(s);
}
}

//Father class
import java.util.Scanner;
class Father
{
int age;
Scanner scan=new Scanner(System.in);
Father()throws WrongAge
{
System.out.println("Enter father's age:");
age=scan.nextInt();
if(age<0)
throw new WrongAge("Age cannot be negative.");
}
}

//Son class
import java.util.Scanner;
class Son extends Father
{
int sonage;
Scanner scan=new Scanner(System.in);

Son()throws WrongAge
{
System.out.println("Enter son's age:");
sonage=scan.nextInt();
if(sonage<0)
throw new WrongAge("Age cannot be negative.");
}

public void check()throws WrongAge
{
if(sonage>=age)
throw new WrongAge("Son's age cannot be greater than father's age.");
}

public void display()
{
System.out.println("Father's age:"+age);
System.out.println("Son's age:"+sonage);
System.out.println("Sneha N Shastri - 1BM22CS283");
}
}

//AgeMain class
class AgeMain
{
public static void main(String args[])throws Exception
{
Son s=new Son();
s.check();
s.display();
}
}
