
class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Middle_Element
{
    int getMiddle(Node head)
    {
        Node slow = head;
		Node fast = head;
		
		while (slow.next!=null && fast.next!=null && fast.next.next!=null){
		slow = slow.next;
		fast = fast.next.next;
		}
		
		if (fast.next!=null){
		slow = slow.next;
		}
		
		return slow.data;


    }
}