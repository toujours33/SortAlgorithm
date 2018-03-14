package basicsort;

public class Main {

	public static void main(String[] args) {

		Integer[] intTest = new Integer[] { 6, 5, 3, 1, 8, 7, 2, 4 };
		Character[] charTest = new Character[] {'v','a','r','b','h','q','p','l','d'};
		
		Test<Integer> testInteger = new Test<>();
		testInteger.test(intTest);
		System.out.println("********************************************************");
		Test<Character> testCharacter = new Test<>();
		testCharacter.test(charTest);

	}

}
