package AssignmentCode;

public class FindingIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5,6,7,8,9};
		int b[]= {8,7,6,1,0,9,0,0,2,};
		System.out.println("Intersecting elements are:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
