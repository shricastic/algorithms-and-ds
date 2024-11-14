import java.util.*;

class BinaryTreeDemo{

	static class Node{
		int data;
		Node right;
		Node left;

		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree{
		static int index = -1;

		public static Node buildTree(int nodes[]){
			index++;

			if(nodes[index]==-1){
				return null;
			}

			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;

		}
		
		static void preorder(Node root){

			if(root == null)
			{
				return;
			}	

			System.out.print(root.data+" ");

			preorder(root.left);
			preorder(root.right);
		}

		static void inorder(Node root){

			if(root == null){
				return;
			}

			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}

		static void postorder(Node root){

			if(root == null){
				return;
			}

			postorder(root.left);
			postorder(root.right);

			System.out.print(root.data+" ");
		}

		static void levelorder(Node root){
			if(root == null){
				return;
			}

			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);

			while(!q.isEmpty()){
				Node currentNode = q.remove();

				if(currentNode == null){
					System.out.println();	
					if(q.isEmpty() == true){
						break;
					} else{
						q.add(null);
					}
				} else{
					System.out.print(currentNode.data);
					
					if(currentNode.left != null){ 
						q.add(currentNode.left);
					}
					if(currentNode.right!= null){
						q.add(currentNode.right);
					}
				}

			}

		}

		static int countNodes(Node root){
			if(root == null){
				return 0;
			}
			return countNodes(root.left)+ countNodes(root.right)+1;
		}

		static int sumOfNodes(Node root){
			if(root == null){
				return 0;
			} 

			return sumOfNodes(root.left)+sumOfNodes(root.right)+root.data;
		}

		static int maxHeight(Node root){
			if(root == null){
				return 0;
			}
			
			return Math.max(maxHeight(root.left), maxHeight(root.right))+1;
		}

		static int diameter(Node root){
			if(root == null){
				return 0;
			}

			int leftDiameter = diameter(root.left);
			int rightDiameter = diameter(root.right);
			int mainDiameter = maxHeight(root.left)+maxHeight(root.right)+1;

			return Math.max(Math.max(leftDiameter, rightDiameter), mainDiameter); 
		}
}
		public static class Tree{
			int height;
			int diameter;

			Tree(int height, int diameter){
				height = this.height;
				diameter = this.diameter;
			}
		}

		public static Tree diameterLinear(Node root){
			if(root == null){
				return new Tree(0, 0);
			}

			Tree left = diameterLinear(root.left);
			Tree right = diameterLinear(root.right);

			int mainHeight = Math.max(left.height, right.height) + 1;

			int leftDiameter = left.diameter;
			int rightDiameter = right.diameter;
			int mainDiameter = left.height + right.height + 1;

			int myDiameter = Math.max(Math.max(leftDiameter,rightDiameter),mainDiameter);

			Tree temp = new Tree(myDiameter, mainHeight);
			return temp;
		}

	

	



	public static void main(String[] args) {
		int nodes[] = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		BinaryTree tree = new BinaryTree();

		Node root = tree.buildTree(nodes);
		// tree.levelorder(root);
		// System.out.println(tree.countNodes(root));
		// System.out.println(tree.sumOfNodes(root));
		// System.out.println(tree.maxHeight(root));
		// System.out.println(tree.diameter(root));

		System.out.println(diameterLinear(root).diameter);
	}
}