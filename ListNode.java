class ListNode {
	
	private Object info;
	private ListNode next = null;
	private ListNode prev = null;
	
	// Constructor to take Objects
	public ListNode(Object info) {
		this.info = info;
	}
	
	//Setters and Getters
	
	public void setInfo(Object info) {
		this.info = info;
	}
	
	public Object getInfo() {
		return this.info;
	}
	
	
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public ListNode getNext() {
		return this.next;
	}
	
	
	public void setPrev(ListNode prev){
		this.prev = prev;
	}
	
	public ListNode getPrev() {
		return this.prev;
	}
}