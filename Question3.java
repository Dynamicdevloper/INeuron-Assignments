package INeuronAssignments;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=14;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				
				if(i+j<=n/2+1 || (j-i>=n/2-1 && j!=n/2) || (i==1) || j==1
						|| j==n || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
