package example03_ConYShop.front;

import example03_ConYShop.dao.CartItemDao;
import example03_ConYShop.dao.ProductDao;
import example03_ConYShop.entity.CartItem;
import example03_ConYShop.entity.Product;

import java.util.Map;
import java.util.Scanner;

public class LaunchShop {
    private static ProductDao productDao = new ProductDao();
    private static CartItemDao cartItemDao = new CartItemDao();
    private static Scanner sc = new Scanner(System.in);

    /**
     * 显示全部商品
     */
    public static void showAll(){
        System.out.println("编号\t   商品名称   \t 价格 \t 颜色 \t 尺寸 \t 库存 ");

        for (Product cp /*currentProduct*/ : productDao.findAll() /*获取后台商品信息*/){
            System.out.println(cp.getId()+"\t"
                    +cp.getName()+"\t"
                    +cp.getPrice()+"\t"
                    +cp.getColor()+"\t"
                    +cp.getSize()+"\t"
                    +cp.getStock());
        }
    }

    /**
     * 查询指定id的商品
     */
    public static void showByID(){
        System.out.println("输入查询的编号：");
        Product res = productDao.findByID(sc.nextInt());
        if (res == null){
            System.out.println("查询的商品不存在！");
        }else {
            System.out.println("编号\t   商品名称   \t 价格 \t 颜色 \t 尺寸 \t 库存 ");
            System.out.println(res.getId()+"\t"
                    +res.getName()+"\t"
                    +res.getPrice()+"\t"
                    +res.getColor()+"\t"
                    +res.getSize()+"\t"
                    +res.getStock());
        }
    }

    /**
     * 向后台添加商品
     */
    public static void addProduct(){

        System.out.println("输入商品编号");
        int addId = sc.nextInt();
        while (productDao.getProductMapKeySet().contains(addId)){
            System.out.println("编号重复，请重新输入");
            addId = sc.nextInt();
        }

        System.out.println("输入商品名称");
        String addName = sc.next();

        System.out.println("输入商品价格");
        double addPrice = sc.nextDouble();

        System.out.println("输入商品颜色");
        String addColor = sc.next();

        System.out.println("输入商品尺寸");
        int addSize = sc.nextInt();

        System.out.println("输入商品库存");
        int addStock = sc.nextInt();

        productDao.add(new Product(addId,addName,addPrice,addColor,addSize,addStock));
    }

    public static void addCartItem(){
        System.out.println("请输入要购买的商品的编号");
        int buyId = sc.nextInt();
        while (!productDao.getProductMapKeySet().contains(buyId)){
            System.out.println("商品不存在，请重新输入！");
            showAll();
            buyId = sc.nextInt();
        }

        System.out.println("请输入要购买的商品的个数");
        int buyAmount = sc.nextInt();
        while (buyAmount > productDao.findByID(buyId).getStock()){
            System.out.println("库存仅有"+productDao.findByID(buyId).getStock()+"，您不能购买更多，请重新输入");
            buyAmount = sc.nextInt();
        }
        cartItemDao.addCartItem(new CartItem(buyAmount,productDao.findByID(buyId)));
    }
    /**
     * 输出购物车
     */
    public static void showCart(){
        System.out.println("         购物车          ");
        System.out.println("编号\t商品名称\t价格\t库存\t");

        double totalPrice = 0;

        for (Map.Entry<Integer, CartItem> sci : cartItemDao.findCart().entrySet()/*获取购物车商品信息*/){
            CartItem cti = sci.getValue();
            System.out.println(cti.getId()+"\t"
                    +cti.getName()+"\t"
                    +cti.getPrice()+"\t"
                    +cti.getAmount()+"\t"
                    +(cti.getPrice()* cti.getAmount()));
            totalPrice += cti.getPrice()* cti.getAmount();
        }

        System.out.println("总计："+totalPrice);

    }

    public static void main(String[] args) {

        do{
            System.out.println("\n************************\n"+
                               "*****欢迎进入ConY商店*****\n" +
                               "**  1--添加商品        **\n" +
                               "**  2--查看所有商品     **\n" +
                               "**  3--查看指定编号商品 **\n" +
                               "**  4--添加商品到购物车 **\n" +
                               "**  5--查看我的购物车   **\n" +
                               "**  0--退出ConY商店    **\n" +
                               "************************\n" +
                               "************************\n" +
                               "       ^_^请选择菜单：");

            switch (sc.nextInt()){
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    showByID();
                    break;
                case 4:
                    addCartItem();
                    break;
                case 5:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("输入有误qwq");
            }
        }while (true);
    }
}
