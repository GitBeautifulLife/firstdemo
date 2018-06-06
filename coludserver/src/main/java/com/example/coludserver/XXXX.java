package com.example.coludserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Liuh
 * @date 2018/6/1 11:54
 */
public class XXXX {
    /**
     * @Method  getStr
     * @Author Liuh
     * @Date 2018/6/1 11:55
     * @Param
     * @return
    */

        public static void main(String[] arg){
            List<MyTest> list = new ArrayList<MyTest>(){
                {
                    add(new MyTest("1","2","男"));
                    add(new MyTest("2","3","女"));
                    add(new MyTest("3","4","男"));
                    add(new MyTest("4","5","女"));
                }

            };

            list.forEach(test->{
                if (test!=null&&!test.equals("")){
                    System.out.println(test.getSex());
                }
            });


        }


}
