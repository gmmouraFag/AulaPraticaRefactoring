public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1; // Filmes de lançamento ganham 2 pontos se alugados por mais de 1 dia
    }
}
