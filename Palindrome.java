import java.lang.StringBuffer;
class Palindrome{
public static void main(String...ar){
int number=1234554321 ;
String s1=String.valueOf(number);
StringBuffer sb=new StringBuffer(s1);
String reverse=sb.reverse().toString();
if(reverse.equals(s1))  System.out.println("number is palindrome");
else  System.out.println("not a palindrome");
}
}