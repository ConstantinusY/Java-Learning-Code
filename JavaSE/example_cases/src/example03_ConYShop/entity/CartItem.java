package example03_ConYShop.entity;

public class CartItem implements Comparable<CartItem>{
    private int id;//商品编号
    private String name;//商品名
    private double price;//单价
    private int amount;//数量

    public CartItem() {
    }

    public CartItem(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public CartItem(int amount, Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.amount = amount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartItem)) return false;

        CartItem cartItem = (CartItem) o;

        if (getId() != cartItem.getId()) return false;
        if (Double.compare(cartItem.getPrice(), getPrice()) != 0) return false;
        if (getAmount() != cartItem.getAmount()) return false;
        return getName() != null ? getName().equals(cartItem.getName()) : cartItem.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAmount();
        return result;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public int compareTo(CartItem o) {
        return this.id-o.id;
    }
}
