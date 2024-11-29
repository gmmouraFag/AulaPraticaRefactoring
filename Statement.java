public abstract class Statement {

    // Método Template
    public String statement(Customer aCustomer) {
        String result = header(aCustomer);
        result += body(aCustomer);
        result += footer(aCustomer);
        return result;
    }

    public String htmlStatement(Customer aCustomer) {
        String result = htmlHeader(aCustomer);
        result += htmlBody(aCustomer);
        result += htmlFooter(aCustomer);
        return result;
    }

    // Métodos para geração de cabeçalhos e rodapés, que são comuns
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String footer(Customer aCustomer) {
        String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    protected String htmlHeader(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    protected String htmlFooter(Customer aCustomer) {
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
               "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               "</EM> frequent renter points<P>";
    }

    // Métodos abstratos para o corpo do relatório
    protected abstract String body(Customer aCustomer);
    protected abstract String htmlBody(Customer aCustomer);
}
