package com.as.accountmanager.account.service;

import com.as.accountmanager.account.dao.vo.AccountVO;
import com.as.accountmanager.account.logic.AccountLogic;

import com.as.accountmanager.common.Response;
import com.as.accountmanager.common.ResponseVO;
import com.as.accountmanager.util.Log;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * AccountManager
 * @date 20230417
 * @author as
 * @version 1
 * @description account manager, include add, delete, update and search function
 */
@RestController
@RequestMapping("/account")
public class AccountManager {
    @Autowired
    private AccountLogic accountLogic;

    /**
     * addUser
     * @param accountVO
     * @return
     * @descript add a new user
     */
    @RequestMapping(method=RequestMethod.POST, value="/addUser")
    public ResponseVO addUser(@RequestBody AccountVO accountVO) {
        Log.info(this.getClass(), "add user, " + accountVO.toString());
        // check the accountVO, name and phone cannot be empty
        if (StringUtils.isEmpty(accountVO.getName()) && StringUtils.isEmpty(accountVO.getPhone())) {
            return Response.Fail("name or phone cannot be empty");
        }
        // check whether user is exists
        if (!accountLogic.checkUser(accountVO)){
            return Response.Fail("user is already exists");
        }
        try {
            accountLogic.addUser(accountVO);
            return Response.Ok();
        } catch (Exception e) {
            Log.warn(this.getClass(), "failed to add user");
            Log.error(this.getClass(), e.toString());
            return Response.Fail();
        }
    }

    /***
     * deleteById
     * @param id
     * @return
     * @description delete a user by id
     */
    @RequestMapping(method=RequestMethod.POST, value="/deleteById")
    public ResponseVO deleteById(@RequestBody String id) {
        Log.info(this.getClass(), "deleteById, " + id);
        try {
            accountLogic.deleteById(id);
            return Response.Ok();
        } catch(Exception e) {
            Log.warn(this.getClass(), "failed to delete user");
            Log.warn(this.getClass(), e.toString());
            return Response.Fail();
        }
    }
}