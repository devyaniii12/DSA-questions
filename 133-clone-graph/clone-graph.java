/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node==null) return null;

        Map<Node,Node> clonedNodes=new HashMap<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        clonedNodes.put(node,new Node(node.val));

        while(!queue.isEmpty()) {
            Node curr=queue.poll();
            for(Node neighbor:curr.neighbors) {
                if(!clonedNodes.containsKey(neighbor)) {
                    clonedNodes.put(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }
                clonedNodes.get(curr).neighbors.add(clonedNodes.get(neighbor));
            }
        }
        return clonedNodes.get(node);
    }
}