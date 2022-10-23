package INeuronAssignments;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=1; i<=n; i++ ) {
			//I
			for(int j=1; j<=n; j++) {
				if((i>=n/4 && j==(n+1)/2) && i<=(3*n)/4 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//N
			for(int j=1; j<=n; j++) {
				if((j==n/4 && i>=n/4 && i<=(3*n)/4) || 
						(j==i && j>=n/4 && j<=(3*n)/4) ||
						(j==(3*n)/4) && i>=n/4 && i<=(3*n)/4) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
			}
			
			
			//E
			for(int j=1; j<=n; j++) {
				if((i==n/4 || i==(n)/2 || i==(3*n)/4) && (j<=(3*n)/4 && j>=n/4)|| 
						(j==n/4 && i>=n/4 && i<=(3*n)/4) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//U
			for(int j=1; j<=n; j++) {
				if(((j==n/4 || j==(3*n)/4) && (i>=n/4 && i<(3*n)/4)) ||
						(i==(3*n)/4) && j>n/4 && j<(3*n)/4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//R
			for(int j=1; j<=n; j++) {
				if((i==n/4 || i==(n)/2 ) &&(j>=n/4 &&j<(3*n)/4 ) ||
						(j==(3*n)/4 && i>n/4 && i<(n)/2) ||
						(j==n/4) && i>=n/4 && i<=(3*n)/4 ||
						(i>=n/2 && i==j && j<=(3*n)/4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//o
			for(int j=1; j<=n; j++) {
				if((i==n/4 || i==(3*n)/4) && (j>n/4 && j<(3*n)/4) || 
						(j==n/4 || j==(3*n)/4) && (i>n/4 && i<(3*n/4))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//N
			for(int j=1; j<=n; j++) {
				if((j==n/4 && i>=n/4 && i<=(3*n)/4) || 
						(j==i && j>=n/4 && j<=(3*n)/4) ||
						(j==(3*n)/4) && i>=n/4 && i<=(3*n)/4) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
