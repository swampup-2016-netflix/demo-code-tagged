package swampup;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;

import java.util.Set;

public class ReloMain {

    public static void main(String[] args) {
        Set<Set<String>> ps = Sets.powerSet(Sets.newHashSet("one", "two"));

        ps.forEach( set -> {
            System.out.print(Joiner.on(",").join(set));
            System.out.println("(" + set.size() + ")");
        });
    }

}