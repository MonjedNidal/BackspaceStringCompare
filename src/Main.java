import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c", "#a#"));
    }
    public static boolean backspaceCompare(String s, String t) {
        if (s != null && t != null){
            Stack<Character> stackS = new Stack<>();
            Stack<Character> stackT = new Stack<>();

            int temp = Math.max(s.length(), t.length());
            for (int i = 0; i < temp; i++) {
                if (i < s.length()){
                    if (s.charAt(i) != '#'){
                        stackS.push(s.charAt(i));
                    }else {
                        if (!stackS.isEmpty()){
                            stackS.pop();
                        }
                    }
                }
                if (i < t.length()){
                    if (t.charAt(i) != '#'){
                        stackT.push(t.charAt(i));
                    }else {
                        if (!stackT.isEmpty()){
                            stackT.pop();
                        }
                    }
                }
            }return stackS.equals(stackT);

        }return true;
    }
}