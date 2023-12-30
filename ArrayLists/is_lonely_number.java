import java.util.ArrayList;
import java.util.Collections;

public class is_lonely_number {

    public static ArrayList<Integer> isLonelyNumber(ArrayList<Integer> list)
    {
        Collections.sort(list); 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1 ; i<list.size()-1 ; i++){
            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1) ){
                ans.add(list.get(i));
            }
        }

        if(list.size() == 1){
            ans.add(list.get(0)) ;
        }

        if(list.size() > 1){
            if(list.get(0)+1 <list.get(1) ){
                ans.add(list.get(0));
            }
            if(list.get(list.size()-2)+1 < list.get(list.size()-1) ){
                ans.add(list.get(list.size()-1)) ;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>() ;

        list1.add(10);
        list1.add(6);
        list1.add(5);
        list1.add(8);

        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(3);
        
        System.out.println("Lonely numbers in list 1 are : "+isLonelyNumber(list1));
        System.out.println("Lonely numbers in list 2 are : "+isLonelyNumber(list2));
    }
}
