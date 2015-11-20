package ro.ing.ingkey.security;

import java.util.Random;

/**
 * Created by Radooo on 11/20/2015.
 */
public class RandomChallengeGenerator {

    private Double amount;
    private int ing_id;
    private String iban;

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + ing_id;
        hash = hash * 31 + iban.hashCode();
        hash = hash * 13 + amount.toString().hashCode();
        int firstPartInt = hash >> 16 << 16;
        int secondPartInt = hash << 16;
        int hashDataInt = firstPartInt ^ secondPartInt;
        Random r = new Random();
        int randomInt = r.nextInt(65536);
        return randomInt | hashDataInt;
    }

    public int generateChallenge(double amount, int ing_id, String iban) {
        this.amount = amount;
        this.ing_id = ing_id;
        this.iban = iban;
        return this.hashCode();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getIng_id() {
        return ing_id;
    }

    public void setIng_id(int ing_id) {
        this.ing_id = ing_id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
