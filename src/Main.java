public class Main {
    public static void main(String[] args) {

        int ticketPrice = 250; //цена билета
        int perMiles = 20; // количество рублей за 1 милю

        int bonusMiles = ticketPrice / perMiles;

        System.out.println("Начислено: " + bonusMiles + " бонусных миль");
    }
}