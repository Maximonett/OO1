package ar.edu.unlp.objetos.uno.eje25Bag;

import java.util.*;
 
public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {
    private Map<T, Integer> elements;

    public BagImpl() {
        this.elements = new HashMap<>();
    }

    @Override
    public boolean add(T element) {
        this.elements.put(element, this.occurrencesOf(element) + 1);
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        return this.elements.getOrDefault(element, 0);
    }

    @Override
    public void removeOccurrence(T element) {
        if (this.elements.containsKey(element)) {
            int count = this.elements.get(element);
            if (count > 1) {
                this.elements.put(element, count - 1);
            } else {
                this.elements.remove(element);
            }
        }
    }

    @Override
    public void removeAll(T element) {
        this.elements.remove(element);
    }

    @Override
    public int size() {
        // Suma de todas las ocurrencias
        return this.elements.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public Iterator<T> iterator() {
        List<T> all = new ArrayList<>();
        for (Map.Entry<T, Integer> entry : this.elements.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                all.add(entry.getKey());
            }
        }
        return all.iterator();
    }

    @Override
    public boolean contains(Object o) {
        return this.elements.containsKey(o);
    }

    @Override
    public void clear() {
        this.elements.clear();
    }
    
    
    public List<T> getElementsWithOcurrences(int n){
    	List<T> results=new ArrayList<>();
    	
    	this.elements.entrySet()
    		.stream()
    		.filter(entry->entry.getValue()==n)
    		.forEach(entry->results.add(entry.getKey()));
    		
    	return results;
    }
    
    
}

