package csAdvanced.datastructure.treeWithTheSameValue;

import java.util.Objects;

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

        BinaryTree<Integer> root = new BinaryTree<>(1, new BinaryTree<>(1, new BinaryTree<>(2), null), new BinaryTree<>(1));
        System.out.println(treeWithTheSameValue(root));
    }

    public static boolean treeWithTheSameValue(BinaryTree<Integer> root){
        if (root == null) return true;

        if (root.left != null && !root.data.equals(root.left.data)) return false;
        if (root.right != null && !root.data.equals(root.right.data)) return false;

        return treeWithTheSameValue(root.left) && treeWithTheSameValue(root.right);
    }
}

