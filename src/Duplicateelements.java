
public class Duplicateelements {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,7,2,4,3,5,7,8,9,2};
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j] && i!=j)) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
