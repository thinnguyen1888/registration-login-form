//package com.example.demo.dao;
//
//import com.example.demo.domain.User;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(false)
//@RequiredArgsConstructor
//public class UserDaoTest {
//
//  private final UserDao userDao;
//  private final TestEntityManager testEntityManager;
//
//  @Test
//  public void testCreateUser() {
//    User user = new User();
//    user.setEmail("thinh@gmail.com");
//    user.setName("thinh");
//    user.setPassword("123");
//
//    User saveUser = userDao.save(user);
//    User existUser = testEntityManager.find(User.class, saveUser.getId());
//
//    assertEquals(existUser.getEmail(), user.getEmail());
//  }
//}
