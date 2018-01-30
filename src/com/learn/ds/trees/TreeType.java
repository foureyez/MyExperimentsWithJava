package com.learn.ds.trees;

public enum TreeType {

	BINARY_TREE(1), BINARY_SEARCH_TREE(2);

	private int treeId;

	TreeType(int treeId) {
		this.treeId = treeId;
	}

	public int getTreeId() {
		return treeId;
	}

	public static TreeType getTreeType(int treeId) {
		TreeType[] treeType = TreeType.values();

		for (int index = 0; index < treeType.length; index++) {
			if (treeType[index].getTreeId() == treeId) {
				return treeType[index];
			}
		}
		return null;
	}
}
