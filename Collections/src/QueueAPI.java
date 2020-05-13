import java.util.PriorityQueue;

public class QueueAPI {

	public static void main(String args[]) {
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	for(int i = 10; i>0; i--) {
		queue.add(i);
		
		
	}
	/*int head = queue.peek();
	System.out.println(">> head is: "+head+", size of queue is: "+queue.size());
	
	queue.poll();
	
	head = queue.peek();
	System.out.println(">> head is: "+head+", size of queue is: "+queue.size());
	*/
	
	for( int i =0; i<queue.size(); i++) {
		System.out.println(queue.peek());
		queue.poll();
	}
	}

}
