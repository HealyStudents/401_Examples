package generics;

public class Test<T>
{
    // An object of type T is declared
    T obj;
    public Test(T obj) {  this.obj = obj;  }  // constructor

    public T getObject()  { return this.obj; }
}

