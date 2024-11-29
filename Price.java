public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);

    // Versão genérica e concreta do método getFrequentRenterPoints
    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Para a maioria dos filmes, o valor padrão é 1 ponto
    }
}
