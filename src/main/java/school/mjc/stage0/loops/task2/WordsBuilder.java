package school.mjc.stage0.loops.task2;
public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase = "";
        int i = 0;
        while (i < chars.length) {
            phrase += chars[i];
            i++;
        }
        System.out.print(phrase);
    }
}


//public class WordsBuilder {
//    public static void main(String[] args) {
//        char[] chars = new char[]{'l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l'};
//        String phrase = "";
//        int i = 0;
//        while (i < chars.length) {
//            phrase += chars[i];
//            i++;
//        }
//        System.out.println(phrase);
//    }
//}