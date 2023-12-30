import java.util.ArrayList;
import java.util.* ;

import java.util.ArrayList;

public class array_list_intro {
    public static void main(String[] args) {
        
        // Array List Initiallization 
        ArrayList <Integer> list = new ArrayList<>() ;

        // Operations on ArrayLisyt
/*
        1.add(number) = add in list                              TC = O(1) 

        2.add(index,number) = add number on ith index             TC = O(n)                            

        3.get(index) = get ith element                           TC = O(1)

        4.remove(index) = remove element from ith index           TC = O(n)

        5.set(index,number) = set number at ith index             TC = O(n)   

        6.size() = gives s=number of elements in listarray
*/

        list.add(10) ;
        list.add(20);
        list.add(1,30);

        System.out.println("Number at ith index is : "+list.get(2));
        System.out.println("LIST IS : "+list);

        list.remove(1);
        list.set(1,90) ;

        System.out.println(list);
        System.out.println("Size of list is : "+list.size());


        // 2D arraylist initiallization and adding elemnts to it 

        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>() ;

        ArrayList <Integer> list1 = new ArrayList<>() ;

        list1.add(10);
        list1.add(20) ;


        ArrayList<Integer> list2 = new ArrayList<>() ;

        list2.add(30);
        list2.add(40) ;

        mainList.add(list1) ;
        mainList.add(list2);

        for(int i=0 ; i<mainList.size() ; i++) {
            ArrayList<Integer> currList = mainList.get(i) ;
            for(int j=0 ; j<currList.size() ; j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

    }


    
    

}
