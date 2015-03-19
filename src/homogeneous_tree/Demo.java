package homogeneous_tree;


public class Demo {
  public static void main(String[] args) {

    HomogeneousTree tree = new HomogeneousTree();
    tree.add(8);
    tree.add(11);
    tree.add(13);
    tree.add(10);
    tree.add(9);
    tree.add(7);
    tree.add(6);
    tree.add(6);
    tree.add(12);

    System.out.println(" ");
    tree.inOrderTree(tree.root);

    System.out.println(" ");
    System.out.print("Is this element find ? --->  ");
    tree.findNode(6);
  }
}
