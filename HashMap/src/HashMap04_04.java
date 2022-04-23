import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMap04_04 {
    public static void main(String[] args) {
        Map<Key, Value> map = new HashMap<>();
        map.put(new Key(100), new Value(500));
        map.put(new Key(101), new Value(501));
        map.put(new Key(102), new Value(502));

        System.out.println(map.size());


    }
}

class Key {
    private int id;

    @Override
    public boolean equals(Object o) {
        System.out.println("Key -> equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return id == key.id;
    }

    @Override
    public int hashCode() {
        System.out.println("Key -> hash");
        return Objects.hash(id);
    }

    public Key(int id) {
        this.id = id;
    }
}

class Value {
    private int id;

    @Override
    public boolean equals(Object o) {
        System.out.println("Val -> equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return id == value.id;
    }

    @Override
    public int hashCode() {
        System.out.println("Val -> hash");
        return Objects.hash(id);
    }

    public Value(int id) {
        this.id = id;
    }
}