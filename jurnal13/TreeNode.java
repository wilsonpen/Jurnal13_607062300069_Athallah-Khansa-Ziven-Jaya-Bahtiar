public class TreeNode<E extends Comparable<E>> {
    
    //Atribut private
    private TreeNode<E> leftNode;
    private E data;                 
    private TreeNode<E> rightNode;

    //Konstruktor
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null;    
    }

    //Getter
    public E getData() {    //Untuk mendapatkan data node saat ini
        return data;
    }

    public TreeNode<E> getLeftNode() {  //Untuk mendapatkan referensi ke node kiri
        return leftNode;
    }

    public TreeNode<E> getRightNode() { //Untuk mendapatkan referensi ke node kanan
        return rightNode;
    }

    //Metode insert --> untuk memasukkan nilai baru ke dalam pohon biner
    public void insert(E insertValue) {
        if (insertValue.compareTo(data) < 0) {  
            if (leftNode == null) {
                leftNode = new TreeNode<E>(insertValue);
            } else {
                leftNode.insert(insertValue);   
            }
        }
        else if (insertValue.compareTo(data) > 0) {
            if (rightNode == null) {
                rightNode = new TreeNode<E>(insertValue);
            } else {
                rightNode.insert(insertValue);  
            }
        }
        else {      
            if (leftNode == null) {
                leftNode = new TreeNode<E>(insertValue);
            } else {
                leftNode.insert(insertValue);   
            }
        }
    }

    //Metode toString
    @Override
    public String toString() {
        return "TreeNode [leftNode=" + leftNode + ", data=" + data + ", rightNode=" + rightNode + "]";
    }
}