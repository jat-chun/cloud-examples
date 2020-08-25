package com.jat.oauth2server.service;

import com.jat.oauth2server.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author jatchen
 * @description: TODO
 * @date 2020/8/2211:34 AM
 */
@Service
public class UserServiceDetail implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao.findByUsername(s);
    }
}
