package standardprocedureofjava.chapter05.array;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"jo", "sun", "mi"};

        for(int i=0; i<names.length; i++){
            System.out.println("names["+i+"]: "+names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp: "+tmp);
        names[0] = "JO";

        for(String str : names){
            System.out.print(str);
        }
    }
}
