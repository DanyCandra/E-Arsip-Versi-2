package com.bpd.arsip.model;

import com.bpd.arsip.dao.UserDao;
import com.bpd.arsip.database.DatabaseConnection;
import com.bpd.arsip.entitas.User;
import com.bpd.arsip.exception.ArsipException;
import com.bpd.arsip.helper.render.TableHakAksesRender;
import com.bpd.arsip.helper.render.TableRenderDefault;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dany Candra
 */
public class UserModel {

    @TableColumn(name = "ID USER", number = 1, size = 30, renderer = TableRenderDefault.class)
    private String idUser;
    @TableColumn(name = "USERNAME", number = 2, size = 50, renderer = TableRenderDefault.class)
    private String userName;

    private String password;
    @TableColumn(name = "NAMA", number = 3, size = 40, renderer = TableRenderDefault.class)
    private String nama;
    @TableColumn(name = "HAL AKSES", number = 4, size = 65, renderer = TableHakAksesRender.class)
    private int previllage;

    public UserModel() {
    }

    public UserModel(String idUser, String userName, String password, String nama, int previllage) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.nama = nama;
        this.previllage = previllage;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPrevillage() {
        return previllage;
    }

    public void setPrevillage(int previllage) {
        this.previllage = previllage;
    }
    
    

    public List<UserModel> getAllUserModel() throws ArsipException {
        List<UserModel> list = new ArrayList<>();

        UserDao dao = DatabaseConnection.getUserDao();
        List<User> listTmp = dao.getAllUser();
        listTmp.stream().map((user) -> {
            UserModel model = new UserModel();
            model.setIdUser(user.getIdUser());
            model.setNama(user.getNama());
            model.setPassword(user.getPassword());
            model.setUserName(user.getUserName());
            model.setPrevillage(user.getPrevillage());
            return model;
        }).forEachOrdered((model) -> {
            list.add(model);
        });
        return list;
    }

    public void insert() throws ArsipException {
        User user = new User();
        user.setIdUser(idUser);
        user.setNama(nama);
        user.setPassword(password);
        user.setUserName(userName);
        user.setPrevillage(previllage);

        UserDao dao = DatabaseConnection.getUserDao();
        dao.insertUser(user);
    }

    public void update() throws ArsipException {
        User user = new User();
        user.setIdUser(idUser);
        user.setNama(nama);
        user.setPassword(password);
        user.setUserName(userName);
        user.setPrevillage(previllage);

        UserDao dao = DatabaseConnection.getUserDao();
        dao.updateUser(user);
    }

    public boolean isCanDelete() throws ArsipException {
        UserDao dao = DatabaseConnection.getUserDao();
        boolean result = dao.isCanDelete(idUser);
        return result;
    }

    public boolean isCanInsert() throws ArsipException {
        UserDao dao = DatabaseConnection.getUserDao();
        boolean result = dao.isCanInsert(userName);
        return result;
    }

    public void delete() throws ArsipException {
        UserDao dao = DatabaseConnection.getUserDao();
        dao.delete(idUser);
    }

    public User getUserFromModel(UserModel model) {
        User user = new User();
        user.setIdUser(model.getIdUser());
        user.setNama(model.getNama());
        user.setPassword(model.getPassword());
        user.setUserName(model.getUserName());
        user.setPrevillage(model.getPrevillage());
        return user;
    }

    public boolean getUserLogin(String userName, String password) {
        boolean result = false;
        UserDao dao = DatabaseConnection.getUserDao();
        User user;
        try {
            user = dao.getUser(userName, password);
            if (user != null) {
                result = true;
                setIdUser(user.getIdUser());
                setNama(user.getNama());
                setPassword(user.getPassword());
                setUserName(user.getUserName());
                setPrevillage(user.getPrevillage());
            } else {
                result = false;
            }
        } catch (ArsipException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public boolean getUserLoginByProperties(String userName, String password) throws ArsipException {
        boolean result = false;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("conf/user.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);
            if (properties != null) {
                if (userName.equals(properties.getProperty("username")) && password.equals(properties.getProperty("password"))) {
                    setIdUser(properties.getProperty("idUser"));
                    setNama(properties.getProperty("nama"));
                    setPassword(properties.getProperty("password"));
                    setUserName(properties.getProperty("username"));
                    result = true;
                } else {
                    result = false;
                }
            }
            fileInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null, ex);
            throw new ArsipException(ex.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(QuotaModel.class.getName()).log(Level.SEVERE, null, ex);
                throw new ArsipException(ex.getMessage());
            }
        }
        return result;
    }

    public List<UserModel> getAllUserModelByName(String namaPemilik) throws ArsipException {
        List<UserModel> list = new ArrayList<>();

        UserDao dao = DatabaseConnection.getUserDao();
        List<User> listTmp = dao.getAllUserByNama(namaPemilik);
        listTmp.stream().map((user) -> {
            UserModel model = new UserModel();
            model.setIdUser(user.getIdUser());
            model.setNama(user.getNama());
            model.setPassword(user.getPassword());
            model.setUserName(user.getUserName());
            model.setPrevillage(user.getPrevillage());
            return model;
        }).forEachOrdered((model) -> {
            list.add(model);
        });
        return list;
    }

    public UserModel getUserModelByIdUser(String idUser) throws ArsipException {
        UserDao dao = DatabaseConnection.getUserDao();
        User user = dao.getUser(idUser);
        UserModel model = new UserModel();
        if (user != null) {
            model.setIdUser(user.getIdUser());
            model.setNama(user.getNama());
            model.setPassword(user.getPassword());
            model.setUserName(user.getUserName());
            model.setPrevillage(user.getPrevillage());
        }

        return model;
    }

    public void updateUserAdmin() throws ArsipException {
        try {
            FileOutputStream outputStream = new FileOutputStream("conf/user.properties");
            Properties properties = new Properties();
            properties.setProperty("username", userName);
            properties.setProperty("password", password);
            properties.setProperty("nama", nama);
            properties.setProperty("idUser", idUser);
            properties.store(outputStream, "");
        } catch (IOException ex) {
            Logger.getLogger(QuotaModel.class.getName()).log(Level.SEVERE, null, ex);
            throw new ArsipException(ex.getMessage());
        }
    }
}
