class Main {
    public Integer maximum(Integer[] numList) {
        Integer max = numList[0];
        for (int i=1; i < numList.length; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        var m = new Main();
        System.out.println("Número máximo es: " + m.maximum(new Integer[]{1, 3, 6, 2, 4}));
    }
}

