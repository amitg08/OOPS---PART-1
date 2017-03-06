
public class Boolean {
	String s1;
	String s2;
	boolean same;
	Boolean(String s1, String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	void same(){
		if(s1==s2){
			System.out.println(same=true);
		}
		else{
			System.out.println(same=false);
		}
		
	}
	public static void main(String[] args){
		Boolean b = new Boolean("Amit", "Amit");
		b.same();
	}
}
//true