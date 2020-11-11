package linkedlistlib;

/**
 * Интерфейс-оболочка элемента связного списка
 * @see Base
 */

public interface Node<X> {

    /**
     * @return
     * Возврашает следующий объект цепочки
     */
    Node<X> next();

    /**
     * @param next - следующий элемент цепочки
     */
    void setNext(Node<X> next);

    /**
     * Возвращает именно элемент списка, а не объект-оболочку
     *
     * @return Элемент списка
     */
    X data();

    /**
     * Устанавливает элемент списка
     * @param data Элемент списка
     *
     */
    void setData(X data);
}
