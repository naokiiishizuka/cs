package csAdvanced.datastructure.preorderTraversal;

import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println(Arrays.toString(preorderTraversal(root)));
    }

    public static int[] preorderTraversal(BinaryTree<Integer> root){
        ArrayList<Integer> result = new ArrayList<>();
        preorderTraversalHelper(root, result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static void preorderTraversalHelper(BinaryTree<Integer> root, ArrayList<Integer> result) {
        if(root == null) return;
        result.add(root.data);
        if(root.left != null) preorderTraversalHelper(root.left, result);
        if(root.right != null) preorderTraversalHelper(root.right, result);
    }
}
