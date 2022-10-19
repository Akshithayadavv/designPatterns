public class SingletonDoubleCheckLocking{

    public static void main(String[] args){

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                single3 obj= single3.getInstance();
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                single3 obj= single3.getInstance();
            }
        });

        t1.start();

        t2.start();
    }
}

class single3 {

    public static single3 obj ;

    private single3() {
        System.out.println("Instance created");
    }

    public static single3 getInstance(){

        if(obj==null){

            synchronized (single3.class)
            {if (obj==null)
            obj=new single3();
            }}
        //System.out.println("In singleton class");
        return obj;
    }
}