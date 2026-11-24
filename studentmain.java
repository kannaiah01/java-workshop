class student{
String stdName;
String branch;
int stdid;
void display(){
System.out.println(stdName+"  "+branch+"  "+stdid);
}
}
class studentmain{
public static void main(String...ar){
student obj=new student();
obj.stdName = "kannaiah";
obj.branch = "CSD";
obj.stdid = "1001";
obj.display( );
}
}