import java.util.Scanner;
class person{
String name;
int age;
void getdetails(String n,int a)
{
this.name=n;
this.age=a;
}
void showdetails()
{
System.out.println("Name:"+ name);
System.out.println("Age:"+ age);
}
}
class student extends person{
String branch;
double cgpa;
void  inputstudent(String n,int a,String br,double cg)
{
this.branch=br;
this.cgpa=cg;
}
void display()
{
showdetails();
System.out.println("Name:"+ name);
System.out.println("Age:"+ age);
System.out.println("Branch:"+branch);
System.out.println("CGPA:"+cgpa);
}
public static void main(String[]args){
student s=new student();
s.inputstudent("kannaiah",22,"CSD",8.97);
s.display();
}
}
