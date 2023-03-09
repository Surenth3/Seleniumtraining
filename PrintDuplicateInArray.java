package Week1;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = a.length;
		for (int i=0;i<len;i++) {
			for (int j=i+1;j<len-1;j++) {
				if (a[i]==a[j]) {
					System.out.println("Duplicate no is: "+ a[i]);
				}
			}
		}

	}

}
