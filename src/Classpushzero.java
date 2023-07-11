
public class Classpushzero {

	public static void main(String[] args) {
		
		int a[]= {1,0,1,0,1,0,1,0,1,0};
		int n= a.length;
		moveZerotoend(a,n);
		System.out.println("array elements move to end");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

	 static void moveZerotoend(int a[], int n) {
		// TODO Auto-generated method stub
	int count=0;
	for(int i=0;i<n;i++) {
	if(a[i]!=0) {
		a[count++]=a[i];
	}
	
	}
	while(count<n) {
		a[count++]=0;
	}
	 }
}
