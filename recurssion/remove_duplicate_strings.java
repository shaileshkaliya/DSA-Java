public class remove_duplicate_strings {

    public static void RemoveDuplicates(String str,StringBuilder newStr,int i,boolean map[]) 
    {   
        //base case
        if(i == str.length()) {
            System.out.println(newStr);
            return ;
        }
        
        //current characyer is repeated
        char ch = str.charAt(i);
        if(map[ch-'a'] == true) {
            RemoveDuplicates(str, newStr, i+1,map);
        }

        //current character is not repeated so append it in newstring
        else {
            map[ch-'a']= true;
            RemoveDuplicates(str, newStr.append(ch), i+1,map);
        }

    }
    public static void main(String[] args) {
        String str = "apnacollege";
        RemoveDuplicates(str, new StringBuilder(""), 0,new boolean[26]);
    }
}
