import java.util.*;

class CountConsonants{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter the String ");
        String str = sc.next().toLowerCase();
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) != 'a') && (str.charAt(i) != 'e') && (str.charAt(i) != 'i') && (str.charAt(i) != 'o') && (str.charAt(i) != 'u')){
                count = count + 1;
            }
        }
        System.out.println(count);

    }
}