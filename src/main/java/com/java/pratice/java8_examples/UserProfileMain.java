package com.java.pratice.java8_examples;

import java.util.Optional;

public class UserProfileMain {
    public static void main(String[] args) {
        UserProfileService service = new UserProfileService();
        UserProfile profile1 = service.getUserProfile("11111");
        if(profile1 != null){
            System.out.println("User found: " +profile1.getUserId()+"," +profile1.getName());
        }
        else {
            System.out.println("Profile not found");
        }
        UserProfile profile2 = service.getUserProfile("12345");
        if(profile2 != null){
            System.out.println("User found: " +profile1);
        }
        else {
            System.out.println("Profile not found");
        }

        UserProfileService service2 = new UserProfileService();
        Optional<UserProfile> user = service2.getUserProfile_Optional("123454");
        user.ifPresent(userProfile -> System.out.println(userProfile.getName()));
        UserProfile value = user.orElse(new UserProfile("00000", "User not found"));
        System.out.println(value);

    }

}
