import java.util.Stack;

/**
 * Tower
 */
public class Tower {
    public Stack<Integer> disks;
    private int index;

    public Tower(int i){
        disks = new Stack<Integer>();
        index = i;
    }

    public int index()
    {
        return index;
    }

    public void add(int d)
    {
        if(!disks.isEmpty() && disks.peek()<=d)
            System.out.println("Error !");
        else{
            disks.push(d);
        }
    }
    
    public void moveTopto(Tower t){
        int top = disks.pop();
        t.add(top);
    }

    public void moveDisks(int n, Tower destination , Tower buffer){
        if(n>0){
            moveDisks(n-1,buffer,destination);
            moveTopto(destination);
            buffer.moveDisks(n-1,destination,this);
        }
    }
}