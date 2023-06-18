package standardprocedureofjava.chapter05.array;

public class ArrayEx16 {
    public static void main(String[] args) {
        // c:jdk1.8\work\ch5>java ArrayEx16 abc 123 "Hello world"
        if(args!=null){
            System.out.println("매개변수의 개수: " + args.length);
            for(int i=0; i<args.length; i++){
                System.out.println("args[" + i + "] = \"" + args[i] + "\"");
            }
        }
    }
}
