package top.uaian.algorithm.leecode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                characters.push(')');
            } else if (s.charAt(i) == '[') {
                characters.push(']');
            } else if (s.charAt(i) == '{') {
                characters.push('}');
            } else if(characters.isEmpty() || characters.pop() != s.charAt(i)){
                return false;
            }
        }
        return characters.isEmpty();
    }


//    public static boolean isValid(String s) {
//        Stack<Character> characters = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
//                characters.push(s.charAt(i));
//            } else if(s.charAt(i) == ')'){
//                if(characters.isEmpty() || characters.pop() != '('){
//                    return false;
//                }
//            }else if(s.charAt(i) == ']'){
//                if(characters.isEmpty() || characters.pop() != '['){
//                    return false;
//                }
//            }else if(s.charAt(i) == '}'){
//                if(characters.isEmpty() || characters.pop() != '{'){
//                    return false;
//                }
//            }
//        }
//        if(!characters.isEmpty()){
//            return false;
//        }
//        return true;
//    }
}
