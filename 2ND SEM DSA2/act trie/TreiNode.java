import java.util.List;
import java.util.ArrayList;
class TrieNode {

  // The character stored in this node.
  char character;

  // The child nodes of this node.
  List<TrieNode> children = new ArrayList<>();

  // The isLeaf flag.
  private boolean isLeaf;

  // Constructor.
  public TrieNode(char character) {
      this.character = character;
  }

  // Add a child node.
  public void addChild(TrieNode child) {
      children.add(child);
  }

  // Get the child node for a given character.
  public TrieNode getChild(char character) {
      return children.stream().filter(child -> child.character == character).findFirst().orElse(null);
  }

  // Set the isLeaf flag.
  public void setIsLeaf(boolean isLeaf) {
      this.isLeaf = isLeaf;
  }

  // Get the isLeaf flag.
  public boolean isLeaf() {
      return isLeaf;
  }
}
