package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.*;
import com.system.registeration.intern.mapper.PermissionMapper;
import com.system.registeration.intern.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Resource
    PermissionMapper pMapper;
    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public BaseRespVo register(User user) {
        BaseRespVo result = new BaseRespVo();

        try {
           Integer id = userMapper.findUserByName(user.getUsername());
            if(id != null){
                //如果用户名已存在
                result.setMsg("用户名已存在");

            }else{
//                userMapper.regist(user);
                userMapper.insert(user);
                //System.out.println(user.getId());
                result.setMsg("注册成功");
                result.setErrno(0);
                result.setData(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;


    }

    @Override
    public BaseRespVo login(User user) {
            BaseRespVo result = new BaseRespVo();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());

        List<User> userInTable= userMapper.selectByExample(userExample);
            try {

                if(userInTable.size()==0){
                    result.setMsg("用户名或密码错误");
                }else{
                    result.setMsg("登录成功");
                    result.setErrno(0);

                }
            } catch (Exception e) {
                result.setMsg(e.getMessage());
                e.printStackTrace();
            }
            return result;

        }

    @Override
    public List<String> selectPermissionByUsername(String username) {
      UserExample adminExample = new UserExample();
        adminExample.createCriteria().andUsernameEqualTo(username);
        List<User> admins = userMapper.selectByExample(adminExample);
        Integer[] roleIds = admins.get(0).getGroupid();


        ArrayList<String> peimissionList = new ArrayList<String>();
        for (Integer roleId:roleIds){

            PermissionExample permissionExample = new PermissionExample();
            permissionExample.createCriteria().andRoleIdEqualTo(roleId);
            List<Permission> permissions = pMapper.selectByExample(permissionExample);
            for (Permission permission:permissions){
                peimissionList.add(permission.getPermission());
            }
        }
        return peimissionList;
    }

    @Override
    public Integer selectUserIdByUserName(String userName) {
        Integer id=userMapper.selectUserIbByName(userName);

        return id;
    }


}
