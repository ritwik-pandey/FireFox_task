import java.util.*;
class SelectionSort{
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

		// Selection Sort

		for(int i = 0; i < n; ++i){

			for(int j = i + 1; j < n; ++j){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Using Selection Sort");

		for(int i = 0; i < n; ++i){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
