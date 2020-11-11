package Service;

import DAO.ConnectionDB;
import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    Connection connection =  ConnectionDB.getConnection();

    private static final String INSERT_PRODUCT_SQL = "INSERT INTO product (nameProduct,price,count,color,descrision,idCategory) VALUES (?,?,?,?,?,?);";
    private static final String SELECT_ALL_PRODUCT = "SELECT *\n" +
            "FROM product\n" +
            "LEFT JOIN category c\n" +
            "ON c.idCategory = product.idCategory;";
    //private static final String SELECT_ALL_PRODUCT = "select * from product";
    private static final String DELETE_PRODUCT_SQL = "DELETE FROM product WHERE idProduct = ?;";
    private static final String SELECT_PRODUCT_BY_ID = "SELECT FROM product WHERE idProduct = ?;";
    private static final String UPDATE_PRODUCT_SQL = "UPDATE product set nameProduct = ?,price = ?,count = ?, color = ?,descrision = ?,idCategory = ? where idProduct = ?;";
    //private static final String SELECT_PRODUCT_SQL_LIKE = "UPDATE product set nameProduct = ?,price = ?,count = ?, color = ?,descrision = ?,idCategory = ? where idProduct = ?;";

    @Override
    public List<Product> displayProduct() {
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("idProduct");
                String nameProduct = resultSet.getString("nameProduct");
                double price = resultSet.getDouble("price");
                int count = resultSet.getInt("count");
                String color = resultSet.getString("color");
                String descrision = resultSet.getString("descrision");
                int idCategory = resultSet.getInt("idCategory");
                list.add(new Product(id,nameProduct,price,count,color,descrision,idCategory));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean addNewProduct(Product product,int idCategory) {
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_PRODUCT_SQL);
            ps.setString(1,product.getNameProduct());
            ps.setDouble(2,product.getPrice());
            ps.setInt(3,product.getCount());
            ps.setString(4,product.getColor());
            ps.setString(5,product.getDescrision());
            ps.setInt(6,product.getIdCategory());
            int check = ps.executeUpdate();
            if (check >0){
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean editProduct(Product product) {
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_PRODUCT_SQL);
            ps.setString(1,product.getNameProduct());
            ps.setDouble(2,product.getPrice());
            ps.setInt(3,product.getCount());
            ps.setString(4,product.getColor());
            ps.setString(5,product.getDescrision());
            ps.setInt(6,product.getIdCategory());
            ps.setInt(7,product.getIdProduct());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int idProduct) {
        try {
            PreparedStatement ps = connection.prepareStatement(DELETE_PRODUCT_SQL);
            ps.setInt(1,idProduct);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return true;
    }
    public Product selectProduct(int idProduct){
        try {
            PreparedStatement ps = connection.prepareStatement(SELECT_PRODUCT_BY_ID);
            ps.setInt(1,idProduct);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                String nameProduct = resultSet.getString("nameProduct");
                double price = resultSet.getDouble("price");
                int count = resultSet.getInt("count");
                String color = resultSet.getString("color");
                String descrision = resultSet.getString("descrision");
                int idCategory = resultSet.getInt("idCategory");
                return new Product(nameProduct,price,count,color,descrision,idCategory);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
