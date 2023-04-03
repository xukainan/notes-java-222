package top.uaian.algorithm.leecode;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] land = new char[][]{{'1','1','0','0','0'}, {'1','1','0','0','0'}, {'0','0','1','0','0'}, {'0','0','0','1','1'}};
        System.out.println(numIslands(land));
    }


    public static int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == '1' && !visited[i][j]){
                    res++;
                    findBorder(grid, i, j, visited, m, n);
                }
            }
        }
        return res;
    }

    private static void findBorder(char[][] grid, int i, int j, boolean[][] visited, int m, int n) {
        if(i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || grid[i][j] == '0')
            return;

        visited[i][j] = true;
        findBorder(grid, i - 1, j, visited, m, n);
        findBorder(grid, i + 1, j, visited, m, n);
        findBorder(grid, i, j - 1, visited, m, n);
        findBorder(grid, i, j + 1, visited, m, n);
    }
}
