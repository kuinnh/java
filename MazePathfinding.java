package cn.kuinn.university;

public class MazePathfinding {
    public static void main(String[] args) {
        // 10x10 迷宫地图初始化
        char[][] maze = {
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '.', '.', '.', '#', '.', '.', '.', '.', '#'},
                {'#', '#', '#', '.', '#', '.', '#', '#', '.', '#'},
                {'#', '.', '.', '.', '.', '.', '#', '.', '.', '#'},
                {'#', '.', '#', '#', '#', '.', '#', '.', '#', '#'},
                {'#', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
                {'#', '#', '#', '.', '#', '.', '#', '#', '.', '#'},
                {'#', '.', '.', '.', '#', '.', '.', '#', '.', '#'},
                {'#', '.', '#', '#', '#', '.', '.', '.', 'E', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
        };


        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }


        if (findway(maze,1,1)) {
            System.out.println("Found");
        }

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static boolean findway(char[][] maze, int i, int j) {
        if (maze[i][j] == 'E') {
            return true;
        }
        if (maze[i][j] == '.') {
            maze[i][j] = 'S';
            if (findway(maze, i + 1, j)) {
                return true;
            } else if (findway(maze, i, j + 1)) {
                return true;
            } else if (findway(maze, i - 1, j)) {
                return true;
            } else if (findway(maze, i, j - 1)) {
                return true;
            }else{
                maze[i][j] = 'X';
                return false;
            }
        }else {
            return false;
        }
    }

}
