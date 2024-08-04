package csAdvanced.datastructure.inorderTraversal;

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
        System.out.println(Arrays.toString(inorderTraversal(root)));
    }

    public static int[] inorderTraversal(BinaryTree<Integer> root){
        ArrayList<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static void inorderTraversalHelper(BinaryTree<Integer> root, ArrayList<Integer> result) {
        if(root == null) return;
        if(root.left != null) inorderTraversalHelper(root.left, result);
        result.add(root.data);
        if(root.right != null) inorderTraversalHelper(root.right, result);
    }
}
