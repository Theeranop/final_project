package com.example.bmi.db;

import com.example.bmi.model.User;

    public interface UserManagerHelper {
        public static final String DATABASE_NAME = "ahoy_login";
        public static final int DATABASE_VERSION = 1;
        public long registerUser(User user);
        public User checkUserLogin(User user);
        public int changePassword(User user);

    }
