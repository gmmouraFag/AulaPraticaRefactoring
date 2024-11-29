import java.util.Enumeration;

public class TextStatement extends Statement {

    @Override
    protected String body(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        return result;
    }
}
