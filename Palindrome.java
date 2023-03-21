public class Palindrome {
    public static void main(String[] args) {
        String[] strMain = "java Palindrome madam racecar apple kayak song noon".split(" ");//ввод и сплит строки по пробелам
        for (String s : strMain) {
            System.out.println(isPalindrome(s) + "\t" + s + "\t" + reverseString(s));//вывод результата
        }
    }

    public static String reverseString(String s) {
        StringBuilder newstr = new StringBuilder();//создание новой строки 
        for (int i = s.length() - 1; i >= 0; i--) {//добавление новой перевернутой строки
            newstr.append(s.charAt(i));
        }
        return newstr.toString();
    }

    public static boolean isPalindrome(String s) {//проверка на палиндром с помощью equals
        return s.equals(reverseString(s));
    }
}