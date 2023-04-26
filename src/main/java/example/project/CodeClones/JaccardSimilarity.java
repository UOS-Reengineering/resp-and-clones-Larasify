package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        double lena = set1.size();
        double lenb = set2.size();
        double intersect = 0;
        for(String s: set1){
            for(String k: set2){
                if(s.equals(k))
                    intersect++;
            }
        }
        return intersect / (lena+lenb-intersect);
    }

}
