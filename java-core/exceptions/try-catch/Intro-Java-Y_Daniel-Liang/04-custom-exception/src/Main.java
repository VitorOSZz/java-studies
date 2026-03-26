public class Main {
    public static void main(String[] args) {

        Saiyan vitor = new Saiyan("Vitor", 2007, true);
        vitor.canTransformHumanBuffed = true;

        vitor.transform("Super Saiyan");
        System.out.println("Saiyan into Human Buffed (Exception)");
        vitor.transform("Human Buffed");
        System.out.println("Saiyan into Super Buu (Exception not valid transformation)");
        vitor.transform("Super Buu");
    }
}