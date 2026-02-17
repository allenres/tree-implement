public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10, null, null);
    root.left = new TreeNode<Integer>(9, null, null);
    root.left.left = new TreeNode<Integer>(5, null, null);
    root.left.right = new TreeNode<Integer>(2, null, null);

    root.right = new TreeNode<Integer>(15, null, null);
    root.right.left = new TreeNode<Integer>(-3, null, null);
    root.right.right = new TreeNode<Integer>(5, null, null);
    root.right.right.right = new TreeNode<Integer>(22, null, null);

    TreeNode<String> stringRoot = new TreeNode<String>("hello", null, null);
    stringRoot.left = new TreeNode<String>("How", null, null);
    stringRoot.left.left = new TreeNode<String>("are", null, null);
    stringRoot.left.right = new TreeNode<String>("you", null, null);

    stringRoot.right = new TreeNode<String>("I", null, null);
    stringRoot.right.left = new TreeNode<String>("am", null, null);
    stringRoot.right.right = new TreeNode<String>("so", null, null);
    stringRoot.right.right.right = new TreeNode<String>("good", null, null);

    // preOrder(root);
    System.out.println();
    // postOrder(root);
    //printGrader(root, 100);
    System.out.println(countNodes(stringRoot));
  }

  public static int countNodes(TreeNode<?> node) {
    return node == null ? 0 : 1 + countNodes(node.left) + countNodes(node.right);
  }

  public static void printGrader(TreeNode<Integer> node, int threshold) {
    if (node == null) return;
    if(node.value > threshold) {
      System.out.println(node.value);
    }
    printGrader(node.left, threshold);
    printGrader(node.right, threshold);
  }

  // Print tree rooted at the given node in pre-order.
  // ? if you dont need to reuse it, parameterize
  public static void preOrder(TreeNode<?> node) {
    if (node == null)
      return; 
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
  }

  // type variable if you need to reuse it
  public static <T> void postOrder(TreeNode<T> node) {
    if (node == null)
      return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.println(node.value);
  }

  public static <E> void inOrder(TreeNode<E> node) {
    if (node == null)
      return;
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
  }
}
