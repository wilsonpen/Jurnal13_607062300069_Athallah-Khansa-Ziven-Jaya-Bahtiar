public class Main {
    public static void main(String[] args) {
        Tree<String> tree = new Tree<>();

        System.out.println("Inserting the following values: ");


        tree.insertNode("F");
        tree.insertNode("E");
        tree.insertNode("H");
        tree.insertNode("D");
        tree.insertNode("G");
        tree.insertNode("C");
        tree.insertNode("B");
        tree.insertNode("H");
        tree.insertNode("K");
        tree.insertNode("J");


        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();

        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();

        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        
        System.out.println();
        System.out.println();

        tree.searchBST("K");
        tree.searchBST("A");

    }
}