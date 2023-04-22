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
public class join_and_isalive {
    public static void main(String[] args){
        thread1 th1=new thread1();  //object creation for class thread1
        thread2 th2=new thread2();  //object creation for class thread1
        Thread t1=new Thread(th1);   //passing object of thread1 class(th1) to the new THREAD object
        Thread  t2=new Thread(th2);  //passing object of thread1 class(th1) to the new THREAD object
        t1.start();    //executing run method
        t2.start();   //executing run method
        System.out.println(t1.isAlive());  //used to find the thread is dead or alive  #here it is alive
        try{
            t1.join();     //join used to stop the execution of main thread and complete the execution of t1 and t2 thread
        }catch(Exception e){}
        try{
            t2.join();     //join used to stop the execution of main thread and complete the execution of t1 and t2 thread
        }catch(Exception e){}
        System.out.println("bye");
        System.out.println(t1.isAlive());    //used to find the thread is dead or alive    #here it is dead
   }
}
