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
        if(i>=0)
            i--;
        else
            System.out.println("Index out of bound\n");
    }
    void peek(){
        System.out.println("The element at top is: "+a[i]);
    }
}
