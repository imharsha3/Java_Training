package com.java.pratice.java8_examples;

import java.util.Optional;

public class UserProfileService {

    public UserProfile getUserProfile(String userId){
        if("11111".equals(userId)){
            return new UserProfile("11111", "Java");
        }
        else{
            return null;
        }
    }

    public Optional<UserProfile> getUserProfile_Optional(String userId){
        return Optional.ofNullable(findUser(userId));
    }

    private UserProfile findUser(String userId){
        if("11111".equals(userId)){
            return new UserProfile("11111", "Java");
        }
        else{
            return null;
        }
    }
}
