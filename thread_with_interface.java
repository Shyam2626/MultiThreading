class thread1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hiii");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
class thread2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
public class thread_with_interface {
    public static void main(String[] args){
        thread1 th1=new thread1();  //object creation for class thread1
        thread2 th2=new thread2();  //object creation for class thread1
        Thread t1=new Thread(th1);   //passing object of thread1 class(th1) to the new THREAD object
        Thread  t2=new Thread(th2);  //passing object of thread1 class(th1) to the new THREAD object
        t1.start();    //executing run method
        t2.start();   //executing run method
   }
}
