package Question_1;

/*
1. Extend the LinkedSet<E> class to a class called LinkedRRSet<E extends Comparable<E>>, it
overrides the add method of LinkedSet to put elements in a natural order (ie using the
elements compareTo method).

It also has methods retain and remove for dealing with ranges of elements.
Each method accepts two parameters of type E, start and end, which specify a
range of elements to retain or remove from the set (determined by the compareTo method
of the elements). If either parameter is null the range is considered open-ended.

The retain method:
should retain just those elements of the set that are between start (inclusive) and
end (exclusive), and return the elements that have been removed as a set.

The remove method:
does the opposite, retaining the elements that are outside the specified range, and
returning the elements removed as a set.

Include a driver main method to test the class with many variations.
(20 marks)
 */

/**
 * Created by Scott on 2/04/2017.
 */
public class LinkedRRSet<E extends Comparable<E>> extends LinkedSet<E>
{
	@Override public boolean add(E o)
	{
		// Its a set, so it cant add it if it already contains it
		if (!(contains(o)) && o != null)
		{
			Node<E> newNode = new Node<>(o);

			// if the LinedSet is empty, OR, the element needs to be added to the front
			if (firstNode == null || o.compareTo(firstNode.element) <= 0)
			{
				newNode.next = firstNode;
				firstNode = newNode;
			}
			else
			{
				Node<E> currentNode = firstNode;

				// This loop will keep iterating until it gets to the point where the element needs to be added
				// currentNode.next.element because first node is already checked, and we need to check the node
				// after it each time so we don't iterate over the node we want to add it too/
				while (currentNode.next != null && o.compareTo(currentNode.next.element) >= 0)
				{
					currentNode = currentNode.next;
				}

				newNode.next = currentNode.next;
				currentNode.next = newNode;
				numElements++;
			}

			return true;
		}

		return false;
	}

	public LinkedRRSet<E> retain(E start, E end)
	{
		LinkedRRSet<E> removedElements = new LinkedRRSet<>();

		Node<E> currentNode = firstNode;

		if (start != null)
		{
			// remove everything as you go until you find the start
			while (currentNode.next != null && start.compareTo(currentNode.next.element) >= 0)
			{
				removedElements.add(currentNode.element);
				Node<E> temp = currentNode.next;
				currentNode.next = null;
				currentNode = temp;
			}
		}

		firstNode = currentNode;

		if (end != null)
		{
			// iterate until you find the end
			while (currentNode.next != null && end.compareTo(currentNode.next.element) > 0)
			{
				currentNode = currentNode.next;
			}

			// remove the rest of the list
			while (currentNode.next != null)
			{
				removedElements.add(currentNode.next.element);
				Node<E> temp = currentNode.next;
				currentNode.next = null;
				currentNode = temp;
			}
		}

		return removedElements;
	}

	public LinkedRRSet<E> remove(E start, E end)
	{
		LinkedRRSet<E> removedElements = new LinkedRRSet<>();

		Node<E> currentNode = firstNode;
		Node<E> linkNode = null;

		if (start != null) // find the start (else just remove everything up to the end)
		{
			while (currentNode.next != null && start.compareTo(currentNode.next.element) > 0)
			{
				currentNode = currentNode.next;
			}

			linkNode = currentNode;
		}

		if (end != null) // then remove everything until you find the end
		{
			while (currentNode.next != null && end.compareTo(currentNode.element) > 0)
			{
				removedElements.add(currentNode.next.element);
				Node<E> temp = currentNode.next.next;
				currentNode.next.next = null;
				currentNode = temp;
			}

			// link the ends back up
			if (linkNode == null)
			{
				firstNode = currentNode;
			}
			else
			{
				linkNode.next = currentNode;
			}
		}
		else // remove the rest
		{
			// if remove everything, make sure fistNode is null
			if (start == null && end == null)
			{
				removedElements.add(firstNode.element);
				firstNode = null;
			}

			while (currentNode.next != null)
			{
				removedElements.add(currentNode.next.element);
				Node<E> temp = currentNode.next;
				currentNode.next = null;
				currentNode = temp;
			}
		}

		return removedElements;
	}

}
