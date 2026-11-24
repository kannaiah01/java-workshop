import java.util.Scanner;
class Student1{

int id;
String name;
void display(){
System.out.println(id+""+name);
}
public static void main(String[]args){
Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter student id:");
s.id=sc.nextInt();
System.out.println("enter student name:");
s.name=sc.next();
s.display();
}
}