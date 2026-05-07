import java.util.Scanner;

public class Ring {

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

        System.out.print("Enter failed coordinator: ");
        int failed = sc.nextInt();

        System.out.print("Enter initiator process: ");
        int initiator = sc.nextInt();

        System.out.println("\nProcesses in ring are:");

        for(int i = 0; i < n; i++) {

            if(process[i] != failed) {

                System.out.print(process[i] + " ");
            }
        }

        int coordinator = -1;

        for(int i = 0; i < n; i++) {

            if(process[i] != failed) {

                coordinator = process[i];
            }
        }

        System.out.println("\n\nNew Coordinator is Process "
                + coordinator);

        sc.close();
    }
}