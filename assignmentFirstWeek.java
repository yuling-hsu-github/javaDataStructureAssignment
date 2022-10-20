package assginment1;

public class assignmentFirstWeek {
	//Print out prime number counting from 1 to 100000 for each 10000
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 10001;
		for (int i = 1; i<100000; i=i+10000) {
			if ((i+10000)==counter) {
			long nanoTime1 = System.nanoTime();
			System.out.println("Prime Number from " + i + " to "+counter+".");
			primecounting(i,counter);
			counter+=10000;
			long nanoTime2 = System.nanoTime();
			
			float runTimeInNanoSeconds = (nanoTime2 - nanoTime1);
			//Q: how to change nanoseconds to seconds
		        System.out.println("Time taken by for loop : " + runTimeInNanoSeconds + " nano seconds");
		    }  
		}

			}

	
	//Create a method to identify each number is prime or not, I choose to calculate nonprime number first then total-nonprime
	public static int primecounting(int str, int end){

		int nonprimeNumber = 0;
		//0-10000 prime number

		
		for(int i = str; i<end; i++) {		    
			for(int j = 2; j<=(i-2); j++) {
				if(i%j==0){
					//System.out.println(i);
					nonprimeNumber = nonprimeNumber + 1;
					break;
					}
				else{	
					  continue;	
	}}
	}
		System.out.println("Total prime number: " + (end - str - nonprimeNumber ));
		return end  - str - nonprimeNumber ;	
	}		
	
	}

