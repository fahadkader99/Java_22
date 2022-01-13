package practice_session.Array.Single_Dimension;

public class EnhancedForLoopWithChar {

    public static void main(String[] args) {

        String[] names = {"Ashikul", "Kader", "Ahsan", "Alif", "Naim"};


        for (String name  : names){
            if (name.startsWith("A")) System.out.println(name);
        }

        for (String x : names){
            if (x.contains("s")) System.out.println(x);
        }


        EnhancedForLoopWithChar c3 = new EnhancedForLoopWithChar();
        c3.findChar();

    }
    void findChar(){
        char [] c = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (char x : c){
            System.out.println(x);
        }

        for (char x : c){
            if (x == 'a' || x =='c'){
                System.out.println(x);
            }
        }
    }
}
