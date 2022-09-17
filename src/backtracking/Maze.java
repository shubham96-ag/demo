package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(pathCount(3,3));
        path("",3,3);
        System.out.println(ReturnPath("",3,3));
        System.out.println(ReturnPathDiagonal("",3,3));
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println(ReturnPathWithRestrictions("",maze,0,0));
        System.out.println("All path output: ");
        allPathWithoutReturnType("",maze,0,0);
        System.out.println(allPath("",maze,0,0));

    }

    public static int pathCount(int x,int y){
        if(x==1 || y==1){
            return 1;
        }
        int left = pathCount(x-1,y);
        int right = pathCount(x,y-1);
        return left+right;
    }

    public static void path(String p,int row, int col){
        if(row==1 && col==1) {
            System.out.println(p);
            return;
        }
        if(row!=1)
        path(p+"D",row-1,col);
        if(col!=1)
        path(p+"R",row,col-1);
    }

    public static ArrayList<String> ReturnPath(String p, int row, int col){
        ArrayList<String> res = new ArrayList<>();
        if(row==1 && col==1) {
            res.add(p);
            return res;
        }
        if(row!=1)
            res.addAll(ReturnPath(p+"D",row-1,col));
        if(col!=1)
            res.addAll(ReturnPath(p+"R",row,col-1));
        return res;
    }

    /* this indexing is being used
 3 2 1
3
2
1
 */
    public static ArrayList<String> ReturnPathDiagonal(String p, int row, int col){
        ArrayList<String> res = new ArrayList<>();
        if(row==1 && col==1) {
            res.add(p);
            return res;
        }
        if(row>1 && col>1)
            res.addAll(ReturnPathDiagonal(p+"D",row-1,col-1));
        if(row!=1)
            res.addAll(ReturnPathDiagonal(p+"V",row-1,col));
        if(col!=1)
            res.addAll(ReturnPathDiagonal(p+"H",row,col-1));
        return res;
    }
/* this indexing is being used
 0 1 2
0
1
2
 */
    public static ArrayList<String> ReturnPathWithRestrictions(String p,boolean[][] maze, int row, int col){
        ArrayList<String> res = new ArrayList<>();
        //if encounter any river simply return from that point
        if(maze[row][col]==false)
            return res;
        //if reach at last row or last column simply return value as no more calls can be made.
        if(row==maze.length-1 && col==maze[0].length-1) {
            res.add(p);
            return res;
        }
        if(row<maze.length-1)
            res.addAll(ReturnPathWithRestrictions(p+"D",maze,row+1,col));
        if(col<maze[0].length-1)
            res.addAll(ReturnPathWithRestrictions(p+"R",maze,row,col+1));
        return res;
    }

    public static void allPathWithoutReturnType(String p, boolean[][] maze, int row, int col){
        if(row==maze.length-1 && col==maze[0].length-1) {
            System.out.println(p);
            return;
        }
        //if encounter any river simply return from that point
        if(maze[row][col]==false) {
            return;
        }
        //I am considering the cell into my path and hence marking it false to indicate it is visited in current recursive call
        maze[row][col] = false;
        //if reach at last row or last column simply return value as no more calls can be made.

        if(row<maze.length-1)
            allPathWithoutReturnType(p+"D",maze,row+1,col);
        if(col<maze[0].length-1)
            allPathWithoutReturnType(p+"R",maze,row,col+1);
        if(row>0)
            allPathWithoutReturnType(p+"U",maze,row-1,col);
        if(col>0)
            allPathWithoutReturnType(p+"L",maze,row,col-1);

        //this line is where function calls will get over
        //therefore before the function gets removed also remove the changes that were made by the function
        maze[row][col] = true;
    }

    //this function returns list of all paths. User is allowed to move in left,right,up,down
    public static ArrayList<String> allPath(String p,boolean[][] maze, int row, int col){
        ArrayList<String> res = new ArrayList<>();
        //if reach at last row or last column simply return value as no more calls can be made.
        if(row==maze.length-1 && col==maze[0].length-1) {
            res.add(p);
            return res;
        }
        //if encounter any river simply return from that point
        if(maze[row][col]==false)
            return res;
        //I am considering the cell into my path and hence marking it false to indicate it is visited in current recursive call
        maze[row][col] = false;

        if(row<maze.length-1)
            res.addAll(allPath(p+"D",maze,row+1,col));
        if(col<maze[0].length-1)
            res.addAll(allPath(p+"R",maze,row,col+1));
        if(row>0)
            res.addAll(allPath(p+"U",maze,row-1,col));
        if(col>0)
            res.addAll(allPath(p+"L",maze,row,col-1));

        //this line is where function calls will get over
        //therefore before the function gets removed also remove the changes that were made by the function
        maze[row][col] = true;
        return res;
    }
}
