package day34_b_encapsulation;

public class Bank {
    public static void main(String[] args) {
        DebitCard card1 = new DebitCard(1234_4321L, "Tom Jerry", 10_000.00);

        DebitCard card2 = new DebitCard(123344_4321L, "Tom James", 10_000.00);
        // card1.cardNumber = 32423503495L;

        DebitCard card3 = new DebitCard(1111222233334444L, "Winnie Puah", "Visa", 1234, 20_000.00);

        DebitCard card4 = new DebitCard(1111222233334444L, "james bond", "Visa", 1234, 20_000.00);

        System.out.println("---------------------------------");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
    }
}
