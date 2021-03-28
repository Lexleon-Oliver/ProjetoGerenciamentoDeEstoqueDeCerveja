package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInsuficientException extends Exception {

    public BeerStockInsuficientException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to Decrement informed exceeds the quantity in stock : %s", id, quantityToDecrement));
    }


}
