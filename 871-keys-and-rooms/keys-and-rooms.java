class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] vis = new boolean[rooms.size()];

        dfs(rooms, 0, vis);

        for(boolean room : vis) {
            if(!room) {
                return false;
            }
        }

        return true;
    }

    private void dfs(List<List<Integer>> rooms,
                     int curr,
                     boolean[] vis) {

        vis[curr] = true;

        for(int key : rooms.get(curr)) {
            if(!vis[key]) {
                dfs(rooms, key, vis);
            }
        }
    }
}