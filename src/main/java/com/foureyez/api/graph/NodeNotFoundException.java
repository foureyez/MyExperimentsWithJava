package com.foureyez.api.graph;

public class NodeNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public NodeNotFoundException(int id) {
		super("Node not found " + id);
	}
}
