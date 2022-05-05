

import java.util.*;
class Stack{
	int n = 10;
	int top1;
	int top2;
	int a1[] = new int[n];
	
	Stack(){
		top1 = -1;
		top2 = n;
	}
	
	void push1(int x){
		if(top1 < top2-1){
			a1[++top1] = x;
		}
		else{
			System.out.println("Stack overflow");
		}
	}
	
	void push2(int x){
		if(top1 < top2-1){
			a1[--top2] = x;
		}
		else{
			System.out.println("Stack overflow");
		}
	}
	
	int pop1(){
		if(top1 <0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a1[top1--];
			return x;
		}
	}
	
	int pop2(){
		if(top2 >= n){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int x = a1[top2++];
			return x;
		}
	}
	
	public static void main(String [] args){
		Stack s1 = new Stack();
		
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		
		System.out.println("Popped element from stack1 is "+s1.pop1());
		System.out.println("Popped element from stack2 is "+s1.pop2());
	}
}