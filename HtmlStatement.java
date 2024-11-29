import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String body(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        StringBuilder result = new StringBuilder();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result.append(each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n");
        }
        return result.toString();
    }
}
