
package JDrones;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
public class varcondicion {
    private  Lock vcondition;
    private  Condition condition;
    private Lock mutexvc;
    varcondicion(){
        vcondition = new ReentrantLock();
        condition=vcondition.newCondition();
        mutexvc= new ReentrantLock();
    }
    public  void signal(){
        mutexvc.lock();
        try{
            condition.signal();
        }catch(Exception e){}
        finally{
            mutexvc.unlock();
        }
    }
    public void await(){
     mutexvc.lock();
        try{
            condition.await();
        }catch(Exception e){}
        finally{
            mutexvc.unlock();
        }
    }
}
