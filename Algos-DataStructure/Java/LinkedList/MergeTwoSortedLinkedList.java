 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    // Create a dummy node to represent the head of the merged list
    SinglyLinkedListNode dummy = new SinglyLinkedListNode(-1);
    SinglyLinkedListNode current = dummy;
    
    // Traverse both lists in parallel, comparing the nodes at each position
    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
           current.next = head1;
           head1 = head1.next;
        } else {
           current.next = head2;
           head2 = head2.next;
        }
       current = current.next;
    }
    
        // If either list still has remaining nodes, append them to the end of the merged list
    if (head1 != null) {
      current.next = head1;
    }
    if (head2 != null) {
      current.next = head2;
    }

   // Return the head of the merged list (excluding the dummy node)
   return dummy.next;
        
}