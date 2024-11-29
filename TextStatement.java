import java.util.Enumeration;

public class TextStatement extends Statement {

    @Override
    protected String body(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        StringBuilder result = new StringBuilder();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result.append("\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n");
        }
        return result.toString();
    }
}
