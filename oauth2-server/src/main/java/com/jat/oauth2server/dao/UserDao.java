package com.jat.oauth2server.dao;

import com.jat.oauth2server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jatchen
 * @description: TODO
 * @date 2020/8/2211:31 AM
 */
public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
