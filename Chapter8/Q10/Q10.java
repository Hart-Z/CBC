/**
 * Q10
 */
public class Q10 {

    public static void main(String[] args) {
        
    }

    enum Color{blue , green, white, red};

    public static boolean PaintFill(Color[][] screen, int r, int c,Color newc)
    {
        if(screen[r][c]==newc)  return false;
        PaintFill(screen,r,c,screen[r][c],newc);
        return true;
    }

    public static void PaintFill(Color[][] screen, int r, int c, Color oldc,Color newc) {
        if(r<0 || r>screen.length || c<0 || c>screen[0].length)  return;
       
        if(screen[r][c]==oldc)
        {
            screen[r][c] = newc;
            PaintFill(screen,r+1,c,oldc,newc);
            PaintFill(screen,r-1,c,oldc,newc);
            PaintFill(screen,r,c+1,oldc,newc);
            PaintFill(screen,r,c-1,oldc,newc);
        }
        
    }
}