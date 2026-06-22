import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println(a);

        sc.nextLine(); // Consume the newline character left by nextInt()
        
        System.out.println("Enter the value of s :");
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
