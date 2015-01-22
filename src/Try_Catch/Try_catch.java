package Try_Catch;

public class Try_catch {

	public static void main(String[] args) {
		
		try{
		int num = 10/0;
		System.out.println(num);
		
		}catch(Exception ex){
			
			
			System.out.println("you are not allowed to divide a number by zero");
	}finally{
		
		
		//clean up block 
		//clean DB connection 
	}

}
}