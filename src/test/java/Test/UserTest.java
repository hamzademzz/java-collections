package Test;


import com.hamza.school.domain.User;
import com.hamza.school.modules.UserModule;
import com.hamza.school.repositories.users.UserFileRepository;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class UserTest {

    String fileName=null;
    UserFileRepository userFileRepository=null;

    @Before
    public void setup(){
        String id= java.util.UUID.randomUUID().toString();
        fileName="UserTest-shouldAdd-"+id+".txt";
        userFileRepository = new UserFileRepository(fileName);
    }

    public void tearDown(){
        File file=new File(fileName);
        if(file.exists()){
            file.delete();
        }
        fileName=null;
        userFileRepository=null;
    }

    @Test
    public void changePassword(){
        User user1 = new User("FirstName1" , "LastName1" , "UserName1" , "Password1");
        userFileRepository.add(user1);
        userFileRepository.changePassword("UserName1" ,"Password1" , "newPassword" ,"newPassword");

        String expected = "newPassword";

        assertEquals(expected, user1.getPassword());
    }


    @Test
    public void authenticate(){
        User user1 = new User("FirstName1" , "LastName1" , "UserName1" , "Password1");
        User user4 = new User("FirstName4" , "LastName4" , "UserName4" , "Password4");
        userFileRepository.add(user4);
        userFileRepository.add(user1);


        Boolean expected = true;
        Boolean actual = userFileRepository.authenticate("UserName1" , "Password1");

        assertEquals(expected,actual);

    }


    @Test
    public void addShouldAdd() throws IOException {
        User user=new User();
        user.setUserName("usrnm");
        user.setFirstName("frstnm");
        user.setLastName("lstnm");
        user.setPassword("pwd");
        // TODO: assign user's details
        userFileRepository.add(user);

        // validate and assert
        User actual=userFileRepository.get(user.getUserName());


        user.setUserName("usrnm");
        user.setFirstName("frstnm");
        user.setLastName("lstnm");
        user.setPassword("pwd");
        userFileRepository.add(user);

        int expected = 2;

        assertEquals(expected, userFileRepository.users.size());
        assertEquals(user.getUserName(),actual.getUserName());

    }


    @Test
    public void getShouldGet(){
        User user = new User();
        user.setUserName("username");
        user.setFirstName("firstname");
        user.setLastName("lastname");
        user.setPassword("password");

        userFileRepository.add(user);

        User actual = userFileRepository.get(user.getUserName());
        assertEquals(user.getUserName(),actual.getUserName());
    }

    @Test
    public void deleteShouldDelete(){
        User user1 = new User("FirstName1" , "LastName1" , "UserName1" , "Password1");
        User user2 = new User("FirstName2" , "LastName2" , "UserName2" , "Password2");
        userFileRepository.add(user1);
        userFileRepository.add(user2);

        userFileRepository.delete("UserName2");

        int expectedSize = 1;
        assertEquals(expectedSize,userFileRepository.users.size());

    }



    @Test
    public void getAllShouldGetAll(){
        User user1 = new User("FirstName1" , "LastName1" , "UserName1" , "Password1");
        User user2 = new User("FirstName2" , "LastName2" , "UserName2" , "Password2");
        User user3 = new User("FirstName3" , "LastName3" , "UserName3" , "Password3");
        User user4 = new User("FirstName4" , "LastName4" , "UserName4" , "Password4");
        userFileRepository.add(user1);
        userFileRepository.add(user2);
        userFileRepository.add(user3);
        userFileRepository.add(user4);

        int expectedSize = 4;
        assertEquals(expectedSize,userFileRepository.users.size());


        //how would i actually see if getAll actually gets all?

    }


    @Test
    public void updateShouldUpdate(){
        //update has input entries
    }

    @Test
    public void readUsers(){

    }





}
