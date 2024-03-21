import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    
    static class Node{
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data){
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    static class BinTree{
        static int index = -1;
        
        public static Node buildTree(int[] nodes){
            index++;
            if(nodes[index] == -1){
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode; 
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.leftNode);
            preorder(root.rightNode);
        } 

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.leftNode);
            postorder(root.rightNode);

            System.out.print(root.data+" ");
        }
                
        //Breadth First Search
        public static void levelorder(Node root){
            
            if(root==null){
                return;
            }
        
            Queue<Node> queue = new LinkedList<Node>();
            
            queue.add(root);
            queue.add(null);

            while(!queue.isEmpty()){
                Node currNode = queue.remove();
                
                if(currNode==null){
                    System.out.println();
                    if(queue.isEmpty()){
                        break;
                    } else{
                        queue.add(currNode);
                    }
                } else{
                    System.out.print(currNode.data+" ");
                    if(currNode.leftNode!=null){
                        queue.add(currNode.leftNode);
                    }

                    if(currNode.rightNode != null){
                        queue.add(currNode.rightNode);
                    }
                }

            }
        }

        public static int height(Node root){
            if(root==null) 
            return 0;
            else{

                if(height(root.leftNode)>height(root.rightNode)){
                    return height(root.leftNode)+1;
                } else{
                    return height(root.rightNode)+1;
                }
            }
        }

        public static int totalNodes(Node root){
            if(root==null){
                return 0;
            }
          
            int left = totalNodes(root.rightNode);
            int right = totalNodes(root.leftNode);
            return left+right+1;        
        }

        public static int diameter(Node root){
            
        }

    }
    

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinTree b = new BinTree();
        Node root = b.buildTree(nodes);

        System.out.println(b.totalNodes(root));

    }
}