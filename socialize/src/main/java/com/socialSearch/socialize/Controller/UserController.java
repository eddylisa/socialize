package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.User;
import com.socialSearch.socialize.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("register")
    public String userAccountCreation(@RequestBody User user) {
        userService.createUserAccount(user);
        return user.getLastName()+" "+user.getFirstName()+" is registered successfully ";
    }

    @GetMapping("view")
public List<User> viewNearByUsers(){
        return userService.viewUsers();
}

    @GetMapping("view/{id}")
    public User findOneUser(@PathVariable Long id){
        return userService.findUserById(id);
    }
    @DeleteMapping ("delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User is deleted successfully";
    }
    @PutMapping("update/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody User user){
        userService.updateUser(id, user);
        return "User "+user.getFirstName()+"is updated successfully";
    }
    @GetMapping("view/name/{name}")
            public User findUserByName(@PathVariable("name") String name){
        return userService.findUserByName(name);
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

















