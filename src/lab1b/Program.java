package lab1b;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark = 70;
		String result;
		
		
		if (mark >=1 && mark < 50) {
			result = "Fail";
		} 
		else if (mark >= 50 && mark <= 60) {
			result = "Pass";
		} 
		else if (mark >= 61 && mark <= 70) {
			result = "Merit";
		} 
		else if (mark >= 71 && mark <= 100) {
			result = "Distinction";
		} 
		else {
			result = "Error: marks must be between 1..100";
		}
		
		System.out.println(result);
	}

}
