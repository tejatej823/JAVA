public class WrapperMethods{
    public static void main(String[] args){
        int num=10;
        Integer wrappedNum=num;
        System.out.println("Wrapped Integer : "+wrappedNum);

        Integer anotherNum =29;
        int primitiveNum=anotherNum;
        System.out.println("Primitive int : "+primitiveNum);
        System.out.println("Type : "+anotherNum.getClass());
    }
}