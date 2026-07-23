public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        System.out.println("Root node: " + root.data);

        root.left = new Node(10);
        root.left.left = new Node(18);
        root.left.right = new Node(18);

        System.out.println("Left child of root: " + root.left.data);
    }
}