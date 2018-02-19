package f;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Foo {
    public String getC(Object a){
        return ((Object)a).getClass().toString();
    }
    public <T extends Number> double addiction(T one, T two) {
        double a = (Double)one;
        double b = (Double)two;
        return a+b;
    }
}
