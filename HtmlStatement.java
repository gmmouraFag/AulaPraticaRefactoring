import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String body(Customer aCustomer) {
        // Não será usado em HTML, apenas sobrescrito na classe base como método
        return "";
    }

    @Override
    protected String htmlBody(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }
        return result;
    }
}
