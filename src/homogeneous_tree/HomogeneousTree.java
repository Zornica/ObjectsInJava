package homogeneous_tree;


public class HomogeneousTree {

  Node root;

  /**
   * Adds items into the tree
   *
   * @param value is the element which add
   */


  public void add(int value) {
    add(root, value);
  }

  private void add(Node node, int value) {
    if (root == null) {
       root = new Node(value);
      return;
    }
    if (node.value > value && node.leftChild != null) {
      add(node.leftChild, value);
    }
    if (node.value > value && node.leftChild == null) {
      node.leftChild = new Node(value);
      return;
    }
    if (node.value < value && node.rightChild != null) {
      add(node.rightChild, value);
    }
    if (node.value < value && node.rightChild == null) {
      node.rightChild = new Node(value);
      return;
    }


  }


  /**
   * Outputs of the elements of the tree
   */

  public void inOrderTree(Node focusNode) {
    if (focusNode != null) {
      inOrderTree(focusNode.leftChild);
      System.out.print(focusNode.value + " ");
      inOrderTree(focusNode.rightChild);
    }
  }

  /**
   * Finds the element in the tree
   *
   * @param value is the element which we find
   */

  public void findNode(int value) {
    Node focusNode = root;
    while (focusNode.value != value) {
      if (value < focusNode.value) {
        focusNode = focusNode.leftChild;
      } else {
        focusNode = focusNode.rightChild;
      }
      if (focusNode == null) {
        System.out.println("No!There are not found an element with value  " + value + " ! ");
        return;
      }
    }
    System.out.println("Yes! There are found an element with value  " + focusNode.value + " !");
  }
}
