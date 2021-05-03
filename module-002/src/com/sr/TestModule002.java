package com.sr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jerry
 * @create 2021-04-22 20:26
 * 测试类
 */
public class TestModule002 {
    public static void main(String[] args) {
        Mymodel mymodel = new Mymodel();
        System.out.println(mymodel);
        List<String>  strs = new ArrayList<String>() ;
        strs.add("1");
        strs.add("2");
        strs.add("6");
        strs.add("4");
        strs.add("5");
        strs.add("6");
        /*
        删除集合中偶数，list.remove()方法会造成集合大小动态变化，最后数据的值下标发生变化；用iterator迭代器来操作
         */
      Iterator<String> iterator = strs.iterator();
        while (iterator.hasNext()){
           int t =  Integer.parseInt(iterator.next()) ;
           if(t%2==0)
               iterator.remove();
        }

     /*   for (int i = 0; i<strs.size() ;i++){
            int j = Integer.parseInt(strs.get(i)) ;
            if(j%2 == 0)
                strs.remove(i) ;
        }*/
        System.out.println(strs);
    }
}
