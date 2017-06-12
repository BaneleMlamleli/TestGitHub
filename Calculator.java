public class Calculator{
	
	//Addition method
	public static void getAddition(double firstNum, double secNum){
		System.out.println(firstNum+" + "+secNum+" = "+(firstNum + secNum));	
	}

	//Division method
	public static void getDivision(double first, double sec){
		if(sec == 0){
			System.out.println("Error! Cannot divide by zero");
		}else{
			System.out.println(first+" / "+sec+" = "+(first/sec));
		}
	}
	
	public static void main(String[]args){
		java.util.Scanner console = new java.util.Scanner(System.in);
		getAddition(2,5);
	}
