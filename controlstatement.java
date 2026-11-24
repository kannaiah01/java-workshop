import java.util.Scanner;
class controlstatement{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
if(num>0){
System.out.println("positive number");
}
if(num%2==0){
System.out.println("even number");
}else{
System.out.println("odd number");
}
if(num>0){
System.out.println("number is positive");
}else if(num<0){
System.out.println("number is negative");
}else{
System.out.println("number is zero");
}

System.out.println("\nEnter day number(1-7):");
int day=sc.nextInt();

switch(day){
case1:System.out.println("monday");break;
case2:System.out.println("tuesday");break;
case3:System.out.println("wednesday");break;
case4:System.out.println(thursday");break;
case5:System.out.println("friday");break;
case6:System.out.println("saturday");break;
case7:System.out.println("sunday");break;
default:System.out.println("Invalid day");
}
System.out.println("\nWhile loop");
int i=1;
while(i<=5){
System.out.println(i);
i++;
}
}
}




