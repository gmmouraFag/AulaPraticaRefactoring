public abstract class Statement {

    // Método Template
    public String value(Customer aCustomer) {
        String result = header(aCustomer);
        result += body(aCustomer);
        result += footer(aCustomer);
        return result;
    }

    // Métodos comuns para cabeçalho e rodapé
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String footer(Customer aCustomer) {
        String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    // Métodos abstratos para o corpo do relatório
    protected abstract String body(Customer aCustomer);
}
