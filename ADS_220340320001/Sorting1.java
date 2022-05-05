
import java.util.*;
class Sorting1{
	void insertionSort(int a1[]){
		int n = a1.length;
		for(int i=1; i<n; i++){
			int k = a1[i];
			int j = i-1;
			while(j>=0 && a1[j]>k){
				a1[j+1] =a1[j];
				j = j-1;
			}
			display(a1);
			a1[j+1] = k;
			
		}
	}
	static void display(int a1[]){
		int n = a1.length;
		for(int i=0; i<n; i++){
			System.out.print(a1[i]+" ");
		}
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of Array ");
		int n = sc.nextInt();
		int a1[] = new int[n];
		System.out.println("Array elements ");
		for(int i=0; i<n; i++){
			a1[i] = sc.nextInt();
		}
		Sorting1 s = new Sorting1();
		s.insertionSort(a1);
		s.display(a1);
		
		
	}
}