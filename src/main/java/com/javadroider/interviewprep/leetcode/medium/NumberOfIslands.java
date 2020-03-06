package com.javadroider.interviewprep.leetcode.medium;

public class NumberOfIslands {
    public static void main(String[] args) {
        char [][] mat1 = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        char [][] mat2 = {{'1','0','0','1'},{'0','1','1','0'},{'0','1','1','1'},{'1','0','1','1'}};
        System.out.println(new NumberOfIslands().numIslands(mat1));
    }

    public int numIslands(char[][] grid) {

        if( grid == null){
            return 0;
        }

        int count = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){

                if(grid[row][col] == '1'){
                    count++;
                    bfs(grid, row, col);
                }
            }
        }

        return count;
    }

    private void bfs(char grid[][], int row, int col){

        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';

        //left
        bfs(grid, row, col - 1);
        //right
        bfs(grid, row, col + 1);
        //up
        bfs(grid, row + 1, col);
        //down
        bfs(grid, row - 1, col);

    }
}
