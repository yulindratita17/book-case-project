package bookproject.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bookproject.abstracts.CommercialBook;

public class BookCaseAction {
    public static List<CommercialBook> findBookByPrice(String type, List<CommercialBook> getAllBooks) {
        List<CommercialBook> result = new ArrayList<>();
        List<Double> priceTemp = new ArrayList<>();

        for (CommercialBook commercialBook : getAllBooks) {
            priceTemp.add(commercialBook.getPrice());
        }

        double min = Collections.min(priceTemp);
        double max = Collections.max(priceTemp);

        for (CommercialBook commercialBook : getAllBooks) {
            if (type.equalsIgnoreCase("expensive")) {
                if (commercialBook.getPrice() == max) {
                    result.add(commercialBook);
                }
            } else if (type.equalsIgnoreCase("cheap")) {
                if (commercialBook.getPrice() == min) {
                    result.add(commercialBook);
                }
            }

        }

        return result;
    }

}
