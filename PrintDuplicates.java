package AssignmentCode;

public class PrintDuplicates {
public static void main(String[] args) {
	int[] arr = {11,12,13,11,13,14,15,16,17,18,19};
	//Printing Duplicate numbers present in an array.
	System.out.println("Duplicate Numbers are:");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]+",");
			}
		}
}
}
}