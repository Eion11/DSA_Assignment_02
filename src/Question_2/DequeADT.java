package Question_2;

/**
 * Created by Scott on 2/04/2017.
 */
public interface DequeADT<E>
{
	public void enqueueFront(E element);

	public void enqueueRear(E element);

	public E dequeueFront();

	public E dequeueRear();

	public E first();

	public E last();

	public boolean isEmpty();

	public int size();
}
