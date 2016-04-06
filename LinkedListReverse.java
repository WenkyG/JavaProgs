class Node{
	public int data;
	public Node next_node;
	
	public Node(){
		this.data = 0;
		this.next_node = null;
	}
	public Node(int data){
		this.data = data;
		this.next_node = null;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setNext(Node next_node){
		this.next_node = next_node;
	}
	public int getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next_node;
	}
}

class LList {
	public Node head;
	public Node tail;

	public LList(){
		this.head = null;
		this.tail = null;
	}

	public void insert(int data){
		Node obj = new Node(data);
		if(head == null){
			head = obj;
			tail = obj;
		} else {
			tail.setNext(obj);
			tail = obj;
		}
	}

	public void printL(){
		Node t = head;
		while(t!=null){
			System.out.print("----->"+t.getData());
			t= t.getNext();
		}
		System.out.println();
	}

	public void reverse(){
		Node temp1 = head;
		Node temp2 = temp1.getNext();
		temp1.setNext(null);
		Node tail_temp = temp1;
		while(head != tail){
			Node temp3 = temp2.getNext();
			if(temp3.getNext() == null){
				head = temp3;
				head.setNext(temp2);
				temp2.setNext(temp1);
			} else {
			head = temp2;
			head.setNext(temp1);
			temp1 = temp2;
			temp2 = temp3;
		}
		}
		tail = tail_temp;
	}
}
class LMain{
	public static void main(String[] args) {
		LList oj = new LList();
		oj.insert(1);
		oj.insert(2);
		oj.insert(3);
		oj.insert(4);
		oj.insert(5);
		oj.insert(6);
		oj.printL();
		oj.reverse();
		oj.printL();
	}
}