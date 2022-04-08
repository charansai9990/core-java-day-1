package Problem_Statement_2_3;

public class ArrayofElements {
	public static void main(String[] args) {
		
		int a[]= {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		
		//Sum of elements in an array
		int sum=0;	
		for(int i=0;i<a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Elements:" +sum);
		
		//Average of elements in an array
		int avg;
		avg=sum/18;
		System.out.println("Average of Elements: "+avg);
		
		//Smallest number in a given array
		int smallest=Integer.MAX_VALUE ;
		for(int number: a) {
			
			 if(number<smallest) {
				smallest=number;
			}
		}
		
		System.out.println("smallest number:" +smallest);
	
	}

}


