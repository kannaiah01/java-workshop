abstract class student{
abstract void result();
}
class Marks extends student{
int m1=60,m2=70;
void result(){
int total=m1+m2;
System.out.println("Total Marks="+total);
}
public static void main(String []args){
student s=new Marks
();
s.result();
}
}