import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>(List.of(1,1,2,2,3,4,4,5,6));
        Set<Integer> set=new HashSet<>();
        for(Integer data:li){
            set.add(data);
        }
        System.out.println(set);

    }
}
