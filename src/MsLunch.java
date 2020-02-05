public class MsLunch {
    private long c1 = 0;
    private long c2 = 0;

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void inc1(){
        synchronized ((lock1)) {
            c1++;
            //this is called the critical region, only locking somethign that needs to be locked when you're using it
        }
    }

    public void inc2(){
        synchronized (lock2){
            c2++;
        }
    }
}
