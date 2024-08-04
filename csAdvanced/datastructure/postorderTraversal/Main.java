package csAdvanced.datastructure.postorderTraversal;

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
        System.out.println(Arrays.toString(postorderTraversal(root)));
    }
    public static int[] postorderTraversal(BinaryTree<Integer> root){
        ArrayList<Integer> result = new ArrayList<>();
        postorderTraversalHelper(root, result);
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static void postorderTraversalHelper(BinaryTree<Integer> root, ArrayList<Integer> result) {
        if(root == null) return;
        if(root.left != null) postorderTraversalHelper(root.left, result);
        if(root.right != null) postorderTraversalHelper(root.right, result);
        result.add(root.data);
    }
}