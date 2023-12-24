public class time {

        public static void main(String[] args) {
            long totalMilli=System.currentTimeMillis();
            long totalSecond=totalMilli/1000;
            long currentSecond=totalSecond%60;
            long totalMinutes=totalSecond/60;
            long currentMinutes=totalMinutes%60;
            long totalHours=totalMinutes/60;
            long currentHour=totalHours%24;
            System.out.println("Current time in india is "+currentHour+":"+currentMinutes+":"+currentSecond);
           
        }
        
    }
    
    

