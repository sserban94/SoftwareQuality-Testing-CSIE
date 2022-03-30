package algo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ParanthesesProblem {
    public static void checkParantheses(String text) {
        for (int i = 0; i < text.length(); i++){
            Deque<Character> deque = new ArrayDeque<>();
            char c = text.charAt(i);
            if (c == '{' || c == '[' || c == '('){
                deque.add(c);
            }
        }
    }
}
