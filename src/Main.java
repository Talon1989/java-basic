import bp.BuilderPattern;
import f.FromP;
import f.FuncInterface;
import f.Utill;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main (String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(450);
        list.add(540);
        list.add(486);
        list.add(216);
        list.set(0, 111);
        for(Integer l : list){
            System.out.println(l);
        }
        System.out.println(
                new Utill().findGCF(list)
        );
        pp(new Potato(){});

        new FromP();

        Map<String, Integer> m = new HashMap<>();
        m.put("Fabio", 10);
        m.put("Lucas", 15);
        m.put("John", 12);
        System.out.println(m.get("Fabio"));
        m.put("Fabio", 20);
        System.out.println(m.get("Fabio"));
        for(Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey()+" / "+e.getValue());
        }

    }

    private static void bp(){
        BuilderPattern pb1 = BuilderPattern.create(new BuilderPattern.Builder()
                .id(new BigInteger("123")).name("Banana").build());
        System.out.println(pb1);
        pb1.setCountry("Italy");
        System.out.println(pb1);
    }

    private<T> void  swap (T one ,T two){
        T temp = one;
        one = two;
        two = temp;
    }

    private class Banana<T extends Number>{
        T one;
    }

    enum Plane{
        Mig(15), Pak(18);
        int num;
        Plane(int num){this.num = num;}
    }

    public static void printt(FuncInterface anInterface, Integer num1, Integer num2){
        System.out.println(anInterface.operation(num1, num2));
    }

    private static  void pp(Potato p){
        p.pri("asd");
    }

    private interface Potato{
        default void pri(String txt){
            System.out.println(txt);
        }
    }

}
