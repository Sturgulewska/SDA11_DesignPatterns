package main.java.singleton;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public enum SingletonEnum {

    GET_INSTANCE;

    public void calculate() {
        System.out.println(this.getClass().getSimpleName());
    }
}
