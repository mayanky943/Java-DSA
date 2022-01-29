package example;

import java.util.*;

public class jimAndtheBurgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int order=sc.nextInt();
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> small=null;
        for(int i=0;i<order;i++){
            small=new ArrayList<>();
            small.add(sc.nextInt());
            small.add(sc.nextInt());
            list.add(small);
        }

        List<Integer> ans= Solve(list);

        for(Integer a:ans){
            System.out.println(a);
        }
    }

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    private static List<Integer> Solve(List<List<Integer>> list) {
        List<Integer> result=new ArrayList<>(list.size());
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
           int delivery_time=list.get(i).get(0)+list.get(i).get(1);
           map.put((i+1),delivery_time);
        }
        Map<Integer,Integer> sortedMap=sortByValue((HashMap<Integer, Integer>) map);
        for(int a: sortedMap.keySet()){
            result.add(a);
        }
        return result;
    }
}
