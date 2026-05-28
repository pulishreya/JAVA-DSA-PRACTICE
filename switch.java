import java util. Scanner ;
public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();    
        int result = square(n);
        System.out.println("the square of " + n + " is " + result);                     
        sc.close();
        