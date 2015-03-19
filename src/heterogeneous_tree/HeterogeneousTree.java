package heterogeneous_tree;


public class HeterogeneousTree {
  Node root;

  /**
   * Adds items into the tree
   *
   * @param key  is the key value of element
   * @param name is value of element which we add
   */


  public void add(int key, Object name) {
    add(root, key, name);
  }


  private void add(Node node, int key, Object name) {
    Node treeNode = new Node(key, name);
    if (root == null) {
      root = treeNode;
      return;
    }
    if (node.key > key && node.leftChild != null) {
      add(node.leftChild, key, name);
    }
    if (node.key > key && node.leftChild == null) {
      node.leftChild = new Node(key, name);
      return;
    }
    if (node.key < key && node.rightChild != null) {
      add(node.rightChild, key, name);
    }
    if (node.key < key && node.rightChild == null) {
      node.rightChild = new Node(key, name);
      return;
    }


  }

  /**
   * Finds the element in the tree
   *
   * @param key is the element which we find
   * @return element
   */

  public void findNode(int key) {
    Node focusNode = root;
    while (focusNode.key != key) {
      if (key < focusNode.key) {
        focusNode = focusNode.leftChild;
      } else {
        focusNode = focusNode.rightChild;
      }
      if (focusNode == null) {
        System.out.println("No!There are not found an element with value  " + key + " ! ");
        return;
      }
    }
    System.out.println("Yes! There are found an element with value  " + focusNode.key + " !");
  }

  /**
   * Outputs of the elements of the tree
   */
  public void inOrderTree(Node focusNode) {
    if (focusNode != null) {

      inOrderTree(focusNode.leftChild);

      inOrderTree(focusNode.rightChild);
      System.out.println(focusNode);
    }
  }

}
