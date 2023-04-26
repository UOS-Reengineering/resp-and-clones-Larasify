package example.project.CodeClones;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        System.out.print("\t");
        for(int i=0;i<sequence2.length;i++){
            System.out.print(sequence2[i]+"\t");
        }
        System.out.print("\n");
        for(int i=0;i<sequence1.length;i++){
            System.out.print(sequence1[i]+"\t");
            for(int j=0;j<sequence2.length;j++){
                if(sequence2[j] == sequence1[i]){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
