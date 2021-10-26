package collection.utils;

public interface MyList<E> {
	int size();
	boolean isEmpty();
	boolean add(E e);
	boolean remove(int i);
	E get(int i);
	void set(int i, E e);
	void show();
}
