package controller;

import java.sql.SQLException;
import java.util.List;
import model.Kontak;
import model.KontakDAO;

public class KontakController {
    private final KontakDAO contactDAO;

    public KontakController() {
        contactDAO = new KontakDAO();
    }

    public List<Kontak> getAllContacts() throws SQLException {
        return contactDAO.getAllContacts();
    }

    public void addContact(String nama, String nomorTelepon, String kategori) throws SQLException {
        Kontak c = new Kontak(0, nama, nomorTelepon, kategori);
        contactDAO.addContact(c);
    }

    public void updateContact(int id, String nama, String nomorTelepon, String kategori) throws SQLException {
        Kontak c = new Kontak(id, nama, nomorTelepon, kategori);
        contactDAO.updateContact(c);
    }

    public void deleteContact(int id) throws SQLException {
        contactDAO.deleteContact(id);
    }

    public List<Kontak> searchContacts(String keyword) throws SQLException {
        return contactDAO.searchContacts(keyword);
    }

    public boolean isDuplicatePhoneNumber(String nomorTelepon, Integer excludeId) throws SQLException {
        return contactDAO.isDuplicatePhoneNumber(nomorTelepon, excludeId);
    }
}
