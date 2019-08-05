package Examples;

public class Manager {
public void baketi(){
    System.out.println("Manager baketi");
}



static class ItManager extends Manager {
    public void baketi(){
        System.out.println("It Manager baketi");
    }

}

static class MechManager extends ItManager {
    public void baketi(){
        System.out.println("Mech Manager baketi");
    }

}

static class FaltuManager extends MechManager {
    public void baketi() {
        System.out.println("Faltu Manager baketi");
    }

    public void BhayankarBaketi() {
        System.out.println("Bhayankar Baketi Manager baketi");
    }

}



    public static void main(String[] args) {

        Manager mg1 = new ItManager();
        Manager mg2 = new MechManager();
        Manager mg3 = new FaltuManager();
        mg1.baketi();
        mg3.baketi();
        ((FaltuManager) mg3).BhayankarBaketi();

    }



}