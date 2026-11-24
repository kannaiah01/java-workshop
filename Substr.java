class Substr{
	public static void main(String...arg){
		String str="bits college";
		String ss=str.substring(3);
		System.out.println(ss);
		String dob1="21-02-2002";
		String dob2="21-02-2004";
		String dob3="01-04-2001";
		String d1=dob1.substring(6,10);
		String d2=dob2.substring(6,10);
		String d3=dob3.substring(6,10);

		System.out.println(d1+"\n"+d2+"\n"+d3);
	}		
}