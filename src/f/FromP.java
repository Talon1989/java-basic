package f;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FromP implements Serializable {

    private Intf molt = new Intf() {
        @Override
        public Integer operation(Integer obj) {
            return obj*2;
        }
    };

    public FromP() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer>list2 = applyToEach(list, (a)->a*2);
        System.out.println(list2);
    }

    public List<Integer> applyToEach(List<Integer> list, Intf intf){
        List<Integer> list2 = new ArrayList<>();
//        for(Integer n : list){
//            list2.add(intf.operation(n));
//        }
        for(int i = 0; i < list.size(); i++){
            list.set(i, intf.operation(list.get(i)));
        }
        return list;
    }

    interface Intf {
        Integer operation(Integer obj);
    }

}