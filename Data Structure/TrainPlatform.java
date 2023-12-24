//function :check if the train can be parked in the platform
//input: the number of the train and the number of the platform
//output: the number of the platform required
public class TrainPlatform
{
    public static void main(String[] args) {
        int arrival[]={1000,1100,1235,1240,1245,1300,1500}; 
        int departure[]={1130,1200,1240,1300,1305,1400,1600};
        int n=arrival.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=0;j<n;j++)
            {
                if(arrival[i]>=arrival[j] && arrival[i]<=departure[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
            }
        }
        System.out.println("The number of platforms required is: "+max);

    }
}