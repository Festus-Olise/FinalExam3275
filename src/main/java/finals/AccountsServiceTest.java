package finals;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountsServiceTest {

    @Test
    void retrieveData() {

        SavingsInterfaceImpl saves = new SavingsInterfaceImpl();
        AccountsService aService = new AccountsService(bb);

        List<String> fl = aService.retrieveData();

        assertEquals(2, fl.size());
    }

}