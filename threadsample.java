class thread1 extends Thread{
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
class thread2 extends Thread{
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
public class threadsample{
    public static void main(String[] args){
         thread1 th1=new thread1();    //object creation for class thread1
         thread2 th2=new thread2();    //object creation for class thread2
         th1.start();  //executing run method
         th2.start();  //executing run method
    }
}

