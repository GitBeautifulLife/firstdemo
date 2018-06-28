package com.example.coludserver.duilie;

/**
 * @author Liuh
 * @date 2018/6/28 12:01
 */
public class AppTest {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        PushBlockQueue.getInstance().start();
        for(;;){
            Thread.sleep(1000);
            PushBlockQueue.getInstance().put("0123456");
        }
    }
}
