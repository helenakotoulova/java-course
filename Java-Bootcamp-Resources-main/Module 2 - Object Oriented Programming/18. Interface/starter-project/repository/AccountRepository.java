package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;

public class AccountRepository {

    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone()); // je spatne tu mit jen account a zaroven nemuzeme udelat new Account(),
        // mohli bychom to tu mit rozdelene na if podminky: if (account instanceof Checking) {...} else {...}, 
        // ale to neni moc efektivni. Proto zavedeme v Account classe abstraktni metodu clone()
    }

    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }

}

