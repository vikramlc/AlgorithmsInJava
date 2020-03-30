import java.util.*;

public class Main {

    private static Map<Character, Character> matchingParenMap = new HashMap<>();
    private static Set<Character> openingParenSet = new HashSet<>();

    static {
        matchingParenMap.put(')', '(');
        matchingParenMap.put('}', '{');
        matchingParenMap.put('[', '[');
        openingParenSet.addAll(matchingParenMap.values());
    }

    public static void main(String[] args) {
        System.out.println(String.format(
                "Has matching parens %s? : %s", "(abcd)", hasMatchingParens("(abcd)")));
        System.out.println(String.format(
                "Has matching parens %s? : %s", "{{{{}}", hasMatchingParens("{{{{}}")));
        System.out.println(String.format(
                "Has matching parens %s? : %s", "{{{{}}})", hasMatchingParens("{{{{}}})")));
        System.out.println(String.format(
                "Has matching parens %s? : %s", "{{{}}}()", hasMatchingParens("{{{}}}()")));
        System.out.println(String.format(
                "Has matching parens %s? : %s", "{{{}}]()", hasMatchingParens("{{{}}]()")));
        System.out.println(String.format(
                "Has matching parens %s? : %s", "{{}}([]){}{}{}{}{[[[[]]]]}",
                hasMatchingParens("{{}}([]){}{}{}{}{[[[[]]]]}")));
    }

    private static boolean hasMatchingParens(String input) {
        Stack<Character> parenStack = new Stack<>();

        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);

            if(openingParenSet.contains(ch)) {
                parenStack.push(ch);
            }
            if(matchingParenMap.containsKey(ch)) {
                char lastParen = parenStack.pop();
                if(lastParen != matchingParenMap.get(ch)) {
                    return false;
                }
            }
        }

        return parenStack.isEmpty();
    }
}
