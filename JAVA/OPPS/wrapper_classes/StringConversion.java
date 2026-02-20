public class StringConversion{
    public static void main(String[] args){
        String str="213";
        int number=Integer.parseInt(str);
        Integer wrapped=Integer.valueOf(str);
        System.out.println(number+10);
        System.out.println(wrapped+10);
    }
}