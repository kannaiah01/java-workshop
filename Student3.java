import java.util.Scanner;
class Student3{
int sb_marks1;
int sb_marks2;
int sb_marks3;
String name;
void display(){
int avg=(sb_marks1+sb_marks2+sb_marks3)/3;
int sum=sb_marks1+sb_marks2+sb_marks3;
System.out.println(name+" "+avg+" "+sum);
}
public static void main(String[] args){
Student3 s=new Student3();
Scanner sc=new Scanner(System.in);
System.out.print("Enter student name:");
s.name=sc.next();
System.out.print("Enter sub_marks1:");
s.sb_marks1=sc.nextInt();
System.out.print("Enter sub_marks2:");
s.sb_marks2=sc.nextInt();
System.out.print("Enter sub_marks3:");
s.sb_marks3=sc.nextInt();
s.display();

}
}
