
public class abstractTest extends abstractDem{


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        abstractTest obj=new abstractTest();
        abstractDem o=new abstractDem() {

            @Override
            void display() {
                // TODO Auto-generated method stub

            }
        };
        obj.display();

    }

    @Override
    void display() {
        // TODO Auto-generated method stub
        System.out.println("Hello");
    }

}
