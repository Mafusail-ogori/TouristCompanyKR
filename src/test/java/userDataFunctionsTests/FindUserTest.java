package userDataFunctionsTests;

import data.UserData;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;
import user.User;

import static org.junit.Assert.assertEquals;

public class FindUserTest {
    @Mock
    UserData userData = new UserData();

    @Mock
    User user = new User("mafusaillo", "dan", "haha", "dpo.prots@gmail.com");


    @Test
    @DisplayName("Should find user properly")
    public void finUserTest(){
        userData.getUserData().add(user);
        assertEquals(user, userData.findUser("mafusaillo" , "haha"));
        assertEquals(user, userData.findUser("dpo.prots@gmail.com", "haha"));
    }
}
