public class CountAndSay {
    public static String countAndSay(int n)
    {
        if(n<=0)
        {
            return "";
        }
        String result="1";
        for(int i=2;i<=n;i++)
        {
            result=generateNextTerm(result);
        }
        return result;
    }  
    public static String generateNextTerm(String str)
    {
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                count++;
            }
            else
            {
                result.append(count).append(str.charAt(i-1));
                count=1;
            }
        }
        result.append(count).append(str.charAt(str.length()-1));
        return result.toString();
    }  
    public static void main(String[] args) {
        int n=5;
        String result=countAndSay(n);
        System.out.println("The "+n+"th term in the Count and Say sequence is: "+result);
    }
}
