package com.example.wmrmaven.concurrence;

/**
 * @author wumoran
 * @version 1.0
 * @description TODO
 * @date 2022/1/12 19:45
 */
public class TestSynClass {

    private   long count = 0;
    synchronized long get(){
        return count;
    }
    synchronized void set(long v){
        count = v;
    }
    void add10K() {
        int idx = 0;
        while(idx++ < 10000) {
            set(get()+1);
        }
    }
    //竞态条件
    public static void main(String[] args) throws InterruptedException {
        TestSynClass testSynClass = new TestSynClass();
        new Thread(()->{
            long tp = testSynClass.get();

            try {
                Thread.sleep(10);
                testSynClass.set(tp+1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            long tp = testSynClass.get();
            testSynClass.set(tp+1);
        }).start();
        Thread.sleep(1000);
        System.out.println(testSynClass.count);
    }
}