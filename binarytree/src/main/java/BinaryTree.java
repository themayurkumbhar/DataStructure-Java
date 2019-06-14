import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree<T> {

    TreeNode<T> root;

    public BinaryTree() {
        root = null;
    }

    /**
     * The method will add data to the tree in breadth first traversal style.
     * @param data
     */
    public void add(T data) {

        LinkedList<TreeNode<T>> queue = new LinkedList<>();
        TreeNode<T> newNode = new TreeNode<>(data);
        if (root == null) {
            root = newNode;
        } else {
            queue.add(root);
            while (true) {
                TreeNode<T> temp = queue.poll();
                if (temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    break;
                }
                if (temp.getRight() == null) {
                    temp.setRight(newNode);
                    break;
                }
                queue.add(temp.getLeft());
                queue.add(temp.getRight());
            }
        }
    }

    /**
     * The tree nodes are processed in a breadth first traversal style.
     * @return
     */
    public List<TreeNode<T>> levelOrderTraversal() {

        List<TreeNode<T>> preOrderSeq = new ArrayList<>();
        if (root == null) {
            return preOrderSeq;
        }
        LinkedList<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode<T> temp = queue.poll();
            preOrderSeq.add(temp);
            if (temp.getLeft() != null) {
                queue.add(temp.getLeft());
            }
            if (temp.getRight() != null) {
                queue.add(temp.getRight());
            }
        }
        return preOrderSeq;
    }

    /**
     * full binary tree is a tree in which each node has zero or two children.
     *
     * @return
     */
    public boolean checkBinaryTreeIsFull() {

        boolean isFullBinarytree = true;
        if (root == null) {
            return isFullBinarytree;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            TreeNode tempNode = queue.poll();
            if (tempNode.hasLeftChild() && !tempNode.hasRightChild()) {
                isFullBinarytree = false;
                queue.clear();
            }
            if (!tempNode.hasLeftChild() && tempNode.hasRightChild()) {
                isFullBinarytree = false;
                queue.clear();
            } else if (tempNode.hasLeftChild() && tempNode.hasRightChild()) {
                queue.add(tempNode.getLeft());
                queue.add(tempNode.getRight());
            }
        }
        return isFullBinarytree;
    }

    private boolean isFullBinaryTree(TreeNode<T> root) {

        if (root == null) {
            return true;
        }
        if (!root.hasLeftChild() && !root.hasRightChild()) {
            return true;
        }
        if (root.hasLeftChild() && root.hasRightChild()) {
            return isFullBinaryTree(root.getLeft()) && isFullBinaryTree(root.getRight());
        }
        return false;
    }

    /**
     * full binary tree is a tree in which each node has zero or two children.
     * @return
     */
    public boolean isBinaryTreeFull(){
        return isFullBinaryTree(root);
    }


    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getData());
            inOrder(root.getRight());
        }
    }

    /**
     * Recursive algorithm to process the tree nodes in an order in which
     * the left subtree is processed first then the root and then the right subtree
     */
    public void inOrderTraversal(){
        inOrder(root);
    }

    /**
     * Recursive algorithm to process the tree nodes in an order in which
     * the left subtree is processed first then the root and then the right subtree
     * @return
     */
    public List<TreeNode> inOrderNonRec(){

        List<TreeNode> inOrderSeq = new ArrayList<>();
        if (root == null) {
            return inOrderSeq;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tempNode = root;
        while(true){

            while(tempNode!=null){
                stack.push(tempNode);
                tempNode=tempNode.getLeft();
            }
            if(!stack.isEmpty()){
                tempNode=stack.pop();
            }else{
                break;
            }
            inOrderSeq.add(tempNode);
            tempNode = tempNode.getRight();
        }
        return inOrderSeq;
    }

    /**
     * solution using one stack and one queue
     * @return
     */
    public List<TreeNode<T>> spiralForm(){

        if (root == null){
            return new ArrayList<>();
        }

        Stack<TreeNode<T>> stack = new Stack<>();
        LinkedList<TreeNode<T>> linkedList = new LinkedList<>();
        int level=0;
        ArrayList<TreeNode<T>> spiral = new ArrayList<>();
        linkedList.add(root);
        while(!linkedList.isEmpty()){

            int size = linkedList.size();
            while (size-->0) {

                TreeNode<T> temp = linkedList.poll();
                if(level%2==0){
                    stack.push(temp);
                }else {
                    spiral.add(temp);
                }
                if (temp.getLeft() != null) {
                    linkedList.add(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    linkedList.add(temp.getRight());
                }
            }
            while (!stack.isEmpty()){
                spiral.add(stack.pop());
            }
            level++;
        }
        return spiral;
    }

    public List<TreeNode<T>> preOrderNonRecursive(){

        List<TreeNode<T>> preOrder = new ArrayList<>();
        if(root == null){
            return preOrder;
        }
        Stack<TreeNode<T>> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){

            TreeNode<T> temp = stack.pop();
            preOrder.add(temp);
            if(temp.getRight()!=null){
                stack.push(temp.getRight());
            }
            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }
        return preOrder;
    }

}
