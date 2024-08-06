package csAdvanced.datastructure.bstInsert;

class BinaryTree<E>{
    public E data;
    public BinaryTree<E> left;
    public BinaryTree right;

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
        System.out.println(bstInsert(root, 5));
    }

    public static BinaryTree<Integer> bstInsert(BinaryTree<Integer> root, int key) {
        if (root == null) {
            return new BinaryTree<>(key);
        }
        if (key < root.data) {
            root.left = bstInsert(root.left, key);
        } else if (key > root.data) {
            root.right = bstInsert(root.right, key);
        }
        return root;
    }
}
