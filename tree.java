class Solution {
    public int maxDepth(Node root) {
        
        if(root == null) return 0;
        int max = 1;
        Stack<NodeInfo> stack = new Stack<>();
        stack.push(new NodeInfo(root, 1));
        while(!stack.isEmpty()){
            NodeInfo currNode = stack.pop();
            max = Math.max(currNode.depth, max);
            for(Node child : currNode.node.children){
                stack.push(new NodeInfo(child, currNode.depth+1));
            }
        }
        return max;
    }
    
    class NodeInfo{
        Node node;
        int depth;
        public NodeInfo(Node node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
}
