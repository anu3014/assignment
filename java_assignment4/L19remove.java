package Package1;
class ListNode3{
	int val;
	ListNode3 next;
	ListNode3(int val){
		this.val=val;
		this.next=null;
	}
}
class L19remove{
	public ListNode3 removeNthFromEnd(ListNode3 head, int n) {
        ListNode3 dummy = new ListNode3(0);
        dummy.next = head;
        ListNode3 first = dummy;
        ListNode3 second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return dummy.next;
    }
}