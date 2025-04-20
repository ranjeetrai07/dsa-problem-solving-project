package pepcoding.level1.array.simpleArray;

public class Sample {

    public static void main(String[] args) {
        boolean cds = false;
        boolean emergingMarket = cds ? false : myFlag() ;
        System.out.println(emergingMarket);

        if(!cds && !emergingMarket){
            System.out.println("Hi1");
        }
    }

    public static boolean myFlag(){
        System.out.println("Hi2");
        return true;
    }


}
