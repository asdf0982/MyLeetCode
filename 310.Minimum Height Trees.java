
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//此题起初我想用DFS或BFS来做,发现很难进行下去.
//这是一道无向图的深度的经典题
public class Test {
	public static  List<Integer> findMinHeightTrees(int n, int[][] edges) {
	    if (n == 1) return Collections.singletonList(0);//若n为1只需要返回0
	    
	    List<Set<Integer>> adj = new ArrayList<>(n);
	    for (int i = 0; i < n; ++i) adj.add(new HashSet<>());//HashSet不允许有重复的值
	    for (int[] edge : edges) {
	        adj.get(edge[0]).add(edge[1]);
	        adj.get(edge[1]).add(edge[0]);
	    }
	    //在i号下标显示的是与i有连接的节点.
	    //下面就要找出只和一个点有连接的"叶子"节点
	    List<Integer> leaves = new ArrayList<>();
	    for (int i = 0; i < n; ++i)
	        if (adj.get(i).size() == 1) leaves.add(i);
	    
	    //深度相同的初始节点最多只能有两个
	    while (n > 2) {
	    	//去掉一圈叶子节点数,得到剩余的节点数
	        n -= leaves.size();
	        List<Integer> newLeaves = new ArrayList<>();
	        for (int i : leaves) {
	            int j = adj.get(i).iterator().next();//第一次调用Iterator的next()方法时，它返回序列的第一个元素
	            //即找到叶子节点连接的那个点,从那个点的下标处删除叶子点
	            adj.get(j).remove(i);
	            //加入新点也被删的只剩下一个对应点了,那他就成为了新的叶子点
	            if (adj.get(j).size() == 1) newLeaves.add(j);
	        }
	        leaves = newLeaves;
	    }
	    return leaves;
	}
	
	public static void main(String args[]) {
		int n;
		int [][] edges={{0,3},{1,3},{2,3},{4,3},{5,4}};
		n=6;
		List<Integer> result;
		result = findMinHeightTrees(n,edges);
	}
}
