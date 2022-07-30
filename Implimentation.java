class Stack{  // using array

    int data[];
    int tos;
    public Stack ()
    {
        this.data=new int[4];
       this.tos=-1;
    }

   private void doubleSize(){

        int newData[]=new int[2*data.length];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        this.data=newData;
       
    }

    public void push(int val)  {

        if(tos+1==data.length){

            doubleSize();
        }
       this.tos++;
        data[tos]=val;
    }
        

    

    public int  pop(){
        if(tos==-1){

            System.err.println("Stack is empty");
            return -1;
        }

        tos--;
        int ele=data[tos];
        return ele;


    }

    public  int peek(){
        if(tos==-1){

            System.err.println("Stack is empty");
            return -1;
        }

        
        int ele=data[tos];
        return ele;


    }

    public int size(){

        return tos+1;


    }





}



public class Implimentation {

    public static void main(String[] args) {

        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(70);
        System.err.println(st.peek());
        int poped_ele=st.pop();
        System.err.println(poped_ele);
        st.push(40);
        st.push(50);
        st.push(60);
        System.err.println(st.size()); 

        
    }

    
}
