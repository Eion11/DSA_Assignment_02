package Question_2;

/**
 * Created by Scott on 2/04/2017.
 */
public class Node<E>
{
	public E       element;
	public Node<E> next;
	public Node<E> previous;

	public Node(E element)
	{
		this.element = element;
		this.next = null;
		this.previous = null;
	}
}
