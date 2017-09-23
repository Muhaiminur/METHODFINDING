/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodfinding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author 12301019
 */
public class METHODFINDING {

    static List<String> method = new ArrayList<String>();
    static String []key={"public"};
    static List<String> keywords = new ArrayList<String>();
    static String []op={"+","-","/","%","*","="};
    static List<String>operator = new ArrayList<String>();
    static String[]lo={"==","!=",">","<",">=","<="};
    static List<String>logicaloperator = new ArrayList<String>();
    static List<String>num = new ArrayList<String>();
    static String[]ot={",","(",")","{","}",";","[","]"};
    static List<String>other = new ArrayList<String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreElements()){
                    String s=(String)st.nextElement();
                    System.out.println(s);
                    if(Arrays.asList(key).contains(s)){
                            keywords.add(s);
                            String abir="";
                            s=(String)st.nextElement();
                            while(s.equalsIgnoreCase("int")||s.equalsIgnoreCase("static")||s.equalsIgnoreCase("void")){
                                String ss=(String)st.nextElement();
                                abir=abir+ss;
                                //System.out.println("abir====================="+abir);
                                if(ss.contains(")")){
                                    //iden.add(ss);
                                    if(abir.contains("int")){
                                        abir.replace("int","");
                                    }
                                    method.add(abir);
                                    break;
                                }
                                
                                //iden.add(ss);
                            }
                        }
                }
            }
        } catch (Exception e) {
            
        }
        print();
    }
    public static void check(String s){
        
    }
    public static void print(){
        System.out.println("OUTPUT::");
        /*System.out.print("PRINTING KEYWORDS ::");
        for (String s : keywords) {
            System.out.print(s+" ");
        }
        System.out.println();*/
        System.out.println("PRINTING METHOD ::");
        for (String s : method) {
            if(s.contains("int")){
                                        String a=s.replace("int","");
                                        s=a;
                                    }
            System.out.println(s+" ");
        }
        System.out.println();/*
        System.out.print("PRINTING MATH OPERATOR ::");
        Set<String> t = new LinkedHashSet<>(operator);
        for (String s : t) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("PRINTING LOGICAL OPERATORS ::"); // prints "Hello!"
        Set<String> t2 = new LinkedHashSet<>(logicaloperator);
        for (String s : t2) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("PRINTING NUMARICAL VALUES ::"); // prints "Hello!"
        Set<String> t3 = new LinkedHashSet<>(num);
        for (String s : t3) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("PRINTING OTHER ::"); // prints "Hello!"
        Set<String> t4 = new LinkedHashSet<>(other) ;
        for (String s : t4) {
            System.out.print(s+" ");
        }

*/
        System.out.println();
    }
}
