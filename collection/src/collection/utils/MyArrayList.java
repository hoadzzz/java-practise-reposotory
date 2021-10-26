package collection.utils;

import java.lang.reflect.Array;

public class MyArrayList<E> implements MyList<E> {

	private static  int initalCapacity = 10;
	private static int size = 0;
	private E[] elements;
	
	public MyArrayList() {
		elements = create(initalCapacity);
	}
	
	public MyArrayList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("capacity should be greater than 0!");
		}
		if(capacity > 0) {
			initalCapacity = capacity;
		}
		elements = create(capacity);
	}
	
	

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E get(int i) {
		if(i < 0 || i > size) {
			throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds exception");
			
		}
		return elements[i];
	}

	@Override
	public void set(int i, E e) {
		if(i < 0 || i > size) {
			throw new ArrayIndexOutOfBoundsException("Index " + i + "out of bounds exception!");
			
		}
		elements[i] = e;
	}

	@Override
	public boolean add(E e) {
		if(size < initalCapacity) {
			elements[size++] = e;
			return true;
		}
		elements = grow(e);
		return true;
	}

	@Override
	public boolean remove(int i) {
		if(i < 0 || i > size) {
			throw new ArrayIndexOutOfBoundsException("Index " + i + "out of bounds exception!");
			
		}
		for (int j = 0; j < elements.length - 1; j++) {
			if(j >= i) {
				elements[j] = elements[j+1];
			}
		}
		size--;
		
		return true;
	}
	
	@Override
	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}
		System.out.println();
	}
	
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}
	
	private E[] grow(E e) {
		E[] newElements = create(size + 1);
		for (int i = 0; i < elements.length; i++) {
			newElements[i] = elements[i];
		}
		newElements[size++] = e;
		return newElements;
	}
	
}
