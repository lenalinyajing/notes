package org.example.day04.Thread;

//有人拿重了，拿到同一张票
public class ThreadDemo04 implements Runnable{

    //票数
    private int ticketNum = 10;
    @Override
    public void run() {
        while (true){
            if(ticketNum<=0){
                break;
            }
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"====拿到第"+ticketNum--+"=====  票");
        }
    }

    public static void main(String[] args) {
        ThreadDemo04 threadDemo04 = new ThreadDemo04();

        new Thread(threadDemo04,"xixxxxxx").start();
        new Thread(threadDemo04,"yyyyyyyy").start();
        new Thread(threadDemo04,"zzzzzzzz").start();
    }
}
