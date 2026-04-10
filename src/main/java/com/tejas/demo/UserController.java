package com.tejas.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    @GetMapping
    public List<User> getUsers(){
        if(users.isEmpty()){
            throw new RuntimeException("No Users to show. Add Users first");
        }
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        users.add(user);
        return "User Added Successfully.";
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        throw new UserNotFoundException("User not present with id: "+ id);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User updatedUser){
        for (User user : users){
            if (user.getId() == id){
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return "User Modified Successfully";
            }
        }
        throw new UserNotFoundException("User not found with id: "+id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        for (User user : users){
            if (user.getId() == id){
                users.remove(user);
                return "User Deleted Successfully";
            }
        }
        throw new UserNotFoundException("User not found to delete with id: "+id);
    }
}
