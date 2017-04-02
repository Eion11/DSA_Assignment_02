package Question_2;
/*
A deque (pronounced deck) or double-ended queue is a linear collection that allows
insertion and deletion at both ends, such as described by the following interface available on
Blackboard

Prepare two classes called ArrayDeque and LinkedDeque for implementing deques which
have O(1) methods for enqueue and dequeue methods at both ends.

Do not use an existing data structure, create your own using an underlying array or nodes.
Include a driver main method to test all aspects of the class with some suitable output.
(20 marks)
 */

/**
 * Created by Scott on 2/04/2017.
 */
public class LinkedDeque<E> implements DequeADT<E>
{
	protected int     numElements = 0;
	protected Node<E> firstNode   = null;
	protected Node<E> lastNode    = null;

	@Override public void enqueueFront(E element)
	{
		Node<E> newNode = new Node<>(element);

		newNode.next = firstNode;

		if (numElements == 0)
		{
			lastNode = newNode;
		}
		else
		{
			firstNode.previous = newNode;
		}

		firstNode = newNode;
		numElements++;
	}

	@Override public void enqueueRear(E element)
	{
		Node<E> newNode = new Node<>(element);

		newNode.previous = lastNode;

		if (numElements == 0)
		{
			firstNode = newNode;
		}
		else
		{
			lastNode.next = newNode;
		}

		lastNode = newNode;
		numElements++;
	}

	@Override public E dequeueFront()
	{
		E returnElement = firstNode.element;
		firstNode = firstNode.next;

		firstNode.previous = null;

		return returnElement;
	}

	@Override public E dequeueRear()
	{
		E returnElement = lastNode.element;
		lastNode = lastNode.previous;

		lastNode.next = null;

		return returnElement;
	}

	@Override public E first()
	{
		return firstNode.element;
	}

	@Override public E last()
	{
		return lastNode.element;
	}

	@Override public boolean isEmpty()
	{
		if (numElements == 0)
		{
			return true;
		}
		return false;
	}

	@Override public int size()
	{
		return numElements;
	}

	@Override public String toString()
	{
		String text = "[ ";

		Node<E> currentNode = firstNode;

		while (currentNode != null)
		{
			text += currentNode.element.toString();

			if (currentNode.next != null)
			{
				text += ", ";
			}

			currentNode = currentNode.next;
		}

		text += " ]";

		return text;
	}
}
