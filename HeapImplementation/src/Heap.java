import java.util.ArrayList;
import java.util.Scanner;
public class Heap {

	static ArrayList<Integer> items = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter next int, 'done' to stop: ");
		String line = sc.next();
		while (!line.equals("done")) {
			insertElement(Integer.parseInt(line));
			// System.out.println();
			System.out.print("Enter next int, 'done' to stop: ");
			line = sc.next();
		}

		for (int i : items) {
			System.out.println(i);

		}
		System.out.println("\n");

		int max = delete();
		System.out.println("the root that is deleted is " + " " + max);
		System.out.println("\n");

		System.out.println(" the new root is" + " " + items.get(0));

		for (int i : items) {
			System.out.println(i);
		}
		System.out.println("\n");

		for (int i : items) {
			System.out.println(i);
		}

	}

	public static void heapIfy() {
		int k = items.size() - 1;
		while (k > 0) {
			int p = (k - 1) / 2;
			int item = items.get(k);
			int parent = items.get(p);
			if (item > parent && parent > 0 && item > 0) {
				// swap
				items.set(k, parent);
				items.set(p, item);
				k = p;
			} else
				break;
		}
	}

	public static void siftDown() {
		int k = 0;
		int left = 2 * k + 1;
		while (left < items.size()) {
			int max = left;
			int right = left + 1;
			if (right < items.size()) {
				if (items.get(right) > items.get(left) && items.get(right) > 0 && items.get(left) > 0) {
					max++;
				}
			}
			if (items.get(max) > items.get(k)) {
				// switch
				// store the root;
				int temp = items.get(k);
				// store the last element in the place of the root.. this
				// deletes the root;
				items.set(k, items.get(max));
				items.set(max, temp);
				k = max;
				left = 2 * k + 1;

			} else
				break;
		}
	}

	public static void insertElement(int item) {
		items.add(item);
		heapIfy();

	}

	public static int delete() {
		if (items.size() == 0) {
			System.out.println("No element in the heap");
		}
		// if there is only one element remove it
		if (items.size() == 1) {
			items.remove(0);
		}
		// save the root
		int temp = items.get(0);
		// swap it with the last element in the heap
		items.set(0, items.get(items.size() - 1));
		// call sift down to position it
		siftDown();
		return temp;
	}

}
