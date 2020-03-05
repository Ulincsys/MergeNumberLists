
public class Main {
	public static void main(String[] args) { // setting up the stage
		ListNode ln1 = makeList(9, 2, 4, 9, 7, 5, 3, 8);
		ListNode ln2 = makeList(4, 4, 4, 6, 2, 8);
		ListNode cursor = new ListNode();
		
		solution(ln1, ln2, cursor);
		
		printList(cursor);
	}
	
	public static void solution(ListNode ln1, ListNode ln2, ListNode cursor) {
		if(Null(ln1) && Null(ln2)) {
			return;
		}
		
		cursor.val += (!Null(ln1) ? ln1.val : 0)
				+ (!Null(ln2) ? ln2.val : 0);
		if(cursor.val > 9) {
			cursor.val -= 10;
			cursor.next = new ListNode(1);
		} else if(hasNext(ln1) || hasNext(ln2)) {
			cursor.next = new ListNode();
		}
		cursor = cursor.next;
		ln1 = (!Null(ln1)) ? ln1.next : ln1;
		ln2 = (!Null(ln2)) ? ln2.next : ln2;
		solution(ln1, ln2, cursor);
	}
	
	public static boolean hasNext(ListNode node) {
		if(!Null(node) && !Null(node.next)) {
			return true;
		}
		return false;
	}
	
	public static boolean Null(ListNode... nodes) {
		for(ListNode node : nodes) {
			if(node != null) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void printList(ListNode list) {
		ListNode cursor = list;
		StringBuilder result = new StringBuilder("[ ");
		while(cursor != null) {
			result.append(cursor.val).append(
					(cursor.next != null) ? ", " : "");
			cursor = cursor.next;
		}
		System.out.println(result.append(" ]"));
	}
	
	public static ListNode makeList(int... nums) {
		ListNode list = new ListNode();
		
		ListNode cursor = list;
		
		for(int i : nums) {
			cursor.next = new ListNode(i);
			cursor = cursor.next;
		}
		
		return list.next;
	}
}






















