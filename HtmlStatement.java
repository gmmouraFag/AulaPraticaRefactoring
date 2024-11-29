import java.util.Enumeration;

public class HtmlStatement extends Statement {

    @Override
    protected String body(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }
        return result;
    }
}
