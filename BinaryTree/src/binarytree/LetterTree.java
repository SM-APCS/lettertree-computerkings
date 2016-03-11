package binarytree;

/**
 *
 * @author add your name here
 */
public class LetterTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeNode a = new TreeNode("a", null, null);
        TreeNode b = new TreeNode("b", null, null);
        TreeNode c = new TreeNode("c", a, b);
        TreeNode d = new TreeNode("d", null, null);
        TreeNode e = new TreeNode("e", c, d);

        postorder(e);
    }
    private static void postorder (TreeNode current)
   {
      if (current.getLeft() != null)
         postorder(current.getLeft());

      if (current.getRight() != null)
         postorder(current.getRight());

      System.out.println(current.getValue());
   }
}
