import java.util.Scanner;

public class PalindromSayi {
	public static boolean isPalindrome(int number)
	{
		int reversedNumber = 0,lastNumber,temp = number;
		
		
		while (temp!=0) {
			
			lastNumber = temp % 10;
			reversedNumber = reversedNumber*10+lastNumber;
			
		 temp/=10;
		}
		if(number == reversedNumber) {
			return true ;
			
		} 
		else { return false ;
		
		}
	}

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz : ");
		int number = input.nextInt();
		
		
		if(isPalindrome(number)) {
			
			System.out.println("bir palindrom sayısıdır.");
			
		}
		else { System.out.println("bir palindrom sayı değildir.");
		
		
			
		}
		
		

	}

}
