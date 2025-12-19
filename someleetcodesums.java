package org.example;
import java.util.*;
class Main{
    public static void patternsum(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
             System.out.println();
            }
        }

    }
    public static int stringtointeger(String s){
         s=s.trim();
        int n=s.length();
         int sign=1;
         long num=0;
        if(n==0){
            return 0;
        }
        int i=0;
        if (s.charAt(i) == '-' || s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            if(num*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (num*sign);

    }
    public static String countandsay(int n){
        String s="1";
        for(int i=1;i<n;i++){
            String result="";
            int count=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    count++;
                }
                else{
                    result=result+count+s.charAt(j-1);
                    count=1;
                }
            }
            result=result+count+s.charAt(s.length()-1);
            s=result;
        }
        return s;
    }
    public static List<List<String>>Anagrams(String [] strs){
        if(strs ==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>>frequencyString=new HashMap<>();
        for(String str :strs){
           String freqString =getFrequencyString(str);
           if(frequencyString.containsKey(freqString)){
               frequencyString.get(freqString).add(Str);
           }
           else{
               List<String>stringlist=new ArrayList<>();
               stringlist.add(str);
               frequencyString.put(freqString,stringlist);
           }
        }
        return new ArrayList<>(frequencyString.values());
    }
    public static void main(String[] args) {
        List<String>arraylist=new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        System.out.println(countandsay(arraylist));

    }
}
