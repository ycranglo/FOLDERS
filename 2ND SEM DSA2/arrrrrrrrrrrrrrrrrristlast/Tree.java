public class Tree {
	private TreeNode root;
	private int count;

	public Tree() {
		this.root = new TreeNode();
	}
	
	public TreeNode getRoot() {
		return this.root;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void insert(String word) {
		TreeNode currrentNode = this.root;

		for (char character : word.toCharArray()) {
			if (!currrentNode.hasChild(character)) {
				currrentNode.addChild(new TreeNode(), character);
				currrentNode = currrentNode.getChild(character);
			}
		}

		currrentNode.addChild(new TreeNode(), '|');
		currrentNode.setWord(true);
	}
}