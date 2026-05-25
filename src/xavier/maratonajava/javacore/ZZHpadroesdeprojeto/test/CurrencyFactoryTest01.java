package xavier.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import xavier.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Country;
import xavier.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Currency;
import xavier.maratonajava.javacore.ZZHpadroesdeprojeto.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.printf(currency.getSymbol());
    }
}
