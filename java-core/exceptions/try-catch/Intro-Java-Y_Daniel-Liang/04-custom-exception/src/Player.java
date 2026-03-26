class Player {

    private String name;
    private int birthYear;

    public Player(String name, int birthYear) {
        this.name = name;
        this.setBirthYear(birthYear);
        this.canTransformSuperSaiyan = false;
        this.canTransformHumanBuffed = false;
    }

    boolean canTransformHumanBuffed;
    boolean canTransformSuperSaiyan;

    public void setBirthYear(int birthYear) throws IllegalArgumentException {
        if (birthYear <= 0) {
            System.out.println("Invalid birth year");
            throw new IllegalArgumentException("Invalid birth year");
        } else {
            this.birthYear = birthYear;
        }
    }


    public boolean transform(String transformation) {

        try {
            switch (transformation) {
                case "Human Buffed":
                    if (canTransformHumanBuffed && this instanceof Human) {
                        System.out.println("Human Buffed transformed");
                    } else {
                        throw new IllegalTransformation();
                    }
                    break;
                case "Super Saiyan":
                    Saiyan saiyan = new Saiyan("undefined", 100, false);
                    if (canTransformSuperSaiyan && this instanceof Saiyan) {
                        System.out.println("Super Saiyan transformed");
                    } else {
                        throw new IllegalTransformation();
                    }
                    break;
                default:
                    throw new IllegalTransformation("This is not a valid transformation");
            }
        } catch (IllegalTransformation e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }


}
