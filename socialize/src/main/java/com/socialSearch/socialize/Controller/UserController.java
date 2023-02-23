package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.Model.User;
import com.socialSearch.socialize.Services.UserService;
import com.socialSearch.socialize.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("registration")
    public String userAccountCreation(@RequestBody User user) {
        userService.createUserAccount(user);
        return " User is registered successfully ";
    }
@GetMapping("view")
public List<User> viewUsers(){
        return userService.viewUsers();
}
    @PutMapping ("delete_user/{id}")
    public String deleteUser(@PathVariable Long id){
       userService.deleteUser(id) ;
       return "User is deleted successfully";

    }
//    @PutMapping("updateUser")
//    public String updateUser(@RequestBody User user){
//        userService.updateUser(user);
//        return "user is updated successfully";
//    }

//    @PutMapping("/{index}")
//    public List<User> updateUser(@RequestBody User user,@PathVariable int index){
//        User updatedUser= users.get(index);
//        if(user!=null){
//            updatedUser=user;
//            users.set(index,updatedUser);
//        }
//        return users;
//    }
//    @PutMapping("/update")
//    public String updateUser(@RequestBody UserAcc user)throws InterruptedException, ExecutionException {
//        return userService.updateUserAccount(user);

//    }
//    @DeleteMapping("/delete")
//    public String deleteUserAccount(@RequestParam String documentId)throws InterruptedException, ExecutionException {
//        return userService.deleteUser(documentId);
//    }
//    @GetMapping("/test")
//    public ResponseEntity<String> testEndPoint(){
//        return  ResponseEntity.ok(" Your end points are working well");
//    }

}

















