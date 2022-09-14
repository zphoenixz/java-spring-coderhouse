@FunctionalInterface
public interface Square {
    int area(int x);
    default int area2(int x){
        return x*x;
    }
    default int area3(int x){
        return x*x;
    }
}
