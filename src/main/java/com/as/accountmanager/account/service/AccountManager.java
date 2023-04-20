package com.as.accountmanager.account.service;

import com.as.accountmanager.account.dao.vo.AccountVO;
import com.as.accountmanager.account.logic.AccountLogic;

import com.as.accountmanager.common.Response;
import com.as.accountmanager.common.ResponseVO;
import com.as.accountmanager.util.Log;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * @param accountVO
     * @return
     * @description delete a user by id
     */
    @RequestMapping(method=RequestMethod.POST, value="/deleteById")
    public ResponseVO deleteById(@RequestBody AccountVO accountVO) {
        Log.info(this.getClass(), "deleteById, " + accountVO.getId());
        try {
            accountLogic.deleteById(accountVO.getId());
            return Response.Ok();
        } catch(Exception e) {
            Log.warn(this.getClass(), "failed to delete user");
            Log.warn(this.getClass(), e.toString());
            return Response.Fail();
        }
    }

    @RequestMapping(method=RequestMethod.POST, value="/modifyById")
    public ResponseVO modifyById(@RequestBody AccountVO accountVO) {
        Log.info(this.getClass(), accountVO);
        try {
            accountLogic.modifyById(accountVO);
            return Response.Ok();
        } catch (Exception e) {
            Log.warn(this.getClass(), "modify user information failed!");
            Log.warn(this.getClass(), e);
            return Response.Fail();
        }
    }

    @RequestMapping(method=RequestMethod.POST, value="/search")
    public ResponseVO search(@RequestBody AccountVO accountVO) {
        List<AccountVO> accountVOList= accountLogic.search(accountVO);
        return Response.Ok(accountVOList);
    }

    @RequestMapping(method=RequestMethod.POST, value="/resetPassword")
    public ResponseVO resetPassword(@RequestBody AccountVO accountVO) {
        try {
            accountLogic.resetPassword(accountVO.getId());
            return Response.Ok();
        } catch (Exception e){
            Log.warn(this.getClass(), e.toString());
            return Response.Fail();
        }

    }
}