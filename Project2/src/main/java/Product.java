public class Product {
    private int  id;
    private String denomination;

    private String producer;
    private int price;
    private int count;
    private MyDate expiration_date;
    private static int id_increment = 12397312;




    public Product(String denomination, String producer, int price, MyDate dat, int count ) throws Exception {
        if (price<=0 || count<0) throw new Exception();
    Product.id_increment++;

    this.id = id_increment;
    this.denomination = denomination;
    this.producer = producer;
    this.price = price;
    this.expiration_date = dat;
    this.count = count;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id:" + id +
                ", Найменування: '" + denomination + '\'' +
                ", Виробник: '" + producer + '\'' +
                ", Ціна: " + price +
                ", Термін зберігання: " + expiration_date +
                ", Кількість: " + count +
                '}';
    }

    public int getId(){return id;}
    public String getDenomination(){return  denomination;}
    public String getProducer(){return producer;}
    public int getPrice(){return price;}
    public int getCount(){return count;}
    public MyDate getExpiration_date() {return expiration_date;}

    public void setPrice(int price){this.price = price;}
    public void setCount(int count){this.count = count;}
    public void setExpiration_date(MyDate expiration_date) {this.expiration_date = expiration_date;}





}
