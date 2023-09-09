class Trie {

  // The root node.
  private TrieNode root;

  // Constructor.
  public Trie() {
      root = new TrieNode(' ');
  }

  // Add a string to the trie.
  public void add(String string) {
      TrieNode currentNode = root;

      for (char character : string.toCharArray()) {
          TrieNode childNode = currentNode.getChild(character);

          if (childNode == null) {
              childNode = new TrieNode(character);
              currentNode.addChild(childNode);
          }

          currentNode = childNode;
      }

      currentNode.setIsLeaf(true);
  }

  // Display the trie.
  public void display() {
      display(root, "");
  }

  // Display the trie recursively.
  private void display(TrieNode node, String prefix) {
      if (node.isLeaf()) {
          System.out.println(prefix + node.character);
      } else {
          for (TrieNode childNode : node.children) {
              display(childNode, prefix + node.character);
          }
      }
  }

  // Display the child node for a given character.
  public void display(char character) {
      TrieNode childNode = root.getChild(character);

      if (childNode != null) {
          display(childNode, "");
      } else {
          System.out.println("No child node for character " + character);
      }
  }
}