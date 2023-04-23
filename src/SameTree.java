package Solution;

public class SameTree
{
    public static boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p == null) return q == null;
        if(q == null) return p == null;
        if(p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args)
    {
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        boolean isSame = isSameTree(tree1, tree2);
        System.out.println(isSame);
    }
}
