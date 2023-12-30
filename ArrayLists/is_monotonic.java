import java.util.ArrayList;


public class is_monotonic {
    public static boolean isMonotonic(ArrayList<Integer> list) {

        int min = Integer.MAX_VALUE ;
        for(int i=0 ; i<list.size() ; i++){
            min = Math.min(min,list.get(i)) ;
        }

        if(min == list.get(0)){
            for(int i=0 ; i<list.size()-1 ; i++){
                if(list.get(i) > list.get(i+1)){
                    return false ;
                }
            }
        }
        else {
            for(int i=0 ; i<list.size()-1 ; i++){
                if(list.get(i) < list.get(i+1)){
                    return false ;
                }
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>() ;
        ArrayList<Integer> list3 = new ArrayList<>() ;

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(4);

        list3.add(1);
        list3.add(3);
        list3.add(2);

        System.out.println("List1 is montonic : "+isMonotonic(list1));
        System.out.println("List2 is monotonic : "+isMonotonic(list2));
        System.out.println("List3 is monotonic : "+isMonotonic(list3));

    }
}
