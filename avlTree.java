public class avlTree {
    static class Node {
        int data;
        Node left, right;
        int height;

        Node(int data) {
            this.data = data;
            this.height = 1; // New node initially added at leaf
        }
    }
    public static Node root;

    public static int height(Node n) {
        if (n == null) return 0;
        return n.height;
    }
    public static int getBalance(Node n) {
        if (n == null) return 0;
        return height(n.left) - height(n.right);
    }
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // New root
    }
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // New root
    }
    public static Node insert(Node root, int key) {
        // Normal BST insertion
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; // No duplicates

        // Update height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // Get balance factor
        int balance = getBalance(root);

        // 4 Cases
        
        // Case 1: LL
        if (balance > 1 && key < root.left.data)
            return rightRotate(root);

        // Case 2: RR
        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        // Case 3: LR
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Case 4: RL
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);
    }
}
