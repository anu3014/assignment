package Package1;
class ListNode2{
	int val;
	ListNode2 next;
	ListNode2(int val){
		this.val=val;
		this.next=null;
	}
}
class L876middlell{
	public ListNode2 middleNode(ListNode2 head) {
        ListNode2 slow = head;
        ListNode2 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}