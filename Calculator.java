public class Calculator{
	
	//Addition method
	public static void getAddition(double firstNum, double secNum){
		System.out.println(firstNum+" + "+secNum+" = "+(firstNum + secNum));	
	}
	
	public static void main(String[]args){
		java.util.Scanner console = new java.util.Scanner(System.in);
		getAddition(2,5);
	}
}