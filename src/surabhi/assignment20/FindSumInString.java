package surabhi.assignment20;

public class FindSumInString {
	int sum;
	void getSum(String str) {  
		char ch=' ';int num=0;
		for(int index=0;index<str.length();index++) { 
			ch=str.charAt(index);
			if(ch>=48 && ch<=57) {
				num=Character.getNumericValue(ch);  
				sum=sum+num;
			}
		}
	}  
	  
	void displaySum() { 
		System.out.println("Sum of all numbers :"+sum);
	}
	public static void main(String[] args) {
		FindSumInString findSumInString=new FindSumInString();
		findSumInString.getSum("J7yu9y8h1h8j4b7j3jjb6");  
		findSumInString.displaySum();
	}

}
