package linkedlistlib;

/**
 *  Класс-оболочка элемента списка, основанный на {@link linkedlistlib.Node}, используется для
 *  унифицирования работы с каждым элементом списка, содержит внутри себя
 *  сам элемент списка
 *  @see linkedlistlib.Node
 */

class Base<X> implements Node<X> {
    /**
     * X - элемент списка, находящийся внутри объекта-оболочки
     */
    X data;

    /**
     * next - следующий объект-оболочка в списке
     */
    private Node<X> next;

    /**
     * @param data Элемент списка, передаваемый в объект-оболочку
     */
    Base(X data) {
        this.data = data;
    }

    /**
     * @return
     * Возвращает элемент списка, находящийся внутри объекта-оболочки
     */
    @Override
    public X data() {
        return data;
    }

    @Override
    public void setData(X data) {
        this.data = data;
    }

    /**
     * @see Node
     * @return
     * Возвращает следующий объект-оболочку в списке
     */
    @Override
    public Node<X> next() {
        return next;
    }

    /**
     * @see Node
     * Возвращает следующий объект-оболочку в списке
     */
    @Override @SuppressWarnings("Unchecked")
    public void setNext(Node<X> next) {
        this.next = next;
    }
}
