package csAdvanced.datastructure.BinaryTreeMaximumNode;

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
        System.out.println(maximumNode(root));
    }
    public static BinaryTree<Integer> maximumNode(BinaryTree<Integer> root){
        if(root == null) return null;
        if(root.right == null) return root;
        return maximumNode(root.right);
    }
}
