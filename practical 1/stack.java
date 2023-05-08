public class stack {
    int n;
    int i=-1;//top
    int a[];
    stack(int length){
        n = length;
        a= new int[n];
    }
    void push(int b){
        if(i<=9){
            i++;
            a[i]=b;
        }
        else
            System.out.println("The stack is full");
    }
    void pop(){
        if(i>0)
            i--;
        else
            System.out.println("The stack is Empty");
    }
    int isEmpty(){
        if(i==-1)
            return 1;
        else
            return 0;
    }
    int isFull(){
        if(i==n-1)
            return 1;
        else
            return 0;
    }
    void peek(){
        System.out.println("The element at top is: "+a[i]);
    }
}
