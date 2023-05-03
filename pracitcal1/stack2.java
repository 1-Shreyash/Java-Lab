package pracitcal1;


public class stack2 {
    int n;
    int i=-1;//top
    stack2(int length){
        n = length;
    }
    int a[]= new int[n];
    void push(int b){
        i++;
        a[i]=b;
    }
    void pop(){
        i--;
    }
    void peek(){
        System.out.println("The element at top is: "+a[i]);
    }
}
