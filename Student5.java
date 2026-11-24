class Student5{
int id;
String name;
Student5(){
id=0;
name="Not Assigned";
System.out.println("Default constructor called");
}
Student5(int i,String n){
id =i;
name=n;
System.out.println("Parameterized constructed called");
}
void display(){
System.out.println("ID:"+id+",Name:"+name);
}
public static void main(String[] args){
Student5 s1=new Student5();
s1.display();
System.out.println();
Student5 s2=new Student5(105,"kannaiah");
s2.display();
}
}