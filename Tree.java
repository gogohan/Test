class Node{
	int item;
	Node Left,Right;

	public Node(int item){
		this.item=item;
		this.Left=null;
		this.Right=null;
	}
}

public class Tree {
	Node root;
	Tree(){
		root=null;
	}
	
	public void print(Node node) {
		if(node!=null) {
			System.out.println(node.item);
			print(node.Left);
			print(node.Right);
		}
	}
	public void print() {
		this.print(this.root);
	}
	public boolean search(Node node,int i,boolean flag) {
		if(node!=null) {
			//System.out.println(node.item);
			if(node.item==i)
				flag = true;
			//System.out.println(flag);
			if(flag==false) {
				flag = search(node.Left,i,flag);
				flag = search(node.Right,i,flag);
			}
			return flag;
		}
		return flag;
	    
	}
	public boolean search(int i) {
		return (this.search(this.root,i,false));
	}
	public static void main(String args[]){

		Tree tree= new Tree();
		tree.root = new Node(2);
		
		tree.root.Left=new Node(7);
		tree.root.Right=new Node(5);
		
		tree.root.Left.Left= new Node(2);
		tree.root.Left.Right= new Node(6);
		tree.root.Right.Right = new Node(9);
		
		tree.root.Left.Right.Left = new Node(5);
		tree.root.Left.Right.Right= new Node(11);
		
		tree.root.Right.Right.Left=new Node(4); 
		//tree.print();
		System.out.println(tree.search(3));
		System.out.println(tree.search(11));
		System.out.println(tree.search(2));
		System.out.println(tree.search(4));
		System.out.println(tree.search(5));


	}
}
