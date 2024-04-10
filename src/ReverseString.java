import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("insira uma String");
        String str = scan.nextLine();
        StringBuilder strReverse = new StringBuilder();

        for (int  i = str.length() -1 ;i >= 0 ; i--){
            strReverse.append(str.charAt(i));
        }
        System.out.println(strReverse);
    }
}
