import java.util.Scanner;
class Person{
String name;
int age;
void getdetails(String n,int a)
{
this.name=n;
this.age=a;
}
void showdetails(){
System.out.println("Name:"+name);
System.out.println("Age:"+age);
}
}
class Student6 extends Person{
String branch;
double cgpa;
void inputstudent(String br,double cg){
this.branch=br;
this.cgpa=cg;
}
void display(){
System.out.println("Branch:"+branch);
System.out.println("CGPA:"+cgpa);
}
public static void main(String[] args){
Student6 s=new Student6();
s.inputstudent("CSD",8.12);
s.getdetails("kannaiah",23);
s.showdetails();
s.display();
}
}  