package csAdvanced.datastructure.BinaryTreeMinimumNode;

class BinaryTree<E>{
    public E data;
    public BinaryTree<E> left;
    public BinaryTree<E> right;

    public BinaryTree() {}
    public BinaryTree(E data) { this.data = data; }
    public BinaryTree(E data, BinaryTree<E> left, BinaryTree<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    public static void main(String[] args) {

        BinaryTree<Integer> root = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4), null), new BinaryTree<>(3));
        System.out.println(minimumNode(root));
    }
    public static BinaryTree<Integer> minimumNode(BinaryTree<Integer> root){
        if(root == null) return null;
        if(root.left == null) return root;
        return minimumNode(root.left);
    }
}
