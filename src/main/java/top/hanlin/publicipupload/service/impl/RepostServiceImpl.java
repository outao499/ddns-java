package top.hanlin.publicipupload.service.impl;

import org.springframework.stereotype.Service;
import top.hanlin.publicipupload.dao.FileOperationDao;
import top.hanlin.publicipupload.entity.UserInfo;
import top.hanlin.publicipupload.service.RepostService;

import java.util.List;

@Service
public class RepostServiceImpl implements RepostService {

    private final FileOperationDao repostDao;

    public RepostServiceImpl(FileOperationDao repostDao) {
        this.repostDao = repostDao;
    }

    @Override
    public boolean login(String password) {
        String results = repostDao.getPassword();
        if (!(results == null || results.isEmpty())) {
            return password.equals(results);
        }
        return false;
    }

    @Override
    public List<UserInfo> getAllUser() {
        return repostDao.getAllUser();
    }

    @Override
    public void modifyPassword(String modify) {
        repostDao.modifyPassword(modify);
    }

    @Override
    public boolean isInitialPassword() {
        return repostDao.isInitialPassword();
    }

    @Override
    public boolean isDefaultPassword(String password) {
        return repostDao.isDefaultPassword(password);
    }
}
