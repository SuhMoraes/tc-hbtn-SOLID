public class MySQLProductRepository implements IDbProduct {

    public String getProductById(String productID) {
        return productID;
    }

    @Override
    public String getAll() {
        return null;
    }

    @Override
    public String update(Product product) {
        return null;
    }

    public String delete(String productID) {
        return productID;
    }
}
