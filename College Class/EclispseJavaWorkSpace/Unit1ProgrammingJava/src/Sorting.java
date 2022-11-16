
public class Sorting {
	public static void Sort(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[j]>arr[i]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("After Descending Sorting: ");
		for(int item:arr) { //Enhanced Loop
			System.out.println(item);
		}
	}
	
	public static void Sort1(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("After Ascending Sorting: ");
		for(int item:arr) { //Enhanced Loop
			System.out.println(item);
		}
	}


	public static void main(String[] args) {
		int[] num = {3,2,4,57,8,9,1,5};
		System.out.println("Before Sorting: ");
		for(int i=0; i< num.length ; i++) {
			System.out.println(num[i]);
		}
		Sort(num);
		Sort1(num);
		
		
	}
}


//Ctrl + Shift + F --> For formatting 
// For System.out.println --> sysout --> ctrl + space bar