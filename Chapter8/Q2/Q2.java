import java.awt.Point;
import java.util.ArrayList;

/**
 * Q2
 */
public class Q2 {

    public static void main(String[] args) {
        
    }

    public static ArrayList<Point> getPath (boolean[][] M) {
        if(M==null || M.length==0)  return null;
        ArrayList<Point> res = new ArrayList<>();
        HashSet<Point> visited = new HashSet<>();

        if(helper1(M, 0, 0, res,visited))
            return res;
        
        return new ArrayList<Point>();
    }

    // time consuming
    // public static boolean helper(boolean[][] M, int x , int y , ArrayList<Point> path,HashSet<Point> visited) {
    //     if(x>M.length || y>M[0].length || !M[x][y]) return false;

    //     boolean flag = (x==M.length-1) && (y==M[0].length-1);

    //     if(flag || helper(M, x+1, y, path) || helper(M, x, y+1, path))
    //     {
    //         Point p = new Point(x,y);
    //         path.add(p);
    //         return true;
    //     }
    //     return false;

    // }

    public static boolean helper1(boolean[][] M, int x , int y , ArrayList<Point> path,HashSet<Point> visited) {
        if(x>M.length || y>M[0].length || !M[x][y]) return false;
        
        Point p = new Point(x,y);

        if(visited.contains(p)) return false;

        boolean flag = (x==M.length-1) && (y==M[0].length-1);

        if(flag || helper(M, x+1, y, path,visited) || helper(M, x, y+1, path,visited))
        {
            path.add(p);
            return true;
        }
        visited.add(p);
        return false;
    }




}