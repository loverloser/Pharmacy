package com.labanovich.model.dao.interfaces;

import com.labanovich.model.entities.Cure;
import com.labanovich.model.entities.Type;
import com.labanovich.model.exceptions.DAOException;

import java.sql.Timestamp;
import java.util.List;

public interface CureDAO {
    List<Cure> getAll() throws DAOException;
    boolean add(String name, String dose, String deliveryTime, String description, int typeId, double price, String country);
    boolean delete(int id);
    boolean edit(int id, String name, String dose, String deliveryTime, String description, int typeId, double price, String country);
    List<Cure> getAdminUser(int id, Timestamp orderTime);
    List<Type> getAllTypes();
}
