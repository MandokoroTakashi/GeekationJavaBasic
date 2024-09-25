package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				continue;
			} else if(i % 3 == 0 ) {
				System.out.println("Fizz");
				continue;
			} else if(i % 5 == 0 ) {
				System.out.println("Buzz");
				continue;				
			}
			System.out.println(i);			
		}
		
		String[] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		for(String language: languages) {
			if(language == "Java") {
				System.out.println("現在学習中の言語は"+language+"です。");
				continue;
			} else if (language == "HTML") {
				System.out.println(language+"はプログラミング言語ではありません。");				
				break;
			}
			System.out.println(language);
		}
	}

}
