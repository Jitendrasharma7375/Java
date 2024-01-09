//Praveen is crazy about IPL. He was watching mumbai indians vs. Chennar Super Kings final match. mumbai won the toss and elected to bat first. They finished batting with a score of X. Next, Chennai started to bat and scored Y runs in N number of balls. Now, Praveen wants to calculate the run rate and check whether there is a probability for Chennai to win or not. Help him calculate the run rate and check the probability.

//Input formats: Input consists of 4 integers,The first input corresponds to the total number of balls. The second input corresponds to the total number of runs. The third input corresponds to the number of runs scored. The fourth input corresponds to the number of balls bowled.

//Output format: The first output corresponds to the total number of overs. The second output corresponds to the total number of overs finished. The third output corresponds to the current run rate. The fourth output corresponds to total run rate.The fifth output corresponds to the eligibility,If eligible print "Eligible to Win" else print "Not Eligible to Win".

//input:300 375 78 45
//output: 50 7.3 3.2 5.4 Not eligible to win
import java.util.*;
public class Cricket {
    public static void main(String[] args) {
        int totalBalls, totalRuns, runsScored, ballsBowled;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of balls:");
        totalBalls = sc.nextInt();
        System.out.print("Enter total number of runs:");
        totalRuns = sc.nextInt();
        System.out.print("Enter number of runs scored:");
        runsScored = sc.nextInt();
        System.out.print("Enter number of balls bowled:");
        ballsBowled = sc.nextInt();
        int totalOvers = totalBalls / 6;
        float oversFinished = (ballsBowled / 6)+(float)(ballsBowled % 6) / 10;
        float currentRunRate = (float) runsScored / oversFinished;
        float totalRunRate = (float) totalRuns / totalOvers;
        if (currentRunRate >= totalRunRate) {
            System.out.println(totalOvers + " " + oversFinished + " " + currentRunRate + " " + totalRunRate + " Eligible to Win");
        } else {
            System.out.println(totalOvers + " " + oversFinished + " " + currentRunRate + " " + totalRunRate + " Not Eligible to Win");
        }
        sc.close(); 
       }
}
