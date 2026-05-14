package top.hanlin.publicipupload.dao;

import top.hanlin.publicipupload.entity.UserInfo;

import java.util.List;

public interface FileOperationDao {
    String getPassword();
    List<UserInfo> getAllUser();
    boolean addIdAndKey(String name,String secretId,String secretKey);
    boolean deleteAccount(String provider, String secretId);
    void modifyPassword(String modify);
    boolean isInitialPassword();

    /**
     * 判断指定密码是否等于配置中的默认初始密码
     */
    boolean isDefaultPassword(String password);
}
