package com.socialSearch.socialize.Controller;
import com.socialSearch.socialize.Model.BlockUser;
import com.socialSearch.socialize.Model.User;
import com.socialSearch.socialize.Services.BlockUserService;
import com.socialSearch.socialize.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class BlockUserController {
    @Autowired
    private BlockUserService blockUserService;
    @PostMapping("/blockedUser")
    public String blockUserAccount(@RequestBody BlockUser blockUser) {
        blockUserService.createBlockUserAccount(blockUser);
        return " User blocked successfully ";
    }
}

