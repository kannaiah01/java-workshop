class Person{
String name;
int age;
void getdetails(String n,int a){
this.name=n;
this.age=a;
}
void showdetails()
{
System.out.println("NAME:"+name);
System.out.println("Age:"+age);
}
}

class Student extends Person{
double cgpa;
String branch;
void inputstudent(String n,int a,String br,double cg){
getdetails(n,a);
this.branch=br;
this.cgpa=cg;
}
void display(){
showdetails();
System.out.println("Branch:"+branch);
System.out.println("cgpa:"+cgpa);
}
}

class Teacher extends Person{
int rollno;
int marks;
void inputstudent1(String n,int a,int i,int m){
getdetails(n,a);
this.rollno=i;
this.marks=m;
}
void display1(){
showdetails();
System.out.println("Rollno:"+rollno);
System.out.println("marks:"+marks);
}
}
class Aa{
public static void main(String args[]){
Student s=new Student();
Teacher  t=new Teacher();
t.inputstudent1("kannaiah",22,78,96);
t.display1();
s.inputstudent("kannaiah",22,"csd",9.8);
s.display();
}
}