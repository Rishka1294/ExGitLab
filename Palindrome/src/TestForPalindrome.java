 
/*
    A palindrome is a word that reads the same backward or forward.

	Write a function that checks if a given word is a palindrome. Character case should be ignored.

	For example, isPalindrome("Deleveled") should return true as character case should be ignored, 
	resulting in "deleveled", which is a palindrome since it reads the same backward and forward.

 */

//Test 1 for git lab
public class TestForPalindrome {

	public static void main(String[] args) 
	{
		System.out.println(TestForPalindrome.isPalindrome("Deleveled"));


	}
	
	public static boolean isPalindrome(String word)
	{
		String fixedWord = word.toLowerCase();
		int length = fixedWord.length();
		
		for(int i = 0; i <= fixedWord.length()-1; i++)
		{
			if(fixedWord.charAt(i) != fixedWord.charAt((length-1) - i))
			{
				return false;
			}
			
		}
		
		return true;
	}

}
