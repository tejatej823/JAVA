class Logger{
    private static final Logger instance=new Logger();
    private Logger(){}
    public static Logger getInstance(){
        return instance;
    }
    public void log(String msg){
        System.out.println("Log "+msg);
    }
}
class Singleton{
    public static void main(String[] args){
        Logger log1=Logger.getInstance();
        Logger log2=Logger.getInstance();
        log1.log("Teja");
        log2.log("Tejesh");
    }
}