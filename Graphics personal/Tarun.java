public class Tarun {
    
    Integer a;
    String name;

    public Tarun(Integer a, String name) {
        this.a = a;
        this.name = name;
    }


    // public static void main(String[] args) {
    //     Tarun t = new Tarun(1, "Tarun");
    //     Tarun t1 = new Tarun(1, "Tarun");
    //     System.out.println(t.equals(t1));
    // }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tarun) {
            Tarun t = (Tarun) obj;
            if (t.a == this.a && t.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }


    public Integer getA() {
        return a;
    }


    public void setA(Integer a) {
        this.a = a;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    // i want to create a sigleton object of this class

    // private static Tarun t = null;

    // public static Tarun getInstance() {
    //     if (t == null) {
    //         t = new Tarun(1, "Tarun");
    //     }
    //     return t;
    // }

}
