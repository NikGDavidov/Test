public class Counter implements AutoCloseable {
    int count;
    @Override
    public void close() throws Exception {

    }
    public void add() {
        count ++;
    }

        }
