package domain;

public class BinaryTree {
//pushing from Eclipse
	int data;
	BinaryTree leftNode = null;
	BinaryTree rightNode = null;
	BinaryTree parent;
	
	//private int size;
	
	public BinaryTree(int data) {
		this.data = data;
		//size = 1;
	}
	
	/*public int size() {
		return size;
	}*/
	
	public int getData(BinaryTree bTree) {
		return bTree.data;
	}
	
	public BinaryTree getParent(BinaryTree bTree) {
		return bTree.parent;
	}
	
	public BinaryTree find(int d) {
		System.out.println(this.data);
		if (d == this.data)
		{
			System.out.println("Found "+data);
			return this;
		}
		else if (d< this.data) {
			if (leftNode!= null)
				return leftNode.data !=0? leftNode.find(d): null;
		}
		else if (d> this.data) {
			if (rightNode != null)
				return rightNode.data !=0? rightNode.find(d): null;
		}
		System.out.println("Not Found "+d);
		return	null;
		
	}
	
	public void insertInOrder(int data) {
		if (data < this.data) 
		{
			if (leftNode ==  null) 
			{
				setLeftNode(new BinaryTree(data));
			}
			else
				leftNode.insertInOrder(data);
			
		}
		else if (data> this.data)
		{
			if (this.rightNode == null)
				setRightNode(new BinaryTree(data));
			else
				this.rightNode.insertInOrder(data);
		}
		//this.size++;

	}
	
	public void setLeftNode(BinaryTree left) {
		this.leftNode = left;
		if (left!= null) {
			left.parent = this;
			System.out.println("Parent node of left value "+left.data+" is "+this.data+" ");
		}
	}
	
	public void setRightNode(BinaryTree right) {
		this.rightNode = right;
		if (right != null) {
			right.parent = this;
			System.out.println("Parent node of right value "+right.data+" is "+this.data+" ");
		}
	}
	
	public boolean isBinaryTree(BinaryTree bTree) {
		if (bTree == null) {
			return true;
		}
		else {
			do {
				if ((bTree.leftNode != null && bTree.leftNode.data > bTree.data) || (bTree.rightNode != null && bTree.rightNode.data <bTree.data))
				{
					return false;
				}
				else 
				{
					boolean retval = true;
					if (bTree.leftNode != null) {
						retval = isBinaryTree(bTree.leftNode);
					}
					if (retval == true) {
						if (bTree.rightNode != null) 
							retval = isBinaryTree(bTree.rightNode);
						if (retval == false)
							return retval;
					}

				}
				return true;
			}while(bTree != null);
		}
	}
	
}
