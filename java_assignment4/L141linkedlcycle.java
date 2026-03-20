package Package1;
class ListNode1{
	int val;
	ListNode1 next;
	ListNode1(int val){
		this.val=val;
		this.next=null;
	}
}
class L141linkedlcycle{
	public boolean hasCycle(ListNode1 head) {
        if (head == null) return false;

        ListNode1 slow = head;
        ListNode1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }
}