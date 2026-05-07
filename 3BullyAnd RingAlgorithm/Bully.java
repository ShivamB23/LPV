import java.util.Scanner;

public class Bully {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, coordinator;

        System.out.print("Enter number of processes: ");
        n = sc.nextInt();

        int process[] = new int[n];

        System.out.println("Enter process IDs:");

        for(int i = 0; i < n; i++) {
            process[i] = sc.nextInt();
        }

        coordinator = process[n-1];

        System.out.println("Coordinator is Process " + coordinator);

        System.out.print("Enter failed coordinator: ");
        int failed = sc.nextInt();

        System.out.print("Enter process initiating election: ");
        int initiator = sc.nextInt();

        System.out.println("\nElection messages are sent to:");

        for(int i = 0; i < n; i++) {

            if(process[i] > initiator &&
               process[i] != failed) {

                System.out.println("Process " +
                        initiator +
                        " --> Process " +
                        process[i]);
            }
        }

        int newCoordinator = -1;

        for(int i = 0; i < n; i++) {

            if(process[i] != failed) {

                newCoordinator = process[i];
            }
        }

        System.out.println("\nNew Coordinator is Process "
                + newCoordinator);

        sc.close();
    }
}