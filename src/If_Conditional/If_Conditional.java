package If_Conditional;

public class If_Conditional {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20; 
		
		if (num1<num2){
			System.out.println("num1 less then num2");
			
			if (num1%2==0){
				System.out.println(num1 +"is odd number");
			}else{
				System.out.println(num1 + "is even number");
			}
		}else {
			
			System.out.println("num2 less then num1 ");
			
		}
		

	}

}
