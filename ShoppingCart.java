package org.example;
import java.util.*;
class details{
    int productid;
    String productname;
    double price;
    int qty;

    public details(int productid, String productname, double price, int qty){
        this.productid=productid;
        this.productname=productname;
        this.price=price;
        this.qty=qty;
    }
    void display(){
        System.out.println("ProductId: "+productid+"  Product Name:"+productname+"   Product Price: "+price+"   Product Qty: "+qty);
    }
}
class Shopping{
    ArrayList<details>prodetail=new ArrayList<>();
    ArrayList<details>cartlist=new ArrayList<>();

    void addproduct(details productadd){
        prodetail.add(productadd);
        System.out.println("Products Details Successfully Added :"+productadd.productname);
    }
    void removeproduct(int proID){
        for(details d:prodetail){
            if(d.productid == proID){
                prodetail.remove(d);
                return;
            }
        }
    }

    void addqty(int proId,int proqty){
        for( details id :prodetail){
            if(id.productid==proId){
              id.qty+=proqty;
              return;
            }
        }
    }
    void displayall(){
        System.out.println("Product Details");
        for(details b :prodetail){
            b.display();
        }
    }
    void addcart(int proId,int Qty) {
        for (details d : prodetail) {
            if (d.productid == proId) {
                if (d.qty < Qty) {
                    System.out.println("Insufficient Stock ");
                    return;
                }
                d.qty -= Qty;
                    for (details c : cartlist) {
                        if (c.productid == proId) {
                            c.qty += Qty;
                            return;
                        }
                    }
                    cartlist.add(new details(d.productid, d.productname, d.price, Qty));
                    return;
                }
        }
    }
    void totalbill(){
        double total=0;
        for(details d:cartlist){
            total+=d.price*d.qty;
        }
        System.out.println("____________________________");
        System.out.println("TotalBill:"+total);
    }
    void displaycart(){
        System.out.println("User Product details ");
        for(details c :cartlist){
            c.display();
        }
        totalbill();
    }

}
public class Main {
    public static void main(String[] args) {
            Shopping s =new Shopping();
            details b1=new details(101,"Milk",10.00,5);
            details b2=new details(102,"Curd",10.00,5);
            details b3=new details(103,"Salt",15.00,10);
            s.addproduct(b1);
            s.addproduct(b2);
            s.addproduct(b3);
            s.displayall();
            s.addcart(101,4);
            s.addcart(102,4);
            s.displayall();
            s.displaycart();
    }
    }

//Output:
 Products Details Successfully Added :Milk
Products Details Successfully Added :Curd
Products Details Successfully Added :Salt
Product Details
ProductId: 101  Product Name:Milk   Product Price: 10.0   Product Qty: 5
ProductId: 102  Product Name:Curd   Product Price: 10.0   Product Qty: 5
ProductId: 103  Product Name:Salt   Product Price: 15.0   Product Qty: 10
Product Details
ProductId: 101  Product Name:Milk   Product Price: 10.0   Product Qty: 1
ProductId: 102  Product Name:Curd   Product Price: 10.0   Product Qty: 1
ProductId: 103  Product Name:Salt   Product Price: 15.0   Product Qty: 10
User Product details 
ProductId: 101  Product Name:Milk   Product Price: 10.0   Product Qty: 4
ProductId: 102  Product Name:Curd   Product Price: 10.0   Product Qty: 4
____________________________
TotalBill:80.0
