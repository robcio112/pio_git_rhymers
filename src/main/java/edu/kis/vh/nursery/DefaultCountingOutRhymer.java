package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer reprezentuje podstawowy mechanizm wyliczanki
 * oparty na strukturze stosu
 */

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    /**
     * @return aktualny indeks wskaźnika total
     */
    public int getTotal() {
        return total;
    }

    private int total = -1;

    /**
     * Dodaje nową wartość do wyliczanki, jeśli tablica nie jest pełna.
     * * @param in wartość do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * * @return true, jeśli total jest równy EMPTY_STACK_VALUE
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy tablica wyliczanki została całkowicie zapełniona.
     * * @return true, jeśli osiągnięto FULL_STACK_VALUE
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Zwraca ostatnio dodaną wartość bez usuwania jej z wyliczanki.
     * * @return ostatnia wartość lub EMPTY_STACK_VALUE, jeśli pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnio dodaną wartość z wyliczanki.
     * * @return wyjęta wartość lub EMPTY_STACK_VALUE, jeśli pusta
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
