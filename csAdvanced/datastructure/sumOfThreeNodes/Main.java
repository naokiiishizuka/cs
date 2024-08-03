package csAdvanced.datastructure.sumOfThreeNodes;

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
    public static void main(String[] args){
        BinaryTree<Integer> root = new BinaryTree<>(1, new BinaryTree<>(2, new BinaryTree<>(4), null), new BinaryTree<>(3));
        System.out.println(sumOfThreeNodes(root));
    }

    public static int sumOfThreeNodes(BinaryTree<Integer> root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        sum += (root.data != null) ? root.data : 0;
        sum += (root.left != null && root.left.data != null) ? root.left.data : 0;
        sum += (root.right != null && root.right.data != null) ? root.right.data : 0;

        return sum;
    }
}
