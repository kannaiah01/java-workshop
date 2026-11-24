import java.util.Scanner;
class Student2{
int roll_no;
String name;
String college_name;
String branch;
int mobile;
void display(){
System.out.println(name+""+roll_no+""+college_name+""+branch+""+mobile);
}
public static void main(String[]args){
Student2 s=new Student2();
Scanner sc=new Scanner(System.in);
System.out.println("enter student roll_no:");
s.roll_no=sc.nextInt();
System.out.println("enter student name:");
s.name=sc.next();
System.out.println("enter student college_name:");
s.college_name=sc.next();
System.out.println("enter student branch:");
s.branch=sc.next();
System.out.println("enter student mobile:");
s.mobile=sc.nextInt();
s.display();
}
}