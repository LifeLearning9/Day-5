import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Map<Character, Integer> a = Map.ofEntries(
            Map.entry('I', 1),
            Map.entry('V', 5),
            Map.entry('X', 10),
            Map.entry('L', 50),
            Map.entry('C', 100),
            Map.entry('D', 500),
            Map.entry('M', 1000)
        );
       String s=sc.next();
       int sum=0;
       int cur=a.get(s.charAt(0));
       for(int i=1;i<s.length();i++)
       {
           int next=a.get(s.charAt(i));
           if(cur>=next)
           sum=sum+cur;
           else
           sum=sum-cur;
           
         cur=next;
       }
       sum=sum+cur;
       System.out.println(sum);
    }
}
