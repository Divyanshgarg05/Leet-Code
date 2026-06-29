class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int provinces = 0;

        for(int i = 0; i < n; i++) {
            if(!vis[i]) {
                dfs(isConnected, vis, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] graph, boolean[] vis, int curr) {
        vis[curr] = true;

        for(int i = 0; i < graph.length; i++) {
            if(graph[curr][i] == 1 && !vis[i]) {
                dfs(graph, vis, i);
            }
        }
    }
}