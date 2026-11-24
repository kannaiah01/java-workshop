class constructor
{
	String name;
	int rno;
	double cgpa;
	public constructor(String name, int rno, double cgpa){
	this.name=name;
	this.rno=rno;
	this.cgpa=cgpa;
	}
	public void display(){
	System.out.println(name+"\t"+rno+"\t"+cgpa);
	}

}
class ConstructorOverLoading
{
	public static void main(String...arg)
	{
	constructor c=new constructor("kannaiah",105,7.0);
	//c.name="kannaiah";
	//c.rno=105;
	//c.cgpa=7.0;
	c.display();	
	}
}