package Package1;
class ListNode4{
	int val;
	ListNode4 next;
	ListNode4(int val){
		this.val=val;
		this.next=null;
	}
}
class L2addtwonumber{
	public ListNode4 addTwoNumbers(ListNode4 l1, ListNode4 l2) {
        ListNode4 dummy = new ListNode4(0);
        ListNode4 curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode4(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
}