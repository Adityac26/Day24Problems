package D24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String n = sc.next();

        Pattern email = Pattern.compile("[A-Za-z0-9]{3,}[.,_+-]{0,1}[a-z0-9]{0,}[a-z0-9]{0,}@[a-z0-9]{1,}[.]{1}[a-z]{2,}[.,]{0,1}[a-z]{0,3}");
        Matcher m = email.matcher(n);
        boolean flag = m.matches();
        System.out.println(flag);

    }
}
