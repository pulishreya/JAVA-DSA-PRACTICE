import java.util.Scanner;
public class reverse {
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = 12345;
    int reverse = 0;
    while (n > 0){
        int digit = n %10;
        reverse = reverse*10+digit;
        n = n/10;
    }
    System.out.print(reverse);
}
}
