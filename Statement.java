public abstract class Statement {

    // Método Template - coordenando a estrutura do relatório
    public String value(Customer aCustomer) {
        String result = header(aCustomer);
        result += body(aCustomer);  // Parte específica
        result += footer(aCustomer);
        return result;
    }

    // Método comum para cabeçalho
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    // Método comum para rodapé
    protected String footer(Customer aCustomer) {
        String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    // Método abstrato para o corpo do relatório (a ser implementado pelas subclasses)
    protected abstract String body(Customer aCustomer);
}
