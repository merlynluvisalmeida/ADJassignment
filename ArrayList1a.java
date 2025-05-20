package arrayList;
	import java.util.*;

	public class ArrayList1a {
	    public static void main(String[] args) {
	        // 1. Adding elements
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        System.out.println("Initial ArrayList: " + arrayList);
	        System.out.println("Initial LinkedList: " + linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Grapes");
	        linkedList.add(1, "Grapes");

	        System.out.println("\nAfter adding 'Grapes' at index 1:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        System.out.println("\nAfter adding multiple elements:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 4. Accessing elements
	        System.out.println("\nElement at index 2 in ArrayList: " + arrayList.get(2));
	        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(0, "Strawberry");
	        linkedList.set(0, "Strawberry");

	        System.out.println("\nAfter updating element at index 0:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 6. Removing elements
	        arrayList.remove("Grapes");
	        linkedList.remove("Grapes");

	        System.out.println("\nAfter removing 'Grapes':");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);

	        // 7. Searching elements
	        System.out.println("\nSearching 'Banana':");
	        System.out.println("ArrayList contains 'Banana'? " + arrayList.contains("Banana"));
	        System.out.println("LinkedList contains 'Banana'? " + linkedList.contains("Banana"));

	        // 8. List size
	        System.out.println("\nSize of ArrayList: " + arrayList.size());
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating over list using for-each
	        System.out.println("\nIterating ArrayList using for-each:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        System.out.println("\nIterating LinkedList using for-each:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("\nIterating ArrayList using Iterator:");
	        Iterator<String> arrayListIterator = arrayList.iterator();
	        while (arrayListIterator.hasNext()) {
	            System.out.println(arrayListIterator.next());
	        }

	        System.out.println("\nIterating LinkedList using Iterator:");
	        Iterator<String> linkedListIterator = linkedList.iterator();
	        while (linkedListIterator.hasNext()) {
	            System.out.println(linkedListIterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);

	        System.out.println("\nSorted ArrayList: " + arrayList);
	        System.out.println("Sorted LinkedList: " + linkedList);

	        // 12. Sublist
	        List<String> arraySubList = arrayList.subList(1, 3);
	        List<String> linkedSubList = linkedList.subList(1, 3);

	        System.out.println("\nSublist from index 1 to 3:");
	        System.out.println("ArrayList Sublist: " + arraySubList);
	        System.out.println("LinkedList Sublist: " + linkedSubList);

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();

	        System.out.println("\nAfter clearing the lists:");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("LinkedList: " + linkedList);
	    }
	}

