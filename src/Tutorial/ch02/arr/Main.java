package Tutorial.ch02.arr;

public class Main {
    public static void main(String[] args) {
        char[] alphabats = new char[26];
        char ch = 'A';

        for(int i = 0; i<alphabats.length; i++,ch++){
            alphabats[i] = ch;
        }
    }
}
