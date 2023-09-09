public class TreeNode {
	private boolean word;
	private TreeNode[] children;
    
	/**
	 * Getters and Setters
	 */

	public TreeNode() {
		this.word = false;
		this.children = new TreeNode[500];
	}

	public boolean getWord() {
		return this.word;
	}

	public TreeNode getChild(char character) {
		return this.children[character - 'a'];
	}

	public TreeNode[] getChildren() {
		return this.children;
	}

	public void setWord(boolean word) {
		this.word = word;
	}

	// Adds a node as a child of this node
	public void addChild(TreeNode child, char character) {
		this.children[character - 'a'] = child;
	}

	// Determines if this node has child or not
	public boolean hasChild(char character) {
		return this.children[character - 'a'] != null;
	}
}
