package org.andestech.learning.rfb18.g2;

class A{
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public A(int data) {
        this.data = data;
    }

    private int data;

    public String toString(){return
            String.valueOf(data);}

}


class B<T>
{
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public B(T data) {
        this.data = data;
    }

    private T data;


   public void getInfo(){
       System.out.println(data.getClass().getCanonicalName());
   }

}

class C<K,V>{

}

public class App 
{
    public static void main( String[] args )
    {B b = new B(11);


     // B<Integer> b2 = new B<>(234.33);
      B<A> b3 = new B<>(new A(25));

        b3.getInfo();
        System.out.println(b3.getData().getData());

      int a1 = 12;
      Integer a2 = 12;

      int a3 = 2 + a2;


    }
}
