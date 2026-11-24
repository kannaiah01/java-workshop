//random class program
import java.util.Random;
class RandomDemo1{
public static void main(String...ar){
Random r=new Random();
int numberOne=Math.abs(r.nextInt()%90)+10;
int numberTwo=Math.abs(r.nextInt()%90)+10;
int result=numberOne+numberTwo;
System.out.printf("n1=%5d\n",numberOne);
System.out.printf("n2=%5d\n",numberTwo);
System.out.printf("sum=%5d\n",result);
}
}