package com.study.ch3;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        int getStackSize = stack.size();

        while (getStackSize > -1) {
            try {
                System.out.println(stack.get(getStackSize--));
            } catch (Exception e) {
            }
        }

        ArrayList<String> stack2 = new ArrayList<>();
        stack2.add("고예리임");
        stack2.add("강승호오");
        stack2.add("지짜");

        int getStack2Size = stack2.size();

        while (getStack2Size > -1) {
            try {
                System.out.println(stack2.get(getStack2Size--));
            } catch (Exception e) {
            }
        }


    }
}
