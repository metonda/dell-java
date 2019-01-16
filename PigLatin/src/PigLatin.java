import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
//		ask user for an English word and create variable, 'word'
		System.out.println("Hi.");
		System.out.println("Give me a lower-case English word, and I'll give you the pig-latin translation.");
		Scanner reader = new Scanner(System.in);
		String word = reader.nextLine();
		System.out.println("The English word is " + word);
		
//		check to see if 'word' starts with a vowel or consonate
//		use indexOf String method to see if any vowels occur at index (0)
		int indexOfFirsta = word.indexOf('a');
		int indexOfFirste = word.indexOf('e');
		int indexOfFirsti = word.indexOf('i');
		int indexOfFirsto = word.indexOf('o');
		int indexOfFirstu = word.indexOf('u');
		
		if (indexOfFirsta <= 2 || indexOfFirste <= 2 || indexOfFirsti <= 2 || indexOfFirsto <= 2 || indexOfFirstu <= 2){
			String wordBeg1 = word.substring(0,  1);
			String wordEnd1 = word.substring(2, indexEnd);
			System.out.println("The PigLatin word is " + wordEnd1 + wordBeg1 + "ay");
		}
		
//		boolean startsWithVowel (String s)  ???
		
	//		if true, then concatonate ('word' + "yay") and this equals 'word'
//		output 'word'
		
	//		if not true, output the index of the first occurance of any vowel ???
	//		create substring1 from index(0) through and including the last consonate before the first vowel
	//		create substring2 from the first vowel to the end of 'word'
	//		concatonate (substring1 + substring2 + "ay") and this equals 'word'
//		output 'word'
	
		// TODO Auto-generated method stub

	}

}
