package Question_2;

/**
 * Created by Scott on 2/04/2017.
 */
public class Main_Q2_Linked
{
	public static void main(String[] args)
	{
		// Test many variations to prove it works
		LinkedDeque<Integer> linkedQue = new LinkedDeque<>();

		// Adding Elements
		System.out.println("Enqueue Rear:	5, 6, 7");
		linkedQue.enqueueRear(5);
		System.out.println(linkedQue);
		linkedQue.enqueueRear(6);
		System.out.println(linkedQue);
		linkedQue.enqueueRear(7);
		System.out.println(linkedQue);

		System.out.println("\nEnqueue Front:	4, 3");
		linkedQue.enqueueFront(4);
		System.out.println(linkedQue);
		linkedQue.enqueueFront(3);
		System.out.println(linkedQue);

		// Removing Elements
		System.out.println("\nRemoving Elements:");
		System.out.println("Dequeue Rear:	" + linkedQue.dequeueRear());
		System.out.println(linkedQue);
		System.out.println("Dequeue Rear:	" + linkedQue.dequeueRear());
		System.out.println(linkedQue);
		System.out.println("Dequeue Front:	" + linkedQue.dequeueFront());
		System.out.println(linkedQue);
		System.out.println("Dequeue Front:	" + linkedQue.dequeueFront());
		System.out.println(linkedQue);

		// Add more Elements
		System.out.println("\nEnqueue Rear:	8, 9");
		linkedQue.enqueueRear(8);
		System.out.println(linkedQue);
		linkedQue.enqueueRear(9);
		System.out.println(linkedQue);

		System.out.println("\nEnqueue Front:	1, 2");
		linkedQue.enqueueFront(2);
		System.out.println(linkedQue);
		linkedQue.enqueueFront(1);
		System.out.println(linkedQue);
	}
}
