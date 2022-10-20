package assginment1;
import java.util.*;//代表導入所有那個類別的方法
public class javaassignment3 {
	//arraylist
	public static void homework3(int n){
		System.out.println("<Homework.HW3>java ListCoomparssion");
		//arrayadd
		long startime = System.nanoTime();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i<n;i++) {
			array.add(i);
		}
		long endtime = System.nanoTime();
		double estimatetime = (endtime-startime)/1000000000.0;
		System.out.println("Arraylist add: " + estimatetime + "sec");
		
		long liststartime = System.nanoTime();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i<n;i++) {
			list.add(i);
		}
		long listendtime = System.nanoTime();
		double listestimatetime = (listendtime-liststartime)/1000000000.0;
		System.out.println("Linkedlist add: " + listestimatetime + "sec");
		
		//arrayget
		long startimeget = System.nanoTime();
		long endtimeget = System.nanoTime();
		double estimatetimeget = (endtimeget-startimeget)/1000000000.0;
		System.out.println("Arraylist get: "+ estimatetimeget + "sec");
		//listget
		long getstartime = System.nanoTime();
		long getendtime = System.nanoTime();
		double getestimatetime = (getendtime-getstartime)/1000000000.0;
		System.out.println("Linkedlist get: " + getestimatetime + "sec");
		//arrayremove
		long startimeremove = System.nanoTime();			
		for(int i = 999999; i>-1;i--) {
			array.add(i);
		}		
		long endtimeremove = System.nanoTime();
		double estimatetimeremove = (endtimeremove-startimeremove)/1000000000.0;
		System.out.println("Arraylist remove: "+ estimatetimeremove + "sec");
		//listremove
		long liststarttimeremove = System.nanoTime();			
		for(int i = 999999; i>-1;i--) {
			array.add(i);
		}		
		long listendtimeremove = System.nanoTime();
		double listtimeremove = (listendtimeremove-liststarttimeremove)/1000000000.0;
		System.out.println("Linkedlist remove: "+ listtimeremove + "sec");
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homework3(1000000);
		
		
		
	}

}
