import java.util.StringTokenizer;
class TokenDemo{
	public static void main(String...args){
		/*String clg="Balaji Institute of technology"+" Science, it is 			offering eight "+" in four years. There are three "+" sections in 		each year with "+"  around 60 students each.";*/
		String clg="Balaji Institute of technology and Science";
		StringTokenizer st=new StringTokenizer(clg, " ");
		int count=st.countTokens();
		System.out.println(count);
		String[] s=new String[count];
		int i=0;
		while(st.hasMoreTokens()){
			s[i]=st.nextToken();
			i++;
		}
		for(String v:s) System.out.println(v);

		/*String s1=st.nextToken();
		System.out.println(s1);
		String s2=st.nextToken();
		System.out.println(s2);
		String s3=st.nextToken();
		System.out.println(s3);

		count=st.countTokens();
		System.out.println(count);


		String s4=st.nextToken();
		System.out.println(s4);
		String s5=st.nextToken();
		System.out.println(s5);
		String s6=st.nextToken();
		System.out.println(s6);
		count=st.countTokens();
		System.out.println(count);*/
	}
}