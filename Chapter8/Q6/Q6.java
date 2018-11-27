/**
 * Q6
 */
public class Q6 {

    public static void main(String[] args) {
        Tower t1 = new Tower(1);
        Tower t2 = new Tower(2);
        Tower t3 = new Tower(3);
        
        t1.add(3);
        t1.add(2);
        t1.add(1);

        t1.moveDisks(3,t3,t2);
        System.out.println("First");
        for(int ele : t1.disks)
            System.out.println(ele);
        System.out.println("Second");
        for(int ele : t2.disks)
            System.out.println(ele);
        System.out.println("Third");
        for(int ele : t3.disks)
            System.out.println(ele);


    }

    
}