package UnitedHealthCare;

public class TestCustomHm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CustomHM<Integer, Integer> cMap=new CustomHM<Integer,Integer>(5);
        cMap.put(10, 20);
        cMap.put(25, 20);
        cMap.put(22, 11);
        cMap.put(23, 33);
        cMap.put(10, 10);
        cMap.put(25, 25);

        cMap.display();
    }

}
