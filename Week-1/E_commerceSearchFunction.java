class Product
{
    int productId;
    String productName;
    String Category;

    Product(int productId,String productName,String Category)
    {
       this.productId=productId;
       this.productName=productName;
       this.Category=Category;
    } 
}

public class E_commerceSearchFunction{
    public static Product LinearSearch(Product[] products, int productId)
    {
         for(Product p:products)
         {
            if(p.productId==productId)
            {
                    return p;
            }
         }
         return  null;
    }

     public static Product BinarySearch(Product[] products, int productId)
    {
         int low=0;
         int high=products.length-1;
         while(low<=high)
         {
            int mid=(low+high)/2;
            if (products[mid].productId == productId) 
            {
                 return products[mid];
            }
            else if (products[mid].productId < productId) 
            {
                 low= mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return null;

     }
     public static void main()
     {

           Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        int searchId = 104;

        // Linear Search
        Product result1 = LinearSearch(products, searchId);

        if (result1 != null) {
            System.out.println("Linear Search Result:");
            System.out.println("Product ID: " + result1.productId);
            System.out.println("Product Name: " + result1.productName);
            System.out.println("Category: " + result1.Category);
        } else {
            System.out.println("Product not found using Linear Search");
        }

        // Binary Search
        Product result2 = BinarySearch(products, searchId);

        if (result2 != null) {
            System.out.println("\nBinary Search Result:");
            System.out.println("Product ID: " + result2.productId);
            System.out.println("Product Name: " + result2.productName);
            System.out.println("Category: " + result2.Category);
        } else {
            System.out.println("Product not found using Binary Search");
        }
    }
     }

    

