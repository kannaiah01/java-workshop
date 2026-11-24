import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadStudent{
public static void main(String[]args){
File file=new File("Student.txt");
Scanner sc=new Scanner(file);
System.out.println("Reading from file");
while(sc.hasNext()){
System.out.println(sc.next() + " ");
}
sc.close();
}
}