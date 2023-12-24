public class CarMileage {
    private double mileage;
    CarMileage()
    {
        mileage=0;
    }
    public void drive(double distance)
    {
        if(distance>0)
        {
            mileage+=distance;
        }
        else 
        {
            System.out.println("Distance must be greater than 0.");
        }
    }
    public double getMileage(){
        return mileage;
    }
    public static void main(String[] args) {
        CarMileage c=new CarMileage();
        System.out.println("Mileage:"+c.getMileage());
        c.drive(10);
        System.out.println("Mileage:"+c.getMileage());
        c.drive(10);
        System.out.println("Mileage:"+c.getMileage());
    }
}
