package com.sjms.wq.结构型.装饰者模式.demoone;

import com.sjms.wq.结构型.装饰对象模式.demoone.bo.Beverage;
import com.sjms.wq.结构型.装饰对象模式.demoone.bo.Espresso;
import com.sjms.wq.结构型.装饰对象模式.demoone.bo.Mocha;
import com.sjms.wq.结构型.装饰对象模式.demoone.bo.Whip;
import com.sjms.wq.结构型.装饰对象模式.demotwo.bo.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStream;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 世墨
 * @Date: 2022/3/4 11:00
 * @DESCRIPTION
 */
public class Test {

    /**
     * 新的设计原则：开闭原则：对修改关闭，对扩张开发
     * <p>
     * 装饰者模式：记住 如何装饰 和 如何委托
     * <p>
     * 装饰者模式 ：动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案。
     *
     * java中使用的装饰者模式：io流
     */


    @org.junit.jupiter.api.Test
    void test() {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $," + espresso.cost());
        espresso = new Mocha(espresso);//进行装饰
        espresso = new Whip(espresso);//进行装饰
        System.out.println(espresso.getDescription() + " $," + espresso.cost());
    }

    /**
     * java IO流典型的装饰者
     *
     * FileInputStream  是被装饰的 “组件”。java I/0 程序提供了几个组件，包括了 FileInputStream，StringButterInputStream，ByteArrayInputStream等这些类都是最基本的字节读取功能
     *    ||
     * ButteredInputStream 是一个具体的装饰者，它加入两种行为，利用缓冲输入来改变性能，用了一个readline()方法(用来一次读取一行文本输入数据)来增加接口
     *   ||
     * LineNumberInputStream 也是一个具体的装饰者 它加上了计算行数的能力
     *
     *
     * io 类图
     *
     *                                                     InputStream  这是我们的抽象组件
     *               //                    //                                  ||                          \\
     *        FileInputStream         StringBufferInputStream              ByteArrayInputStream           FilterInputStream:是一个抽象装饰者
     *                                                                                                 //       ||                  ||            \\
     *                                                                                PushbackInputStream   BufferedInputStream  DataInputStream   LineNumberInputStream  这些都是具体的装饰者
     *
     *
     *
     *
     */

    @org.junit.jupiter.api.Test
    void test_io(){
        int c;
        try { //自定义
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/text.txt")));
            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target-nums[i])){
                    return new int[] {i,map.get(target-nums[i])};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        }
    }
}
