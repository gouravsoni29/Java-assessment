package _3oct;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductLoader {
	
private static List<Product> lt = new ArrayList<>();
    
    public static void loadProduct() throws Exception {
        
        BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\gourav.soni\\eclipse-workspace\\Happiestmind\\product.txt")));
        
        String line;
        while((line=bf.readLine())!=null)
        {
            String arr[] = line.split(",");
            Product pp = new Product(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]));
           lt.add(pp);
        }
    }
    public static List<Product> getProductList(){
        return lt;
    }
    
    public static Product searchProduct(String productID)
    {
        List <Product> temp_lt = getProductList();
        for(Product p : temp_lt)
        {
            if(p.productID.equals(productID) )
            {
                return p;
            }
        }
        return null; 
    }

}
/*Gourav Soni*/