package linkedlistlib;

import java.util.Arrays;

/**
 * Реализация обработчика связного списка на основе {@link AlternateList}.
 *
 * Обрабатывает цепочку объектов-оболочек {@link Base}, содержащих в себе элементы
 * списка.
 *
 * В каждый объект-оболочку помещается элемент списка.
 * Таким образом в данный список можно
 * положить любой объект, как и в {@link java.util.ArrayList}
 * @param <X> Тип элементов связного списка.
 * @see AlternateList
 */

public class LinkedList<X> implements AlternateList<X> {

    /**
     * size - размер списка
     */
    private int size;

    /**
     * head - начало связного списка
     */
    private Node<X> head;

    /**
     * tail - конец связного списка
     */
    private Node<X> tail;

    {
        size = 0;
        head = null;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(X data) {
        if (size == 0) {
            size = 1;
            head = new Base<>(data);
            Node<X> buf = head;
            while (buf.next() != null) {
                buf = buf.next();
                size++;
            }
            tail = buf;

        } else {
            tail.setNext(new Base<>(data));
            tail = tail.next();
            size++;
        }
    }

    @Override
    public void addAll(AlternateList<X> list) {
        tail.setNext(((LinkedList<X>)list)._get(0));
        tail = ((LinkedList<X>)list)._get(list.size() - 1);
        size += list.size();
    }

    @Override // FIXME: 29.09.2020 
    public void set(X data, int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        else if (index < 0) throw new IllegalArgumentException("Index may not be smaller then 0!");
        _get(index).setData(data);
        //System.out.println(index);
    }

    /**
     * @see AlternateList#insert(Object, int)
     */
    @Override // FIXME: 29.09.2020 
    public void insert(X data, int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        else if (index < 0) throw new IllegalArgumentException("Index may not be smaller then 0!");
        else if (index == 0) {
            Node<X> node0 = head;
            head = new Base<>(data);
            head.setNext(node0);
        } else {
            Node<X> node0 = _get(index - 1);
            Node<X> node1 = node0.next();
            Base<X> inserted = new Base<>(data);
            node0.setNext(inserted);
            inserted.setNext(node1);
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        else if (index < 0) throw new IllegalArgumentException("Index may not be smaller then 0!");
        Node<X> buf0 = _get(index - 1);
        buf0.setNext(buf0.next().next());
        size--;
    }

    /**
     * Внутренний метод, предназначенный для получения объекта-оболочки
     * с индексом i
     * @param i Индекс элемента
     * @return
     * Возвращает объект-оболочку i из списка
     */
    private Node<X> _get(int i) {
        Node<X> buf = head;
        while (i-- > 0) {
            buf = buf.next();
        }
        return buf;
    }

    @Override
    public X get(int index) {
        Node<X> node;
        IndexOutOfBoundsException outOfBoundsException =
                new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        if (index < 0) throw new IllegalArgumentException("Index may not be smaller then 0!");
        try {
            node = _get(index);
        } catch (NullPointerException e) {
            throw outOfBoundsException;
        }
        if (node == null) throw outOfBoundsException;
        else return node.data();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<X> buf = head;
        for (int i = 0; i < array.length && buf.next() != null; i++) {
            array[i] = buf.data();
            buf = buf.next();
        }
        array[size - 1] = buf.data();
        return array;
    }

    @Override
    public String toString() {
        return "LinkedList {\n" +
                "size = " + size +
                "\n" +
                Arrays.toString(toArray()) +
                "\n}";
    }
}
