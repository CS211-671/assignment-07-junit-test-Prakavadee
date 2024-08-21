package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password1");
        userList.addUser("user02", "password2");
        userList.addUser("user03", "password3");

        // TODO: find one of them
        User user = userList.findUserByUsername("user02");

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
        assertNotNull(user);
        assertEquals("user02", user.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password1");
        userList.addUser("user02", "password2");
        userList.addUser("user03", "password3");

        // TODO: change password of one user
        boolean changed = userList.changePassword("user02", "password2", "newPassword");

        // TODO: assert that user can change password
        // assertTrue(actual);
        assertTrue(changed);
        assertTrue(userList.login("user02", "newPassword") != null);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password1");
        userList.addUser("user02", "password2");
        userList.addUser("user03", "password3");

        // TODO: call login() with correct username and password
        User user = userList.login("user03", "password3");

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
        assertNotNull(user);
        assertEquals("user03", user.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "password1");
        userList.addUser("user02", "password2");
        userList.addUser("user03", "password3");


        // TODO: call login() with incorrect username or incorrect password
        User user = userList.login("user03", "wrongPassword");

        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(user);
    }

}