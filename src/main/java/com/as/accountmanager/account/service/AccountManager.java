package com.as.accountmanager.account.service;

import com.as.accountmanager.account.dao.vo.AccountVO;
import com.as.accountmanager.account.logic.AccountLogic;

import com.as.accountmanager.common.Response;
import com.as.accountmanager.common.ResponseVO;
import com.as.accountmanager.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/***
 * AccountManager
 * @date 20230417
 * @author as
 * @version 1
 */
@RestController
@RequestMapping("/account")
public class AccountManager {
    @Autowired
    private AccountLogic accountLogic;

    @RequestMapping(method=RequestMethod.POST, value="/addUser")
    public ResponseVO addUser(@RequestBody AccountVO accountVO) {
        Log.info(this.getClass(), "add user, " + accountVO.toString());
        try {
            accountLogic.insert(accountVO);
            return Response.Ok();
        } catch (Exception e) {
            Log.warn(this.getClass(), "failed to add user");
            Log.error(this.getClass(), e.toString());
            return Response.Error();
        }
    }
}