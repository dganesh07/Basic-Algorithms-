
public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNode(50);
		addNode(25);
		addNode(15);
		addNode(30);
		addNode(75);
		addNode(85);
		System.out.println("Inorder traverse");
		inOrderTraverse(root);
		System.out.println("preorder traverse");
		preOrderTraverse(root);
		System.out.println("postorder traverse");
		postOrderTraverse(root);
		System.out.println("find node ");
		Node found = FindNode(15);
		if(found == null){
			System.out.println("node does not exists!!");
		}
		else
		System.out.println("data found" + " " +found.data);
		System.out.println("its parent" + " " + found.parent.data);
		
	}

	// static variable for the root
	static Node root;

	public static void addNode(int data) {
		// calling the parameterized constructor to assign the data to the node
		Node node = new Node(data);

		// if no node exists! add
		if (root == null)
			root = node;

		// else traverse the node to find the appropriate place and then add
		insert(root, node);

	}

	public static Node FindNode(int data){
		Node Tnode = root;
		while(Tnode.data!=data){
			if(data < Tnode.data){
				Tnode = Tnode.leftChild;
			}
			else
			{
				Tnode = Tnode.RightChild;
			}
			if(Tnode == null){
				return null;
			}
		}
		return Tnode;
	}
	
	public static void deleteNode(int data){
		//when node does not have a child!
		//when node has right and left child
		
		
		//step1. find the node!
		
		Node toDelete = FindNode(data);
		if(toDelete!=null){
			
		}
		
		
	}
	
	
	
	
	
	// inorder
	// left->node , root , right->node
	public static void inOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			inOrderTraverse(focusNode.leftChild);
			System.out.println(focusNode.data);
			inOrderTraverse(focusNode.RightChild);
		}
	}

	// preorder
	// root , Left->Node , Right->Node
	public static void preOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode.data);
			preOrderTraverse(focusNode.leftChild);
			preOrderTraverse(focusNode.RightChild);
		}
	}

	// postOrder
	// Left->Node , Right->Node , root
	public static void postOrderTraverse(Node focusNode) {
		if (focusNode != null) {
			postOrderTraverse(focusNode.leftChild);
			postOrderTraverse(focusNode.RightChild);
			System.out.println(focusNode.data);
		}
	}

	// recurssive function to add a new node!!
	public static void insert(Node Tnode, Node toAdd) {
		if (Tnode.data > toAdd.data) {
			if (Tnode.leftChild == null){
				toAdd.parent = Tnode;
				Tnode.leftChild = toAdd;
			}
				
			else
				insert(Tnode.leftChild, toAdd);
		} else if (Tnode.data < toAdd.data) {
			if (Tnode.RightChild == null){
				toAdd.parent = Tnode;
				Tnode.RightChild = toAdd;
			}
			else
				insert(Tnode.RightChild, toAdd);
		}
		// what about the toAdd data being equal to any of the node
		// how to handle duplicates???
	}

}



//create a tree with     leftchild , parent , rightchild
class Node {
	int data;
	Node leftChild;
	Node RightChild;
	Node parent;

	Node() {

	}

	Node(int data) {
		this.data = data;
	}

}