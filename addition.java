class addition{
	private int a,b,c;
	public int getA(){
		return a;
	}
	public void setA(){
		a=x;
	}
	public int getB(){
		return b;
	}
	public void setB(){
		b=x;
	}
	public int getC(){
		return c;
	}
	public void setC(){
		c=x;
	}
 	public void add(){
	setC(getA() + getB());
	}
}
class MainAddition
{
	public static void main(String...ar)
	{
		Addition ob=new Addition();
		ob.setA(123);
		ob.setB(200);
		ob.add();
		System.out.println("A = "+obj.getA());
		System.out.println("B = "+obj.getB());
		System.out.println("Sum = "+obj.getc());
	}
}