import java.util.Scanner;
public class Dollar {
    public static void main(String[] args) {
        int FDollar,FCent;
        int SDollar,SCent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Dollar you have:");
        FDollar = sc.nextInt();
        System.out.print("Total Cent you have:");
        FCent = sc.nextInt();
        System.out.print("Total Dollar you have:");
        SDollar = sc.nextInt();
        System.out.print("Total Cent you have:");
        SCent = sc.nextInt();
        int TotalCent = (FCent + SCent)/100;
        int remainingCent = (FCent + SCent)%100;
        int TotalDollar = FDollar + SDollar + TotalCent;
        System.out.println();
        System.out.println("Total Dollar is: " + TotalDollar);
        System.out.println("Total Cent is: " + remainingCent);
        sc.close();
    }
}
