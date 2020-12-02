/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDrones;

/**
 *
 * @author jeans
 */
public class Barrier {
    public  int maxNumThreads;
    public int numCalls = 0;
    public Barrier(int numThreads) {
        this.maxNumThreads = JDrones.nu;
    }
    public synchronized void call() {
        numCalls++;
            if (numCalls == maxNumThreads) {
                this.notifyAll();
                  numCalls = 0;
            } else {
         try {
             this.wait();
         } catch (InterruptedException ignore) { }
        }
      }
    
 }