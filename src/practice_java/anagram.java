package practice_java;

public class anagram {
    public static void main(String[] args) {
      String word="funeral";
      String word2="real fun";
      word2=word2.replaceAll(" ","");
      if(word.length()==word2.length()){
          for(int i =0;i <word.length();i++){
              if(word.contains(word2.substring(i,i+1))){
                  word=word.replaceFirst(word2.substring(i,i+1)," ");
              }
          }
      }
        System.out.println(word.isBlank()?"anagram":"not anagram");
    }
}
