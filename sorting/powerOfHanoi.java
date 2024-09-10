package sorting;

public class powerOfHanoi {
    public static void main(String[] args){
        int a=2;
        move(a, "source", "dest","help");
    }
    private static void move(int n,String source,String dest,String help){
        if(n<=0){
            return;
        }
        move(n-1, source,help,dest);
        System.out.println("disk "+n+" moving "+source+" to "+dest);
        move(n-1,help,dest,source);
    }
}