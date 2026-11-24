import java.lang.StringBuffer;
import java.util.StringTokenizer;
class SBDemo{
	public static void main(String...ar){
		String str=new String("welcometojavacoding");
		StringTokenizer st=new StringTokenizer(str, " 		 ");
		StringBuffer sb=null;
		String temp = new String();
		StringBuffer result =new StringBuffer();
      		while(st.hasMoreTokens()){
			temp = st.nextToken();
			sb=new StringBuffer(temp);
			result.append(sb.reverse());
			//System.out.println(sb.reverse() );
		}
		System.out.println(result);
	}
}																																