package com.socialSearch.socialize.Controller;
import com.socialSearch.socialize.entity.BlockUser;
import com.socialSearch.socialize.services.BlockUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/block_users/")
public class BlockUserController {
    @Autowired
    private BlockUserService blockUserService;
    @PostMapping("register")
    public String blockUserAccount(@RequestBody BlockUser blockUser) {
        blockUserService.createBlockUserAccount(blockUser);
        return " User blocked successfully";
    }
}

