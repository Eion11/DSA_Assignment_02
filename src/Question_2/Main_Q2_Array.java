package Question_2;

/**
 * Created by Scott on 2/04/2017.
 */
public class Main_Q2_Array
{
	public static void main(String[] args)
	{
		// Test many variations to prove it works
		ArrayDeque<Integer> arrayQue = new ArrayDeque<>();
		System.out.println(arrayQue);
		arrayQue.enqueueRear(3);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(4);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(5);
		System.out.println(arrayQue);

		arrayQue.enqueueFront(2);
		System.out.println(arrayQue);
		arrayQue.enqueueFront(1);
		System.out.println(arrayQue);
		arrayQue.enqueueFront(0);
		System.out.println(arrayQue);

		System.out.println(arrayQue.back);
		System.out.println(arrayQue.last());

		System.out.println("Dequeue Front: " + arrayQue.dequeueFront());
		System.out.println(arrayQue);

		System.out.println("Dequeue Front: " + arrayQue.dequeueFront());
		System.out.println(arrayQue);

		System.out.println("Dequeue Front: " + arrayQue.dequeueFront());
		System.out.println(arrayQue);

		System.out.println("Dequeue Back: " + arrayQue.dequeueRear());
		System.out.println(arrayQue);

		System.out.println("Dequeue Back: " + arrayQue.dequeueRear());
		System.out.println(arrayQue);

		System.out.println("Dequeue Back: " + arrayQue.dequeueRear());
		System.out.println(arrayQue);

		arrayQue.enqueueRear(1);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(4);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(5);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(3);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(4);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(5);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(3);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(4);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(5);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(3);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(4);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(5);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(3);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(4);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);

		System.out.println("Dequeue Front: " + arrayQue.dequeueFront());
		System.out.println(arrayQue);
		System.out.println("Dequeue Front: " + arrayQue.dequeueFront());
		System.out.println(arrayQue);
		System.out.println("Dequeue Front: " + arrayQue.dequeueFront());
		System.out.println(arrayQue);

		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
		arrayQue.enqueueRear(6);
		System.out.println(arrayQue);
	}
}
