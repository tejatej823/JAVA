enum PaymentStatus{
    SUCCESS(200),
    FAILURE(500),
    PENDING(100);
    int code;
    PaymentStatus(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
public class Test_Enum2{
    public static void main(String[] args){
        PaymentStatus payment1=PaymentStatus.SUCCESS;
        System.out.println(payment1.getCode());
        System.out.println(payment1.getClass());
    }
}