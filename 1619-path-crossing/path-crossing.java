class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        Set <String> visited = new HashSet<>();
        visited.add("0,0");

        for(char dir : path.toCharArray()){
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
            String pos = x + "," + y;
            if(visited.contains(pos)){
                return true;
            }
            visited.add(pos);
        }
        return false;
    }
}