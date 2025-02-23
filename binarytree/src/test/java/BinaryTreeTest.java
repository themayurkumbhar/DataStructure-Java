import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreeTest {

    @Test
    public void shouldProcessBreadthFirstStyle(){

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);
        binaryTree.add(6);

        List<TreeNode<Integer>> result = binaryTree.levelOrderTraversal();
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6);
        Assert.assertEquals(expected,result.stream().map(TreeNode::getData).collect(Collectors.toList()));
    }

    @Test
    public void testIfTreeIsFullBinaryTree(){

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(3);
        binaryTree.add(4);
        binaryTree.add(5);

        Assert.assertTrue(binaryTree.isBinaryTreeFull());

        binaryTree.add(6);

        Assert.assertFalse(binaryTree.isBinaryTreeFull());
    }


}
