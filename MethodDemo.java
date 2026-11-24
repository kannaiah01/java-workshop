class MethodDemo{
public static void main(String args[]){
String text="welcome to coding world";
int len=text.length();
System.out.println("length= "+len);
String s1=text+"  java";
System.out.println(s1);
//System.out.println(s1.concat(text, " C++") );
String s3="bits college";
System.out.println(s3.toUpperCase());
String s4="WARANGAL";
System.out.println(s4.toLowerCase());
String search="to";
int index=text.indexOf(search);
if(index>0){
System.out.println(search+" string found at "+ (index+1
}
}