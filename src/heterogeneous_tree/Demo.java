package heterogeneous_tree;

import java.util.Scanner;

/**
 * Created by clouway on 3/10/15.
 */
public class Demo {
  public static void main(String[] args) {

    HeterogeneousTree tree = new HeterogeneousTree();
    Cat cat = new Cat();
    Dog dog = new Dog();
    tree.add(7, cat.name("Mima"));
    tree.add(3, dog.name("Pesho"));
    tree.add(9, 34);
    tree.add(6, 65.32);
    System.out.println(" ");
    tree.inOrderTree(tree.root);
    System.out.println(" ");
    System.out.println("Is this element find ?   ");
    tree.findNode(5);
    System.out.println(" ");
    tree.findNode(7);

  }
}
