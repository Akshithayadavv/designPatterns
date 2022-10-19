public class Singleton {

    public static void main(String[] args){
        single obj= single.getInstance();
        //single obj1= single.getInstance();

    }
}

class single {

    static single obj = new single();

    private single() {

    }

    public static single getInstance(){

        System.out.println("In singleton class");
        return obj;
    }
}