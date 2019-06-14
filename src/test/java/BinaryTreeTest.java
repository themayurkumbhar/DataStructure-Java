import Trees.BinaryTree;
import Trees.TreeNode;

import java.util.List;

public class BinaryTreeTest {

    public static void main(String[] args) {


        BinaryTree binaryTree=new BinaryTree();
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(6);
        binaryTree.add(7);
        binaryTree.add(8);
        binaryTree.add(9);

        List<TreeNode> nodes = binaryTree.preOrderTraversal();
        //nodes.forEach(node-> System.out.println(node.getData()));

        BinaryTree binaryTree1 = new BinaryTree();
        //System.out.println(binaryTree.checkBinaryTreeIsFull());
        //System.out.println(binaryTree1.checkBinaryTreeIsFull());
        //System.out.println(binaryTree.isBinaryTreeFull());
        //System.out.println(binaryTree1.isBinaryTreeFull());
        //binaryTree.inOrderTraversal();
        //binaryTree.inOrderNonRec().forEach(node -> System.out.println(node.getData()));

        //binaryTree.spiralForm().forEach(node-> System.out.println(node.getData()));
        binaryTree.preOrderNonRecursive().forEach(node-> System.out.println(node.getData()));
    }


}
