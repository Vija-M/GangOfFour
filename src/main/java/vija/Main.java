package vija;


public class Main {
    public static void main(String[] args) {
        CakeFactory cakeFactory = new CakeFactory();
        //factory instantiates an object
        Cake cake = cakeFactory.getCake("berry");
        System.out.println("The factory returned "+cake.getClass());
        System.out.println(cake.getType());



    }
}
