public class Finally_block{
        public static void main(String[] args){
        System.out.println(fun());
    }
        static int fun(){
        int[] a=new int[2];
        try{
            return 3;
        }
        finally{
            System.out.println("Finally");
        }
        }
}