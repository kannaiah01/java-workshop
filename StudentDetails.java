import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class StudentDetails {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student ID: "); 
int id = sc.nextInt();
sc.nextLine(); 
System.out.print("Enter Student Name: ");
 String name = sc.nextLine();
try{
FileWriter fw = new FileWriter("students.txt", true);
 fw.write("ID: " + id + ", Name: " + name + "\n");
 fw.close();
System.out.println("Student details appended successfully.");
} catch (IOException e) {
System.out.println("File error occurred.");
e.printStackTrace();
}
sc.close();
}
}