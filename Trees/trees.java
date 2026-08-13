// package Trees;

// public class trees {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int node[]){
//             idx++;
//             if(node[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(node[idx]);
//             newNode.left = buildTree(node);
//             newNode.right = buildTree(node);
//             return newNode;
//         }
//     }
    
//     public static void main(String[] args) {
//         int node[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         System.out.println(root.data);
//     }
// }


// pre order traversal

// package Trees;

// public class trees {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int node[]){
//             idx++;
//             if(node[idx] == -1){
//                 return null;
//             }
//             Node newNode = new Node(node[idx]);
//             newNode.left = buildTree(node);
//             newNode.right = buildTree(node);
//             return newNode;
//         }
//     }
//     public static void preorder(Node root){
//         if(root == null){
//             return;
//         }
//         System.out.println(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }
    
//     public static void main(String[] args) {
//         int node[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(node);
//         preorder(root);
//     }
// }



// inorder treversal


// package Trees;
// public class trees{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         static class BinaryTree{
//             static int idx = -1;
//             public static Node buildTree(int node[]){
//                 idx++;
//                 if(node[idx] == -1){
//                     return null;
//                 }
//                 Node newNode = new Node(node[idx]);
//                 newNode.left = buildTree(node);
//                 newNode.right = buildTree(node);
//                 return newNode;            
//             }
//         }

//         public static void preorder(Node root){
//             if(root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }

//         public static void inorder(Node root){
//             if(root == null){
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }

//         public static void main(String[] args) {
//             int node[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
//             BinaryTree tree = new BinaryTree();
//             Node root = tree.buildTree(node);
            
//             System.out.println(root.data);

//             // calling inorder traversal
//             inorder(root);
//         }
// }


//post order traversal


// package Trees;
// public class trees{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         static class BinaryTree{
//             static int idx = -1;
//             public static Node buildTree(int node[]){
//                 idx++;
//                 if(node[idx] == -1){
//                     return null;
//                 }
//                 Node newNode = new Node(node[idx]);
//                 newNode.left = buildTree(node);
//                 newNode.right = buildTree(node);
//                 return newNode;            
//             }
//         }

//         public static void preorder(Node root){
//             if(root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }

//         public static void inorder(Node root){
//             if(root == null){
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }

//         public static void postorder(Node root){
//             if(root == null){
//                 return;
//             }
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
//         }
//         public static void main(String[] args) {
//             int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//             BinaryTree tree = new BinaryTree();
//             Node root = tree.buildTree(node);
            
//             System.out.println(root.data);

//             // calling postorder traversal
//             postorder(root);
//         }
// }


// //level order 
// package Trees;
// import java.util.*;
// public class trees{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         static class BinaryTree{
//             static int idx = -1;
//             public static Node buildTree(int node[]){
//                 idx++;
//                 if(node[idx] == -1){
//                     return null;
//                 }
//                 Node newNode = new Node(node[idx]);
//                 newNode.left = buildTree(node);
//                 newNode.right = buildTree(node);
//                 return newNode;            
//             }
//         }

//         public static void preorder(Node root){
//             if(root == null){
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }

//         public static void inorder(Node root){
//             if(root == null){
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }

//         public static void postorder(Node root){
//             if(root == null){
//                 return;
//             }
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data+" ");
//         }

//         public static void levelorder(Node root){
//             if (root == null){
//                 return;
//             }
//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while(!q.isEmpty()){
//                 Node currNode = q.remove();
//                 if(currNode == null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                         break;
//                     }
//                     else{
//                         q.add(null);
//                     }
//                 }
//                 else{
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left != null){
//                         q.add(currNode.left);
//                     }
//                     if(currNode.right != null){
//                         q.add(currNode.right);
//                     }
//                 }
//             }
//         }

        
//         public static void main(String[] args) {
//             int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//             BinaryTree tree = new BinaryTree();
//             Node root = tree.buildTree(node);

//             // calling postorder traversal
//             levelorder(root);
//         }
// }


// count of nodes

// package Trees;
// import java.util.*;
// public class trees{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//         static class BinaryTree{
//             static int idx = -1;
//             public static Node buildTree(int node[]){
//                 idx++;
//                 if(node[idx] == -1){
//                     return null;
//                 }
//                 Node newNode = new Node(node[idx]);
//                 newNode.left = buildTree(node);
//                 newNode.right = buildTree(node);
//                 return newNode;            
//             }
//         }

// // count
// public static int countofNodes(Node root){
//     if(root == null){
//         return 0;
//     }
//     int leftNodes = countofNodes(root.left);
//     int rightNodes = countofNodes(root.right);
//     return leftNodes + rightNodes + 1;
// }

        
//         public static void main(String[] args) {
//             int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//             BinaryTree tree = new BinaryTree();
//             Node root = tree.buildTree(node);

//             // calling postorder traversal
//         System.out.println(countofNodes(root));
//      }
// }


 
//sum of nodes
package Trees;
import java.util.*;
public class trees{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        static class BinaryTree{
            static int idx = -1;
            public static Node buildTree(int node[]){
                idx++;
                if(node[idx] == -1){
                    return null;
                }
                Node newNode = new Node(node[idx]);
                newNode.left = buildTree(node);
                newNode.right = buildTree(node);
                return newNode;            
            }
        }

// sum
public static int sumofNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftsum = sumofNodes(root.left);
    int rightsum = sumofNodes(root.right);
    return leftsum + rightsum + root.data;
}

        
        public static void main(String[] args) {
            int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(node);

            // calling postorder traversal
        System.out.println(countofNodes(root));
     }
}
