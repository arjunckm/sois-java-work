/*Program 8 -sum of all integers in loop */
class SumIntegers{
	public static void main(String args[]){
		int variable=0;
		for(int i=100;i<=200;i++){
			if(i%7==0)
				variable+=i;
		}
		System.out.println("The sum of all integers are: "+variable);
	}
}
