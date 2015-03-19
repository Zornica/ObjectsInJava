package heterogeneous_tree;


public class Node {


  int key;
  Object name;
  Node leftChild;
  Node rightChild;

  /**
   * Constructor to sets the elements
   *
   * @param key  is the key value
   * @param name is the value of elements
   */

  Node(int key, Object name) {
    this.key = key;
    this.name = name;
  }

  /**
   * Converts to string the elements
   *
   * @return string of elements
   */
  public String toString() {
    return name + "    has a key     " + key;
  }


}
