import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	int n,a,b,c;
	Scanner sc = new Scanner(System.in);
	n= sc.nextInt();
		for (int i=0; i<n; i++) {
			int[] lowest = new int[3];
			a=sc.nextInt();
			lowest[0]=a;
			b=sc.nextInt();
			lowest[1]=b;
			c=sc.nextInt();
			lowest[2]=c;
			java.util.Arrays.sort(lowest);
			System.out.println("Case "+(i+1)+": "+lowest[1]);
		}
	
}
}
