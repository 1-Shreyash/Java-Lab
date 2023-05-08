package pracs;

public class Stack {
    int n;
    int i=-1;//top
    // stack(int length){
    //     n = length;
    // }
    int[] a = new int[n];
    void push(int b){
        if(i<=n){
            i++;
            a[i]=b;
        }
        else
            System.out.println("index out of bound");
    }
    void pop(){
        if(i>=0)
            i--;
        else
            System.out.println("Index out of bound\n");
    }
    void peek(){
        System.out.println("The element at top is: "+a[i]);
    }
}