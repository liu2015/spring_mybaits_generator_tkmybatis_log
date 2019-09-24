package com.example.demo.util.shiro;

import com.example.demo.entity.RoleT;
import com.example.demo.entity.UserT;
import com.example.demo.userservice.useruservice;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class EnceladusShiroRealm extends AuthorizingRealm {
    @Autowired
    private useruservice useruservice;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        String username= (String) principalCollection.getPrimaryPrincipal();


        UserT userT= useruservice.byname(username);
        for (RoleT roleT:userT.getRoles())
        {
            authorizationInfo.addRole(roleT.getRole());

        }


        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
