public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;   //Atribut private

    //Konstruktor
    public Tree() {
        root = null;
    }

    //Metode insertNode --> Menambahkan nilai (interValue) ke dalam tree
    //Jika root masih null, buat node baru dan dijadikan root
    //Jika root tidak null, panggil metode insert pada root + nilai keposisi sesuai
    public void insertNode(E insertValue) {
        System.out.print(insertValue + " ");      
        if (root == null) {
            root = new TreeNode<E>(insertValue);    
        } else {
            root.insert(insertValue);
        }
    }

    //Metode helper --> metode rekursif melakukan traversal preorder pada Tree
    private void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;    
        }

        System.out.printf("%s ", node.getData());   
        preorderHelper(node.getLeftNode());     
        preorderHelper(node.getRightNode());    
    }

    //Melakukan metode preorder traversal
    //Root-Kiri-Kanan
    public void preorderTraversal() {
        preorderHelper(root);
    }

    //Metode helper --> metode rekursif melakukan traversal inorder pada Tree
    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        inorderHelper(node.getLeftNode());      
        System.out.printf("%s ", node.getData());       
        inorderHelper(node.getRightNode());     
    }

    //Melakukan metode inorder traversal
    //Kiri-Root-kanan
    public void inorderTraversal() {
        inorderHelper(root);
    }

    //Metode helper --> metode rekursif melakukan traversal postorder pada Tree
    private void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        postorderHelper(node.getLeftNode());    
        postorderHelper(node.getRightNode());   
        System.out.printf("%s ", node.getData());       
    }

    //Melakukan metode postorder traversal
    //Kiri-Kanan-Root
    public void postorderTraversal() {
        postorderHelper(root);
    }

    //Metode Search (pencarian) -->metode rekursif untuk mencari nilai E pada Tree
    //Jika node saat ini null = elemen tidak ditemukan
    //Jika key sama dengan data di node saat ini = elemen ditemukan
    //Jika key < data di node saat ini, cari di subtree kiri
    //Jika key > data di node saat ini, cari di subtree kanan
    private boolean searchBSTHelper(TreeNode<E> node, E key) {
        boolean result = false;

        if (node != null) {
            if (key.equals(node.getData())) {
                result = true;
            } else if (key.compareTo(node.getData()) < 0) {
                result = searchBSTHelper(node.getLeftNode(), key);
            } else {
                result = searchBSTHelper(node.getRightNode(), key);
            }
        }
        return result;
    }

    //Memulai pencarian dari root dan mencetak hasilnya apakah elemen ditemukan atau tidak
    public void searchBST(E key) {
        boolean hasil = searchBSTHelper(root, key);

        if (hasil) {
            System.out.println("Data " + key + " ditemukan pada tree");
        } else {
            System.out.println("Data "+ key + " tidak ditemukan pada tree");
        }
    }
}