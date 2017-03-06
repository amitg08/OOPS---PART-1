
public class ResultProcessing {
	String name;
	int rollno;
	
	ResultProcessing(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		}
	 void grade(int m){
		 if(m<=100 && m>=90){
			 System.out.println("O");
		}
		 else if(m<90 && m>=80){
			 System.out.println("E");
		 }
		 else if(m<80 && m>=70){
			 System.out.println("A");
		 }
		 else if(m<70 && m>=60){
			 System.out.println("B");
		 }
		 else if(m<60 && m>=50){
			 System.out.println("C");
		 }
		 else if(m<50 && m>=40){
			 System.out.println("D");
		 }
		 else{
			 System.out.println("F");
		 }
	 }
	 public static void main(String[] args){
		 ResultProcessing a = new ResultProcessing("Amit", 2);
		 a.grade(85);
	 }
}
