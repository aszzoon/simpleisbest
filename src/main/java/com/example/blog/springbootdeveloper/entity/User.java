//package com.example.blog.springbootdeveloper.entity;
//
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//
//@Table(name = "users")
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Getter
//@Entity
//public class User implements UserDetails {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", updatable = false)
//    private Long id;
//
//    @Column(name = "email", nullable = false, unique = true)
//    private String email;
//
//    @Column(name = "password", nullable = false)
//    private String password;
//
//    @Builder
//    public User(String email, String password, String auth) {
//        this.email = email;
//        this.password = password;
//    }
//
//
//    @Override // 권한반환
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override //password반환
//    public String getPassword() {
//        return null;
//    }
//
//    @Override // id반환
//    public String getUsername() {
//        return null;
//    }
//
//    @Override // 계정만료여부반환
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override // 계정잠금여부반환
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override // 패스워드 만료여부
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override // 사용가능 확인 로직
//    public boolean isEnabled() {
//        return false;
//    }
//}
