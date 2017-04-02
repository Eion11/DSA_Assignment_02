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
public class ArrayDeque<E> implements DequeADT<E>
{
	protected final int INITIAL_CAPACITY = 20;
	protected E[] elements;

	protected int numElements = 0;
	protected int front       = 0;
	protected int back        = 0;

	public ArrayDeque()
	{
		elements = (E[]) (new Object[INITIAL_CAPACITY]);
	}

	@Override public void enqueueFront(E ele)
	{
		if (numElements == 0)
		{
			elements[0] = ele;
			back = 0;
			front = 0;
			numElements++;
		}
		else if (front - 1 < 0) // goes to the array max if the front is at 0
		{
			if (elements[INITIAL_CAPACITY - 1] == null) // make sure there isnt something in the spot already
			{
				elements[INITIAL_CAPACITY - 1] = ele;
				front = INITIAL_CAPACITY - 1;
				numElements++;
			}
		}
		else
		{
			if (elements[front - 1] == null) // make sure there isnt something in the spot already
			{
				elements[--front] = ele;
				numElements++;

			}
		}
	}

	@Override public void enqueueRear(E ele)
	{
		if (numElements == 0)
		{
			elements[0] = ele;
			back = 0;
			front = 0;
			numElements++;
		}
		else if (back + 1 > INITIAL_CAPACITY - 1) // Loops back around if its adding over the array size
		{
			if (elements[0] == null) // make sure there isnt something in the spot already
			{
				elements[0] = ele;
				back = 0;
				numElements++;
			}
		}
		else
		{
			if (elements[back + 1] == null) // make sure there isnt something in the spot already
			{
				elements[++back] = ele;
				numElements++;
			}
		}
	}

	@Override public E dequeueFront()
	{
		if (numElements > 0) // Makes sure there are elements in the array
		{
			E theFront = elements[front];

			elements[front] = null;

			if (front + 1 > INITIAL_CAPACITY - 1)
			{
				front = 0;
			}
			else
			{
				front++;
			}

			numElements--;

			return theFront;
		}

		return null;
	}

	@Override public E dequeueRear()
	{
		if (numElements > 0) // Makes sure there are elements in the array
		{
			E theBack = elements[back];

			elements[back] = null;

			if (back - 1 < 0)
			{
				back = INITIAL_CAPACITY - 1;
			}
			else
			{
				back --;
			}

			numElements--;

			return theBack;
		}

		return null;
	}

	@Override public E first()
	{
		return elements[front];
	}

	@Override public E last()
	{
		return elements[back];
	}

	@Override public boolean isEmpty()
	{
		if (numElements > 0)
		{
			return false;
		}

		return true;
	}

	@Override public int size()
	{
		return numElements;
	}

	@Override public String toString()
	{
		String text = "[ ";

		int counter = front;
		for (int n = 0; n < numElements; n++)
		{
			text += elements[counter].toString();

			if (counter + 1 > INITIAL_CAPACITY - 1)
			{
				counter = 0;
			}
			else
			{
				counter++;
			}

			if (n < numElements-1)
			{
				text += ", ";
			}
		}

		text += " ]";
		return text;
	}
}
