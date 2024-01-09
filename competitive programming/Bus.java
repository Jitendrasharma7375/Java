import java.util.Scanner;
public class Bus {
    public static void main(String[] args) {
        int busCapacity,groups;
        int passangers[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the bus:");
        busCapacity = sc.nextInt();
        System.out.print("Enter the number of groups:");
        groups = sc.nextInt();
        System.out.println("Enter the number of passangers in each group:");
        for(int i=0;i<groups;i++)
        {
            passangers[i] = sc.nextInt();
        }
        int busRequired = 0;
        int sum=0;
        for(int i=0;i<passangers.length;i++)
        {
            if(sum+passangers[i]>busCapacity)
            {
                busRequired++;
                sum=passangers[i];
            }
            else
            {
                sum+=passangers[i];
            }
        }
        if(sum>0)
        {
            busRequired++;
        }
        System.out.println("The number of buses required are "+busRequired);
        sc.close();
    }
}
