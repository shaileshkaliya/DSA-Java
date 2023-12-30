
public class merge_sort_strings {

    public static String[] Merge(String str1[],String str2[])
    {
        int m = str1.length;
        int n = str2.length;

        String str3[] = new String[m+n];
        int i=0;
        int j=0;
        int k=0;

        while(i < m && j < n)
        {
            if(str1[i].compareTo(str2[j]) < 0) {
                str3[k] = str1[i] ;
                i++;
                k++;
            }
            else {
                str3[k] = str2[j] ;
                j++;
                k++;
            }
        }

        while(i < m){
            str3[k] = str1[i];
            k++;
            i++;
        }
        while(j < n){
            str3[k] = str2[j];
            k++;
            j++;
        }

        return str3 ;

    }
    public static String[] MergeSort(String str[],int si,int ei)
    {
        if(si >= ei){
            String temp[] = {str[si]};
            return temp;
        }

            int mid = si+(ei-si)/2;
            String str1[] = MergeSort(str, si, mid);
            String str2[] = MergeSort(str, mid+1, ei);
            String str3[] = Merge(str1,str2);
            return str3;
        

    }
    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","mercury"};
        // MergeSort(str, 0, str.length-1);
        
        String str2[] = {"abc","fgd"};
    
        String str3[] = Merge(str, str2);
        for(int i=0 ; i<str3.length-1 ; i++) {
            System.out.print(str3[i]+" ");
        }
    }

}
