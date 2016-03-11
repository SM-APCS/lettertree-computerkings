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
        BSTree tree = new BSTree();
        tree.add(new char('A'));
        tree.add(new char('B'));
        tree.add(new char('C'));
        tree.add(new char('D'));
        tree.add(new char('E'));
        tree.add(new char('F'));
        
        System.out.println(tree);
        
    }
    
}
