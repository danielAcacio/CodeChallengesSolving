package br.com.resolutions;

import java.util.ArrayList;
import java.util.List;

public class Brackets {

	static class TreeBracket{
		private static final String openBracket="(";
		private static final String closeBracket=")";
		
		int bracketToOpen = 0;
		int bracketToClose = 0;
		
		private NodeBracket root;
		
		public TreeBracket(int n) {
			bracketToOpen = n;
			bracketToClose= n;
			
			this.root= buildTree(n, n, "");	
		}

		private NodeBracket buildTree(int openBracket, int closeBracket, String appendText) {
			if(openBracket == 0 && closeBracket == 0) {
				
				NodeBracket node = new NodeBracket();
				node.setNodeValue(node.getNodeValue()+appendText);
				return node;
			
			}else {
				
				NodeBracket node = new NodeBracket();
				node.setNodeValue(node.getNodeValue()+appendText);
				
				if(openBracket>0)
					node.setLeft(buildTree(openBracket-1, closeBracket, node.getNodeValue()+"("));
				if(openBracket<closeBracket)
					node.setRight(buildTree(openBracket, closeBracket-1, node.getNodeValue()+")"));
				
				return node;
					
			}
				
		}
		
		public List<NodeBracket> getBaseNodeList(){
			return getBaseNodeList(new ArrayList<NodeBracket>(), root);
		}
		
		
		private List<NodeBracket> getBaseNodeList(List<NodeBracket> list, NodeBracket node){
			if(node.getRight()==null && node.getLeft()==null) {
				list.add(node);
				return list;
			}else {
				if(node.getLeft()!=null) {
					List<NodeBracket> r = getBaseNodeList(list, node.getLeft()); 
					if(!list.containsAll(r))
						list.addAll(r);
				
				}if(node.getRight()!=null) {
					List<NodeBracket> r = getBaseNodeList(list, node.getRight());
					if(!list.containsAll(r))
						list.addAll(r);
				}
				return list;
				
				
			}
		}
		
	}
	
	static class NodeBracket{
		private String nodeValue="";
		private NodeBracket right;
		private NodeBracket left;
		

		public String getNodeValue() {
			return nodeValue;
		}
		public void setNodeValue(String nodeValue) {
			this.nodeValue = nodeValue;
		}
		public NodeBracket getRight() {
			return right;
		}
		public void setRight(NodeBracket right) {
			this.right = right;
		}
		public NodeBracket getLeft() {
			return left;
		}
		public void setLeft(NodeBracket left) {
			this.left = left;
		}
		
		@Override
		public String toString() {
			return nodeValue;
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		TreeBracket tree = new TreeBracket(10);
		List<NodeBracket> nodes = tree.getBaseNodeList();
		System.out.println(nodes.size());
		
		for(NodeBracket node : nodes) {
			System.out.println(node);
		}
		
		
		
		
		
	}
	
	
	
}
