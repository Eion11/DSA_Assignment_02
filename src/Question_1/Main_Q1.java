package Question_1;

/**
 * Created by Scott on 2/04/2017.
 */
public class Main_Q1
{
	public static void main(String[] args)
	{
		// Testing how LinkedSet works
		System.out.println("Old LinkedSet: ");
		LinkedSet<Integer> oldSet = new LinkedSet<>();
		oldSet.add(5);
		oldSet.add(4);
		oldSet.add(7);
		oldSet.add(9);
		oldSet.add(2);
		oldSet.add(3);
		System.out.println(oldSet);

		// Testing my new LinkedRRSet
		System.out.println("\nNew LinkedRRSet: ");
		LinkedRRSet<Integer> newSet = new LinkedRRSet<>();
		newSet.add(5);
		System.out.println("Add 5:				" + newSet);
		newSet.add(7);
		System.out.println("Add 7:				" + newSet);
		newSet.add(null);
		System.out.println("Add null:			" + newSet);
		newSet.add(9);
		System.out.println("Add 9:				" + newSet);
		newSet.add(8);
		System.out.println("Add 8:				" + newSet);
		newSet.add(8);
		System.out.println("Add 8:				" + newSet);
		newSet.add(2);
		System.out.println("Add 2:				" + newSet);
		newSet.add(3);
		System.out.println("Add 3:				" + newSet);

		// Testing Retain
		System.out.println("\nTesting Retain: ");
		System.out.println("														 " + newSet);

		System.out.println("Retain null-null:		Removed: " + newSet.retain(null, null) + " 			New Set: " + newSet);
		System.out.println("Retain null-8:			Removed: " + newSet.retain(null, 8) + " 		New Set: " + newSet);
		System.out.println("Retain 3-8				Removed: " + newSet.retain(3, 8) + " 			New Set: " + newSet);
		System.out.println("Retain 5-null:			Removed: " + newSet.retain(5, null) + " 			New Set: " + newSet);
		System.out.println("Retain 5-5:				Removed: " + newSet.retain(5, 5) + " 			New Set: " + newSet);

		// Testing Remove
		System.out.println("\nTesting Remove: ");
		newSet.add(2);
		newSet.add(3);
		newSet.add(7);
		newSet.add(8);
		newSet.add(9);
		System.out.println("Adding:													 " + newSet);
		System.out.println("Remove 5-5:				Removed: " + newSet.remove(5, 5) + " 			New Set: " + newSet);
		System.out.println("Remove 3-7:				Removed: " + newSet.remove(3, 7) + " 			New Set: " + newSet);
		System.out.println("Remove null-8:			Removed: " + newSet.remove(null, 8) + " 			New Set: " + newSet);
		newSet.add(8);
		newSet.add(2);
		newSet.add(3);
		System.out.println("Adding:													 " + newSet);
		System.out.println("Remove 4-null:			Removed: " + newSet.remove(4, null) + " 		New Set: " + newSet);
		System.out.println("Remove null-null:		Removed: " + newSet.remove(null, null) + " 		New Set: " + newSet);
	}
}
