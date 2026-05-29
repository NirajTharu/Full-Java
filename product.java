public class product<T,U> {
    T item; 
    U price;

    product(T item, U price)
    {
        this.item = item;
        this.price = price;
    }
    public T getitem()
    {
        return this.item;
    }
    public U getprice()
    {
        return this.price;
    }
}
