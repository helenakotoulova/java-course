import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.CheckingService;
import service.CreditService;

public class Main {

    public static void main(String[] args) {
        // nechceme primo updatovat to account repository, ty CRUD operations se maji delat pres interface, coz je v tomto pripade
        // ten checkingService a creditService.
        AccountRepository accountRepository = new AccountRepository();
        CheckingService checkingService = new CheckingService(accountRepository);
        CreditService creditService = new CreditService(accountRepository);
        
        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
            new Checking("A1234B", new BigDecimal("500.00")),
            new Checking("E3456F", new BigDecimal("300.50")),
            new Checking("I5678J", new BigDecimal("100.25")),
            new Credit("A1534B", new BigDecimal("0.50")),
            new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> {
            if (account instanceof Credit) {
                creditService.createAccount((Credit)account);
            } else {
                checkingService.createAccount((Checking)account);
            }
        });

        Checking checking = (Checking) accountRepository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        accountRepository.updateAccount(checking);
    }


}