package linkedlistlib;

public interface AlternateList<X> {

    /**
     * Очищает весь список
     */
    void clear();

    /**
     * Добавляет элемент цепочки, принимает объет элемента и
     * именно элемента, а не класса оболочки
     * @param data Объект элемента
     */
    void add(X data);

    /**
     * Добавляет к текущему списку список list
     * @param list Передаваемый список
     */
    void addAll(AlternateList<X> list);

    /**
     * Заменяет элемент с индексом index на элемент со значением data
     * @param data На что заменить элемент
     * @param index Индекс заменяемого элемента
     */
    void set(X data, int index);

    /**
     * Вставляет элемент data после элемента с индексом index
     * @param data  Элемент
     * @param index Индекс элемента, перед которым вставляется элемент data
     */
    void insert(X data, int index);

    /**
     * Удаляет элемент списка с индексом i
     * @param index Индекс элемента
     */
    void remove(int index);

    /**
     * @param index Индекс элемента
     * @return
     * Возвращает элемент списка (не объект-оболочку)
     */
    X get(int index);

    /**
     * @return
     * Возвращает размер списка
     */
    int size();

    /**
     * Создаёт из списка массив объёктов
     * @return
     * Возвращает массив объектов
     */
    Object[] toArray();
}
