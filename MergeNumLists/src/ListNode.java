
public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode() {
		this(0);
	}
	
	public ListNode(int val) {
		this.val = val;
	}
}

/* 
 public static ListNode solution(ListNode ln1, ListNode ln2) {
	ListNode result = new ListNode(0);
	ListNode cursor = result;
	ListNode finalize;
	
	while(notNull(ln1, ln2)) {
		cursor.val += ln1.val + ln2.val;
		if(cursor.val > 9) {
			cursor.val -= 10;
			cursor.next = new ListNode(1);
		} else if(!allNull(ln1.next, ln2.next)) {
			cursor.next = new ListNode();
		}
		
		cursor = cursor.next;
		ln1 = ln1.next;
		ln2 = ln2.next;
	}
	
	finalize = notNull(ln1) ? ln1 : ln2;
	
	while(notNull(finalize)) {
		cursor.val += finalize.val;
		if(cursor.val > 9) {
			cursor.val -= 10;
			cursor.next = new ListNode(1);
		} else if(notNull(finalize.next)) {
			cursor.next = new ListNode();
		}
		
		cursor = cursor.next;
		finalize = finalize.next;
	}
	
	return result;
}
 */