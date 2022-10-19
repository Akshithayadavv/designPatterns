public class SingletonSynchronised{

    public static void main(String[] args){

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                single2 obj= single2.getInstance();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                single2 obj= single2.getInstance();
            }
        });

        t1.start();
        t2.start();
    }
}

class single2 {

    public static single2 obj ;

    private single2() {
        System.out.println("Instance created");
    }

    public static synchronized single2 getInstance(){

        if(obj==null){
            obj=new single2();}
        //System.out.println("In singleton class");
        return obj;
    }
}