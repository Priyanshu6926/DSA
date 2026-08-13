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
package Trees;
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

        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void main(String[] args) {
            int node[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(node);
            
            System.out.println(root.data);

            // calling inorder traversal
            inorder(root);
        }
}