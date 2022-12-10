package Searching;

public class Search_in_Strings {
    public static void main(String[] args) {
        String name="Chetan";
        char a ='t';
        System.out.println(search(name, a));
        System.out.println(search2(name,a));
    }
    static boolean search(String s, char targt ){
        if(s.length()==0) return false;

        for(int i=0;i<s.length();i++){
            if(targt == s.charAt(i)) return true;
        }
        return  false;
    }
    static boolean search2(String s, char targt ){
        if(s.length()==0) return false;

        for(char ch : s.toCharArray()){
            if(ch ==targt) return true;
        }
        return  false;
    }
}
