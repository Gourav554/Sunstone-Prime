import java.util.*;
public class Generic {
    // String,water container;   Only String data store kar sakte hain

    //Object class is top most Parent class of all java classes, isliye Object data type se hum kisi bhi type ka data store kar sakte hain, lekin type safety nahi hoti
    Object container;  // Object data type se hum kisi bhi type ka data store kar sakte hain, lekin type safety nahi hoti

public void box(Object item) {
    this.container = item;
}

public Object getValue(){
    return this.container;
}


}
