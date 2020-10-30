public class Maze {
    public static void main(String[] args) {
        int maze [][] = {{1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,3},
                        {1,0,1,0,1,0,1},
                        {0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1},
                        {1,2,1,0,1,0,1}};

        String directions [] =  {"N","N","N","N","N","E","E","E","E","E"};

        // find the start
        int start[] = {-1,-1};
        int end[] = {-1,-1};

        for (int y = 0; y < maze.length; y++) {
            for (int x = 0; x < maze[y].length; x++) {
                if (maze[y][x] == 2) {
                    start[0] = y;
                    start[1] = x;
                } else if (maze[y][x] == 3) {
                    end[0] = y;
                    end[1] = x;
                }
            }
        }

        if (start[0] == -1) {
            System.out.println("No start found");
            System.exit(0);
        }

        if (end[0] == -1) {
            System.out.println("No end found");
            System.exit(0);
        }

        int[] pos = {-1 ,-1};
        pos[0] = start[0];
        pos[1] = start[1];

        for (int i = 0; i < directions.length; i++) {
            Move(pos, directions[i], maze);
        }

        if (maze[pos[0]][pos[1]] == 0) {
            System.out.println("Lost");
            System.exit(0);
        }
    }

    static void Move(int pos[], String dir, int maze[][]) {
        // N E S W
        System.out.println("My current position is: y-"+pos[0]+" x-"+pos[1]);
        if (dir.equals("N")) {
            pos[0] -= 1;
        } else if (dir.equals("E")) {
            pos[1] += 1;
        } else if (dir.equals("S")) {
            pos[0] += 1;
        } else if (dir.equals("W")) {
            pos[1] -= 1;
        }
        if (pos[0] >= maze.length || pos[1] >= maze[0].length) {
            System.out.println("Dead");
            System.exit(0);
        }
        if (maze[pos[0]][pos[1]] == 1 || pos[0] < 0 || pos[1] < 0) {
            System.out.println("Dead");
            System.exit(0);
        }

        if (maze[pos[0]][pos[1]] == 3 ) {
            System.out.println("Finish");
            System.exit(0);
        }
    }
}
