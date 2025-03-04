import java.util.*;
class InsertionSort{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n = in.nextInt();
		if(n <= 0){
			System.out.println("Enter a valid number");
			System.exit(0);
		}
		int a[] = new int[n];
		System.out.println("Enter the values: ");
		for(int i = 0; i < n; ++i){
			a[i] = in.nextInt();
		}
		
		//Insertion Sort
		
		System.out.println("Using Insertion Sort");

		for(int i = 1; i < n; ++i){
			int temp = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > temp){
				a[j + 1] = a[j];
				--j;
			}
			a[j + 1] = temp;
		}

		for(int i = 0; i < n; ++i){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}



