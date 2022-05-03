import java.util.regex.*;

public class RegExClasses {
	public static void main(String[] args) {
		System.out.println("Atividade com expressões regulares");

        System.out.println("-----------------------------------------------------");
        
        System.out.println("Respostas para letra A");
        String expressao_A = "a[a]*b";
        System.out.println(Pattern.matches(expressao_A, "aab")); // true
		System.out.println(Pattern.matches(expressao_A, "abb"));  // false

        System.out.println("Respostas para letra B");
        String expressao_B = "a[b]*";
        System.out.println(Pattern.matches(expressao_B, "aab")); // false
		System.out.println(Pattern.matches(expressao_B, "abb")); // true

        System.out.println("Respostas para letra C");
        String expressao_C = "abb[b]*";
        System.out.println(Pattern.matches(expressao_C, "aabbb")); // true
		System.out.println(Pattern.matches(expressao_C, "abb")); // false

        System.out.println("Respostas para letra D");
        String expressao_D = "a[a]*b{0,2}";
        System.out.println(Pattern.matches(expressao_D, "aabbb")); // true
		System.out.println(Pattern.matches(expressao_D, "aaabb")); // false

        System.out.println("Respostas para letra E");
        String expressao_E = "a{2,}b{3,}";
        System.out.println(Pattern.matches(expressao_E, "aabbb")); // true
		System.out.println(Pattern.matches(expressao_E, "abbb")); //false

        System.out.println("Respostas para letra F");
        String expressao_F = "[a+b]{3,}";
        System.out.println(Pattern.matches(expressao_F, "aabbb")); // true
		System.out.println(Pattern.matches(expressao_F, "ab")); //  false

        System.out.println("Respostas para letra G");
        String expressao_G = "[a+b]{0,3}";
        System.out.println(Pattern.matches(expressao_G, "aabbb")); // false
		System.out.println(Pattern.matches(expressao_G, "ab")); // true
        System.out.println(Pattern.matches(expressao_G, "abb")); // true
       
        System.out.println("Respostas para letra H");
        String expressao_H = "[ab*]{1,2}|[ab*]{4,}";
        System.out.println(Pattern.matches(expressao_H, "aabbb")); // true
		System.out.println(Pattern.matches(expressao_H, "ab")); // true
        System.out.println(Pattern.matches(expressao_H, "abb")); // false

        System.out.println("Respostas para letra I");
        String expressao_I = "(?:[ab]{2})*";
        System.out.println(Pattern.matches(expressao_I, "aabbbb")); // true
		System.out.println(Pattern.matches(expressao_I, "ab")); // true
        System.out.println(Pattern.matches(expressao_I, "abb")); // false

        System.out.println("Respostas para letra J");
        String expressao_J = "^[ab]([ab]{2})*$";
        System.out.println(Pattern.matches(expressao_J, "aabbb")); // true
		System.out.println(Pattern.matches(expressao_J, "ab")); // false
        System.out.println(Pattern.matches(expressao_J, "abb")); // true

        System.out.println("Respostas para letra K");
        String expressao_K = "(?:[ab]{4})*";
        System.out.println(Pattern.matches(expressao_K, "aabb")); // true
		System.out.println(Pattern.matches(expressao_K, "abbb")); // true
        System.out.println(Pattern.matches(expressao_K, "abb")); // false

        System.out.println("Respostas para letra L");
        String expressao_L = "b*(ab*ab*)*";
        System.out.println(Pattern.matches(expressao_L, "aabb")); // true
		System.out.println(Pattern.matches(expressao_L, "abbb")); // false
        System.out.println(Pattern.matches(expressao_L, "aabb")); // true
        
        System.out.println("Respostas para letra M");
        String expressao_M = "a*(ba*ba*)*ba*";
        System.out.println(Pattern.matches(expressao_M, "aaaab")); // true
		System.out.println(Pattern.matches(expressao_M, "aabbb")); // true
        System.out.println(Pattern.matches(expressao_M, "abb")); // false

 }
}