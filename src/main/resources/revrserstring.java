
public class revrserstring {

	public static void main(String[] args) {
	
		
		String str="amitbhati1000";
		String b=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			b=b+str.charAt(i);
		}
System.out.println("revser string are :"+b);
	}

}
