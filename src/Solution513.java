import java.util.ArrayList;
import java.util.HashMap;

public class Solution513 {
    HashMap<Integer, ArrayList<Integer>> map= new HashMap<>();
    public int findBottomLeftValue(TreeNode root) {
        return map.get(addStuff(1, root)).get(0);
    }

    public int addStuff(int depth, TreeNode node) {
        if(node == null) {
            return depth-1;
        }
        if(!map.containsKey(depth)) {
            map.put(depth, new ArrayList<Integer>());
        }
        map.get(depth).add(node.val);
        return Math.max(addStuff(depth+1, node.left), addStuff(depth+1, node.right));
    }
}
