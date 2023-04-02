import java.util.Scanner;
class MarriageEligibility
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter You  Age Check Marriage Eligibility...);
		int age=scnextInt();
		if(age>21){
			System.out.println("Congratulation You Are Eligible For Marriage");
		}else{
			System.out.println("You Are Not Eligible For Marriage");


		}
	}
}