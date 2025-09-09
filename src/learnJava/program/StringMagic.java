package learnJava.program;
//TODO: Check if the sentence is empty.

//If the sentence is empty, return an empty string
// TODO: Split the sentence into words using the split method.
// Use " " as the delimiter to match space.
// TODO: Create a StringBuilder to hold the reversed sentence.
// TODO: Loop through each word in the words array.
// TODO: For each word, create a StringBuilder and reverse the word.
// Append the reversed word, followed by a space, to the reversed sentence.

// TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
public class StringMagic {

	public static String reverseWordsInSentence(String sentence) {
		if (sentence == null) {
			System.out.println("Invalid");
		} else if (sentence.equals("")) {
			System.out.println(" ");
		}

		StringBuilder reverseSentences = new StringBuilder();
		for(String word :sentence.split(" ")) {
			StringBuilder reverseWord=new StringBuilder(word).reverse();
			reverseSentences.append(reverseWord).append(" ");
		}
		return reverseSentences.toString().trim();
	}

	public static void main(String[] args) {
		String sentence = "Hello world Java";
		System.out.println(reverseWordsInSentence(sentence));
	}

}
