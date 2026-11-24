class Animal{
String s;
void getdetails(String n){
this.s=n;
}
void sound(){
System.out.println("sound:"+sou);
}
}
class Bird extends Animal{
String name;
void get1(String n,String b){
getdetails(n,b);
this.bName=b;
}
void sound1(){
super.sound();
System.out.println("sound:"+bname);
}
}
class Cat extends Animal{
String name;
void get2(String n,String c
){
getdetails(n);
this.cname=n;
}
void sound2(){
super.sound();
System.out.println("sound:"+cname);
}
}
class Bb{
public static void main(String[]args){
Cat c=new Cat();
c.get2("Cat","meow");
c.sound2();
Bird b=new Bird();
b.get1("kingfisher","kigle");
b.sound1();
}
}