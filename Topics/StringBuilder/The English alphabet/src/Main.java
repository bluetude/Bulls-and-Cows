class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder alphabet = new StringBuilder();
        char letter = 'A';
        for (int i = 0; i < 26; i++) {
            alphabet.append(letter);
            alphabet.append(" ");
            letter++;
        }
        alphabet.delete(alphabet.length() - 1, alphabet.length());
        return alphabet;
    }
}