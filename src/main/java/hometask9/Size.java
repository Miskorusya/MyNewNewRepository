package hometask9;

enum Size {
    S("S", 36, 60),
    M("M", 38, 62),
    L("L", 40, 64);

    private final String abbreviation;
    private final int width;
    private final int length;

    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    // Геттер для скороченої назви
    public String getAbbreviation() {
        return abbreviation;
    }

    // Геттер для ширини
    public int getWidth() {
        return width;
    }

    // Геттер для довжини
    public int getLength() {
        return length;
    }