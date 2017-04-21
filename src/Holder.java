public class Holder {
    private String word;

    private Holder(String word) {
        this.word = word;
    }

    private void show(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

    @Override
    public String toString() {
        return "Holder{" +
                "word='" + word + '\'' +
                '}';
    }
}
