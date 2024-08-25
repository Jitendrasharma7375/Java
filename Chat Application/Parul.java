

class Parul{
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String args[]){  
        Parul s1=new Parul();  
        Parul s2=new Parul();  
        s1=null;  
        s2=null;  
        System.gc(); 
        
        Runtime r=Runtime.getRuntime();  
        System.out.println("Total Memory: "+r.totalMemory());  
        System.out.println("Free Memory: "+r.freeMemory());  

        for(int i=0;i<10000;i++){  
            new Parul();  
        }  
           System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
           System.gc();  
           System.out.println("After gc(), Free Memory: "+r.freeMemory());  
    }  
}

