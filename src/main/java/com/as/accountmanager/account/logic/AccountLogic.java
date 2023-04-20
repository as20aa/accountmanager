package com.as.accountmanager.account.logic;

import com.as.accountmanager.account.dao.AccountDAO;
import com.as.accountmanager.account.dao.vo.AccountVO;
import com.as.accountmanager.util.Constants;
import com.as.accountmanager.util.IDGenerator;
import com.as.accountmanager.util.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/***
 * AccountLogic
 * @date 20230416
 * @author as
 * @version 1
 */
@Component
public class AccountLogic {
    @Autowired
    private AccountDAO accountDAO;
    @Autowired
    private IDGenerator idGenerator;

    public void insert(AccountVO newOne) {
        accountDAO.insert(newOne);
    }

    @Transactional
    public void deleteById(String id) {
        accountDAO.deleteById(id);
    }

    public List<AccountVO> search(AccountVO accountVO) {
        return accountDAO.search(accountVO);
    }

    public boolean checkUser(AccountVO accountVO) {
        AccountVO condition = new AccountVO();
        condition.setName(accountVO.getName());
        condition.setPhone(accountVO.getPhone());
        List<AccountVO> accountVOList = accountDAO.search(condition);
        if (accountVOList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * addUser
     * @param accountVO
     * @description generate a user id and add user in database
     */
    @Transactional
    public void addUser(AccountVO accountVO) throws Exception {
        String Id = idGenerator.getID();
        Log.info(this.getClass(), "user id: " + Id);
        accountVO.setId(Id);
        accountDAO.insert(accountVO);
    }

    @Transactional
    public void modifyById(AccountVO accountVO) throws Exception {
        accountDAO.modifyById(accountVO);
    }

    public void resetPassword(String id) throws Exception {
        AccountVO accountVO = new AccountVO();
        accountVO.setId(id);
        boolean flag = checkUser(accountVO);
        if (flag) {
            accountVO.setPassword(Constants.DEFAULT_PWD);
            accountDAO.modifyById(accountVO);
        } else {
            throw new Exception("user is not exists!");
        }
    }
}