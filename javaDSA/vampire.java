package javaDSA;
import java.util.*;
public class vampire{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int maxEnergy=0;
        System.out.println("Enter the Size of people:");
        int s=sc.nextInt();
        String a[]=new String[s];
        System.out.println("Enter the people:");
        for(int i=0;i<s;i++){
            a[i]=sc.next();
        }
        for(int j=1;j<s;j++){
                if((Integer.parseInt(a[j-1]))<(Integer.parseInt(a[j]))){
                    if(maxEnergy<(Integer.parseInt(a[j]))){
                        maxEnergy=Integer.parseInt(a[j]);
                    }
                }
        }
        System.out.println(maxEnergy);
        sc.close();
    }
}