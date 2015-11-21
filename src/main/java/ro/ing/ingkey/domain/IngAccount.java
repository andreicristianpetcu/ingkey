package ro.ing.ingkey.domain;

import javax.persistence.*;

/**
 * Created by HackathonING on 11/20/2015.
 */
@Entity
@Table(name="account")
public class IngAccount {

    @Id
    @Column
    private Long id;

    @Column(name ="account_id")
    private String accountId;

    @Column
    private String iban;

    @Column
    private double balance;

    @Column
    private String currency;

    @Column (name = "ing_id")
    private long ingId;

    public IngAccount() {
    }

    public IngAccount(String accountId, String iban, double balance, String currency, long ingId) {
        this.accountId = accountId;
        this.iban = iban;
        this.balance = balance;
        this.currency = currency;
        this.ingId = ingId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getIngId() {
        return ingId;
    }

    public void setIngId(long ingId) {
        this.ingId = ingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngAccount that = (IngAccount) o;

        if (Double.compare(that.balance, balance) != 0) return false;
        if (ingId != that.ingId) return false;
        if (!iban.equals(that.iban)) return false;
        return currency.equals(that.currency);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = iban.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + currency.hashCode();
        result = 31 * result + (int) (ingId ^ (ingId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "IngAccount{" +
            "accountId='" + accountId + '\'' +
            ", iban='" + iban + '\'' +
            ", balance=" + balance +
            ", currency='" + currency + '\'' +
            ", ingId=" + ingId +
            '}';
    }
}
