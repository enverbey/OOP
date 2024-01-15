package Week_5;

public class MyNumber extends Thread{
    static int i;
    int j;

    public MyNumber(int i, int j){
        this.i = i;
        this.j = j;
    }

    public void showNumber()
    {
        System.out.println("My number i is : " + i);
        System.out.println("My number j is : " + j);
    }
    public void run(){
        System.out.println("therad calıstı");
    }
    public static void heyy()
    {
        System.out.println("Independent !!");
    }
}
