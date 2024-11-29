public class Movie {
    public static final int REGULAR = 0;
    public static final int CHILDRENS = 1;
    public static final int NEW_RELEASE = 2;

    private Price _price;
    private String _title;

    public Movie(String name, int priceCode) {
        _title = name;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                _price = new RegularPrice();
                break;
            case Movie.CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    // Método getFrequentRenterPoints que depende do tipo de filme e dos dias alugados
    public int getFrequentRenterPoints(int daysRented) {
        int points = 1;  // pontos padrão

        // Se for um lançamento novo e alugado por mais de um dia, dá um bônus de pontos
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            points++;
        }

        return points;
    }
}
