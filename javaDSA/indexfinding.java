package javaDSA;
import java.util.*;
public class indexfinding{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array element:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the search element");
		int x=sc.nextInt();
		
		for(int i=0;i<n-1;i++) {
			if(a[i]==x) {
				System.out.println("index:"+i);
			}
		}
		sc.close();
	}

}