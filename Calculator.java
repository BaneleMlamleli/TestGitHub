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
		java.util.Scanner objConsole = new java.util.Scanner(System.in);
		System.out.print("Enter first value: ");
		double firstValue = objConsole.nextDouble();
		System.out.print("Enter second value: ");
		double secondValue = objConsole.nextDouble();
		System.out.println("----------------------");
		getDivision(firstValue, secondValue);
		getAddition(firstValue,secondValue);
	}
