/**
 Problem 15: Lattice Paths
 ---
 Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
 How many such routes are there through a 20×20 grid?
 ---
 @author Travis Stratton
 */
public class Problem15 {

    public static void main(String[] args) {
        int gridSize = 20;
        long[][] grid = new long[gridSize + 1][gridSize + 1];

        // Set up the outside of the grid.  There is only one path along either of the two sides.
        for (int i = 0; i < gridSize; i++) {
            grid[i][gridSize] = 1;
            grid[gridSize][i] = 1;
        }

        /*
            For each point on the grid, there is only right and down. In a 2x2 grid it looks like this
            ? ? 1
            ? ? 1
            1 1 1

            Where 1 is the path once you hit an edge (only one way to progress from there.
            Take the ? in the middle.  There is right (which has 1 path, and down, which has 1 path,
            so add them together and you get 2 paths!

            ?  ?  1
            ? [2] 1
            1  1  1

            Now look at the one to the left of the 2... its against a wall with a 2 and a 1 next to it,
            it will have 3 paths.  Etc. etc.  Fill in until it looks like so:

            6  3  1
            3  2  1
            1  1  1

            And the point at (0,0) is the maximum number of passes from there to the end of the grid
         */
        for (int i = gridSize-1; i>= 0; i--) {
            for (int k = gridSize-1; k >=0 ; k--) {
                grid[i][k] = grid[i+1][k] + grid[i][k+1];
            }
        }

        System.out.println("The number of routes in a 20x20 grid is: " + grid[0][0]);
    }

}
