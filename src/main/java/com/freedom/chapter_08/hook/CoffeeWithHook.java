package com.freedom.chapter_08.hook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * 覆盖这个钩子提供自己的功能
     * @return
     */
    @Override
    boolean customerWantsCondiments() {
        // 让用户输入他们对调料的决定。根据用户的输入返回true或false
        String answer = getUserInput();

        if (answer.toLowerCase(Locale.ROOT).startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 这段代码询问用户是否想要奶和糖，通过命令行获得用户输入
     * @return
     */
    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with you coffee? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
