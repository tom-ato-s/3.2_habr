package BynaryTree;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public void printNode() {
        System.out.println("Значение узла" + value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
    this.value = value;
    }

    public Node getLeftChild() {
       return this.leftChild;
    }
    public void setLeftChild(Node leftChil) {
        this.leftChild = leftChild;
    }
    public Node getRightChild() {
       return this.rightChild;
    }
   public void setRightChildr(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
       return  "Node { value=" + value
                + "leftCild= " + leftChild
                + ", rightChild=" + rightChild + "}";

    }


}
