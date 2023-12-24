public class Jitu {
    
    public static void main(String[] args) {
        Tarun abc =  new Tarun.getInstance();
        System.out.println(abc);    

        abc.setA(5);
        abc.setName("Jitu");

        System.out.println(abc.getA() + " " + abc.getName());




        Tarun obje2 = Tarun.getInstance();
        System.out.println(obje2);

        System.out.println(obje2.getA() + " " + obje2.getName());


    }


    // I am planning to write a code for calculator
    // I want to create a class for calculator
}
