package test;

import java.util.*;

public class SetTest {

    public static void main(String[] args){
         Set<String> set = new HashSet<>();
         set.add("333");
         set.add("111");
         set.add("222");
         set.add("111");
        System.out.println("HashSet===========");
        System.out.println(set.size());
        System.out.println(set.toString());
        for(String a : set){
            System.out.println(a);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("333");
        treeSet.add("111");
        treeSet.add("222");
        treeSet.add("111");
        System.out.println("treeSet===========");
        System.out.println(treeSet.size());
        System.out.println(treeSet.toString());
        for(String a : treeSet){
            System.out.println(a);
        }



        List<String> arrayList = new ArrayList<>();
        arrayList.add("333");
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("111");
        System.out.println("arrayList===========");
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());



        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("1","222");
        hashMap.put("2","222");
        hashMap.put("3","222");

        List<String> ve = new Vector<>();
        ve.add("ssss");
        System.out.println(ve.get(0));
    }
}
