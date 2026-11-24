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
void inputstudent(String n,int a,String br,double cg,int i,int m){
inputstudent(n,a,br,cg);
this.rollno=i;
this.marks=m;
}
void display(){
System.out.println("Rollno:"+rollno);
System.out.println("marks:"+marks);
}
public static void main(String args[]){
Student s=new Student();
inputstudent("Kannaiah",22,"csd",8.98,98,78);
s.display();
}
}