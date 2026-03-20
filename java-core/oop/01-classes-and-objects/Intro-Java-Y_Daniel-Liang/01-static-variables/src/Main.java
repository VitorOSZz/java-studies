public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Village leafVillage = new Village("Leaf Village");

        leafVillage.createNinja("Naruto Uzumaki");
        leafVillage.createNinja("Sasuke Uchiha");

        System.out.println("Leaf Village ninjas: " + leafVillage.getNinjaArraylist());
        System.out.println("All Villages: " + Village.getNumberOfNinjasAllVillages());
        System.out.println("Leaf ninja numbers: " + leafVillage.getNumberOfNinjasThisVillage());

        Village sandVillage = new Village("Sand Village");
        sandVillage.createNinja("Gaara");
        System.out.println("Sand Village ninjas: " + sandVillage.getNinjaArraylist());
        System.out.println("All Villages: " + Village.getNumberOfNinjasAllVillages());


        /*
        Ninja naruto = new Ninja("Naruto Uzumaki");
        System.out.println(naruto.name);
        System.out.println(Ninja.getNumberOfNinjasAllVillages());

        Ninja sasuke = new Ninja("Sasuke Uchiha");
        System.out.println(Ninja.getNumberOfNinjasAllVillages());
        System.out.println(Ninja.getNumberOfNinjasAllVillages());
        */
    }
}