package Service;

import Model.Product;

import java.util.List;

public interface IProductService {
    List<Product> displayProduct();
    boolean addNewProduct(Product product,int idCategory);
    boolean editProduct(Product product);
    boolean deleteProduct(int idProduct);

}
