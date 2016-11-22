package CollectionTest;

public class Book {
    private String name;

    public Book(String name) {
        super();
        this.name = name;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof Book) {
            Book mbook = (Book) obj;
            if (name.equals(mbook.toString())) {
                return true;
            }
        }
        return super.equals(obj);

    }
    
}
