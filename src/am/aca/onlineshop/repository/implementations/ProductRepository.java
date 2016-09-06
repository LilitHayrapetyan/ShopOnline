import implementations.Product;

public class ProductRepository implements IProductRepository{
	private static IProductRepository instance;
	private ProductRepository() {}
	public static ProductRepository getInstance(){
		if(instance == null){
			instance = new ProductRepository();
		}
		return (ProductRepository) instance;
	}
	@Override
	public Product addProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Product editProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
