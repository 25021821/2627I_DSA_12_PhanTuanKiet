package EqualStacks;

import java.util.Stack;
import java.util.Scanner;
public class EqualStacks {
    public int equalstacks(int[] h1, int[] h2, int[] h3 ) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        fillstacks(st1, h1, st2, h2, st3, h3);
        while (!st1.isEmpty() && !st2.isEmpty() && !st3.isEmpty()){
            int stack1 = st1.peek();
            int stack2 = st2.peek();
            int stack3 = st3.peek();
            if (stack1 == stack2 && stack2 == stack3){
                return stack1;
            }
            if(stack1 >= stack2 && stack1 >= stack3){
                st1.pop();
            } else if (stack2 >= stack1 && stack2 >= stack3){
                st2.pop();
            } else if (stack3 >= stack1 && stack3 >= stack2){
                st3.pop();
            }
            }
        return 0;
        }
    private void fillstacks(Stack<Integer> st1, int[] h1, Stack<Integer> st2, int[] h2, Stack<Integer> st3, int[] h3) {
        fillonestack(st1, h1);
        fillonestack(st2, h2);
        fillonestack(st3, h3);
    }
    private void fillonestack(Stack<Integer> stack, int[] heights) {
        int maxheight = 0;
        for (int i = heights.length - 1; i >= 0 ; i--){
            maxheight += heights[i];
            stack.push(maxheight);
        }
    }
    public static void main(String[] args) {
        EqualStacks equalStacks = new EqualStacks();
        int[] h1 = {4, 1, 5, 1, 9};
        int[] h2 = {4, 3, 7};
        int[] h3 = {1, 3, 4, 2};
        int result = equalStacks.equalstacks(h1, h2, h3);
        System.out.println("Maximum height: " + result);
    }
}