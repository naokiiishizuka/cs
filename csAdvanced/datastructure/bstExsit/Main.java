package csAdvanced.datastructure.bstExsit;

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
        System.out.println(exists(root, 30));
    }

    public static boolean exists(BinaryTree<Integer> root, int key){
        if (root == null) return false;
        if (root.data == key) return true;

        if (root.data > key) return exists(root.left, key);
        else return exists(root.right, key);
    }
}
