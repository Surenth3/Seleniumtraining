package Week1;

import java.util.Arrays;

public class Missedelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		for (int i = 1 ;i< a.length;i++) {
			if(a[i-1]!=i) {
				System.out.println(i);
				break;
			}
		}

	}

}
