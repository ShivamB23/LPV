import java.util.Scanner;

public class TokenRing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        int process[] = new int[n];

        System.out.println("Enter process IDs:");

        for(int i = 0; i < n; i++) {
            process[i] = sc.nextInt();
        }

        System.out.print("Enter process requesting critical section: ");
        int req = sc.nextInt();

        System.out.println("\nToken Passing:");

        for(int i = 0; i < n; i++) {

            System.out.println("Token passed to Process "
                    + process[i]);

            if(process[i] == req) {

                System.out.println("\nProcess "
                        + req +
                        " enters Critical Section");

                System.out.println("Process "
                        + req +
                        " exits Critical Section\n");
            }
        }

        System.out.println("Token returned to first process");

        sc.close();
    }
}