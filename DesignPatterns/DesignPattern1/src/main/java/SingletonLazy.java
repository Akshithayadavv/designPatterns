public class SingletonLazy{

    public static void main(String[] args){
        single1 obj= single1.getInstance();
        //single obj1= single.getInstance();

    }
}

class single1 {

    static single1 obj ;

    private single1() {
        System.out.println("Instance created");
    }

    public static single1 getInstance(){

        if(obj==null){
        obj=new single1();}
        //System.out.println("In singleton class");
        return obj;
    }
}