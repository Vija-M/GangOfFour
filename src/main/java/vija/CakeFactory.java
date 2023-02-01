package vija;

public class CakeFactory {
    public Cake getCake(String order) {

        switch (order) {
            case "chocolate":
                return new ChocolateCake();
            case "caramel":
                return new CaramelCake();
            case "berry":
                return new BerryCake();
            default:
                return null;
        }

    }
}

