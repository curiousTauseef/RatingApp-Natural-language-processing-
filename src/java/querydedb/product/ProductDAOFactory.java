/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package querydedb.product;

/**
 *
 * @author macbookpro
 */
public class ProductDAOFactory {
    
    public static ProductDAO createProduct()
    {
        return new ProductDAOImpl();
    }
    
}

