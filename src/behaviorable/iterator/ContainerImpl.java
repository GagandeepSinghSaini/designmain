package behaviorable.iterator;

import java.util.List;

public class ContainerImpl implements Container {

	IIterator iterator = null;
	
	@Override
	public IIterator getIterator(Object type) {
		if(type == null) {
			return null;
		}
		if(type instanceof Object[]) {
			iterator =  new ArrayIterator();
			iterator.setCollectionObject(type);
		}else if(type instanceof List) {
			iterator =  new ArrayListIterator();
			iterator.setCollectionObject(type);
		}
		return iterator;
	}

}
