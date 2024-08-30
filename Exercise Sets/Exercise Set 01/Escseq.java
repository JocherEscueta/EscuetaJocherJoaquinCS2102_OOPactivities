class Escseq {
    public static void main(String[] args) {
        int num = 5;
        int current = 7;
        for (int i = 1; i <= num; i++) {
            System.out.println( (i % 2 == 0) ? "\t" + current : current );
            current += 7;
        }
    }
}