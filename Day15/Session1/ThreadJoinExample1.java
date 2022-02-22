class ThreadJoinExample1 extends Thread{    
 public void run(){    
  for(int i=1;i<=5;i++){    
   try{    
    Thread.sleep(500);    
   }catch(Exception e){System.out.println(e);}    
  System.out.println(i);    
  }    
 }    
public static void main(String args[]) throws InterruptedException{    
	ThreadJoinExample1 t1=new ThreadJoinExample1();    
	ThreadJoinExample1 t2=new ThreadJoinExample1();    
 ThreadJoinExample1 t3=new ThreadJoinExample1();    
 t1.start();    
 try{    
  t1.join();    
 }catch(Exception e){System.out.println(e);}    
    
 t2.start(); 
 t2.join();
 t3.start();    
 }    
}    
