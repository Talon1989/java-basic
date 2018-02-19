package f;

import java.util.List;
import java.util.stream.Collectors;

public class Utill {

    public Integer findGCF (List<Integer> list) {
        int currentGCF;
        int realGCF = 1;
        int minNum = list.stream().reduce(Integer::min).get();
        for(int i=2; i<minNum; i++){
            final int current = i;
            if(list.stream().allMatch(a->a%current==0)){
                realGCF = i;
            }
        }
        return realGCF;
    }

    private Integer findGCF2 (List<Integer> list, int currentGCF, int realGCF, int minNum) {
        for(int i=2; i<minNum; i++){
            final int current = i;
            if(list.stream().allMatch(a->a%current==0)){
                currentGCF = i;
                realGCF *= i;
                System.out.println("CURRENT LIST = "+list);
                System.out.println("CURRENT GCF = "+currentGCF);
                System.out.println("REAL GCF = "+realGCF+"\n");
                findGCF2(list.stream().map(a->a/current).collect(Collectors.toList())
                        , currentGCF, realGCF, minNum);
            }
        }
        System.out.println("FINISHED");
        return realGCF;
    }

}
