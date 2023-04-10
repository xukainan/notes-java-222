package top.uaian.algorithm.leecode;

public class AddStrings {

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int index = 0, len1 = num1.length(), len2 = num2.length();
        int len = Math.min(len1, len2);
        int carry = 0;
        while (index < len) {
            int sum = getStringChar2Integer(num1, len1 - index - 1) + getStringChar2Integer(num2, len2 - index - 1) + carry;
            carry = sum / 10;
            res.append(sum % 10);
            index++;
        }
        if (len1 < len2){
            while (index < len2){
                int sum = getStringChar2Integer(num2, len2 - index - 1) + carry;
                carry = sum / 10;
                res.append(sum % 10);
                index++;
            }
        }else if(len2 < len1){
            while (index < len1){
                int sum = getStringChar2Integer(num1, len1 - index - 1)  + carry;
                carry = sum / 10;
                res.append(sum % 10);
                index++;
            }
        }
        if(carry > 0){
            res.append(1);
        }
        return res.reverse().toString();
    }

    public static Integer getStringChar2Integer(String s, Integer position){
        return Integer.valueOf(s.charAt(position)) - '0';
    }
}
